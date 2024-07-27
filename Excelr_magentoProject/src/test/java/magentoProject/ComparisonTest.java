package magentoProject;



import org.testng.annotations.Test;

import ExcelrBaseclass.ComparisonPage;
import ExcelrBaseclass.HomePage;

public class ComparisonTest extends BaseTest {

    @Test
    public void testProductComparison() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        ComparisonPage comparisonPage = new ComparisonPage(driver);
        comparisonPage.addProductToCompare("Laptop");
        comparisonPage.addProductToCompare("Smartphone");
        comparisonPage.compareProducts();

    }
}