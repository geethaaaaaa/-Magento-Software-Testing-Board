package magentoProject;

import org.testng.annotations.Test;

import ExcelrBaseclass.CartPage;
import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void testViewCart() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("Laptop");

        CartPage cartPage = new CartPage(driver);
        cartPage.viewCart();

        
    }

    @Test
    public void testUpdateProductQuantity() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("Laptop");

        CartPage cartPage = new CartPage(driver);
        cartPage.updateProductQuantity("Laptop", 2);

       
    }
}