package Pages;

import Runner.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends UtilityMethods {

    ExcelDB ExcelDb;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement UserName(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='input-email']"))));
    }

    public  WebElement Password(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='input-password']"))));
    }

    public  WebElement LoginClick(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Login']"))));
    }

}
