package magentoProject;


import org.testng.annotations.Test;

import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
    	HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test@example.com", "password123");
        
        
    }
}