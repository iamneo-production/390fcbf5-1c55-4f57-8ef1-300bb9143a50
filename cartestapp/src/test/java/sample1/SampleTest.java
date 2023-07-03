package sample1;
import java.net.MalformedURLException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.CapabilityType;
import PageObject.BookingsPage;
import PageObject.ContactUsPage;
import PageObject.FAQPage;
import PageObject.LoginPage;
import PageObject.ManageContactUsQueryPage;
import PageObject.ManageTestimonialsPage;
import PageObject.RegisteredUsersPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleTest {

	public WebDriver driver;
	public ContactUsPage ContactUsPage;
	 public FAQPage FAQPage;
	 public LoginPage LoginPage;
	 public ManageContactUsQueryPage ManageContactUsQueryPage;
	 public BookingsPage BookingsPage;
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
		ChromeOptions chromeOptions = new ChromeOptions();
       
        driver=new RemoteWebDriver(new URL("http://localhost:4444"),chromeOptions);
       
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-dev-shm-usage");
		chromeOptions.addArguments("--no-sandbox");         

        //url page again
        System.out.println("Chrome browser is launched");
        ContactUsPage = new ContactUsPage(driver);
	    FAQPage=new FAQPage(driver);
	    LoginPage =new LoginPage(driver);
	    ManageContactUsQueryPage=new ManageContactUsQueryPage(driver);
	    BookingsPage=new BookingsPage(driver);
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
		
	}

	@When("Click on Up arrow symbol")
	public void click_on_up_arrow_symbol()  {
	    // Write code here that turns the phrase above into concrete actions
		FAQPage.checkPageDownward();
		FAQPage.checkUpArrowSymbol();	
		// driver.quit();
	}
	@When("Click on ContactUs Login")
	public void click_on_contact_us_login() {
	    // Write code here that turns the phrase above into concrete actions
	   
	   System.out.println("ContactUs page is displayed");
	}

	@When("User Enter valid FullName,Invalid EmailAddress,valid PhoneNumber,valid Message")
	public void user_enter_valid_full_name_invalid_email_address_valid_phone_number_valid_message()  {
	    // Write code here that turns the phrase above into concrete actions
	    ContactUsPage.setFullName("Admin");
	    ContactUsPage.setEmailId("admin22gmail.com");
	    ContactUsPage.setPhoneNumber("1234567890");
	    ContactUsPage.setMessage("I want latest car updates");
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/form/div[5]/button")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please include '@' in emailaddress");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("SUCCESS:Query Sent. We will contact you shortly");

		}
	
	    }

	@When("User Enter valid FullName,valid EmailAddress,Invalid PhoneNumber,valid Message")
	public void user_enter_valid_full_name_valid_email_address_invalid_phone_number_valid_message()  {
	    // Write code here that turns the phrase above into concrete actions
		ContactUsPage.setFullName("Admin");
	    ContactUsPage.setEmailId("admin@gmail.com");
	    ContactUsPage.setPhoneNumber("Hi");
	    ContactUsPage.setMessage("I want latest car updates");
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/form/div[5]/button")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please match the requested format");
			
		}
		else {
			Assert.assertTrue(false);
			System.out.println("SUCCESS:Query Sent. We will contact you shortly");
			
		}
	      
	}

	@When("User Enter valid FullName,valid EmailAddress,valid PhoneNumber,Invalid Message")
	public void user_enter_valid_full_name_valid_email_address_valid_phone_number_invalid_message()  {
	    // Write code here that turns the phrase above into concrete actions
		ContactUsPage.setFullName("Admin");
	    ContactUsPage.setEmailId("admin@gmail.com");
	    ContactUsPage.setPhoneNumber("1234567890");
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
		ContactUsPage.checkFooterClick();
    	    
    	ContactUsPage.checkUpArrowSymbol();
	    
	}

	@When("Click on Send Message button")
	public void click_on_send_message_button() {
	    // Write code here that turns the phrase above into concrete actions
		ContactUsPage.checkSendMessageButton();
		// driver.quit();
		
		
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
		//  driver.quit();
	}
	@Then("Click on LoginOrRegister Option")
	public void click_on_login_or_register_option() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setLoginOrRegister();
	    System.out.println("Login Page is displayed");
	}
	@Then("Click on SignUpHere Option")
	public void click_on_sign_up_here_option() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setSignUp();
	    System.out.println("SignUp Page is displayed");
	}

	@When("User should Enter valid FullName,Invalid PhoneNumber,valid EmailAddress,valid Password,valid Confirm Password")
	public void user_should_enter_valid_full_name_invalid_phone_number_valid_email_address_valid_password_valid_confirm_password() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.setFullName("Tester");
        LoginPage.setMobileNumber("");
        LoginPage.setEmailId("Tester92@gmail.com");
        LoginPage.setPassword("Tester@1234");
        LoginPage.setConfirmPassword("Tester@1234");
        if(driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div/div[2]/div/div/div/form/div[2]/input")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please fill this field");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Successful Credentials");
			System.out.println("Click on Ok");
		}
	   
	}
	
	@When("User should Enter valid FullName,valid PhoneNumber,Invalid EmailAddress,valid Password,valid Confirm Password")
	public void user_should_enter_valid_full_name_valid_phone_number_invalid_email_address_valid_password_valid_confirm_password()  {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.setFullName("Tester");
        LoginPage.setMobileNumber("1234567890");
        LoginPage.setEmailId("Tester92gmail.com");
        LoginPage.setPassword("Tester@1234");
        LoginPage.setConfirmPassword("Tester@1234");
        if(driver.findElement(By.xpath("//*[@id=\"emailid\"]")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please include '@' in the field");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Successful Credentials");
			System.out.println("Click on Ok");
		}
	   
	}
	@When("User should Enter valid FullName,valid PhoneNumber,valid EmailAddress,valid Password,Invalid Confirm Password")
	public void user_should_enter_valid_full_name_valid_phone_number_valid_email_address_valid_password_invalid_confirm_password()  {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.setFullName("Tester");
        LoginPage.setMobileNumber("1234567890");
        LoginPage.setEmailId("Tester92@gmail.com");
        LoginPage.setPassword("Tester@1234");
        LoginPage.setConfirmPassword("");
        if(driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div/div[2]/div/div/div/form/div[5]/input")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please fill this field");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Successful Credentials");
			System.out.println("Click on Ok");
		}
	    
	}
	
	@When("User should Enter valid InFullName,Invalid PhoneNumber,Invalid EmailAddress,Invalid Password,Invalid Confirm Password")
	public void user_should_enter_valid_in_full_name_invalid_phone_number_invalid_email_address_invalid_password_invalid_confirm_password()  {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.setFullName("");
        LoginPage.setMobileNumber("");
        LoginPage.setEmailId("");
        LoginPage.setPassword("");
        LoginPage.setConfirmPassword("");
        if(driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div/div[2]/div/div/div/form/div[1]/input")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please fill this field");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Successful Credentials");
			System.out.println("Click on Ok");
		}
	    
	}
	@When("User should Enter valid FullName,valid PhoneNumber,valid EmailAddress,valid Password,valid Confirm Password")
	public void user_should_enter_valid_full_name_valid_phone_number_valid_email_address_valid_password_valid_confirm_password()  {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.setFullName("Tester");
        LoginPage.setMobileNumber("1234567890");
        LoginPage.setEmailId("Tester92@gmail.com");
        LoginPage.setPassword("Tester@1234");
        LoginPage.setConfirmPassword("Tester@1234");
        if(driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div/div[2]/div/div/div/form/div[1]/input")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Successful Credentials");
			System.out.println("Click on Ok");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Unsuccessful Credentials");
		}
	    
	}


	@When("Click on I agree with terms and conditions")
	public void click_on_i_agree_with_terms_and_conditions()  {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setAgreeButton();
	    
	}
	
	@When("Click on SignUp button")
	public void click_on_sign_up_button()  {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setSignUpButton();
		// driver.quit();
	    
	    }
	
	@When("User Enter Email id and password")
public void user_enter_email_id_and_password() {
    // Write code here that turns the phrase above into concrete actions
         LoginPage.setEmailAddress("Tester@gmail.com");
	     LoginPage.setPasswordLogin("Tester@1234");
	     System.out.println("Login Successful");
}

	@When("Click on LoginButton")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setLogin();
	}

// 	@When("User open url {string}")
// public void user_open_url(String string) {
//     // Write code here that turns the phrase above into concrete actions
//     driver.get(string);
// }

	@When("Check the header on the Login profile")
	public void check_the_header_on_the_login_profile() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setHeader();
	}
	@When("Click on DownArrowSymbol beside profile")
	public void click_on_down_arrow_symbol_beside_profile() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setDownArrowSymbol();
	    }
	@When("Click on ProfileSettings")
	public void click_on_profile_settings() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setProfileSettings();
	}

	@When("Enter DateOfBirth,Address,Country,City")
	public void enter_date_of_birth_address_country_city() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setDateOfBirth("22/01/2002");
	    LoginPage.setAddress("Rajendra Nagar");
	    LoginPage.setCountry("India");
	    LoginPage.setCity("Hyderabad");
	}

	@When("Click on SaveChanges Option")
	public void click_on_save_changes_option() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setUpdateProfile();
	    System.out.println("Success:Profile Updated successfully");
	}

	@Then("Check the pop-up box")
	public void check_the_pop_up_box() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setQuerySent();
	    LoginPage.setFooterPS();
        
	}

	@When("Click on UpArrowSymbol again1")
	public void click_on_up_arrow_symbol_again1() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setUpArrowSymbolagain1();
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
		// driver.quit();
	}
	@When("Click on UpdatePassword Option")
	public void click_on_update_password_option() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setUpdatePassword();
	}

	@When("Check the Page")
	public void check_the_page()  {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.findElement(By.xpath("/html/body")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Page failed");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Page passed");
		}
		LoginPage.setSignOut();
	    driver.quit();
	}
	@When("Click on MyBookings Option")
	public void click_on_my_bookings_option() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setMyBooking();
	}

	@When("Check the BookingNo")
	public void check_the_booking_no() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setBookingNo("808835028");
	}

	@When("Check the Confirm or NotYetConfirm button")
	public void check_the_confirm_or_not_yet_confirm_button() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setNotYetConfirmedButton();
	}

	@When("Check the Grand Total Price")
	public void check_the_grand_total_price() {
	    // Write code here that turns the phrase above into concrete actions
	   LoginPage.setGrandPrice();
	   System.out.println("My Bookings page is checked");
	   driver.navigate().back();

	}
	@When("User Click on Bookings")
	public void user_click_on_bookings()  {
	    // Write code here that turns the phrase above into concrete actions
	    BookingsPage.setDownArrowSymbol();
	}

	@When("User Click on New Option")
	public void user_click_on_new_option() {
	    // Write code here that turns the phrase above into concrete actions
	    BookingsPage.setNewBookings();
	   
	}

	@Then("Verify the NewBookingsPage")
	public void verify_the_new_bookings_page() {
	    // Write code here that turns the phrase above into concrete actions
		BookingsPage.setNewBookingsPage();
	}

	@When("Click on Search Option")
	public void click_on_search_option() {
	    // Write code here that turns the phrase above into concrete actions
	    BookingsPage.setSearchBox("808835028");
	}

	@When("Enter anyone details among valid FullName,valid BookingNo,valid Vehicle,valid FromDate,Valid ToDate,Valid Status,valid PostingDate,valid Actions1")
	public void enter_anyone_details_among_valid_full_name_valid_booking_no_valid_vehicle_valid_from_date_valid_to_date_valid_status_valid_posting_date_valid_actions1() {
	    // Write code here that turns the phrase above into concrete actions
	    BookingsPage.setFullName();
	    BookingsPage.setBookingNo();
	    BookingsPage.setVehicle();
	    BookingsPage.setFromDate();
	    BookingsPage.setToDate();
	    BookingsPage.setStatus();
	    BookingsPage.setPostingDate();
	    BookingsPage.setAction();
	    BookingsPage.setprint();
	}
	@When("User Click on Bookings1")
	public void user_click_on_bookings1() {
	    // Write code here that turns the phrase above into concrete actions
	    BookingsPage.setDownArrowSymbol();
	    
	}

	@When("User Click on New Option1")
	public void user_click_on_new_option1() {
	    // Write code here that turns the phrase above into concrete actions
	    BookingsPage.setNewBookings();
	   
	   
	}
    

	@When("Click on actions button")
	public void click_on_actions_button() {
	    // Write code here that turns the phrase above into concrete actions
	    BookingsPage.setAction();
	    
	}

	@When("Change action to ConfirmBooking,cancelBooking")
	public void change_action_to_confirm_booking_cancel_booking() {
	    // Write code here that turns the phrase above into concrete actions
		BookingsPage.setprint();
	    
	}

	@When("Select the Show entries button5")
	public void select_the_show_entries_button5() {
	    // Write code here that turns the phrase above into concrete actions
	    BookingsPage.setEntries();
	}

	@When("Check the no of entries5")
	public void check_the_no_of_entries5() {
	    // Write code here that turns the phrase above into concrete actions
		 BookingsPage.setEntries25();
		 BookingsPage.setInfo();
		 System.out.println("Bookings page  is checked ");
	}
	
	@When("Click on Post Testimonial Option")
	public void click_on_post_testimonial_option() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.setPostAtTestmonial();
	}

	@When("Enter the Message in Testimonail Box")
	public void enter_the_message_in_testimonail_box() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.setTestimonialMessage("GOOD SERVICES");
	}

	@When("Click on Save button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setsave();
	}

	@Then("Check the pop-up Box Successful or not")
	public void check_the_pop_up_box_successful_or_not()  {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setSuccessfulMessage();
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("SUCCESS:Testimonail submitted successfully");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Query failed");
		}
	    
	    LoginPage.setFooterSelect();
	    LoginPage.setArrow();
		driver.navigate().back();
		
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
		// driver.quit();
	}
	@When("Click on My Testimonial Option")
	public void click_on_my_testimonial_option() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setMyTestimonial();
	}

	@When("Check the My Testimonial page")
	public void check_the_my_testimonial_page() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage.setMyTestimonialPage();
	    if(driver.findElement(By.xpath("/html/body")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Page failed");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Page successful");
		}
		LoginPage.setSignOut();
		 driver.quit();
	}
	    @When("Click on SignOut Login")
	    public void click_on_sign_out_login() {
	        // Write code here that turns the phrase above into concrete actions
	        LoginPage.setSignOut();
	        System.out.println("Sign out successful");
			driver.quit();
	    }
	}


