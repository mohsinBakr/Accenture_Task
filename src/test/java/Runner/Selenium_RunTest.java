package Runner;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Selenium_RunTest extends UtilityMethods {
    public static String TCsFile = "Test_data.xlsx";

    ExcelDB ExcelDb;
    LandingPage landingPage;
    ResultsPage resultsPage;
    LoginPage loginPage;
    CartPage cartPage;
    int CountTC;



    @Test(priority = 1)
    public void GetIterations() throws Exception {

        ExcelDb = new ExcelDB(driver);
        CountTC = ExcelDb.NumOfTestCases();
        System.out.println("Total Number of TCs: " + CountTC);
        init(BrowserEnum.Firefox);

    }

    @Test(priority = 2)
    public void Login() throws Exception {
        landingPage = new LandingPage(driver);
        loginPage = new LoginPage(driver);
        ExcelDb = new ExcelDB(driver);

        landingPage.MyAccountDDL().click();
        landingPage.LoginBtn().click();
        loginPage.UserName().sendKeys(ExcelDb.GetDataFromExcel("Email",1));
        loginPage.Password().sendKeys(ExcelDb.GetDataFromExcel("Password",1));
        loginPage.LoginClick().click();
    }
    @Test(priority = 3)
    public void Search() throws Exception {
        landingPage = new LandingPage(driver);
        ExcelDb = new ExcelDB(driver);

        landingPage.SearchField().sendKeys(ExcelDb.GetDataFromExcel("SearchFor",1));
        landingPage.SearchButton().click();
    }

    @Test(priority = 4)
    public void AddToCart() throws Exception {
        resultsPage = new ResultsPage(driver);
        ExcelDb = new ExcelDB(driver);
        cartPage = new CartPage(driver);
        resultsPage.ResultAddToCart(ExcelDb.GetDataFromExcel("WhichResNumber",1)).click();
        resultsPage.ViewCartButton().click();
        Assert.assertTrue(cartPage.CheckoutButton().isDisplayed());
    }

    @Test(priority = 5)
    public void TearDown(){
        driver.quit();
    }


}
