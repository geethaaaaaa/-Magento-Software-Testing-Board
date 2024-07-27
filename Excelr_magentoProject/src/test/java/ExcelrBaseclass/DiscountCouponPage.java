package ExcelrBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscountCouponPage extends Basepage {

    public DiscountCouponPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "coupon_code")
    private WebElement couponCodeInput;

    @FindBy(xpath = "//button[@title='Apply Coupon']")
    private WebElement applyCouponButton;

    public void applyDiscountCoupon(String couponCode) 
    {
        couponCodeInput.sendKeys(couponCode);
        applyCouponButton.click();
    }
}
