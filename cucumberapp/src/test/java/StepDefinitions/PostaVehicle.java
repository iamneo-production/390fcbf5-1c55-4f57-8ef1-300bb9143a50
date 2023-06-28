package StepDefinitions;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import javax.print.DocFlavor.URL;

import org.openqa.selenium.remote.RemoteWebDriver;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import pageObject.AdminPage;
//import pageObject.ManageVehiclespage;
import pageObject.PostaVehiclePage;
import io.cucumber.java.en.*;
public class PostaVehicle {
	public WebDriver driver=null;
	public PostaVehiclePage manage;
	public AdminPage adminpage;
	
	@Given("admin url is opened {string}")
	public void this_url_is_opened(String string) throws MalformedURLException {
//		System.setProperty("webdriver.com.driver","C:/Users/kouti/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe;");
//		driver= new ChromeDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    manage =new PostaVehiclePage(driver);
		adminpage=new AdminPage(driver);
	    driver.navigate().to("https://carrental.neohire.io/admin/");
	}

	@Then("admin login page should be visible")
	public void admin_login_page_should_be_visible() throws InterruptedException {
		adminpage.adminloginpage();
		Thread.sleep(1000);
	}

	@When("the username as {string} and password as {string}")
	public void the_username_as_and_password_as(String string, String string2) throws InterruptedException {
		adminpage.adminusername("admin");
		adminpage.adminpass("Test@12345");
		Thread.sleep(1000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		adminpage.adminloginbutton();
		Thread.sleep(1000);
	}

	@Then("admin home page should be visible")
	public void admin_home_page_should_be_visible() throws InterruptedException {
		manage.checkcarrental();
		Thread.sleep(1000);
	}

	@When("user clicks on vehicles category and selects post a vehicle")
	public void user_clicks_on_vehicles_category_and_selects_post_a_vehicle() throws InterruptedException {
	    manage.postavehiclebutton();
	}

	@Then("post a vehicle page should be visible")
	public void post_a_vehicle_page_should_be_visible() throws InterruptedException {
	    manage.checkpostingpage();
	}

	@And("user click save changes button")
	public void user_click_save_changes_button() throws InterruptedException {
	    manage.savechanges();
	}

	@And("enters the vehicle form")
	public void enters_the_vehicle_form() throws InterruptedException {
	    manage.form();
	}

	@And("clicks savechanges button")
	public void clicks_savechanges_button() throws InterruptedException {
	    manage.savechanges();
	    Thread.sleep(2000);
//	    driver.close();
//		driver.quit();
	}
	@Then("admin redirects to car listing page")
	public void admin_redirects_to_car_listing_page() {
	    driver.navigate().to("https://carrental.neohire.io/car-listing.php");
	}

	@And("checks the posted vehicle is visible")
	public void checks_the_posted_vehicle_is_visible() throws InterruptedException {
	    manage.viewdetailsbutton();
	    Thread.sleep(2000);
	    driver.close();
		driver.quit();
	}
	
	

}
