package magentoProject;


import ExcelrBaseclass.ProductPage;
import ExcelrBaseclass.CartPage;
import ExcelrBaseclass.DiscountCouponPage;
import ExcelrBaseclass.HomePage;

import org.testng.annotations.Test;

public class DiscountCouponTest extends BaseTest {

    @Test
    public void testApplyDiscountCoupon() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart("Laptop");

        CartPage cartPage = new CartPage(driver);
        cartPage.viewCart();

        DiscountCouponPage discountCouponPage = new DiscountCouponPage(driver);
        discountCouponPage.applyDiscountCoupon("DISCOUNT2024");

        
    }
}
