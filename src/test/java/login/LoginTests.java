package login;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickMyAccount();
        loginPage.setUserEmail("magdacadis@yahoo.com");
        loginPage.setUserPassword("Altexparola");
        loginPage.clickAutenticateButton();


    }


}
