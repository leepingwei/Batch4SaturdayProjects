package project18;

public class Project18 {

//  Note: Use TestNG for your tests. (Optionally you may use cucumber.)

/*
   Create a TestNG.xml file and add your class to it.
*/

/*
   Setup for your test cases: (Use @BeforeClass method for setup)
   Open a browser and navigate to https://test.mersys.io/
   Dismiss the cookie message (if it pops up for the first time)
   Login by the credentials (username = "i.muratov" and password = "QWEasd@1901")
   Navigate to Student > Students through the left menu
   Click on + icon for adding a student
   Select "Representatives" from the bottom tabs
   Click on + icon to add a new representative
*/

/*
   Verify that you can add a new representative of Father, Mother, Guardian and Self
   Write only one test case for verification of creation of representatives
   Use a single Data Provider in order to use the same test case for creation of each type of representative.
 */

/*
  Verify you can delete an existing representative.
  (For automated testing/verification, deleting one representative will be enough but
   please do not forget to delete other representative you have created above, at least manually)
  (Optional: Use only one test case to delete the four representative you have created about.
   You may use data provider or run your test many times.)
*/

/*
   Verify that a representative cannot be created (or add button will not be active)
   if one of the following data is missing: Representative, First Name, Last Name, Mobile Phone or Country
   Write a single test case and use a single data provider to test each case with missing information each time
*/

/*
   (The following tests must fail. Because you are not supposed to create a representative as stated but in fact you can!)
   Verify that you cannot create a representative (add button should not be active) with the following data:
      with a First Name like "*#@%/" (special characters only)
      with a Last Name like "125436" (digits only)
      with a Mobile Phone like "abcdef" (letters only)
   Write a single test case for this test and pass parameters from TestNG.xml file to test the three cases.
*/

/*
    Create a folder called "screenshot" (suggestively under the project package, not somewhere else in your computer.)
    Create an @AfterMethod to take a screenshot when the test fails.
    Save the screenshots in the folder called "screenshots"
*/

/*
    Create @AfterClass to close the browser
*/

/*
    Add a listener to your xml file for getting well-prepared, good-looking and e-mailable test reports (e.g. html reports)
*/

/*
    OPTIONAL: Run your project in parallel (say, running three tests at a time)
      It is strongly suggested that before trying parallel execution, make sure they run perfectly one after the other.
*/

/*
    CHALLENGE: Without writing any more test cases (you may have to change your code a little),
     run your test in two other browsers (say, Firefox and Edge, or else)
     Before trying challenge part, make sure your test cases work perfectly with one browser.
*/

}
