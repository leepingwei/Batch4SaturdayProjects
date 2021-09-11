package campus.pages;

public class Helper extends Base{

    protected void loginToCampus(String username,String password){
        LoginPage loginpage = new LoginPage();
        loginpage.clickOnAcceptCookiesButton();
        loginpage.enterUserName(username);
        loginpage.enterPassword(password);
        loginpage.clickOnLoginButton();
    }

    protected void openCampusPageAndMaximizeWindow(){
        maximizeWindow();
        openPage("https://test.mersys.io/");
    }
}
