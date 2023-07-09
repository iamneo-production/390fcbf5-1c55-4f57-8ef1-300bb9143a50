package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManageContactusQuerypage {
	public WebDriver edriver;
	public ManageContactusQuerypage(WebDriver fdriver)
	{
	    edriver=fdriver;
	    PageFactory.initElements(edriver, this);
	}
	@FindBy(xpath="/html/body/div/div/div/div/div/div")
	WebElement AdminPage;
	@FindBy(name="username")
	WebElement UserName;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(name="login")
	WebElement Login;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[7]/a")
	WebElement ManageContactUsQueryClick;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div")
	WebElement ManageContactUsQueryPage1;
	@FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input")
	WebElement SearchBoxClick;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[2]")
	WebElement FullName;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[3]")
	WebElement EmailAddress;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[4]")
	WebElement PhoneNumber;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[5]")
	WebElement Message;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[6]")
	WebElement PostingDate;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[3]/td[7]")
	WebElement ReadAction;
	@FindBy(xpath="//*[@id=\"zctb_length\"]/label/select")
	WebElement Entries;
	@FindBy(xpath="//*[@id=\"zctb_length\"]/label/select/option[4]")
	WebElement Entries100;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div[1]")
	WebElement QueryPage;
	public void CheckManageContactUsQuery() {
		AdminPage.isDisplayed();
		UserName.isSelected();
		Password.isSelected();
		Login.isSelected();
		ManageContactUsQueryClick.isSelected();
		ManageContactUsQueryPage1.isDisplayed();
		SearchBoxClick.isEnabled();
		FullName.isDisplayed();
		EmailAddress.isDisplayed();
		PhoneNumber.isDisplayed();
		Message.isDisplayed();
		PostingDate.isDisplayed();
		ReadAction.isDisplayed();
		Entries.isDisplayed();
		
	}
	public void setAdminPage() {
		AdminPage.click();
		AdminPage.isDisplayed();
	}
	public void setUserName(String username) {
		UserName.sendKeys(username);
	}
	public void setPassword(String password) {
		Password.sendKeys(password);
	}
	public void setLogin() {
		Login.click();
	}
	public void setManageContactUsQueryClick() {
		ManageContactUsQueryClick.click();
	}
	public void setManageContactUsQueryPage1() {
		ManageContactUsQueryPage1.isDisplayed();
	}
	public void setSearchBoxClick(String searchbox) {
		SearchBoxClick.click();
		SearchBoxClick.sendKeys(searchbox);
		
	}
	public void setFullName() {
		FullName.isDisplayed();
		
	}
	public void setEmailAddress() {
		EmailAddress.isDisplayed();
		
	}
	public void setPhoneNumber() {
		PhoneNumber.isDisplayed();
		
	}
	public void setMessage() {
		Message.isDisplayed();
	}
	public void setPostingDate() {
		PostingDate.isDisplayed();
	}
	
	public void setReadAction() {
		ReadAction.isDisplayed();
	}
	public void setEntries() {
		Entries.click();
	}
	public void setEntries100() {
		Entries100.click();
	}
	public void setQuerypage() {
		QueryPage.click();
	}
	}

