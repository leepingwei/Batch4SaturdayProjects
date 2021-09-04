package project16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Project16_GroupSolution {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void login() {
        // Navigate to https://test.mersys.io/
        driver.manage().window().maximize();
        driver.get("https://test.mersys.io/");

        // Dismiss the cookie message (if it pops up for the first time)
        WebElement acceptCookies = driver.findElement(By.xpath("//button[text()='Accept all cookies']"));
        wait.until(ExpectedConditions.elementToBeClickable(acceptCookies));
        acceptCookies.click();

        // Login by the credentials (username = "i.muratov" and password = "QWEasd@1901")
        WebElement userName = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
        userName.sendKeys("i.muratov");
        WebElement password = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        password.sendKeys("QWEasd@1901");
        WebElement login = driver.findElement(By.xpath("//button[@aria-label='LOGIN']"));
        login.click();
    }

    @Test
    public void navigateToSchoolDepartment() {
        // Click on Setup in the left menu
        WebElement setup = driver.findElement(By.xpath("(//span[text()='Setup'])[1]"));
        setup.click();

        // Click on School Setup
        WebElement schoolSetup = driver.findElement(By.xpath("(//span[text()='School Setup'])[1]"));
        schoolSetup.click();

        // Click on Departments
        WebElement departments = driver.findElement(By.xpath("(//span[text()='Departments'])[1]"));
        departments.click();
    }

    @Test
    public void addNewSchoolDepartment() {
        // Click on "+" button to add a school department
        WebElement plusButton = driver.findElement(By.cssSelector("ms-add-button > div > button"));
        plusButton.click();

        // On the pop-up window, type "High School" for the name of the department and "HS-1" for the code.
        WebElement name = driver.findElement(By.xpath("//ms-text-field[@formcontrolname='name']//input"));
        name.sendKeys("High School");
        WebElement code = driver.findElement(By.xpath("//ms-text-field[@formcontrolname='code']//input"));
        code.sendKeys("HS-1");

        // Click on "Section" tab
        WebElement section = driver.findElement(By.id("mat-tab-label-0-1"));
        section.click();

        // Type "Junior Classes" for the name of the section and "Juniors" for the short name and click on "Add" button to create the section.
        WebElement sectionName = driver.findElement(By.xpath("//input[@id='ms-text-field-2']"));
        sectionName.sendKeys("Junior Classes");
        WebElement shortName = driver.findElement(By.xpath("//input[@id='ms-text-field-3']"));
        shortName.sendKeys("Juniors");
        WebElement addButton = driver.findElement(By.xpath("(//span[text()='Add'])[1]"));
        addButton.click();

        // Create another section with the name "Senior Classes" and the short name "Seniors" similarly.
        WebElement sectionName2 = driver.findElement(By.xpath("//input[@id='ms-text-field-2']"));
        sectionName2.sendKeys("Senior Classes");
        WebElement shortName2 = driver.findElement(By.xpath("//input[@id='ms-text-field-3']"));
        shortName2.sendKeys("Seniors");
        WebElement addButton2 = driver.findElement(By.xpath("(//span[text()='Add'])[1]"));
        addButton2.click();

        // Click on "Save" for creating the school department.
        WebElement saveButton1 = driver.findElement(By.xpath("(//*[text()='Save'])[1]"));
        saveButton1.click();

        // Verify if the department with the name "High School" created.
        WebElement highSchool = driver.findElement(By.xpath("//td[text()='High School']"));
        wait.until(ExpectedConditions.elementToBeClickable(highSchool));
        highSchool.click();
        Assert.assertEquals(highSchool.getText(), "High School", "High School verification failed");

        // Verify if the two Sections were created too.
        WebElement section2 = driver.findElement(By.id("mat-tab-label-1-1"));
        section2.click();
        WebElement juniorClass = driver.findElement((By.xpath("//*[text()='Junior Classes']")));
        wait.until(ExpectedConditions.visibilityOf(juniorClass));
        Assert.assertEquals(juniorClass.getText(), "Junior", "Junior section verification Failed");
        WebElement seniorClass = driver.findElement(By.xpath("//*[text()='Senior Classes']"));
        Assert.assertEquals(seniorClass.getText(), "Senior", "Senior section verification Failed");

        // Click on "+" button to add a school department AGAIN
        WebElement closeButton = driver.findElement(By.xpath("//button[@aria-label='Close dialog']"));
        closeButton.click();
        WebElement plusButton2 = driver.findElement(By.cssSelector("ms-add-button > div > button"));
        plusButton2.click();
    }


    @DataProvider
    public Object[][] departmentNameProvider() {
        return new Object[][]{
                {"High School", "HS-1"},
                {"High School", "HSC-1"},
                {"High School Classes", "HS-1"}
        };
    }

    @Test(dataProvider = "departmentNameProvider")
    public void verifyToCreateDepartmentWithUsedParameters(String name, String code) {
        // On the pop-up window, type "High School" for the name of the department and "HS-1" for the code AGAIN
        WebElement name2 = driver.findElement(By.xpath("//ms-text-field[@formcontrolname='name']//input"));
        name2.sendKeys(name);
        WebElement code2 = driver.findElement(By.xpath("//ms-text-field[@formcontrolname='code']//input"));
        wait.until(ExpectedConditions.visibilityOf(code2));
        code2.sendKeys(code);

        // Click on "Save" for TRYING to create a school department WITH THE SAME NAME AND CODE.
        WebElement saveButton2 = driver.findElement(By.xpath("//span[text()='Save']"));
        saveButton2.click();

        // Verify that a dialog box occurs with a message "There is already Department with "High School" name!".
        String messageLocatorString = "";
        if (name == "High School")
            messageLocatorString = "//div[text()='There is already Department with \" + High School\" name!']";
        else if (code == "HS-1")
            messageLocatorString = "//div[text()='There is already Department with \"HS-1\" code!']";

        WebElement message = driver.findElement(By.xpath(messageLocatorString));
        wait.until(ExpectedConditions.visibilityOf(message));
        Assert.assertTrue(message.isDisplayed());
    }

    @Test
    public void testWhatever() {
        // Click on "x" to dismiss the pop-up window.
        WebElement closeButton2 = driver.findElement(By.xpath("//button[@aria-label='Close dialog']"));
        closeButton2.click();

        // Click on edit button (or the row) of the "High School" department to edit it.
        WebElement editButton = driver.findElement(By.xpath("(//button[@aria-describedby='cdk-describedby-message-15'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(editButton));
        editButton.click();

        // Edit the school department name as "High School Classes" and department code as "HSC-1" and click on "Save"
        WebElement name6 = driver.findElement(By.xpath("//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input"));
        wait.until(ExpectedConditions.visibilityOf(name6));
        name6.clear();
        name6.sendKeys("High School Classes");

        WebElement code6 = driver.findElement(By.xpath("//ms-text-field[@formcontrolname='code']//input"));
        code6.clear();
        code6.sendKeys("HSC-1");
        WebElement saveButton6 = driver.findElement(By.xpath("(//*[text()='Save'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(saveButton6));
        saveButton6.click();

        // Verify if the department name was edited as "High School Classes" and department code was edited as "HSC-1"
        WebElement editedMessage = driver.findElement(By.xpath("//div[text()='School Department successfully updated']"));
        wait.until(ExpectedConditions.visibilityOf(editedMessage));
        if (editedMessage.getText().contains("successfully")) {
            System.out.println(editedMessage.getText());
        } else {
            System.out.println("School Department failure");
        }

        // Go to Section tab of this school department (High School Classes) and add 3 more sections (you may name them as you wish)
        WebElement clickHighSchool2 = driver.findElement(By.xpath("//td[text()='High School Classes']"));
        wait.until(ExpectedConditions.elementToBeClickable(clickHighSchool2));
        clickHighSchool2.click();
        WebElement section3 = driver.findElement(By.xpath("//span[text()='Section']"));
        wait.until(ExpectedConditions.elementToBeClickable(section3));
        section3.click();

        WebElement plusButton6 = driver.findElement(By.cssSelector("#ms-table-9_buttons > ms-table-toolbar button"));
        wait.until(ExpectedConditions.elementToBeClickable(plusButton6));
        plusButton6.click();

        By sectionName = By.xpath("//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input");

        WebElement sectionName3 = driver.findElement(sectionName);
        wait.until(ExpectedConditions.visibilityOf(sectionName3));
        sectionName3.sendKeys("Grade 10");


        WebElement shortName3 = driver.findElement(By.xpath("//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input"));
        shortName3.sendKeys("GR-10");

        WebElement addButton3 = driver.findElement(By.xpath("(//span[text()='Add'])[1]"));
        addButton3.click();

        WebElement sectionName4 = driver.findElement(sectionName);
        sectionName4.sendKeys("Grade 11");

        WebElement shortName4 = driver.findElement(By.xpath("//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input"));
        shortName4.sendKeys("GR-11");

        WebElement addButton4 = driver.findElement(By.xpath("(//span[text()='Add'])[1]"));
        addButton4.click();

        WebElement sectionName5 = driver.findElement(sectionName);
        sectionName5.sendKeys("Grade 12");

        WebElement shortName5 = driver.findElement(By.xpath("//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input"));
        shortName5.sendKeys("GR-12");

        WebElement addButton5 = driver.findElement(By.xpath("(//span[text()='Add'])[1]"));
        addButton5.click();

        WebElement saveButton7 = driver.findElement(By.cssSelector("mat-dialog-actions > ms-save-button > button"));

        wait.until(ExpectedConditions.elementToBeClickable(saveButton7));
        saveButton7.click();
    }

    @AfterClass
    public void tearDown() {
        navigateToSchoolDepartment();

        // Go back to Departments page and click on corresponding trash icon in order to delete "High School Classes"
        WebElement deleteButton = driver.findElement(By.xpath("(//tbody/tr[1]/..//ms-delete-button/button)[1]"));

        wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
        deleteButton.click();
        // Click on "Delete" for deleting the school department.
        WebElement deleteButton2 = driver.findElement(By.xpath("//button[@type='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(deleteButton2));
        deleteButton2.click();

        // Verify the department is deleted. (it should not be present in the table anymore)
        WebElement deleteConfirmationMessage = driver.findElement(By.xpath("//div[text()='School Department successfully deleted']"));
        wait.until(ExpectedConditions.visibilityOf(deleteConfirmationMessage));
        Assert.assertTrue(deleteConfirmationMessage.isDisplayed());
        // Close the browser
        driver.quit();
    }
}
