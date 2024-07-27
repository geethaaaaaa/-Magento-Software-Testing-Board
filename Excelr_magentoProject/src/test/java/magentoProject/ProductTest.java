package magentoProject;
import org.testng.annotations.Test;

import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("Laptop");

        
    }

    @Test
    public void testRemoveProductFromCart() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("Laptop");
        productPage.removeProductFromCart("Laptop");

        
    }
}
