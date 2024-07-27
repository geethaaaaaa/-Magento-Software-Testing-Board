package ExcelrBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage extends Basepage {

    public FilterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "price")
    private WebElement priceFilter;

    public void filterByPriceRange(String priceRange) {
        priceFilter.sendKeys(priceRange);
        priceFilter.submit();
    }
}
