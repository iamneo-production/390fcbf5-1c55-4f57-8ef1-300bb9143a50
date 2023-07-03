package BaseTest;

import org.openqa.selenium.WebDriver;
import PageObject.FAQPage;
import PageObject.ContactUsPage;
import PageObject.ManageContactUsQueryPage;
import PageObject.ManageTestimonialsPage;
import PageObject.RegisteredUsersPage;

public class BaseClass {
	public static WebDriver driver;
    public ContactUsPage ContactUsPage;
    public FAQPage  FAQPage;
    public ManageContactUsQueryPage ManageContactUsQueryPage;
    public  ManageTestimonialsPage ManageTestimonialsPage;
    public RegisteredUsersPage RegisteredUsersPage;
}
