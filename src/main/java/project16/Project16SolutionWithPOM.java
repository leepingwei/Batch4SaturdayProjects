package project16;

import campus.pages.Helper;
import campus.pages.LoginPage;
import org.junit.Test;

public class Project16SolutionWithPOM extends Helper {

    LoginPage loginpage = new LoginPage();

    @Test
    public void loginTest() {
        openCampusPageAndMaximizeWindow();
        loginToCampus("i.muratov", "QWEasd@1901");
    }
}
