package project15.solution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPageElements {
    public ConfirmationPageElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "p[class='alert alert-success']")
    WebElement confirmMessage;

}
