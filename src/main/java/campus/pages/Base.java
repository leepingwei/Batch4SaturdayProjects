package campus.pages;

import campus.utilities.Browser;
import campus.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    protected WebDriver driver = Driver.getDriver(Browser.CHROME);
    private WebDriverWait wait = new WebDriverWait(driver, 10);

    protected void clickOnElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void sendKeysToElement(WebElement element, String key){
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
        element.sendKeys(key);
    }

    protected void maximizeWindow(){
        driver.manage().window().maximize();
    }

    protected void openPage(String url){
        driver.get(url);
    }
}
