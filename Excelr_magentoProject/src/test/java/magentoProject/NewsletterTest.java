package magentoProject;


import org.testng.annotations.Test;

import ExcelrBaseclass.HomePage;
import ExcelrBaseclass.NewsletterPage;

public class NewsletterTest extends BaseTest {

    @Test
    public void testSubscribeToNewsletter() {
        HomePage homePage = new HomePage(driver);
        
        NewsletterPage newsletterPage = new NewsletterPage(driver);
        newsletterPage.subscribeToNewsletter("user@example.com");

        
    }
}
