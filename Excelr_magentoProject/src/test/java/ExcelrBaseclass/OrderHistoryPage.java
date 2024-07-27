package ExcelrBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends Basepage 
{

    public OrderHistoryPage(WebDriver driver) 
    {
        super(driver);
    }

    @FindBy(linkText = "My Orders")
    private WebElement myOrdersLink;

    public void viewOrderHistory() 
    {
        myOrdersLink.click();
    }
}

