package magentoProject;


import org.testng.annotations.Test;

import ExcelrBaseclass.FilterPage;
import ExcelrBaseclass.HomePage;

public class FilterTest extends BaseTest {

    @Test
    public void testFilterByPriceRange() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProductCategory("Electronics");

        FilterPage filterPage = new FilterPage(driver);
        filterPage.filterByPriceRange("$100 - $200");

      
    }
}
