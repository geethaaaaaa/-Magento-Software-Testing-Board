package magentoProject;


import org.testng.annotations.Test;

import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.LoginPage;
import ExcelrBaseclass.WishlistPage;

public class WishlistTest extends BaseTest {

    @Test
    public void testAddToWishlist() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("user@example.com", "password123");

        WishlistPage wishlistPage = new WishlistPage(driver);
        wishlistPage.addToWishlist("Laptop");

    }

    @Test
    public void testRemoveFromWishlist() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("user@example.com", "password123");

        WishlistPage wishlistPage = new WishlistPage(driver);
        wishlistPage.addToWishlist("Laptop");
        wishlistPage.removeFromWishlist("Laptop");

    }
}
