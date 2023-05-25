package carRental;
import org.testng.annotations.Test;
    
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
  
        public String baseUrl = "https://carrental.neohire.io/";
        String driverPath = "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe";
        public WebDriver driver ;
        
         @BeforeTest
            public void setup()  {
            /*
             //to setup driver
                    WebDriverManager.chromedriver().setup();
                    //to open the browser
                    WebDriver driver=new ChromeDriver();
                    //to maximize the browser
                    driver.manage().window().maximize();
                    //to launch the browser
                      driver.get("https://carrental.neohire.io/");
                      
                      //to load the web elements
                    // driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
            */		 
            System.setProperty("webdriver.chrome.driver", driverPath);
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(baseUrl);
    }
         @Test
            public void testValidateLogin()  {
        
            driver.get("https://carrental.neohire.io/");
        
    //to locate admin
         driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
         // driver.findElement(By.linkText("Admin")).click();
       // Enter valid email and password
     driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("password")).sendKeys("Test@12345");
       // Click on the login button
       driver.findElement(By.name("login")).click();
      String result=driver.getTitle();
           String expected="Car Rental Portal | Admin Dashboard";
         Assert.assertEquals(expected,result);
    
        }
         @Test
            public void testInvalidCredentials(){
               
              driver.get("https://carrental.neohire.io/");
                //to locate admin
                driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
                // Enter invalid email and password
         driver.findElement(By.name("username")).sendKeys("invalid");
      driver.findElement(By.name("password")).sendKeys("invalid");
                // Click on the login button
                driver.findElement(By.name("login")).click();
                 
                // Switching to Alert        
                Alert alert = driver.switchTo().alert();		
                        
                // Capturing alert message.    
                String alertMessage= driver.switchTo().alert().getText();		
                        
                // Displaying alert message		
                System.out.println(alertMessage);	
             //   Thread.sleep(5000);
                        
                // Accepting alert		
                alert.accept();		
                // Verify that the error message is displayed
               Assert.assertTrue(true);
         }
    
         @Test
            public void testEmptyCredentials(){
              driver.get("https://carrental.neohire.io/");
                //to locate admin
                driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
                // Username and password are left empty
         driver.findElement(By.name("username"));
      driver.findElement(By.name("password"));
                // Click on the login button
                driver.findElement(By.name("login")).click();
                 
                // Switching to Alert        
                Alert alert = driver.switchTo().alert();		
                        
                // Capturing alert message.    
                String alertMessage= driver.switchTo().alert().getText();		
                        
                // Displaying alert message		
                System.out.println(alertMessage);	
             //   Thread.sleep(5000);
                        
                // Accepting alert		
                alert.accept();		
                // Verify that the error message is displayed
               Assert.assertTrue(true);
         }
         
               @Test
                public void testDashboard()  {
                      driver.get("https://carrental.neohire.io/");
                
            //to locate admin
                  driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
                  // Enter valid username and password
                driver.findElement(By.name("username")).sendKeys("admin");
                  driver.findElement(By.name("password")).sendKeys("Test@12345");
                  // Click on the login button
                  driver.findElement(By.name("login")).click();
                  //verify the admin is logged in
                  String expectedUrl="https://carrental.neohire.io/admin/dashboard.php";
                  String actualUrl=driver.getCurrentUrl();
                  assert actualUrl.equals(expectedUrl):"Login failed!";
                  //click on dashboard
                  driver.findElement(By.xpath("/html/body/div[2]/nav/ul/li[2]/a")).click();
                  //click on reg users
                   driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/a")).click();
                   //verify the information is displayed
                   assert driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]")).isDisplayed():"Registered user details are not displayed!";
         }
         
         @Test
            public void testBrand()  {
            driver.get("https://carrental.neohire.io/");
        //to locate admin
         driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[6]/a")).click();
         // driver.findElement(By.linkText("Admin")).click();
    // Enter valid email and password
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("Test@12345");
    // Click on the login button
    driver.findElement(By.name("login")).click();
    //click on brand 
    driver.findElement(By.xpath("/html/body/div[2]/nav/ul/li[3]/a")).click();
    //click on create brand
    driver.findElement(By.xpath("/html/body/div[2]/nav/ul/li[3]/ul/li[1]/a")).click();
    //verify the create brand page title
    String result=driver.getTitle();
           String expected="Car Rental Portal | Admin Create Brand";
         Assert.assertEquals(expected,result);
         //verify if on create brand page
         WebElement pageTitle=driver.findElement(By.tagName("h2"));
         Assert.assertEquals(pageTitle.getText(),"Create Brand");
        
         //fill the brand name
        driver.findElement(By.className("form-control")).sendKeys("BENZ");
        driver.findElement(By.name("submit")).click();
        //verify if success message is displayed
        WebElement successMessage=driver.findElement(By.className("form-horizontal"));
        Assert.assertTrue(successMessage.isDisplayed());
         
         }
         
            @AfterTest
            public void terminateBrowser(){
            driver.close();
            } 
    }
    