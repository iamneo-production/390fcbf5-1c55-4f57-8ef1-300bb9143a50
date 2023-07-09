package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUsersPage {
public WebDriver jdriver;
public RegisteredUsersPage(WebDriver kdriver)
{
    jdriver=kdriver;
    PageFactory.initElements(jdriver, this);
}
@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[6]/a")
WebElement AdminClick;
@FindBy(xpath="/html/body/div/div/div/div/div/div")
WebElement AdminPage;
@FindBy(name="username")
WebElement UserName;
@FindBy(name="password")
WebElement Password;
@FindBy(name="login")
WebElement LoginButton;
@FindBy(xpath="/html/body/div[2]/nav/ul/li[8]/a")
WebElement RegUsers;
@FindBy(xpath="/html/body/div[2]/div/div/div/div")
WebElement RegUsersPage;
@FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input")
WebElement SearchBox;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[2]")
WebElement FullName;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[3]")
WebElement EmailAddress;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[4]")
WebElement MobileNo;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[5]")
WebElement DateOfBirth;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[6]")
WebElement Address;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[7]")
WebElement City;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[8]")
WebElement Country;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[9]")
WebElement RegDate;
@FindBy(xpath="//*[@id=\"zctb_length\"]/label/select")
WebElement Entries;
@FindBy(xpath="//*[@id=\"zctb_length\"]/label/select/option[3]")
WebElement Entries50;
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div[1]")
WebElement RegUsersClick;
public void checkRegisteredUsersPage() {
	AdminClick.isEnabled();
	AdminPage.isDisplayed();
	UserName.isEnabled();
	Password.isEnabled();
	LoginButton.isEnabled();
	RegUsers.isSelected();
	RegUsersPage.isDisplayed();
	SearchBox.isSelected();
	FullName.isDisplayed();
	EmailAddress.isDisplayed();
	MobileNo.isDisplayed();
	DateOfBirth.isDisplayed();
	Address.isDisplayed();
	City.isDisplayed();
	Country.isDisplayed();
	RegDate.isDisplayed();
	Entries.isEnabled();
}
public void setAdminClick() {
	AdminClick.click();
}
public void setAdminPage() {
	AdminPage.isDisplayed();
	
}
public void setUserName(String username) {
	UserName.click();
	UserName.clear();
	UserName.sendKeys(username);
}
public void setPassword(String password) {
	Password.click();
	Password.clear();
	Password.sendKeys(password);
}
public void setLoginButton(){
	LoginButton.click();
}
public void setRegUsers() {
	RegUsers.click();
}
public void setRegUsersPage() {
	RegUsersPage.isDisplayed();
}
public void setSearchBox(String search) {
	SearchBox.click();
	SearchBox.clear();
	SearchBox.sendKeys(search);
}
public void setFullName() {
	FullName.isDisplayed();
}
public void setEmailAddress() {
	EmailAddress.isDisplayed();
}
public void setMobileNo() {
	MobileNo.isDisplayed();
}
public void setDateOfBirth() {
	DateOfBirth.isDisplayed();
}
public void setAddress() {
	Address.isDisplayed();
}
public void setCity() {
	City.isDisplayed();
}
public void setCountry() {
	Country.isDisplayed();
}
public void setRegDate() {
	RegDate.isDisplayed();
}
public void setEntries() {
	Entries.click();
	
}
public void setEntries50() {
	Entries50.click();
	RegUsersClick.click();
}
}
