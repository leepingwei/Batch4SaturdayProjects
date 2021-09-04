package project15.solution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageElements {
    public ContactUsPageElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="id_contact")
    WebElement subjectHeading;

    @FindBy(id="email")
    WebElement emailAddress;

    @FindBy(css = "select[name='id_order']")
    WebElement orderReference;

    @FindBy(id="message")
    WebElement message;

    @FindBy(id="submitMessage")
    WebElement sendButton;




}
