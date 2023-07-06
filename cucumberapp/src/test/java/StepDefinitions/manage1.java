package StepDefinitions;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AdminPage;
import pageObject.ManageContactUsQueryPage;
//import pageObject.ManageTestimonialPage;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import io.cucumber.java.AfterAll;
import io.cucumber.java.en.*;

public class manage1 {
	public WebDriver driver=null;
	public ManageContactUsQueryPage manage;
	public AdminPage admin;
	@When("user opens url {string}")
	public void user_opens_url(String string) throws MalformedURLException{
		// System.setProperty("webdriver.com.driver","C:/Users/kouti/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe;");
		// driver= new ChromeDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    manage =new ManageContactUsQueryPage(driver);
		admin=new AdminPage(driver);
	    driver.navigate().to("https://carrental.neohire.io/admin/");
	}

	@Then("user should able see the admin|signin page")
	public void user_should_able_see_the_admin_signin_page() {
		admin.adminloginpage();
	}

	@And("User should enter username as {string}  and passwrod ad {string}")
	public void user_should_enter_username_as_and_password_ad(String string, String string2) throws InterruptedException {
		admin.adminusername("admin");
		admin.adminpass("Test@12345");
		//Thread.sleep(1000);
	}

	@And("click on login")
	public void click_on_login() throws InterruptedException {
		admin.adminloginbutton();
		//Thread.sleep(1000);
	}

	@Then("admin should able to view car rental portal | admin panel")
	public void user_should_able_to_view_car_rental_portal_admin_panel() {
		manage.checkcarrentalportal();
	}

	@And("click on Manage Contactus Query")
	public void click_on_managecontactusquery() throws InterruptedException {
		manage.managecontactusquerybutton();
	    //Thread.sleep(2000);
	}

	@Then("admin should able to see the Manage Contact Us Queries page")
	public void user_should_able_to_see_the_manage_contactusquery_page() {
		manage.checkmanagecontactusquery();	
	}
	@And("admin checks the next option")
	public void clickingnextbutton() throws InterruptedException {
		manage.managecontactusquerynext();
		//Thread.sleep(1000);
		manage.managecontactusquerynext();
		//Thread.sleep(1000);
	}
	@Then("admin checks the previous option")
	public void clickingpreviousbutton() throws InterruptedException {
		manage.managecontactusqueryprev();
		//Thread.sleep(1000);
		manage.managecontactusqueryprev();
		//Thread.sleep(1000);
	}
	@And("admin enter the text")
	public void user_enter_the_text() throws InterruptedException {
	    manage.managecontactusquerysearch("sai teja pending");
	    
	}

	@Then("the details of the entered text will appear")
	public void the_details_of_the_entered_text_will_appear() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		manage.managecontactusqueryfindtext();
	    //Thread.sleep(2000);
	}
	
	@When("admin checks the show entries")
	public void user_checks_the_show_entries() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    manage.managecontactusqueryshow("25");
	    //Thread.sleep(2000);
	    manage.managecontactusqueryshow("50");
	    //Thread.sleep(2000);
	    manage.managecontactusqueryshow("100");
	    //Thread.sleep(2000);
	    
	    
	}
	@Then("admin reads the pending queries")
	public void clickon_pending_and_read() throws InterruptedException{
		manage.managecontactusquerypending();
		driver.close();
		driver.quit();
	}

}