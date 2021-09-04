package project15.solution;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactUsFunctionality extends BaseDriver{


    @Test (dataProvider = "MessageInput")
    public void contactUsTest(String message){  //?
        HomePageElement homePageElement = new HomePageElement(driver);
        ContactUsPageElements contactUsPageElements = new ContactUsPageElements(driver);

        homePageElement.contactUsLink.click();

        Select select = new Select(contactUsPageElements.subjectHeading);
        select.selectByIndex(0);

        contactUsPageElements.emailAddress.sendKeys("studyTest@test.com");

        contactUsPageElements.message.sendKeys(message);//?


        contactUsPageElements.sendButton.click();

    }

    @DataProvider(name="MessageInput")
    public Object[][] MessageInputObject(){
        return new Object[][]{
                {"LiZhou"}, {"123"}, {"@$&"}
        };

    }

}
