package Pages;

import Runner.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage extends UtilityMethods {

    ExcelDB ExcelDb;
    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public  WebElement ResultAddToCart(String ResNumber){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div["+ResNumber+"]/div[1]/div[2]/div[@class='button-group']/button[1]"))));
    }

    public  WebElement ViewCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li/a[@href='http://www.demoshop24.com/index.php?route=checkout/cart']"))));
    }

}
