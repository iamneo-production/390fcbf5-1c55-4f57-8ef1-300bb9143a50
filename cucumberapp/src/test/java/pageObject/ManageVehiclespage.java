package pageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class ManageVehiclespage {
	public static WebDriver driver;
	 public ManageVehiclespage(WebDriver driver) {
		 ManageContactUsQueryPage.driver=driver;
		 PageFactory.initElements(driver,this);
		}
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/h2") WebElement testheader;
	 @FindBy(xpath="/html/body/div[2]/nav/ul/li[4]/ul/li[2]/a") WebElement testbutton2;
	 @FindBy(xpath="/html/body/div[2]/nav/ul/li[4]/a") WebElement testbutton1;
	 @FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input") WebElement testsearch;
	 @FindBy(xpath="//*[@id=\"zctb_length\"]/label/select")WebElement testshow;
	 @FindBy(xpath="//*[@id=\"zctb_next\"]/a") WebElement testnext;
	 @FindBy(xpath="//*[@id=\"zctb_previous\"]/a")WebElement testprev;
	 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[7]/a[1]/i")WebElement testedit ;
	 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[3]/td[7]/a[2]/i")WebElement testdelete;
	@FindBy(xpath="/html/body/div[1]/a") WebElement carrentalportal;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[2]") WebElement testtext;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[5]/div[2]/input") WebElement editseating;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/div[1]/input") WebElement editvehicletitle;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[4]/div[1]/input") WebElement editpriceperday;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/h2") WebElement checkeditvehicle;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[5]/div[2]/div[5]/div/button") WebElement editsave;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/div[2]/div/button") WebElement selectbrand1;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/div[2]/div/div/ul/li[9]/a/span[1]") WebElement selectbrand2;
	 @FindBy(xpath="//*[@id=\"inlineCheckbox1\"]") WebElement checkbox_pdl;
	 @FindBy(xpath="//*[@id=\"inlineCheckbox1\"]") WebElement checkbox_albs;
	 //@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[8]/div[1]/a")WebElement editimg1;
	 //@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[2]/div/input") WebElement editchooseimg;
	 //@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[4]/div/button") WebElement updateimgbutton;
	 @FindBy(xpath="//*[@id=\"zctb_info\"]") WebElement test1stpage;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/div/div/div[2]/div") WebElement successtest;
	 @FindBy(xpath="/html/body/section[2]/div/div/div/div[3]/div[2]/a")WebElement viewtest;
	 @FindBy(xpath="/html/body/section[2]/div/div[2]/div/div[2]/div/ul/li[2]/a") WebElement testaccessories;
	
	public void managevehiclesbutton() throws InterruptedException {
		testbutton1.click();
		//Thread.sleep(1000);
		testbutton2.click();
	}
	public void checkedited() throws InterruptedException{
		viewtest.click();
		Thread.sleep(2000);
		testaccessories.click();
	}
	public void doneedit(){
		successtest.isDisplayed();
	}
	public void check1stpage() {
		test1stpage.isDisplayed();
	}
	// public void updateimg() throws InterruptedException {
	// 	editimg1.click();
	// 	Thread.sleep(2000);
	// 	editchooseimg.sendKeys("C:/Users/karthik/Pictures/OIP.jpg");
	// 	Thread.sleep(1000);
	// 	updateimgbutton.click();
	// 	Thread.sleep(1000);
	// 	//driver.navigate().to("https://carrental.neohire.io/admin/edit-vehicle.php?id=21");
	// 	//driver.navigate().refresh();
	// 	driver.navigate().back();
	// 	driver.navigate().back();
	// 	Thread.sleep(2000);
	// }
	public void managevehicleseditcheckboxes() throws InterruptedException {
		checkbox_pdl.click();
		//Thread.sleep(2000);
		checkbox_albs.click();
	}
	public void checkeditvehicles() {
		checkeditvehicle.isDisplayed();
	}
	public void managevehicleseditsave() {
		editsave.click();
	}
	public void managevehicleseditppd(String price) throws InterruptedException {
		editpriceperday.clear();
		editpriceperday.sendKeys(price);
		//Thread.sleep(1000);
	}
	public void managevehiclesedittitle(String title) throws InterruptedException {
		editvehicletitle.clear();
		editvehicletitle.sendKeys(title);
		//Thread.sleep(1000);
	}
	public void managevehicleseditseating(String seat) throws InterruptedException {
		editseating.clear();
		editseating.sendKeys(seat);
		//Thread.sleep(1000);
	}
	public void managevehiclessearch(String text) throws InterruptedException {
		 testsearch.clear();
		 testsearch.sendKeys(text);
		 //Thread.sleep(1000);
	 }
	 public void managevehiclesfindtext() {
		 testtext.isDisplayed();
	 }
	 public void managevehiclesshow(String num) {
		 Select showdrop = new Select(testshow);
		 showdrop.selectByVisibleText(num);
	 }
	 public void managevehicleseditbrand() throws InterruptedException {
		 selectbrand1.click();
		 //Thread.sleep(1000);
		 selectbrand2.click();
	 }
	 public void managevehiclesnext() {
		 testnext.click();
	 }
	 public void managevehiclesprev() {
		 testprev.click();
	 }
	 public void checkcarrental() {
		 carrentalportal.isDisplayed();
	 }
	 public void checkmanagevehicles() {
		 testheader.isDisplayed();
	}
	public void managevehiclesedit() {
		testedit.click();
	}
	public void managevehicledelete() throws InterruptedException {
		testdelete.click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
	}
}