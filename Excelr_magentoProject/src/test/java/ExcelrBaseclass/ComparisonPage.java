package ExcelrBaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonPage extends Basepage {

    public ComparisonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Add to Compare']")
    private WebElement addToCompareButton;

    @FindBy(linkText = "Compare")
    private WebElement compareLink;

    public void addProductToCompare(String productName) {
        WebElement product = driver.findElement(By.linkText(productName));
        product.click();
        addToCompareButton.click();
    }

    public void compareProducts() {
        compareLink.click();
    }
}