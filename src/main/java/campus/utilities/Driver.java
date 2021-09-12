package campus.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(Browser browser) {
        switch (browser) {
            case CHROME: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            case EDGE: {
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
