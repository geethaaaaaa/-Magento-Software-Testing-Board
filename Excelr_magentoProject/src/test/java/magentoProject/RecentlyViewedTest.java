package magentoProject;


import org.testng.annotations.Test;

import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.ProductPage;
import ExcelrBaseclass.RecentlyViewedPage;

public class RecentlyViewedTest extends BaseTest {

    @Test
    public void testViewRecentlyViewedProducts() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("Laptop");

        RecentlyViewedPage recentlyViewedPage = new RecentlyViewedPage(driver);
        recentlyViewedPage.viewRecentlyViewedProducts();

        // Add assertions to verify recently viewed products
    }
}
