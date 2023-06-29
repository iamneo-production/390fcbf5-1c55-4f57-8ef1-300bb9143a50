package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

import java.net.URL;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import PageObject.Aboutuspage;
import PageObject.Homepage;
import PageObject.carlistingpage;
public class Aboutusstep {
	public WebDriver driver = null;
	public Aboutuspage aboutuspage;
	public carlistingpage carlisting;
	public Homepage homepage; 
	
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
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");




        driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
		
		aboutuspage = new Aboutuspage(driver);
		carlisting = new carlistingpage(driver);
		homepage = new Homepage(driver);
	 
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
	@And("Login as customer")
	public void login_as_customer() throws InterruptedException {
	    carlisting.CustomerLogin();
	    Thread.sleep(2000);
	}


	@Then("sign in as admin")
	public void sign_in_as_admin() throws InterruptedException {
	   carlisting.adminLogin();
	   Thread.sleep(2000);
	}

	@Then("click on bookings")
	public void click_on_bookings() {
	    carlisting.BookingBtn();
	}

	@Then("click on New")
	public void click_on_New() throws InterruptedException {
	   carlisting.NewBtn();
	   Thread.sleep(2000);
	}

	@Then("check whether the customer name is viewed on bookings")
	public void check_whether_the_customer_name_is_viewed_on_bookings() throws InterruptedException {
	   carlisting.checkBooking();
	   Thread.sleep(2000);
	}
	@Then("select From date")
	public void select_From_date() {
	    driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/aside/div[2]/form/div[1]/input")).click();
	}

	@And("select To date")
	public void select_To_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Type a message1")
	public void type_a_message1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
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
	public void type_your_full_name() throws InterruptedException {
		homepage.FullName();
		Thread.sleep(2000);
	}

	@And("type your email")
	public void type_your_email() throws InterruptedException {
		homepage.Emailadd();
		Thread.sleep(2000);
	}

	@And("your phone number")
	public void your_phone_number() throws InterruptedException {
		homepage.PhoneNumber();
		Thread.sleep(2000);
	}

	@And("type a message")
	public void type_a_message() throws InterruptedException {
		homepage.Message();
		Thread.sleep(2000);
	}

	@And("click on send message")
	public void click_on_send_message() throws InterruptedException {
		homepage.SendBtn();
		Thread.sleep(2000);
	}

	@Then("user should view SUCCESS")
	public void user_should_view_SUCCESS() throws InterruptedException {
		homepage.checkmessageinfo();
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


}
