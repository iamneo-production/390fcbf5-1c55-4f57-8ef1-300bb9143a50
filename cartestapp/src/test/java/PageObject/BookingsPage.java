package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingsPage {
	public WebDriver fdriver;

	public BookingsPage(WebDriver gdriver)
	{
	    fdriver=gdriver;
	    PageFactory.initElements(fdriver, this);
	}
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[6]/a")
	WebElement AdminLogin;
	@FindBy(xpath="/html/body/div/div/div/div/div/div")
	WebElement AdminDisplay;
	@FindBy(name="username")
	WebElement UserName;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(name="login")
	WebElement LoginButton;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[5]/a")
	WebElement Bookings;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[5]/div/i")
	WebElement DownArrowSymbol;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[5]/ul/li[1]/a")
	WebElement NewBookings;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div")
	WebElement NewBookingsPage;
	@FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input")
	WebElement SearchBox;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[2]")
	WebElement FullName;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[3]")
	WebElement BookingNo;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[4]/a")
	WebElement Vehicle;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[5]")
	WebElement FromDate;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[6]")
	WebElement ToDate;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[7]")
	WebElement Status;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[8]")
	WebElement PostingDate;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[9]/a")
	WebElement Action;
	@FindBy(xpath="//*[@id=\"print\"]/table/tbody/tr[12]/td/a[1]")
	WebElement ConfirmBooking;
	@FindBy(xpath="//*[@id=\"print\"]/table/tbody/tr[12]/td/a[2]")
	WebElement CancelBooking;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div")
	WebElement Print;
	@FindBy(xpath="//*[@id=\"zctb_length\"]/label/select")
	WebElement Entries;
	@FindBy(xpath="//*[@id=\"zctb_length\"]/label/select/option[2]")
	WebElement Entries25;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div[1]")
	WebElement Info;
	public void checkBookingPage() {
		AdminLogin.isDisplayed();
		AdminDisplay.isDisplayed();
		UserName.isEnabled();
		Password.isEnabled();
		LoginButton.isSelected();
		Bookings.isDisplayed();
		DownArrowSymbol.isSelected();
		NewBookings.isEnabled();
		NewBookingsPage.isDisplayed();
		SearchBox.isDisplayed();
		FullName.isDisplayed();
		BookingNo.isDisplayed();
		Vehicle.isDisplayed();
		FromDate.isDisplayed();
		ToDate.isDisplayed();
		Status.isDisplayed();
		PostingDate.isDisplayed();
		Action.isDisplayed();
		ConfirmBooking.isDisplayed();
		CancelBooking.isDisplayed();
		Print.isDisplayed();
		Entries.isDisplayed();
	}
	public void setAdminLogin() {
		AdminLogin.click();
		AdminLogin.isDisplayed();
	}
	public void setAdminDisplay() {
		AdminDisplay.isDisplayed();
	}
	public void setUserName(String username) {
		UserName.click();
		UserName.sendKeys(username);
	}
	public void setPassword(String password) {
		Password.click();
		Password.sendKeys(password);
	}
	public void setLoginButton() {
		LoginButton.click();
	}
	public void setBookings() {
		Bookings.click();
	}
	public void setDownArrowSymbol() {
		DownArrowSymbol.click();
	}
	public void setNewBookings() {
		NewBookings.click();
	}
	public void setNewBookingsPage() {
		NewBookingsPage.isDisplayed();
	}
	public void setSearchBox(String fullname) {
		SearchBox.click();
		SearchBox.sendKeys(fullname);
		
	}
	public void setFullName() {
		FullName.isDisplayed();
	}
	public void setBookingNo() {
		BookingNo.isDisplayed();
	}
	public void setVehicle() {
		Vehicle.isDisplayed();
	}
	public void setFromDate() {
		FromDate.isDisplayed();
	}
	public void setToDate() {
		ToDate.isDisplayed();
	}
	public void setStatus() {
		Status.isDisplayed();
	}
	public void setPostingDate() {
		PostingDate.isDisplayed();
	}
	public void setAction() {
		Action.click();
	}
	public void setprint() {
		Print.click();
	}
	public void setEntries() {
		Entries.click();
	}
	public void setEntries25() {
		Entries25.click();
	}
	public void setInfo() {
		Info.click();
	}
}
