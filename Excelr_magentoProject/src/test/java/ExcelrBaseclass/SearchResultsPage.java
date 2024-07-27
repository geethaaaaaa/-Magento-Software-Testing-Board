package ExcelrBaseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;



import java.util.List;

public class SearchResultsPage extends Basepage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-item-link")
    private List<WebElement> productLinks;

    public boolean isProductListed(String productName) {
        return productLinks.stream().anyMatch(link -> link.getText().contains(productName));
    }
}