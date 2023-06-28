package BaseTest;

import org.openqa.selenium.WebDriver;
import PageObject.FAQPage;
import PageObject.ContactUsPage;
import PageObject.LoginPage;
import PageObject.ManageContactUsQueryPage;
import PageObject.BookingsPage;
import PageObject.ManageTestimonialsPage;
import PageObject.RegisteredUsersPage;

public class BaseClass {
	public static WebDriver driver;
    public ContactUsPage ContactUsPage;
    public FAQPage  FAQPage;
    public LoginPage  LoginPage;
    public ManageContactUsQueryPage ManageContactUsQueryPage;
    public BookingsPage BookingsPage;
    public  ManageTestimonialsPage ManageTestimonialsPage;
    public RegisteredUsersPage RegisteredUsersPage;
}
