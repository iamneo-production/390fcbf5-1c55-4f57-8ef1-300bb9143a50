package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {
	private WebDriver driver;

	private By adminLocator = By.xpath("/html/body/header/nav/div/div[3]/ul/li[6]/a");
	private By usernameInputLocator = By.name("username");
	private By passwordInputLocator = By.name("password");
	private By loginButtonLocator = By.name("login");
	private By backToHomeLocator = By.linkText("Back to Home");

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAdminButton() {
		WebElement adminButton = driver.findElement(adminLocator);
		adminButton.click();
	}

	public String adminSignInPage() {
		String adminPage = driver.getTitle();
		return adminPage;
	}

	public void enterUsername(String username) {
		WebElement usernameInput = driver.findElement(usernameInputLocator);
		usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordInputLocator);
		passwordInput.sendKeys(password);
	}

	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(loginButtonLocator);
		loginButton.click();
	}

	public void clickBacktoHomeLink() {
		WebElement backToHomeLink = driver.findElement(backToHomeLocator);
		backToHomeLink.click();
	}

	public String getHomePageTitle() {
		String homePage = driver.getTitle();
		return homePage;
	}

	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
	}

	public String getAdminSignInPageTitle() {
		String adminSignInPageTitle = driver.getTitle();
		return adminSignInPageTitle;
	}
}
