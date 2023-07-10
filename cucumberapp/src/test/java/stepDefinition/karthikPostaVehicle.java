package stepDefinition;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import pageObject.AdminPage;
import pageObject.PostaVehiclePage;
import io.cucumber.java.en.*;
public class karthikPostaVehicle {
	public WebDriver driver=null;
	public PostaVehiclePage manage;
	public AdminPage adminpage;
	
	@Given("admin url is opened {string}")
	public void this_url_is_opened(String string) throws MalformedURLException {
//		System.setProperty("webdriver.com.driver","C:/Users/kouti/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe;");
//		driver= new ChromeDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        driver = new RemoteWebDriver(new URL("http://34.85.242.216:4455"), capabilities);
		
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    manage =new PostaVehiclePage(driver);
		adminpage=new AdminPage(driver);
	    driver.navigate().to("https://carrental.neohire.io/admin/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}

	@Then("admin login page should be visible")
	public void admin_login_page_should_be_visible(){
		adminpage.adminloginpage();
	}

	@When("the username as {string} and password as {string}")
	public void the_username_as_and_password_as(String string, String string2){
		adminpage.adminusername("admin");
		adminpage.adminpass("Test@12345");
	}

	@And("clicks on login button")
	public void clicks_on_login_button(){
		adminpage.adminloginbutton();
	}

	@Then("admin home page should be visible")
	public void admin_home_page_should_be_visible(){
		manage.checkcarrental();
	}

	@When("user clicks on vehicles category and selects post a vehicle")
	public void user_clicks_on_vehicles_category_and_selects_post_a_vehicle(){
	    manage.postavehiclebutton();
	}

	@Then("post a vehicle page should be visible")
	public void post_a_vehicle_page_should_be_visible(){
	    manage.checkpostingpage();
	}

	@And("user click save changes button")
	public void user_click_save_changes_button(){
		manage.savechanges();
	}

	@And("enters the vehicle form")
	public void enters_the_vehicle_form(){
		manage.form();
	}

	@And("clicks savechanges button")
	public void clicks_savechanges_button(){
	    manage.savechanges();
	}

	@Then("admin redirects to car listing page")
	public void admin_redirects_to_car_listing_page(){
		driver.navigate().to("https://carrental.neohire.io/car-listing.php");
	}

	@And("checks the posted vehicle is visible")
	public void checks_the_posted_vehicle_is_visible(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		manage.viewdetailsbutton();
		driver.close();
		driver.quit();
	}


}
