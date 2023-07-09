package BaseTest;

import org.openqa.selenium.WebDriver;
import pageObject.FAQPage;
import pageObject.ContactUsPage;
import pageObject.ManageContactusQuerypage;
import pageObject.ManageTestimonialsPage;
import pageObject.RegisteredUsersPage;

public class BaseClass {
	public static WebDriver driver;
    public ContactUsPage ContactUsPage;
    public FAQPage  FAQPage;
    public ManageContactusQuerypage ManageContactUsQueryPage;
    public  ManageTestimonialsPage ManageTestimonialsPage;
    public RegisteredUsersPage RegisteredUsersPage;
}
