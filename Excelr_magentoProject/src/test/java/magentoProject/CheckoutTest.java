package magentoProject;


import org.testng.annotations.Test;

import ExcelrBaseclass.CartPage;
import ExcelrBaseclass.CheckoutPage;
import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.ProductPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void testGuestUserCheckout() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("Laptop");

        CartPage cartPage = new CartPage(driver);
        cartPage.viewCart();
        cartPage.proceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillCheckoutForm("guest@example.com", "Guest", "User", "123 Main St", "City", "12345", "1234567890");

    }
}
