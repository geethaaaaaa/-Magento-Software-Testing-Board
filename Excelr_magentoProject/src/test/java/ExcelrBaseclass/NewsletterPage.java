package ExcelrBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterPage extends Basepage {

    public NewsletterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "newsletter")
    private WebElement newsletterInput;

    @FindBy(xpath = "//button[@title='Subscribe']")
    private WebElement subscribeButton;

    public void subscribeToNewsletter(String email) {
        newsletterInput.sendKeys(email);
        subscribeButton.click();
    }
}
