package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ddriver;

	public LoginPage(WebDriver cdriver)
	{
	    ddriver=cdriver;
	    PageFactory.initElements(ddriver, this);
	}
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[4]/a")
	WebElement LoginOrRegister;
	@FindBy(xpath="//*[@id='loginform']/div/div/div[3]/p[1]/a")
	WebElement SignUp;
	@FindBy(name="fullname")
	WebElement FullName;
	@FindBy(name="mobileno")
	WebElement MobileNumber;
	@FindBy(name="emailid")
	WebElement EmailId;
	@FindBy(xpath="//*[@id=\"signupform\"]/div/div/div[2]/div/div/div/form/div[4]/input")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"signupform\"]/div/div/div[2]/div/div/div/form/div[5]/input")
	WebElement ConfirmPassword;
	@FindBy(xpath="//*[@id=\"signupform\"]/div/div/div[2]/div/div/div/form/div[6]/label")
	WebElement AgreeButton;
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement SignUpButton;
	@FindBy(xpath="//*[@id=\"signupform\"]/div/div/div[1]/button/span")
	WebElement CloseButton;
	@FindBy(xpath="//*[@id=\"signupform\"]/div/div/div[3]/p/a")
	WebElement LoginHere;
	@FindBy(xpath="//*[@id='loginform']/div/div/div[2]/div/div/div/form/div[1]/input")
	WebElement EmailAddress;
	@FindBy(xpath="//*[@id='loginform']/div/div/div[2]/div/div/div/form/div[2]/input")
	WebElement PasswordLogin;
	@FindBy(xpath="//*[@id=\"loginform\"]/div/div/div[2]/div/div/div/form/div[4]/input")
	WebElement Login;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div")
	WebElement Header; 
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/a/i[2]")
	WebElement DownArrowSymbol;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[4]/a")
	WebElement LoginpageClick;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[1]/a")
	WebElement ProfileSettings;
	@FindBy(name="dob")
	WebElement DateOfBirth;
	@FindBy(name="address")
	WebElement Address;
	@FindBy(name="country")
	WebElement Country;
	@FindBy(name="city")
	WebElement City;
	@FindBy(name="updateprofile")
	WebElement UpdateProfile;
	@FindBy(xpath="/html/body/footer/div[1]")
	WebElement FooterPS;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/div")
	WebElement QuerySent;
	@FindBy(xpath="//*[@id=\"back-top\"]/a/i")
	WebElement UpArrowSymbolagain1;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[2]/a")
	WebElement UpdatePassword;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[3]/a")
	WebElement MyBooking;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/div/ul/li[1]/div[3]/a")
	WebElement NotYetConfirmedButton;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/div/ul/table[1]/tbody/tr[3]/th[2]")
	WebElement GrandPrice;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/div/ul/li[1]/h4")
	WebElement BookingNo;
	@FindBy(xpath="/html/body/footer/div[1]")
	WebElement FooterClick;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[4]/a")
	WebElement PostATestimonial;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/form/div[1]/textarea")
	WebElement TestimonialMessage;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/form/div[2]/button")
	WebElement save;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/div")
	WebElement SuccessfulMessage;
	@FindBy(xpath="/html/body/footer/div[1]")
	WebElement FooterSelect;
	@FindBy(xpath="//*[@id=\"back-top\"]/a")
	WebElement Arrow;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[5]/a")
	WebElement MyTestimonial;
	@FindBy(xpath="/html/body")
	WebElement MyTestimonialPage;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[6]/a")
	WebElement SignOut;
	@FindBy(xpath="//*[@id='navigation_bar']/div/div[2]/div[1]/ul/li/a")
	WebElement Tester;
	public void CheckLoginPage() {
		LoginOrRegister.isDisplayed();
		SignUp.isDisplayed();
		FullName.isDisplayed();
		MobileNumber.isDisplayed();
		EmailId.isDisplayed();
		Password.isDisplayed();
		ConfirmPassword.isDisplayed();
		AgreeButton.isDisplayed();
		SignUpButton.isDisplayed();
		EmailAddress.isDisplayed();
		PasswordLogin.isDisplayed();
		Login.isDisplayed();
		Header.isDisplayed();
		DownArrowSymbol.isDisplayed();
		ProfileSettings.isDisplayed();
		DateOfBirth.isDisplayed();
		Address.isDisplayed();
		Country.isDisplayed();
		City.isDisplayed();
		UpdateProfile.isEnabled();
		QuerySent.isDisplayed();
		UpArrowSymbolagain1.isDisplayed();
		UpdatePassword.isDisplayed();
		MyBooking.isDisplayed();
		NotYetConfirmedButton.isSelected();
		BookingNo.isDisplayed();
		GrandPrice.isDisplayed();
		PostATestimonial.isEnabled();
		TestimonialMessage.isDisplayed();
		save.isSelected();
		SuccessfulMessage.isDisplayed();
		MyTestimonial.isDisplayed();
		MyTestimonialPage.isDisplayed();
		SignOut.isEnabled();
	}
		public void setLoginOrRegister() {
	        LoginOrRegister.click();
	    }
        public void setSignUp() {
	        SignUp.click();
	    }
        public void setFullName(String fullname) {
	        FullName.clear();
	        FullName.sendKeys(fullname);
	    }
        public void setMobileNumber(String mobileno) {
        	MobileNumber.clear();
        	MobileNumber.sendKeys(mobileno);
	        
	    }
        public void setEmailId(String emailid) {
        	EmailId.clear();
        	EmailId.sendKeys(emailid);
	        
	    }
        public void setPassword(String password) {
        	Password.clear();
        	Password.sendKeys(password);
	        
	    }
        public void setConfirmPassword(String confirmpassword) {
        	ConfirmPassword.clear();
        	ConfirmPassword.sendKeys(confirmpassword);
        	
        }
        public void setAgreeButton() {
        	AgreeButton.click();
	        
	    }
        public void setSignUpButton() {
        	SignUpButton.click();
        	
	    }
        public void setCloseButton() {
        	CloseButton.click();
        }
        public void setLoginHere() {
        	LoginHere.click();
        }
        public void setEmailAddress(String emailaddress) {
        	
        	EmailAddress.sendKeys(emailaddress);
        }
        public void setPasswordLogin(String passwordlogin) {
        	PasswordLogin.sendKeys(passwordlogin);
        }
        public void setLogin() {
        	Login.click();
        }
        public void setHeader() {
        	Header.click();
        }
        public void setDownArrowSymbol() {
        	DownArrowSymbol.click();
        	
        }
        public void setLoginPageClick() {
        	LoginpageClick.click();
        }
        public void setProfileSettings() {
        	ProfileSettings.click();
        }
        public void setDateOfBirth(String dob) {
        	DateOfBirth.clear();
        	DateOfBirth.sendKeys(dob);
        }
        public void setAddress(String address) {
        	Address.clear();
        	Address.sendKeys(address);
        }
        public void setCountry(String country) {
        	Country.clear();
        	Country.sendKeys(country);
        }
        public void setCity(String city) {
        	City.clear();
        	City.sendKeys(city);
        }
        
        public void setUpdateProfile() {
        	UpdateProfile.click();
        }
        public void setQuerySent() {
        	QuerySent.isDisplayed();
        }
        public void setFooterPS() {
        	FooterPS.click();
        }
        public void setUpArrowSymbolagain1(){
        	UpArrowSymbolagain1.click();
        	UpArrowSymbolagain1.isSelected();
        }
        public void setUpdatePassword() {
        	UpdatePassword.click();
        }
        public void setMyBooking() {
        	MyBooking.click();
        }
        public void setNotYetConfirmedButton() {
        	NotYetConfirmedButton.click();
        }
        public void setGrandPrice() {
        	GrandPrice.isDisplayed();
        }
        public void setBookingNo(String bookingno){
        	BookingNo.click();
        	
        	
        }
        public void setPostAtTestmonial() {
        	PostATestimonial.click();
        }
        public void setTestimonialMessage(String message) {
        	TestimonialMessage.click();
        	TestimonialMessage.clear();
        	TestimonialMessage.sendKeys(message);
        }
        public void setsave() {
        	save.click();
        }
	    public void setSuccessfulMessage() {
	    	SuccessfulMessage.isDisplayed();
	    }
	    public void setFooterSelect() {
	    	FooterSelect.click();
	    }
	    public void setArrow() {
	    	Arrow.click();
	    }
	    
	    public void setMyTestimonial() {
	    	MyTestimonial.click();
	    }
	    public void setMyTestimonialPage() {
	    	MyTestimonialPage.isDisplayed();
	    }

	    public void setSignOut() {
	    	SignOut.click();
	    }
		
	    
}
