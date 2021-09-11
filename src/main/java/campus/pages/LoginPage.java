package campus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@formcontrolname='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookiesButton;

    public void enterUserName(String username){
        sendKeysToElement(userName, username);
    }

    public void enterPassword(String pswrd){
        sendKeysToElement(password, pswrd);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public void clickOnAcceptCookiesButton(){
        clickOnElement(acceptCookiesButton);
    }
}
