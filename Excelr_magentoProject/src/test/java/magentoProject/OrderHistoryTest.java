package magentoProject;




import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.LoginPage;
import ExcelrBaseclass.OrderHistoryPage;

import org.testng.annotations.Test;

public class OrderHistoryTest extends BaseTest {

    @Test
    public void testViewOrderHistory() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("user@example.com", "password123");

        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        orderHistoryPage.viewOrderHistory();

    }
}