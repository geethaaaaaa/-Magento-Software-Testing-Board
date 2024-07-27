package ExcelrBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage {

	public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    @FindBy(id = "search")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@title='Search']")
    private WebElement searchButton;

    @FindBy(linkText = "Electronics")
    private WebElement electronicsCategory;

    public void clickSignIn() {
        signInLink.click();
    }

    public void searchForProduct(String productName) {
        searchInput.sendKeys(productName);
        searchButton.click();
    }

    public void navigateToProductCategory(String category) {
        if (category.equalsIgnoreCase("Electronics")) {
            electronicsCategory.click();
        }
        // Add more categories as needed
    }
}