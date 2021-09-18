package project17;

import campus.utilities.Browser;
import campus.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Project17 {

//  IMPORTANT NOTE: Do not forget to delete whatever you have created manually if needed in order to keep the data clean for other testers please.

//  Setup for your test cases:
//  Open a browser and navigate to https://test.mersys.io/
//  Dismiss the cookie message (if it pops up for the first time)
//  Login by the credentials (username = "i.muratov" and password = "QWEasd@1901")
//  Navigate to HumanResources > Employees through the left menu

//  Test 1: Verify that an employee can be created with a minimum (First Name, Last Name, Employee ID, Document Type and Document Number) data --> (passes)
//  Test 2: Verify that an existing employee can be deleted
//  Test 3: Verify that the first name of an existing employee can be updated --> (passes)
//  Test 4: Verify that the last name of an existing employee can be updated --> (passes)
//  Test 5: Verify that the document number of an existing employee can be updated --> (passes)
//  Test 6: Verify that (any other data you decided) of an existing employee can be updated --> (passes)
//  Test 7: Verify that an employee with different names but the same Employee ID cannot be created --> (fails!)
//  Test 8: Verify that an employee with different names but the same Document Number cannot be created --> (passes)
//  Test 9: Verify that an employee with the same First Name and Last Name can be created --> (passes)

//  Use a data provider to do the Tests 10-15
//  Test 10: Verify that an employee without entering a first name cannot be created --> (passes)
//  Test 10: Verify that an employee without entering a last name cannot be created --> (passes)
//  Test 10: Verify that an employee without entering an Employee ID cannot be created --> (passes)
//  Test 10: Verify that an employee cannot be created if you enter just numerical values for the First Name --> (fails!!!)
//  Test 10: Verify that an employee cannot be created if you enter just special characters like @,!,#, ,%,^,... for the name --> (fails!!!)
//  Test 10: Add your own test data for the data provider for a negative testing of creating an employee (feel free to add more than one case)

//  Test 11: Verify that a photo can be uploaded while creating a new employee --> (fails!)
//  Test 12: Verify that a photo can be uploaded for an existing employee --> (passes)
//  Test 13:Verify that the photo of an existing employee can be changed --> (passes)
//  Test 14: Verify that the photo of an existing employee can be deleted --> (passes)

//  Test 15-17: Write at least three different test cases for the search options of your own!

//  Close the browser

    //  Good luck!
}
