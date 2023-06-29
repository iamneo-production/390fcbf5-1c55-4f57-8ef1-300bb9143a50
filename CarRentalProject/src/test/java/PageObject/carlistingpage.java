package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;


public class carlistingpage {
	public static WebDriver driver;
	public carlistingpage(WebDriver driver) {
		carlistingpage.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[3]/a")WebElement carlistingbutton;
	@FindBy(xpath="/html/body/section[2]/div/div/aside/div[1]/div[2]/form/div[1]/select")WebElement brandtype;
	@FindBy(xpath="/html/body/section[2]/div/div/aside/div[1]/div[2]/form/div[2]/select")WebElement fueltype;
	@FindBy(xpath="/html/body/section[2]/div/div/aside/div[1]/div[2]/form/div[3]/button")WebElement searchbutton;
	@FindBy(xpath="/html/body/section[2]/div/div/div/div[2]/div[2]/a")WebElement viewdetails;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div/div[2]/div/ul/li[2]/a")WebElement accesories;
	@FindBy(xpath="//*[@id=\"listing_img_slider\"]/div[2]/div/div[1]")WebElement prevbtn;
	@FindBy(xpath="//*[@id=\"listing_img_slider\"]/div[2]/div")WebElement imageslider;
	@FindBy(xpath="//*[@id=\"listing_img_slider\"]/div[2]/div/div[2]")WebElement nextbtn;
	@FindBy(xpath="//*[@id=\"listing_img_slider\"]/div[1]/div/div[3]/div/img")WebElement nextimage;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div/div[2]/div/ul/li[1]/a")WebElement vehiclebtn;
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[6]/a")WebElement adminbtn;
	@FindBy(name = "username")WebElement uname;
	@FindBy(name="password")WebElement password;
	@FindBy(name="login")WebElement loginbtn;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[5]/a")WebElement Bookingsbtn;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[5]/ul/li[1]/a")WebElement Newbtn;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[4]/a")WebElement regbtn;
	@FindBy(name = "email" )WebElement emailfield;
	@FindBy(name = "password")WebElement passwordfield;
	@FindBy(name = "login")WebElement loginfield;
	
	public void Carlistingbtn() {
		carlistingbutton.click();
	}
	public void checkcarlistingpage() {
		driver.getPageSource().contains("Find Your Car");
	}
	public void selectbrand() {
	    Select select = new Select(brandtype);
	    select.selectByIndex(1);
	}
	public void selectfuel(){
		Select select = new Select(fueltype);
		select.selectByIndex(2);
	}
	public void Searchbtn() {
		searchbutton.click();
	}
	public void checkcarlistings() {
		 driver.getPageSource().contains("Listings");
	}
	public void Viewdetailsbtn() {
		viewdetails.click();
	}
	public void checkcardetails() {
		driver.getPageSource().contains("Vehicle Overview");
	}
	
	public void Accessoriesbtn() {
		accesories.click();
	}
	public void checkAccessories() {
		driver.getPageSource().contains("ACCESSORIES");
	}
	public void PrevBtn() {
		Actions act =  new Actions(driver);
		act.moveToElement(prevbtn).click().perform();
	}
	public void checkimageslider() {
		imageslider.isDisplayed();
	}
	public void NextBtn() {
		Actions act =  new Actions(driver);
		act.moveToElement(nextbtn).click().perform();
	}
	public void checknextslider() {
		nextimage.isDisplayed();
	}
	public void vehicleoverviewbtn() {
		vehiclebtn.click();
	}
	public void checkvehicleoverview() {
		driver.getPageSource().contains("Vehicle Overview");
	}
	public void CustomerLogin() throws InterruptedException {
		regbtn.click();
		Thread.sleep(2000);
		emailfield.sendKeys("steja7600@gmail.com");
		passwordfield.sendKeys("9014963608");
		loginfield.click();
	}
	
	public void adminLogin() {
		adminbtn.click();
		uname.sendKeys("admin");
		password.sendKeys("Test@12345");
		loginbtn.click();
	}
	public void BookingBtn() {
		Bookingsbtn.click();
	}
	public void NewBtn() {
		Newbtn.click();
	}
	public void checkBooking() {
		if(driver.getPageSource().contains("Y SAI TEJA")) {
			System.out.println("Booking successful");
		}
		else {
			System.out.println("Booking unsuccessful");
		}
	}
}
