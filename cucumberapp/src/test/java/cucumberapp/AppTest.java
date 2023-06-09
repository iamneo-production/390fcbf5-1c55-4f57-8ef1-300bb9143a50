package cucumberapp;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.AbstractDriverOptions;
import java.net.MalformedURLException;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertTrue;
import java.net.URL;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
 //AbstractDriverOptions ChromeDriver=null;
    /**
     * Rigorous Test :-)
     */

    public static void main(String args[]) throws MalformedURLException
    {
        WebDriver driver;
        ChromeOptions chromeOptions = new ChromeOptions();
        //System.out.println("webdriver.chrome.driver","/home/coder/project/workspace/cucumberapp/chromedriver");
        driver=new RemoteWebDriver(new URL("http://localhost:4444"),chromeOptions);
        //WebDriverManager.chromedriver().setup();
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        //assertTrue( true );
       // System.out.println("Hello");
       
           //WebDriverManager.chromedriver().setup();
     //  ChromeOptions options = new ChromeOptions();
       // options.addArguments("--start-maximized");
       // driver = new ChromeDriver(options);
    
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        

        



       /*
          		ChromeOptions options = new ChromeOptions();
          		AbstractDriverOptions<?> abstractOptions = options;
          		abstractOptions.addArguments("--start-maximized");
          		abstractOptions.addArguments("--disable-notifications");
          		abstractOptions.addArguments("--disable-infobars");
          		abstractOptions.addArguments("--disable-popup-blocking");
          		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
          		WebDriver driver = new ChromeDriver(options);
              */
          	driver.quit();
        
    }

}
