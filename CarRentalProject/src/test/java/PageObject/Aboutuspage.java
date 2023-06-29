package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Aboutuspage {
	public static WebDriver driver;
	public Aboutuspage(WebDriver driver) {
		Aboutuspage.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/header/div/div/div/div[1]/div/a/img")WebElement carRentalPortal;
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[2]/a")WebElement aboutusbutton;
	
	
	public void checkCarRentalPortal() {
		carRentalPortal.isDisplayed();
	}
	public void AboutusButton() {
		aboutusbutton.click();
	}
	public void checkAboutuspage() {
	    driver.getPageSource().contains("About Us");
	}
}
