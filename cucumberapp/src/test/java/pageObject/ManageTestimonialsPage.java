package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageTestimonialsPage {
 public WebDriver hdriver;
 public ManageTestimonialsPage(WebDriver idriver)
 {
     hdriver=idriver;
     PageFactory.initElements(hdriver, this);
 }
 @FindBy(xpath="//*[@id=\"navigation\"]/ul/li[6]/a")
 WebElement AdminClick;
 @FindBy(xpath="/html/body/div/div/div/div/div/div")
 WebElement AdminLoginPage;
 @FindBy(name="username")
 WebElement UserName;
 @FindBy(name="password")
 WebElement Password;
 @FindBy(name="login")
 WebElement Login;
 @FindBy(xpath="/html/body/div[2]/nav/ul/li[6]/a")
 WebElement ManageTestimonialsButton;
 @FindBy(xpath="/html/body/div[2]/div/div/div/div")
 WebElement ManageTestimonialPage;
 @FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input")
 WebElement SearchBox;
 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[2]")
 WebElement FullName;
 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[3]")
 WebElement EmailAddress;
 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[4]")
 WebElement Testimonials;
 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[5]")
 WebElement PostingDate;
 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[6]")
 WebElement InActiveButton;
 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div[2]/div[1]")
 WebElement SuccessfulMessage;
 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[6]/a")
 WebElement ActiveButton;
 @FindBy(xpath="//*[@id=\"zctb_length\"]/label/select")
 WebElement Entries;
 @FindBy(xpath="//*[@id=\"zctb_length\"]/label/select/option[2]")
 WebElement Entries25;
 public void checkManageTestimonialPage() {
	 AdminClick.isEnabled();
	 AdminLoginPage.isDisplayed();
	 UserName.isEnabled();
	 Password.isEnabled();
	 Login.isSelected();
	 ManageTestimonialsButton.isEnabled();
	 ManageTestimonialPage.isDisplayed();
	 SearchBox.isEnabled();
	 FullName.isDisplayed();
	 EmailAddress.isDisplayed();
	 Testimonials.isDisplayed();
	 PostingDate.isDisplayed();
	 InActiveButton.isDisplayed();
	 SuccessfulMessage.isDisplayed();
	 ActiveButton.isDisplayed();
	 Entries.isDisplayed();
 }
 public void setAdminClick() {
	 AdminClick.click();
 }
 public void setAdminLoginPage() {
	 AdminLoginPage.isDisplayed();
 }
 public void setUserName(String username) {
	 UserName.click();
	 UserName.clear();
	 UserName.sendKeys("admin");
 }
 public void setPassword(String password) {
	 Password.click();
	 Password.clear();
	 Password.sendKeys("Test@12345");
 }
 public void setLogin() {
	 Login.click();
 }
 public void setManageTestimonialsButton() {
	 ManageTestimonialsButton.click();
	 ManageTestimonialsButton.isEnabled();
 }
 public void setManageTestimonialPage() {
	 ManageTestimonialPage.isDisplayed();
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
 public void setTestimonials() {
	 Testimonials.isDisplayed();
 }
 public void setPostingDate() {
	 PostingDate.isDisplayed();
 }
 public void setActionButton() {
	 InActiveButton.isDisplayed();
	 InActiveButton.click();
	 
 }
 public void setSuccessfulMessage() {
	 SuccessfulMessage.isDisplayed();
 }
 public void setActiveButton() {
	 ActiveButton.isDisplayed();
	 ActiveButton.click();
 }
 public void setEntries() {
	 Entries.click();
	
 }
 public void setEntries25() {
	 Entries25.click();
 }
 
 
 
 
}
