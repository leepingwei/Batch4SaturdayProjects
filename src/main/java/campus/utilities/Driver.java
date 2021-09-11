package campus.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(Browser browser) {
        if (driver == null) {
            if (browser == Browser.CHROME) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            if (browser == Browser.FIREFOX) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            if(browser == Browser.EDGE){
                WebDriverManager.edgedriver();
                driver = new EdgeDriver();
            }
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
        if (driver != null) {
            driver = null;
        }
    }

    private Driver() {
    }
}
