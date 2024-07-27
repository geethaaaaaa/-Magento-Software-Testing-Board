package ExcelrBaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends Basepage {

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "My Wishlist")
    private WebElement wishlistLink;

    @FindBy(xpath = "//a[@title='Add to Wishlist']")
    private WebElement addToWishlistButton;

    @FindBy(xpath = "//a[@title='Remove']")
    private WebElement removeFromWishlistButton;

    public void addToWishlist(String productName) {
        WebElement product = driver.findElement(By.linkText(productName));
        product.click();
        addToWishlistButton.click();
    }

    public void removeFromWishlist(String productName) {
        WebElement product = driver.findElement(By.linkText(productName));
        product.click();
        removeFromWishlistButton.click();
    }
}
