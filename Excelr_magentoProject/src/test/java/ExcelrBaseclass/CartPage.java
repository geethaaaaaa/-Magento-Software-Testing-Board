package ExcelrBaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Basepage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "View Cart")
    private WebElement viewCartLink;

    @FindBy(xpath = "//input[@title='Qty']")
    private WebElement quantityInput;
    
    @FindBy(xpath = "//button[@title='Proceed to Checkout']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//button[@title='Update']")
    private WebElement updateButton;

    public void viewCart() {
        viewCartLink.click();
    }

    public void updateProductQuantity(String productName, int quantity) {
        
        WebElement product = driver.findElement(By.linkText(productName));
        product.click();
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(quantity));
        updateButton.click();
    }
    public void proceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}