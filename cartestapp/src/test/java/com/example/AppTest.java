package com.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.AbstractDriverOptions;
import java.net.MalformedURLException;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.URL;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String args[]) throws MalformedURLException
    {
        WebDriver driver;
        ChromeOptions chromeOptions = new ChromeOptions();
       
        driver=new RemoteWebDriver(new URL("http://localhost:4444"),chromeOptions);
       
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-dev-shm-usage");
       
            driver.quit();
        
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
