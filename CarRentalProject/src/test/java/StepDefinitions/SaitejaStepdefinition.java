package StepDefinitions;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import PageObject.Aboutuspage;
import PageObject.Homepage;
import PageObject.ProfileSettings;
import PageObject.UserModule;
import PageObject.carlistingpage;
public class SaitejaStepdefinition {
	public WebDriver driver = null;
	public Aboutuspage aboutuspage;
	public carlistingpage carlisting;
	public Homepage homepage; 
	public UserModule usermodule;
	public ProfileSettings profile;
	
	@Before
	public void browser_setup() {
		//driver = new ChromeDriver();
	}
	
	@After
	public void browser_tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
	/**
	 * @throws MalformedURLException
	 * 
	 */
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() throws MalformedURLException {
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chromedriver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		//driver = new ChromeDriver();

		//driver.manage().window().maximize();
		//DesiredCapabilities capabilities = new DesiredCapabilities();

       // capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-dev-shm-usage");



        driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		
		aboutuspage = new Aboutuspage(driver);
		carlisting = new carlistingpage(driver);
		homepage = new Homepage(driver);
		usermodule = new UserModule(driver);
		profile = new ProfileSettings(driver);
	 
	}

	@When("user navigates to url")
	public void user_navigates_to_url() {
		driver.navigate().to("https://carrental.neohire.io/");
	}
	
	@Then("user shoud be able to view carrental portal")
	public void user_shoud_be_able_to_view_carrental_portal() {
	    aboutuspage.checkCarRentalPortal();
	}

	@And("click on About us button")
	public void click_on_About_us_button() throws InterruptedException {
	    aboutuspage.AboutusButton();
	    Thread.sleep(2000);
	}

	@Then("user should be able to view About us Page")
	public void user_should_be_able_to_view_About_us_Page() throws InterruptedException {
	    aboutuspage.checkAboutuspage();
	    Thread.sleep(2000);
	}
	
	@When("user clicks on CarListing button")
	public void click_on_CarListing_button() throws InterruptedException {
	    carlisting.Carlistingbtn();
	    Thread.sleep(2000);
	}
	

	@Then("user should be able to view Car Listing Page")
	public void user_should_be_able_to_view_Car_Listing_Page() throws InterruptedException {
	    carlisting.checkcarlistingpage();
	    Thread.sleep(2000);
	}

	@And("list out the available car details")
	public void list_out_the_available_car_details() throws InterruptedException {
	   carlisting.listoutcars();
	   Thread.sleep(2000);
	}

	@And("list out all the recently listed cars")
	public void list_out_all_the_recently_listed_cars() throws InterruptedException {
	   carlisting.checkrecentlylistedcars();
	   Thread.sleep(2000);
	}
	@When("click on one of the recently listed cars")
	public void click_on_one_of_the_recently_listed_cars() throws InterruptedException {
	    carlisting.RecentlyListedCar();
	    Thread.sleep(1000);
	}

	@Then("user should be able to view the details of car")
	public void user_should_be_able_to_view_the_details_of_car() throws InterruptedException {
	    carlisting.checkrecentlylstcar();
	    Thread.sleep(2000);
	}
	
	
	@And("Select Brand Type")
	public void select_Brand_Type() {
	    carlisting.selectbrand();
	}

	@And("Select Fuel Type")
	public void select_Fuel_Type() throws InterruptedException {
		carlisting.selectfuel();
		Thread.sleep(2000);
	}

	@And("click on Find Your Car")
	public void click_on_Find_Your_Car() throws InterruptedException {
	   carlisting.Searchbtn();
	   Thread.sleep(2000);
	}

	@Then("user should be able to view Car Listings")
	public void user_should_be_able_to_view_Car_Listings() throws InterruptedException {
	    carlisting.checkcarlistings();
	    Thread.sleep(2000);
	}

	@And("list out all the cars")
	public void list_out_all_the_cars() throws InterruptedException {
	    carlisting.listoutcars();
	    Thread.sleep(2000);
	    
	}
	
	@When("click on view details")
	public void click_on_view_details() throws InterruptedException {
	    carlisting.Viewdetailsbtn();
	    Thread.sleep(2000);
	}

	@Then("the user should be able to view car details")
	public void the_user_should_be_able_to_view_car_details() throws InterruptedException {
	   carlisting.checkcardetails();
	   Thread.sleep(2000);
	}
	
	@When("click on Accessories button")
	public void click_on_Accessories_button() throws InterruptedException {
	    carlisting.Accessoriesbtn();
	    Thread.sleep(2000);
	}

	@Then("all the accessories are displayed")
	public void all_the_accessories_are_displayed() throws InterruptedException {
	    carlisting.checkAccessories();
	    Thread.sleep(2000);
	}
	@And("list out all the accessories")
	public void list_out_all_the_accessories() throws InterruptedException {
	    carlisting.listoutaccessories();
	    Thread.sleep(2000);
	}
	@Then("user should list out all the similar cars")
	public void user_should_list_out_all_the_similar_cars() throws InterruptedException {
	    carlisting.listoutcars();
	    Thread.sleep(2000);
	}
	@When("click on one of the similar car")
	public void click_on_one_of_the_similar_car() {
	    carlisting.similarcarbtn();
	}

	@Then("user should be able to view details of the car")
	public void user_should_be_able_to_view_details_of_the_car() throws InterruptedException {
		carlisting.checksimilarcardetails();
		Thread.sleep(2000);
	}
	@And("click on prev button")
	public void click_on_prev_button() throws InterruptedException {
		carlisting.PrevBtn();
		Thread.sleep(2000);
	}
	@Then("user should be able to view prev image")
	public void user_should_be_able_to_view_prev_image() {
		carlisting.checkimageslider();
	}
	@When("click on next button")
	public void click_on_next_button() throws InterruptedException {
		carlisting.NextBtn();
		Thread.sleep(2000);
	}
	@Then("user should be able to view next image")
	public void user_should_be_able_to_view_next_image() {
		carlisting.checknextslider();
	}
	@And("click on Vehicle Overview button")
	public void click_on_Vehicle_OSverview_button() throws InterruptedException {
		carlisting.vehicleoverviewbtn();
		Thread.sleep(2000);
	}
	@Then("user should be able to view overview of the vehicle")
	public void user_should_be_able_to_view_overview() throws InterruptedException {
		carlisting.checkvehicleoverview();
		Thread.sleep(2000);
	}	
	@And("display the details of the car")
	public void print_the_details_of_the_car() throws InterruptedException {
	    carlisting.overviewofcar();
	    Thread.sleep(2000);
	}
	
	@When("click on FAQs button")
	public void click_on_FAQs_button() throws InterruptedException {
		homepage.FAQsbtn();
		Thread.sleep(2000);
	}

	@Then("user should be able to view FAQs Page")
	public void user_should_be_able_to_view_FAQs_Page() throws InterruptedException {
		homepage.checkfaqspage();
		Thread.sleep(2000);
	}


	@And("click on Contact us button")
	public void click_on_Contact_us_button() throws InterruptedException {
		homepage.ContactUsBtn();
		Thread.sleep(2000);
	}

	@Then("user should be able to view Contact us Page")
	public void user_should_be_able_to_view_Contact_us_Page() throws InterruptedException {
		homepage.checkcontacuspage();
		Thread.sleep(2000);
	}

	@When("type your full name")
	public void type_your_full_name() {
		homepage.FullName();
	}

	@And("type your email")
	public void type_your_email() {
		homepage.Emailadd();
	}

	@And("your phone number")
	public void your_phone_number() {
		homepage.PhoneNumber();
	}

	@And("type a message")
	public void type_a_message() throws InterruptedException{
		homepage.Message();
		Thread.sleep(2000);
	}

	@And("click on send message")
	public void click_on_send_message() throws InterruptedException {
		homepage.SendBtn();
		Thread.sleep(3000);
	}

	@Then("user should view SUCCESS")
	public void user_should_view_SUCCESS() throws InterruptedException {
		homepage.checkmessageinfo();
		Thread.sleep(2000);
	}
	
	@When("clear full name")
	public void clear_full_name() throws InterruptedException {
	   homepage.clearfullname();
	   Thread.sleep(2000);
	}

	@Then("a validation message is displayed")
	public void a_validation_message_is_displayed() throws InterruptedException {
	    homepage.checkvalidation();
	    Thread.sleep(2000);
	}

	@When("clear email")
	public void clear_email() throws InterruptedException {
	    homepage.clearemail();
	    Thread.sleep(2000);
	}

	@When("clear phone number")
	public void clear_phone_number() throws InterruptedException {
	   homepage.clearphonenumber();
	   Thread.sleep(2000);
	}

	@And("click on Admin button")
	public void click_on_Admin_button() throws InterruptedException{
		homepage.AdminBtn();
		Thread.sleep(2000);
	}
	@Then("user should be able to view Admin signin Page")
	public void user_should_view_Admin_signin_Page() throws InterruptedException {
		homepage.checkAdminPage();
		Thread.sleep(2000);
	}
	@And("click on Login\\/Register button")
	public void click_on_Login_Register_button() throws InterruptedException{
		homepage.LoginBtn();
		Thread.sleep(2000);
	}
	@Then("user should be able to view Login Page")
	public void user_should_be_able_to_view_Login_Page() throws InterruptedException {
		homepage.checkloginpage();
		Thread.sleep(2000);
	}
	@And("click on privacy button")
	public void click_on_privacy_button() throws InterruptedException {
		homepage.PrivacyBtn();
		Thread.sleep(2000);
	}
	@Then("user should be able to view privacy Page")
	public void user_should_view_Privacy_page() throws InterruptedException {
		homepage.checkprivacypage();
		Thread.sleep(2000);
	}
	@And("click on terms of use button")
	public void click_on_termsofuse_button() throws InterruptedException {
		homepage.TermsOfUsebtn();
		Thread.sleep(3000);
	}
	@Then("user should be able to Terms and Conditions Page")
	public void user_should_be_able_to_Terms_and_Conditions_Page() throws InterruptedException {
		homepage.checktermspage();
		Thread.sleep(2000);
	}
	@When("enter email address")
	public void enter_email_address() throws InterruptedException {
	    homepage.SubscribeField();
	    Thread.sleep(2000);
	}

	@And("click on subscribe button")
	public void click_on_subscribe_button() throws InterruptedException {
	    homepage.SubscribeBtn();
	    Thread.sleep(2000);
	}

	@Then("user should be able to see popup message")
	public void user_should_be_able_to_see_popup_message() throws InterruptedException {
	   homepage.checkpopupmessage();
	   Thread.sleep(2000);
	}
	
	@When("click on Service Helpline option")
	public void click_on_Service_Helpline_option() throws InterruptedException {
	    homepage.HelpLineBtn();
	    Thread.sleep(2000);
	}
	@Then("user should be able to see a popup message")
	public void user_should_be_able_to_see_a_popup_message() throws InterruptedException {
		homepage.checkhelplinepopup();
		Thread.sleep(2000);
	}

	@When("user clicks on Login\\/Register module")
	public void user_clicks_on_login_register_module() {
		usermodule.clickUserLogin();
	}
	@When("fill the form")
	public void fill_the_form() throws InterruptedException {
	//usermodule.userSignUp("gok", "987", "gok@gmail.com", "gok", "gok");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	usermodule.userLogin("rent@gmail.com", "rent");
	Thread.sleep(2000);
	}
	@When("click on Login button")
	public void click_on_login_button() {
	  usermodule.clickLogin();
	}
	@Then("welcome message will be displayed")
	public void welcome_message_will_be_displayed() throws InterruptedException {
	  usermodule.welcomeMsg();
	  Thread.sleep(2000);
	}
	@When("user click on dropdown menu")
	public void user_click_on_dropdown_menu() throws InterruptedException {
	  usermodule.clickDropdown();
	  Thread.sleep(2000);
	}

	@When("click on Post a testimonial")
	public void click_on_post_a_testimonial() throws InterruptedException {
	 usermodule.clickpost();
	 Thread.sleep(2000);
	}

	@Then("user navigates to post a testimonial page")
	public void user_navigates_to_post_a_testimonial_page() throws InterruptedException {
	    usermodule.postATestMsg();
	    Thread.sleep(2000);
	}
	@When("user enters a testimonial")
	public void user_enters_a_testimonial() throws InterruptedException {
	 usermodule.enterPostATestimonial("satisfied");
	 Thread.sleep(2000);
	}

	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
	   usermodule.clickSave();
	   Thread.sleep(2000);
	}

	@Then("testimonial submitted message will be displayed")
	public void testimonial_submitted_message_will_be_displayed() throws InterruptedException {
	String message = usermodule.getSuccessMsg();
	System.out.println(message);
	Thread.sleep(2000);
	}

	@When("admin clicks on Admin module")
	public void admin_clicks_on_admin_module() throws InterruptedException {
	//loginPage=new AdminLoginPage(driver);
	usermodule.clickAdminButton();
	Thread.sleep(2000);
	}
	@Then("admin should able to see the admin signin page")
	public void admin_should_able_to_see_the_admin_signin_page() throws InterruptedException {
	String adminpage = usermodule.adminSignInPage();
	System.out.println(adminpage+" page is displayed");
	Thread.sleep(2000);
	}
	@When("admin enters username as {string}  and password as {string}")
	public void admin_enters_username_as_and_passwrod_ad(String string, String string2) throws InterruptedException {
	usermodule.enterUsername("admin");
	usermodule.enterPassword("Test@12345");
	Thread.sleep(2000);
	}
	@When("click on login button")
	public void click_on_login_button1() throws InterruptedException {
	usermodule.clickLoginButton();
	Thread.sleep(2000);
	}

	@Then("admin should able to view car rental portal | admin panel")
	public void admin_should_able_to_view_car_rental_portal_admin_panel() throws InterruptedException {
	//dashboard.checkCarRentalPortal();
	//dashboard=new DashBoardPage(driver);
	String title = "Car Rental Portal | Admin Panel";

	String actualtitle = usermodule.AdminInterface();

	        if (title.equals(actualtitle)) {
	        System.out.println("Successfully Admin Login Page is Opened");
	        } else {
	        System.out.println("Admin Login Page is Not Opened");
	        }
	        Thread.sleep(2000);
	}
	@When("admin click on manage testimonials")
	public void admin_click_on_manage_testimonials() throws InterruptedException {
	   usermodule.clickManageTestimonial();
	   Thread.sleep(2000);
	}

	@Then("admin navigates to manage testimonial page")
	public void admin_navigates_to_manage_testimonial_page() throws InterruptedException {
	  usermodule.manageTestPageTitle();
	  Thread.sleep(2000);
	}

	@Then("verify the posted testimonial")
	public void verify_the_posted_testimonial() throws InterruptedException {
	usermodule.checkPostedTest();
	Thread.sleep(2000);
	}
	@When("click on signout option")
	public void click_on_signout_option() throws InterruptedException {
	usermodule.clickSignOut();
	Thread.sleep(2000);
	}
	@When("user clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
	   usermodule.clickSave();
	   Thread.sleep(2000);
	}

	@Then("warning message will be displayed")
	public void warning_message_will_be_displayed() throws InterruptedException {
	String message = usermodule.getValidationMsg();
	System.out.println(message);
	Thread.sleep(2000);
	}
	@Then("it should be redirected to the home page")
	public void it_should_be_redirected_to_the_home_page() throws InterruptedException {
	//Assert.assertTrue(loginPage.getHomePageTitle().contains("Car Rental Portal"));
	//loginPage=new AdminLoginPage(driver);
	String homePage = usermodule.getHomePageTitle();
	System.out.println(homePage+ " page is displayed");
	Thread.sleep(2000);
	}
	

		@Then("Click on the login\\/Register button")
		public void click_on_the_login_register_button() throws InterruptedException {
		profile.clicklogin_registerbutton();
	   Thread.sleep(2000);
	}

	@Then("Enter the Email address as {string} and password as {string}")
	public void enter_the_email_address_as_and_password_as(String string, String string2) throws InterruptedException{
	    profile.enteremail("steja7600@gmail.com");
	    profile.enterpass("9014963608");
	    Thread.sleep(2000);
	    
	}

	@Then("clicks on login button")
	public void clicks_on_login_button()throws InterruptedException {
	    profile.clickonloginbutton();
	    Thread.sleep(2000);
	}

	@Then("user should see the welcome message")
	public void user_should_see_the_welcome_message() throws InterruptedException{
	    profile.checkwelcomemessage();
	    Thread.sleep(2000);
	}
	@When("user enters invalid {string} and {string}")
	public void user_enters_invalid_and(String email, String password) throws InterruptedException {
	    profile.invalid_login(email, password);
	    Thread.sleep(2000);
	    
	}

	@Then("user should see an error message indicating {string}")
	public void user_should_see_an_error_message_indicating(String error_message) throws InterruptedException {
	    profile.geterror_message(error_message);
	    Thread.sleep(2000);
	}

	@Then("user should click on the dropdown and select the profile settings")
	public void user_should_click_on_the_dropdown_and_select_the_profile_settings()throws InterruptedException {
	   profile.clickondropdown();
	   Thread.sleep(2000);
	}

	@Then("user should see the Your Profile settings page")
	public void user_should_see_the_your_profile_settings_page()throws InterruptedException {
	    profile.checkprofilepage();
	    Thread.sleep(2000);
	}

	@When("user enter all the details")
	public void user_enter_all_the_details() throws InterruptedException{
	   profile.enterfullname("saiteja");
	   profile.enterphonenumber("9876543210");
	   Thread.sleep(2000);
	}

	@When("click on save changes")
	public void click_on_save_changes()throws InterruptedException {
	    profile.clickonsavechangesbutton();
	    Thread.sleep(2000);
	}
	@Then("user should see the success message in profile page")
	public void user_should_see_the_success_message_in_profile_page()throws InterruptedException {
	    profile.checksuccessmessage();
	    Thread.sleep(2000);
	}

	@When("user should clear the name field")
	public void user_should_clear_the_name_field() throws InterruptedException{
	   profile.clearnamefield();
	   Thread.sleep(2000);
	}

	@Then("user should see the validation message near name filed")
	public void user_should_see_the_validation_message_near_name_filed()throws InterruptedException {
	    profile.checkpopupname();
	    Thread.sleep(2000);
	}

	@Then("user should see the validation message near phone number field")
	public void user_should_see_the_validation_message_near_phone_number_field() throws InterruptedException{
	    profile.checkpopupphonenumber();
	    Thread.sleep(2000);
	}
	@When("user should clear the phone number field")
	public void user_should_clear_the_phone_number_field() throws InterruptedException{
	    profile.clearphonenumber();
	    Thread.sleep(2000);
	}

	@Then("click on admin")
	public void click_on_admin()throws InterruptedException {
	    profile.adminbutton();
	    Thread.sleep(2000);
	}

	@Then("Click on Reg Users")
	public void click_on_reg_users() throws InterruptedException{
	    profile.clickonreguser();
	    Thread.sleep(2000);
	}

	@Then("user should see the Registered Users Page")
	public void user_should_see_the_registered_users_page() throws InterruptedException{
	   profile.checkreguserpage();
	   Thread.sleep(2000);
	}

	@Then("enter the user name in the search box")
	public void enter_the_user_name_in_the_search_box() throws InterruptedException{
	   profile.entersearchbox("saiteja");
	   Thread.sleep(2000);
	}

	@Then("user should see the updated info in the table")
	public void user_should_see_the_updated_info_in_the_table()throws InterruptedException {
	   profile.checktheupdatedinfo();
	   Thread.sleep(2000);
	}

	@And("Click on the signout")
	public void click_on_the_signout() {
	    profile.clicksignout();
	}
	@Then("user should see the homepage")
	public void user_should_see_the_homepage() {
	    profile.checkloginbuttonhome();
	}
	}



