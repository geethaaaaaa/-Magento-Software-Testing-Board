package magentoProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.SearchResultsPage;


public class HomePageTest extends BaseTest {

    @Test
    public void testHomePageTitle() {
        String expectedTitle = "Home Page - Magento";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Home page title is incorrect.");
    }

    @Test
    public void testSearchFunctionality() {
        HomePage homePage = new HomePage(driver);
        homePage.searchForProduct("Laptop");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        Assert.assertTrue(searchResultsPage.isProductListed("Laptop"), "Product 'Laptop' is not listed in the search results.");
    }
}