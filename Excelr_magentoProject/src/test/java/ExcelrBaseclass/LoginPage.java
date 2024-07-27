package ExcelrBaseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "pass")
    private WebElement passwordInput;

    @FindBy(id = "send2")
    private WebElement loginButton;

    public void login(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}

