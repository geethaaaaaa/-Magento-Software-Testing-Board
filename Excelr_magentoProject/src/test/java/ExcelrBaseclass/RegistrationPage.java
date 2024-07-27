package ExcelrBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Basepage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "email_address")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "confirmation")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[@title='Register']")
    private WebElement registerButton;

    public void register(String firstName, String lastName, String email, String password) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);
        registerButton.click();
    }
}