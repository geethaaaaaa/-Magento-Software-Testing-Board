package magentoProject;

import org.testng.annotations.Test;

import ExcelrBaseclass.AccountPage;
import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.LoginPage;

public class AccountTest extends BaseTest {

    @Test
    public void testUpdateAccountInformation() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("user@example.com", "password123");

        AccountPage accountPage = new AccountPage(driver);
        accountPage.updatePassword("currentPassword123", "newPassword123");

        
    }
}