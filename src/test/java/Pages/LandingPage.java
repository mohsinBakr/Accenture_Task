package Pages;

import Runner.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends UtilityMethods {
    ExcelDB ExcelDb;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement SearchField(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='search']"))));
    }

    public WebElement SearchButton(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='search']/span/button"))));
    }

    public WebElement MyAccountDDL(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='My Account']"))));
    }

    public WebElement LoginBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='http://www.demoshop24.com/index.php?route=account/login']"))));
    }


}
