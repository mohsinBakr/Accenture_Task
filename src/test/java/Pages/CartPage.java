package Pages;

import Runner.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends UtilityMethods {

    ExcelDB ExcelDb;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public  WebElement CheckoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div/a[@href='http://www.demoshop24.com/index.php?route=checkout/checkout']"))));
    }
}
