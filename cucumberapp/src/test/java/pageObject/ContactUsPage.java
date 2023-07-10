package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContactUsPage {
    public static WebDriver driver;
    public ContactUsPage(WebDriver driver) {
        ContactUsPage.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="fullname")
    WebElement FullName;
    @FindBy(id = "emailaddress")
    WebElement EmailAddress;
    @FindBy(id = "phonenumber")
    WebElement PhoneNumber;
    @FindBy(name = "message")
    WebElement Message;
    @FindBy(name="send")
    WebElement SendMessageButton;
    @FindBy(xpath="/html/body/footer/div[1]")
    WebElement FooterClick;
    @FindBy(xpath = "//*[@id=\"back-top\"]/a/i")
    WebElement UpArrowSymbol;
    @FindBy(xpath="/html/body/section[2]/div/div/div[1]/div[1]")
    WebElement QueryBox;
    public void checkContactUsPage() {
        
        FullName.isDisplayed();
        EmailAddress.isDisplayed();
        PhoneNumber.isDisplayed();
        Message.isDisplayed();
        SendMessageButton.isDisplayed();
        UpArrowSymbol.isDisplayed();
        QueryBox.isDisplayed();
        FooterClick.isEnabled();
    }
    public void setFullName(String fullname) {
        FullName.clear();
        FullName.sendKeys(fullname);
    }
    public void setEmailId(String emailaddress) {
        EmailAddress.clear();
        EmailAddress.sendKeys(emailaddress);
    }
    public void setPhoneNumber(String phonenumber) {
        PhoneNumber.clear();
        PhoneNumber.sendKeys(phonenumber);
    }
    public void setMessage(String message) {
        Message.clear();
        Message.sendKeys(message);
    }
    public void checkSendMessageButton() {
        SendMessageButton.click();
    }
    public void checkFooterClick() {
    	FooterClick.click();
    }
    public void checkUpArrowSymbol() {
        UpArrowSymbol.click();
    }
   public void CheckQueryBox() {
	   QueryBox.isDisplayed();
   }
}