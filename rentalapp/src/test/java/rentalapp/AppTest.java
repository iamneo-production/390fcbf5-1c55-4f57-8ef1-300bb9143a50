package rentalapp;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
import org.junit.Assert;
//import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
  @Test
  public void testValidateLogin()  {
 //to setup driver
 WebDriverManager.chromedriver().setup();
 //to open the browser
 WebDriver driver=new ChromeDriver();
 //to maximize the browser
 driver.manage().window().maximize();
 //to launch the browser
   driver.get("https://carrental.neohire.io/");
   
   //to load the web elements
  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 
//to locate admin
   driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
     // Enter valid email and password
     driver.findElement(By.name("username")).sendKeys("admin");
     driver.findElement(By.name("password")).sendKeys("Test@12345");
     // Click on the login button
     driver.get("https://carrental.neohire.io/");
	  
     //to load the web elements
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
   
 //to locate admin
     driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
       // Enter valid email and password
       driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("password")).sendKeys("Test@12345");
       // Click on the login button
       driver.findElement(By.name("login")).click();
       String result=driver.getTitle();
      String expected="Car Rental Portal | Admin Dashboard";
    Assert.assertEquals(expected,result);
     driver.quit();
   }
  }
	
/*
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AppTest {
	
  public static void main(String args[]) {
    //to setup driver
    WebDriverManager.chromedriver().setup();
    //to open the browser
    WebDriver driver=new ChromeDriver();
    //to maximize the browser
    driver.manage().window().maximize();
    //to launch the browser
      driver.get("https://carrental.neohire.io/");
      //to load the web elements
      driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
      driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
        // Enter valid email and password
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("Test@12345");
        // Click on the login button
        driver.findElement(By.name("login")).click();
    
    
  }
  }
  
/*
import org.junit.After;
	import org.junit.jupiter.api.Assertions;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    //import org.openqa.selenium.chrome.ChromeOptions;
   // import org.openqa.selenium.remote.RemoteWebDriver;
   // import java.net.URL;
//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
	public class AppTest {
         WebDriver driver;
        @Before
	    public void setUp() throws Exception{
	  //WebDriver driver = WebDriverManager.chromedriver().create();
			//to open the browser
			// driver = new ChromeDriver();
			//To maximize	
		//	driver.manage().window().maximize();
              // Navigate to the car rental website
             //System.setProperty("webdriver.chrome.driver","C:\\SELENIUM SOFTWARES\\chromedriver_win32\\chromedriver.exe");
           //   ChromeOptions options=new ChromeOptions();
             // options.setCapability("browserName","chrome");
              //options.setCapability("version","4.9.0");
              //options.setCapability("platform","WIN10");
              //WebDriver driver=new RemoteWebDriver(new URL("https://8080-dbfdbfabbeaffbbecbadfdbcfacbbcbfbcabbadf.project.examly.io/rentalapp/src/test/java/rentalapp/AppTest.java"),options);
            //  options.addArguments("--start-maximized");
        //executed command  WebDriver driver=new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
       // DesiredCapabilities  SSLCertificate=DesiredCapabilities.chrome();
     //   SSLCertificate.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
   //     WebDriver driver=new ChromeDriver(SSLCertificate);
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        
            options.setCapability("browserName","chrome");
              //options.setCapability("version","5.10.162+");
             // options.setCapability("ip","10.56.124.88");
           //   options.setCapability("platform","Linux");
             WebDriver driver=new RemoteWebDriver(new URL("https://8080-dbfdbfabbeaffbbecbadfdbcfacbbcbfbcabbadf.project.examly.io"),options);
       // URL url = new URL("http://10.56.124.84:4444/wd/hub"); // URL of the Selenium Grid hub
        
       // driver = new RemoteWebDriver();
        // use the driver object to automate the browser
	        driver.get("https://carrental.neohire.io/");
	    }
        
        @Test
	    public void testValidLogin() throws NullPointerException{
	    	driver.findElement(By.linkText("Admin")).click();
	    	
	        // Enter valid email and password
	        driver.findElement(By.name("username")).sendKeys("admin");
	        driver.findElement(By.name("password")).sendKeys("Test@12345");
	        // Click on the login button
	        driver.findElement(By.name("login")).click();
	        // Verify that the admin is able to login
	        //Assert.assertTrue(driver.getTitle().contains("Car Rental Portal | Admin Dashboard"));
	 String actual=driver.getTitle();
     String expected="Car Rental Portal";
            Assertions.assertEquals(expected,actual);
        }
      /*  
      @After
	    public void tearDown() throws NullPointerException {
	        // Quit the browser
	        driver.quit();
	    }
        */
//	}
  //  */
//}
/*
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
/*
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
  /*  @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
*/
/*

public class AppTest{
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        //set the desired capabilities for the remove webdriver
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        //create a new remote web driver instance
        driver=new RemoteWebDriver(new URL("https://8080-dbfdbfabbeaffbbecbadfdbcfacbbcbfbcabbadf.project.examly.io/"),capabilities);
        //navigate to the car rental website
        driver.get("https://carrental.neohire.io/");
    }

    @Test
    public void testValidateLogin(){
        //enter vaild email and password
        driver.findElement(By.name("username")).sendkeys("admin");
        driver.findElement(By.name("password")).sendkeys("Test@12345");
        //click on login button
        driver.findElement(By.name("login")).click();
        //verify that the admin is able to login
        Assert.assertTrue(driver.getTitle().contains("Car Rental Portal | Admin Dashboard"));
    }

    
    @Test
    public void testInvalidCredentials(){
        //enter invaild email and password
        driver.findElement(By.name("username")).sendkeys("invalid");
        driver.findElement(By.name("password")).sendkeys("invalid");
        //click on login button
        driver.findElement(By.name("login")).click();
        //verify that the error message is displayed
       // Assert.assertTrue(driver.findElement(By.className("alert-danger")).getText().contains(alert('Invalid Details');
Alert alert=driver.switchTo().alert();
alert.accept();

}

@Test
public void testInvalidPasswordFormat(){
    //enter vaild email and invalid password format
    driver.findElement(By.name("username")).sendkeys("admin");
    driver.findElement(By.name("password")).sendkeys("invalid_password");
    //click on login button
    driver.findElement(By.name("login")).click();
    //verify that the error message is displayed and the password field is highlighted
   // Assert.assertTrue(driver.findElement(By.className("invalid-feedback")).getText().contains("Enter a valid password"));
   // Assert.assertTrue(driver.findElement(By.id("password")).getAttribute("class").contains("is-invalid"));

Alert alert=driver.switchTo().alert();
alert.accept();


}

@Test
public void testEmptyFields(){
    //leave email and password field empty
    //click on the login button
    driver.findElement(By.name("login")).click();
    //verify that the email and password fields are highlighted
   // Assert.assertTrue(driver.findElement(By.id("email")).getAttribute("class").contains("is-invalid"));
    // Assert.assertTrue(driver.findElement(By.id("password")).getAttribute("class").contains("is-invalid"));

Alert alert=driver.switchTo().alert();
alert.accept();
}

@AfterClass
public void tearDown(){
    //quit the browser
    driver.quit();
}
}
*/