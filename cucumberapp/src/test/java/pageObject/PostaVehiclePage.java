package pageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
public class PostaVehiclePage {
	public static WebDriver driver;
	 public PostaVehiclePage(WebDriver driver) {
		 ManageContactUsQueryPage.driver=driver;
		 PageFactory.initElements(driver,this);
		}
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/h2") WebElement testheader;
	 @FindBy(xpath="/html/body/div[2]/nav/ul/li[4]/ul/li[1]/a") WebElement testbutton2;
	 @FindBy(xpath="/html/body/div[2]/nav/ul/li[4]/a") WebElement testbutton1;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/div[1]/input") WebElement vtitle;
	 @FindBy(xpath="/html/body/div[1]/a") WebElement carrentalportal;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/div[2]/div/button") WebElement selectbrand1;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/div[2]/div/div/ul/li[3]/a") WebElement selectbrand2;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/textarea") WebElement voverview;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[4]/div[1]/input") WebElement vppd;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[4]/div[2]/div/button") WebElement fueltype;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[4]/div[2]/div/div/ul/li[2]/a") WebElement fuelpetrol;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[5]/div[1]/input") WebElement vmodelyear;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[5]/div[2]/input") WebElement vseating;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[8]/div[1]/input") WebElement img1;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[8]/div[2]/input") WebElement img2;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[8]/div[3]/input") WebElement img3;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[9]/div[1]/input") WebElement img4;
	 @FindBy(xpath="//*[@id=\"airconditioner\"]") WebElement ac;
	 @FindBy(xpath="//*[@id=\"powerdoorlocks\"]") WebElement powerdoorlocks;
	 @FindBy(xpath="//*[@id=\"antilockbrakingsys\"]") WebElement albs;
	 @FindBy(xpath="//*[@id=\"driverairbag\"]") WebElement driverairbag;
	 @FindBy(xpath="//*[@id=\"passengerairbag\"]") WebElement passairbag;
	 @FindBy(xpath="//*[@id=\"leatherseats\"]") WebElement leatherseats;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[4]/div/button[2]") WebElement savechanges;
	 @FindBy(xpath="/html/body/section[2]/div/div/div/div[13]/div[2]/a") WebElement viewdetails;
//	 @FindBy(xpath="/html/body/div[1]/a") WebElement carrentalportal;
	 
	 public void checkcarrental() {
		 carrentalportal.isDisplayed();
	 }
	 public void postavehiclebutton() throws InterruptedException {
		 testbutton1.click();
		 Thread.sleep(1000);
		 testbutton2.click();
	 }
	 public void checkpostingpage() throws InterruptedException {
		 testheader.isDisplayed();
		 Thread.sleep(1000);
	 }
	 public void savechanges() throws InterruptedException {
		 savechanges.click();
		 Thread.sleep(1000);
	 }
	 public void form() throws InterruptedException {
		 vtitle.sendKeys("Spresso");
		 Thread.sleep(1000);
		 selectbrand1.click();
		 Thread.sleep(1000);
		 selectbrand2.click();
		 Thread.sleep(1000);
		 voverview.sendKeys("Car");
		 Thread.sleep(1000);
		 vppd.sendKeys("600");
		 Thread.sleep(1000);
		 fueltype.click();
		 Thread.sleep(1000);
		 fuelpetrol.click();
		 Thread.sleep(1000);
		 vmodelyear.sendKeys("2020");
		 Thread.sleep(1000);
		 vseating.sendKeys("5");
		 Thread.sleep(1000);
		 img1.sendKeys("./pic1.jpg");
		 Thread.sleep(1000);
		 img2.sendKeys("cucumberapp/src/test/resources/images/pic2.jpg");
		 Thread.sleep(1000);
		 img3.sendKeys("cucumberapp/src/test/resources/images/pic3.jpg");
		 Thread.sleep(1000);
		 img4.sendKeys("cucumberapp/src/test/resources/images/pic4.jpg");
		 Thread.sleep(1000);
		 ac.click();
		 powerdoorlocks.click();
		 albs.click();
		 driverairbag.click();
		 passairbag.click();
		 leatherseats.click();
		 Thread.sleep(2000);
		 //savechanges.click();
		 
	 }
	 public void viewdetailsbutton() {
		 viewdetails.click();
	 }

}
