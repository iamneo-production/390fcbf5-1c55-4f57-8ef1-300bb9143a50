package StepDefinitions;
//import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AdminPage;
//import pageObject.ManageContactUsQueryPage;
import pageObject.ManageVehiclespage;
//import io.cucumber.java.AfterAll;
import io.cucumber.java.en.*;
public class ManageVehiclesDef {
	public WebDriver driver=null;
	public ManageVehiclespage manage;
	public AdminPage adminpage;
	@Given("user opens this url {string}")
	public void user_openurl(String string) throws MalformedURLException{
		// System.setProperty("webdriver.com.driver","C:/Users/kouti/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe;");
		// driver= new ChromeDriver();
		// DesiredCapabilities capabilities = new DesiredCapabilities();

        // capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");

        // driver = new RemoteWebDriver(new URL("http://34.85.242.216:4455"), capabilities);
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("--disable-dev-shm-usage");
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),chromeOptions);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    manage =new ManageVehiclespage(driver);
		adminpage=new AdminPage(driver);
	    driver.navigate().to("https://carrental.neohire.io/admin/");
	}

	@Then("user able see the admin login page")
	public void signin_page(){
		adminpage.adminloginpage();
	}

	@When("User enters username as {string} and passwrod as {string}")
	public void credentials(String string, String string2){
		adminpage.adminusername("admin");
		adminpage.adminpass("Test@12345");
	}

	@And("user clicks on login button")
	public void clicks_login(){
		adminpage.adminloginbutton();
	}

	@Then("admin should see car rental portal|admin panel")
	public void adminhome(){
		manage.checkcarrental();
	}
	@When("admin clicks on vehicle dropdown and selects manage vehicles")
	public void user_clicks_on_vehicle_dropdown_and_selects_manage_vehicles(){
	    manage.managevehiclesbutton();
	}
	@Then("admin should see manage vehicles page")
	public void checking_the_page() {
		manage.checkmanagevehicles();
	}
	@When("admin clicks next")
	public void nextbutton(){
		manage.managevehiclesnext();
	}
	@And("admin clicks previous")
	public void previousbutton(){
		manage.managevehiclesprev();
	}
	@Then("its home page should be visible")
	public void checkhome() {
		manage.check1stpage();
	}
	@When("admin will check the show entries")
	public void admin_will_check_the_show_entries(){
		manage.managevehiclesshow("25");
	    manage.managevehiclesshow("50");
	    manage.managevehiclesshow("100");
	}
	@And("admin checks search box")
	public void admin_checks_search_box(){
		manage.managevehiclessearch("hector");
	}
	@Then("admin deletes a vehicle")
	public void deletevehicle(){
		manage.managevehicledelete();
		driver.switchTo().alert().accept();
		driver.navigate().to("https://carrental.neohire.io/admin/manage-vehicles.php");
	}
	// @Then("checks the search results")
	// public void checks_the_search_results(){
	//     manage.managevehiclesfindtext();
	//     driver.navigate().to("https://carrental.neohire.io/admin/manage-vehicles.php");
	// }
	@When("admin clicks edit option")
	public void admin_clicks_edit_option(){
	    manage.managevehiclesedit();
	}

	@Then("edit page should be shown")
	public void edit_page_should_be_shown(){
	    manage.checkeditvehicles();
	}

	@When("admin makes changes")
	public void admin_makes_changes(){
	    manage.managevehiclesedittitle("bhavana");
	    manage.managevehicleseditppd("1000");
	    manage.managevehicleseditseating("7");
	    manage.managevehicleseditbrand();
	    manage.managevehicleseditcheckboxes();
	}

	@And("clicks on save changes button")
	public void clicks_on_save_changes_button(){
	    manage.managevehicleseditsave();
	    
	}
	@Then("prompt messege will be displayed")
	public void prompt_messege_will_be_displayed() {
		manage.doneedit();
    
	}
	@And("admin checks the updated details")
	public void admin_checks_the_updated_details(){
		driver.navigate().to("https://carrental.neohire.io/car-listing.php");
		manage.checkedited();
		
	    driver.close();
	    driver.quit();
	}

}
