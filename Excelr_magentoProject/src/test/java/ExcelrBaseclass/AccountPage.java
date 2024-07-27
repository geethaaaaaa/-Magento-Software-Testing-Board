package ExcelrBaseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Basepage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "current-password")
    private WebElement currentPasswordInput;

    @FindBy(id = "password")
    private WebElement newPasswordInput;

    @FindBy(id = "password-confirmation")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[@title='Save']")
    private WebElement saveButton;

    public void updatePassword(String currentPassword, String newPassword) {
        currentPasswordInput.sendKeys(currentPassword);
        newPasswordInput.sendKeys(newPassword);
        confirmPasswordInput.sendKeys(newPassword);
        saveButton.click();
    }
}