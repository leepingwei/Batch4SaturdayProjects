package project15.solution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseDriver {
    protected WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\li\\Desktop\\IT school\\selenium\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\li\\Desktop\\IT school\\for Firefox\\geckodriver-v0.29.1-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();

        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("studyTest@test.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("123456");

        WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
        signInButton.click();


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
