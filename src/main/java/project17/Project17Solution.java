package project17;

import campus.pages.Base;
import campus.pages.Helper;
import campus.pages.LoginPage;
import org.junit.BeforeClass;
import org.junit.Test;

public class Project17Solution extends Helper {

    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void setup() {
        openCampusPageAndMaximizeWindow();
        loginToCampus("i.muratov", "QWEasd@1901");
    }
}
