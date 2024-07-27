package magentoProject;

import org.testng.annotations.Test;

import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.RegistrationPage;

public class RegistrationTest extends BaseTest {

    @Test
    public void testRegistration() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.register("John", "Doe", "john.doe@example.com", "password123");

        
    }
}