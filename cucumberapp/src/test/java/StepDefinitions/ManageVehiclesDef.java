package StepDefinitions;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AdminPage;
//import pageObject.ManageContactUsQueryPage;
import pageObject.ManageVehiclespage;
import io.cucumber.java.en.*;
public class ManageVehiclesDef {
	public WebDriver driver=null;
	public ManageVehiclespage manage;
	public AdminPage adminpage;
	@Given("user opens this url {string}")
	public void user_openurl(String string) throws MalformedURLException{
		// System.setProperty("webdriver.com.driver","C:/Users/kouti/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe;");
		// driver= new ChromeDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    manage =new ManageVehiclespage(driver);
		adminpage=new AdminPage(driver);
	    driver.navigate().to("https://carrental.neohire.io/admin/");
	}

	@Then("user able see the admin login page")
	public void signin_page() throws InterruptedException {
		adminpage.adminloginpage();
		//Thread.sleep(1000);
	}

	@When("User enters username as {string} and passwrod as {string}")
	public void credentials(String string, String string2) throws InterruptedException {
		adminpage.adminusername("admin");
		adminpage.adminpass("Test@12345");
		//Thread.sleep(1000);
	}

	@And("user clicks on login button")
	public void clicks_login() throws InterruptedException {
		adminpage.adminloginbutton();
		//Thread.sleep(1000);
	}

	@Then("admin should see car rental portal|admin panel")
	public void adminhome() throws InterruptedException {
		manage.checkcarrental();
		//Thread.sleep(1000);
	}
	@When("admin clicks on vehicle dropdown and selects manage vehicles")
	public void user_clicks_on_vehicle_dropdown_and_selects_manage_vehicles() throws InterruptedException {
	    manage.managevehiclesbutton();
	}
	@Then("admin should see manage vehicles page")
	public void checking_the_page() {
		manage.checkmanagevehicles();
	}
	@When("admin clicks next")
	public void nextbutton() throws InterruptedException {
		manage.managevehiclesnext();
		//Thread.sleep(2000);
	}
	@And("admin clicks previous")
	public void previousbutton() throws InterruptedException {
		manage.managevehiclesprev();
		//Thread.sleep(1000);
	}
	@Then("its home page should be visible")
	public void checkhome() {
		manage.check1stpage();
	}
	@When("admin will check the show entries")
	public void admin_will_check_the_show_entries() throws InterruptedException {
		manage.managevehiclesshow("25");
	    //Thread.sleep(1000);
	    manage.managevehiclesshow("50");
	    //Thread.sleep(1000);
	    manage.managevehiclesshow("100");
	    //Thread.sleep(1000);
	}
	@Then("admin deletes a vehicle")
	public void deletevehicle() throws InterruptedException {
		manage.managevehicledelete();
		//Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	@And("admin checks search box")
	public void admin_checks_search_box() throws InterruptedException {
		manage.managevehiclessearch("ertiga");
	    //Thread.sleep(3000);
	}

	@Then("checks the search results")
	public void checks_the_search_results() throws InterruptedException {
	    manage.managevehiclesfindtext();
	    //Thread.sleep(1000);
	    driver.navigate().to("https://carrental.neohire.io/admin/manage-vehicles.php");
	    //Thread.sleep(1000);
	}
	@When("admin clicks edit option")
	public void admin_clicks_edit_option() throws InterruptedException {
		//Thread.sleep(1000);
	    manage.managevehiclesedit();
	}

	@Then("edit page should be shown")
	public void edit_page_should_be_shown() throws InterruptedException {
	    manage.checkeditvehicles();
	    //Thread.sleep(1000);
	}

	@When("admin makes changes")
	public void admin_makes_changes() throws InterruptedException {
	    manage.managevehiclesedittitle("bhavana");
	    //Thread.sleep(1000);
	    manage.managevehicleseditppd("1000");
	    //Thread.sleep(1000);
	    manage.managevehicleseditseating("7");
	    //Thread.sleep(1000);
	    manage.managevehicleseditbrand();
	    //Thread.sleep(1000);
	    //manage.updateimg();
	    //Thread.sleep(1000);
	    manage.managevehicleseditcheckboxes();
	    //Thread.sleep(1000);
	}

	@And("clicks on save changes button")
	public void clicks_on_save_changes_button() throws InterruptedException {
	    manage.managevehicleseditsave();
	    
	}
	@Then("prompt messege will be displayed")
	public void prompt_messege_will_be_displayed() {
		manage.doneedit();
		//Thread.sleep(1000);
    
	}
	@And("admin checks the updated details")
	public void admin_checks_the_updated_details() throws InterruptedException{
		driver.navigate().to("https://carrental.neohire.io/car-listing.php");
		Thread.sleep(1000);
		manage.checkedited();
		
	    driver.close();
	    driver.quit();
	}


}
