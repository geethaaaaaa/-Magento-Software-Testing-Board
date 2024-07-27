package ExcelrBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Basepage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "street_1")
    private WebElement addressInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "postcode")
    private WebElement postcodeInput;

    @FindBy(id = "telephone")
    private WebElement telephoneInput;

    @FindBy(xpath = "//button[@title='Next']")
    private WebElement nextButton;

    public void fillCheckoutForm(String email, String firstName, String lastName, String address, String city, String postcode, String telephone) {
        emailInput.sendKeys(email);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        postcodeInput.sendKeys(postcode);
        telephoneInput.sendKeys(telephone);
        nextButton.click();
    }
}