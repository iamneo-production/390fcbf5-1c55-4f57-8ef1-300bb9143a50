package stepDefinition;
import java.net.MalformedURLException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.CapabilityType;
import pageObject.ContactUsPage;
import pageObject.FAQPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ManageContactusQuerypage;
import pageObject.ManageTestimonialsPage;
import pageObject.RegisteredUsersPage;

import java.net.URL;

public class ChetanaStepDefinitions {

	public WebDriver driver=null;
	public ContactUsPage ContactUsPage;
	 public FAQPage FAQPage;
	 public ManageContactusQuerypage ManageContactUsQueryPage;
	 public ManageTestimonialsPage ManageTestimonialsPage;
	 public RegisteredUsersPage RegisteredUsersPage;
    @After
	public void tearDown(){
      if(driver!=null){
		driver.quit();
	  }
	}
	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() throws MalformedURLException {
	    // Write code here that turns the phrase above into concrete actions
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
        //url page again
        System.out.println("Chrome browser is launched");
        ContactUsPage = new ContactUsPage(driver);
	    FAQPage=new FAQPage(driver);
	    ManageContactUsQueryPage=new ManageContactusQuerypage(driver);
	    ManageTestimonialsPage=new ManageTestimonialsPage(driver);
	    RegisteredUsersPage=new RegisteredUsersPage(driver);    
	}
	@When("User opens url {string}")
	public void user_opens_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	} 
	@When("Click on FAQ Login")
	public void click_on_faq_login() {
	    // Write code here that turns the phrase above into concrete actions
		 FAQPage.checkFAQButton();
	}
	@Then("User should be able to view the message")
	public void user_should_be_able_to_view_the_message() {
	    // Write code here that turns the phrase above into concrete actions
		FAQPage.checkFAQMessage();
		System.out.println("FAQ page is displayed ");
		tearDown();
	}
	@When("Click on ContactUs Login")
	public void click_on_contact_us_login() {
	    // Write code here that turns the phrase above into concrete actions
	   
	   System.out.println("ContactUs page is displayed");
	}

	@When("User Enter Invalid FullName,Invalid EmailAddress,Invalid PhoneNumber,Invalid Message")
	public void user_enter_invalid_full_name_invalid_email_address_invalid_phone_number_invalid_message() {
	    // Write code here that turns the phrase above into concrete actions
		ContactUsPage.setFullName("");
	    ContactUsPage.setEmailId("");
	    ContactUsPage.setPhoneNumber("");
	    ContactUsPage.setMessage("");
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/form/div[5]/button")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please fill out this field");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("SUCCESS:Query Sent. We will contact you shortly");
		}    
	}

	@When("User Enter valid FullName,valid EmailAddress,valid PhoneNumber,valid Message")
	public void user_enter_valid_full_name_valid_email_address_valid_phone_number_valid_message()  {
	    // Write code here that turns the phrase above into concrete actions
		ContactUsPage.setFullName("Admin");
	    ContactUsPage.setEmailId("admin@gmail.com");
	    ContactUsPage.setPhoneNumber("1234567890");
	    ContactUsPage.setMessage("I want latest car updates");
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div[1]")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("SUCCESS:Query Sent. We will contact you shortly");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Query Failed");
		}
		   
	}

	@When("Click on Send Message button")
	public void click_on_send_message_button() {
	    // Write code here that turns the phrase above into concrete actions
		ContactUsPage.checkSendMessageButton();
		tearDown();
	}

	@Then("User should be able to view the Admin Page")
	public void user_should_be_able_to_view_the_admin_page() {
	    // Write code here that turns the phrase above into concrete actions
	   ManageContactUsQueryPage.setAdminPage();
	   System.out.println("Admin successful");
	}

	@When("User Enter UserName,Password")
	public void user_enter_user_name_password() {
	    // Write code here that turns the phrase above into concrete actions
		ManageContactUsQueryPage.setUserName("admin");
		ManageContactUsQueryPage.setPassword("Test@12345");
	}

	@When("Click on Login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    ManageContactUsQueryPage.setLogin();
	    System.out.println("Login successful");
	}

	@When("User Click on ManageContactUsQuery")
	public void user_click_on_manage_contact_us_query() {
	    // Write code here that turns the phrase above into concrete actions
		ManageContactUsQueryPage.setManageContactUsQueryClick();
	}

	@Then("Verify the ManageContactUsPage")
	public void verify_the_manage_contact_us_page() {
	    // Write code here that turns the phrase above into concrete actions
	   ManageContactUsQueryPage.setManageContactUsQueryPage1();
	}

	@When("Click on Search button")
	public void click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		ManageContactUsQueryPage.setSearchBoxClick("Admin");
	}

	@When("Enter anyone details among valid FullName,valid EmailAddress,valid PhoneNumber,valid Message,valid PostingDate,valid Action")
	public void enter_anyone_details_among_valid_full_name_valid_email_address_valid_phone_number_valid_message_valid_posting_date_valid_action() {
	    // Write code here that turns the phrase above into concrete actions
		ManageContactUsQueryPage.setFullName();
		ManageContactUsQueryPage.setEmailAddress();
		ManageContactUsQueryPage.setPhoneNumber();
		ManageContactUsQueryPage.setMessage();
		ManageContactUsQueryPage.setPostingDate();
	}

	@When("Click on action button")
	public void click_on_action_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ManageContactUsQueryPage.setReadAction();
	  
	}

	@When("Select the Show entries Option")
	public void select_the_show_entries_option() {
	    // Write code here that turns the phrase above into concrete actions
	  ManageContactUsQueryPage.setEntries();
	}

	@When("Check the no of entries made")
	public void check_the_no_of_entries_made() {
	    // Write code here that turns the phrase above into concrete actions
		 ManageContactUsQueryPage.setEntries100();
		 ManageContactUsQueryPage.setQuerypage();
		 System.out.println("Manage Contact Us Query Page is checked");
		tearDown();
	}
	
	@When("User Click on RegUsers")
	public void user_click_on_reg_users() {
	    // Write code here that turns the phrase above into concrete actions
	    RegisteredUsersPage.setRegUsers();
	}

	@Then("Verify the RegisteredUsersPage")
	public void verify_the_registered_users_page() {
	    // Write code here that turns the phrase above into concrete actions
	    RegisteredUsersPage.setRegUsersPage();
	}

	@When("Click on Search button again2")
	public void click_on_search_button_again2()  {
	    // Write code here that turns the phrase above into concrete actions
	    RegisteredUsersPage.setSearchBox("Tester@gmail.com");
	    
	    
	}
	@When("Select the Show entries Option1")
	public void select_the_show_entries_option1() {
	    // Write code here that turns the phrase above into concrete actions
	    RegisteredUsersPage.setEntries();
	}

	@When("Check the no of entries made1")
	public void check_the_no_of_entries_made1() {
	    // Write code here that turns the phrase above into concrete actions
		RegisteredUsersPage.setEntries50();
		System.out.println("Reg Users page  is checked and action should be read");
		tearDown();
	}
	
	@When("User Click on ManageTestimonials")
	public void user_click_on_manage_testimonials() {
	    // Write code here that turns the phrase above into concrete actions
	    ManageTestimonialsPage.setManageTestimonialsButton();
	}

	@Then("Verify the ManageTestimonialsPage")
	public void verify_the_manage_testimonials_page() {
	    // Write code here that turns the phrase above into concrete actions
	   ManageTestimonialsPage.setManageTestimonialPage();
	}

	@Then("Click on Search button again0")
	public void click_on_search_button_again0() {
	    // Write code here that turns the phrase above into concrete actions
	    ManageTestimonialsPage.setSearchBox("Tester");
	}

	@When("Enter anyone details among valid FullName,valid EmailAddress,valid Testimonials,valid PostingDate,valid Action")
	public void enter_anyone_details_among_valid_full_name_valid_email_address_valid_testimonials_valid_posting_date_valid_action() {
	    // Write code here that turns the phrase above into concrete actions
	    ManageTestimonialsPage.setFullName();
	    ManageTestimonialsPage.setEmailAddress();
	    ManageTestimonialsPage.setTestimonials();
	    ManageTestimonialsPage.setPostingDate();
	    ManageTestimonialsPage.setActionButton();
	    
	}

	@When("Click on action button again0")
	public void click_on_action_button_again0() {
	    // Write code here that turns the phrase above into concrete actions
		ManageTestimonialsPage.setActionButton();
		ManageTestimonialsPage.setSuccessfulMessage();
		if(driver.findElement(By.xpath("//*[@id=\"zctb\"]/tbody/tr/td[6]/a")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Query sent successfully");
			System.out.println("Click on Ok and Cancel");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Query Failed");
		}
		
		ManageTestimonialsPage.setSuccessfulMessage();
	}
	@When("Select the Show entries Option2")
	public void select_the_show_entries_option2() {
	    // Write code here that turns the phrase above into concrete actions
	    ManageTestimonialsPage.setEntries();
	}

	@When("Check the no of entries made2")
	public void check_the_no_of_entries_made2() {
	    // Write code here that turns the phrase above into concrete actions
	    ManageTestimonialsPage.setEntries25();
	    System.out.println("Manage Testimonial is checked");
		tearDown();
	}
	}


