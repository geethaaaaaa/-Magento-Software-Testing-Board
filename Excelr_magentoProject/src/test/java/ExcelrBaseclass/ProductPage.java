package ExcelrBaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Basepage {
	public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindBy(xpath = "//button[@title='Remove']")
    private WebElement removeFromCartButton;

    public void addProductToCart() {
        addToCartButton.click();
    }

    public void removeProductFromCart() {
        removeFromCartButton.click();
    }

    public void addProductToCart(String productName) {
       
        WebElement product = driver.findElement(By.linkText(productName));
        product.click();
        addToCartButton.click();
    }

    public void removeProductFromCart(String productName) {
        
        WebElement product = driver.findElement(By.linkText(productName));
        product.click();
        removeFromCartButton.click();
    }
}