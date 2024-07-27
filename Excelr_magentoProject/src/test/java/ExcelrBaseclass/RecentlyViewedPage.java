package ExcelrBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecentlyViewedPage extends Basepage {

    public RecentlyViewedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Recently Viewed")
    private WebElement recentlyViewedLink;

    public void viewRecentlyViewedProducts() {
        recentlyViewedLink.click();
    }
}