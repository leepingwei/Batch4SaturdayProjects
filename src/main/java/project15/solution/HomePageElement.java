package project15.solution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElement {
    public HomePageElement(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="contact-link")
    WebElement contactUsLink;




}
