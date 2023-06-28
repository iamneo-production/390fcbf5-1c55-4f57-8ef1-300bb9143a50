package StepDefination;
import java.net.MalformedURLException;
import PageObject.Booking;
import PageObject.RegUsers;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.CapabilityType;
import java.net.URL;



public class StepDefination {
	public WebDriver driver;
	public Booking booking;
	public RegUsers regusers;
	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        driver = new RemoteWebDriver(new URL("http://34.86.173.116:443"), capabilities);
	        booking = new Booking(driver);
	        regusers = new RegUsers(driver);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
	      System.out.println("User Succesfully launched Chrome Browser");
	      Thread.sleep(2000);
	}
	
	
	@When("User opens url {string}")
	public void user_opens_url(String url) throws InterruptedException {
		//Here driver opens the Car Rental Website
		driver.get(url);
		Thread.sleep(2500);
	    //Here We are checking Website Interface is launched or not
		WebElement Interface=  driver.findElement(By.xpath("//img[@alt='image']"));
		if(Interface.isDisplayed())
		 {
			System.out.println("Car Rental Website Succesfully Launched");
			
		}
		else {
			System.out.println("Website is not opened");
		}
        
	}
	
	@Then("User Navigates to Admin Login Page")
	public void user_navigates_to_admin_login_page() {
		//Navigating to Admin Login Page
	    booking.adminbuttonclick();
	}
	
	@Then("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String userid, String passwordid) throws InterruptedException {
		//Here admin gives userid and password in LoginPage 
		booking.setUserid(userid);
		booking.setPasswordid(passwordid);
		 Thread.sleep(1500);
	    
	}
	
	@Then("User clicks on Login Option")
	public void user_clicks_on_login_option() {
	    booking.ClickLoginButton();
	    
	    
	}
	
	@Then("User able to see admin page successfully")
	public void user_able_to_see_admin_page_successfully() throws InterruptedException {
		
		//Here we are Verifying Admin INterface
		String title = "Car Rental Portal | Admin Panel";
		String actualtitle = booking.AdminInterface();
		
        if (title.equals(actualtitle)) {
        	System.out.println("Successfully Login Page Opened");
        } else {
        	System.out.println("Successfully Login Page Not Opened");
        }
        Thread.sleep(2500);
		
	}
	
	@Then("User clicks on Bookings Option and verify its Categorieslist")
	public void user_clicks_on_bookings_option_and_verify_its_categorieslist() throws InterruptedException {
		
		//Here we are clicking on Admin Booking Option
		
        booking.ClickBookingButton();
	    
	    //Here we are Verifying the Categories list of Bookings
	    
	    booking.VerifyCategoriesList();
	    Thread.sleep(2500);
	}

	
	@When("User Clicks on New Option and Verify Interface")
	public void user_clicks_on_new_option_and_verify_interface() throws InterruptedException {
		//Here we are clicking on New in Bookings option
		
		 booking.NewClick();
		 Thread.sleep(2500);
		 
		//Here we are Verifying New Bookings Interface
		
		booking.NewBookingInterface();
		
	 WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
		if(sno1.isDisplayed()) {
			System.out.println("New Bookings details are present");
		}
		else {
			System.out.println("New Bookings Details are empty");
		}
		 Thread.sleep(2500);
	}

    
    @Then("User Clicks on Show drop down list and verify it")
    public void User_Clicks_on_Show_drop_down_list_and_verify_it() throws InterruptedException {
    	//Here we  are verifying show Dropdown list
    	
    	booking.ShowDisplay();
    	
       //Verify within Selected No Entries displayed or not
    	
    	booking.SelectShowEntry();
    	booking.ShoworSearchOutput();
    	 Thread.sleep(2500);
    	}
    
    @Then("User Verify PREVIOUS and NEXT buttons of Bookings")
    public void user_verify_previous_and_next_buttons_of_bookings() throws InterruptedException {
    	//Here we are checking Next and previous buttons are active or not
    	 WebElement button1 = driver.findElement(By.id("zctb_paginate"));
         String button2 = button1.getText();
         if(button2.contains("2")){
     		
     		 Thread.sleep(3000);
     		 booking.ClickNextButton();
             Thread.sleep(2500);
             booking.ClickPreviousButton();
             Thread.sleep(2500);
             System.out.println("Next and Previous buttons are active");
             
           }
     	
         else {
       		System.out.println("Next and Previous are disabled due to less/equal no of details present of show selected entries ");
       		Thread.sleep(2500);
       	}  
      
    }
    
    @Then("User Enter Car Name in Search Bar {string} and Verify it")
    public void user_enter_car_name_in_search_bar_and_verify_it(String searchTerm) throws InterruptedException {
    	
    	//Here we are checking Search Bar Actions
    	WebElement sno2 = driver.findElement(By.xpath("//td[text()='2']"));
    	if(sno2.isDisplayed()) {
    	booking.SearchClick(searchTerm);
    	Thread.sleep(2500);
    	}
    	else 
    	{
    	   WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
    	   if(sno1.isDisplayed())
    	   {
    	      System.out.println("Only one Booking is present");
    		
              }
           else
           {
            System.out.println("No Booking is present");
           }
    	}
    	//Here we are Verifying  Entered Car Booking  Details are displayed or not
    	
    	booking.SearchCompare(searchTerm);
    	Thread.sleep(2500);
        
     }
    
     String BOOKINGNO;
     @Then("User Clicks on view option and Display Status of Noted Booking Id")
     public void user_clicks_on_view_option_and_display_status_of_noted_booking_id() throws InterruptedException {
    	 
    	// here user note downs the booking No,From Date and To date 
    	 
    	 BOOKINGNO = booking.NoteBookingId();
       	
         // Users clicks on view option
      	 
        booking.ClickViewButton();
        Thread.sleep(2500);
      	 
      	//verify noted booking id details displayed or not
      	 
      	booking.BookingDetailInterface();
      	Thread.sleep(2500);
      	
      	//User should Know Status of Noted Booking ID
      	
      	booking.BookingIdStatus();
      	
      	
      }
     
      
     
     @Then("User Clicks on Confirm Booking verify pop message and cancel it and Confirm it")
     public void user_clicks_on_confirm_booking_verify_pop_message_and_cancel_it_and_confirm_it() throws InterruptedException{
    	 Thread.sleep(2000);
    	 //Here we are Scrolling down the page
    	 JavascriptExecutor jse = (JavascriptExecutor) driver;
    	 jse.executeScript("window.scrollBy(0,200)");
    	 
         //Here we are printing Noted Booking Id
    	 System.out.println("This Booking No is Compared with User Interface="+BOOKINGNO);
         
        //Here we are clicking on confirm booking and cancel it
         Thread.sleep(1500);
         booking.ClickNewConfirmButton();
        
       //Here we are switching alert into text
        	 Alert alert = driver.switchTo().alert();
        	 String textmsg = alert.getText();
        	 System.out.println(textmsg+" such that pop message displayed");
        	 Thread.sleep(2500);
        	 alert.dismiss();
        
       //Here we are clicking on confirm booking and confirm it
         Thread.sleep(1500);
         booking.ClickNewConfirmButton();
             
       //Here we are switching alert into text
        	 driver.switchTo().alert();
        	 Thread.sleep(2500);
        	 alert.accept();
        	 Alert alert1 = driver.switchTo().alert();
        	 String textmsg1 = alert1.getText();
        	 System.out.println(textmsg1);
        	 alert1.accept();
        	 Thread.sleep(1500);
     }
    
    
     
     @Then("User Clicks on Cancel Booking verify pop message and cancel it and Confirm it")
     public void user_clicks_on_cancel_booking_verify_pop_message_and_cancel_it_and_confirm_it()throws InterruptedException {
    	 
    	 Thread.sleep(2000);
    	//Here we are Scrolling down the page
    	 JavascriptExecutor jse = (JavascriptExecutor) driver;
    	 jse.executeScript("window.scrollBy(0,200)");
    	 
    	//Here we are printing Noted Booking Id
    	 System.out.println("This Booking No is Compared with User Interface="+BOOKINGNO);
    	 
    	//Here we are clicking on cancel booking and cancel it
    	 Thread.sleep(1500);
    	 booking.ClickNewCancelButton();
          
    	 //Here we are switching alert into text
    	     Alert alert = driver.switchTo().alert();
        	 String textmsg = alert.getText();
        	 System.out.println(textmsg+" such that pop message displayed");
        	 Thread.sleep(2500);
        	 alert.dismiss();
        	 
        //Here we are clicking on cancel booking and cancel it
        Thread.sleep(1500);
         booking.ClickNewCancelButton();
        	 
       //Here we are switching alert into text
        	 driver.switchTo().alert();
        	 Thread.sleep(2500);
        	 alert.accept();
        	 Alert alert1 = driver.switchTo().alert();
        	 String textmsg1 = alert1.getText();
        	 System.out.println(textmsg1);
        	 alert1.accept();
        	 Thread.sleep(1500);
         
     }

   //END TO END SCENARIO CODE
     @Then ("User Clicks on logout button and back to home button")
     public void user_clicks_on_logout_button_and_back_to_home_button() throws InterruptedException {
    	 //Here we are Logging out from Admin Page and back to Home Page
    	 booking.AdminLogoutClick();
    	 
     }
     
     
    @Then ("User Clicks on LoginRegister button and Enters Valid Email Address as {string} and Password as {string}")
     public void user_clicks_on_loginregisterbutton_and_enters_valid_email_address_as_and_password_as(String emailid,String passid) throws InterruptedException {
     //Here we are clicking User Login button
   	     Thread.sleep(2000);
   	     booking.UserLoginRegisterClick();
   	 //Here we are entering Details to User Login
    	 booking.setemailid(emailid);
    	 booking.setpassid(passid);
    	
     }
    
     @Then("User Clicks on Login button and Drop Down list and Select My Booking Option")
     public void user_clicks_on_login_button() throws InterruptedException {
    	 //Here we are clicking on login user button
    	 Thread.sleep(2000);
    	 booking.UserLoginClick();
    	 
    	 //Here we are clicking on User dropdown and going to My Booking of User
    	 Thread.sleep(2000);
    	 booking.UserDropdownClick();
    	 booking.UserMyBookingClick();
     }
     
     @Then ("Verify the Status of Noted Booking Number and Clicks on Logout button")
     public void verify_the_status_of_noted_booking_number_and_clicks_on_logout_button() throws InterruptedException {
    	  
         // This list to include all the elements in My Booking of User
    	 Thread.sleep(2500);
         List <WebElement> Bookingnos = driver.findElements(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div/ul/li"));
         
         for(WebElement Bookingno : Bookingnos) {
        	    
        	      String BookingNumber = Bookingno.getText();
        	   	
        	  if(BookingNumber.contains(BOOKINGNO) ) 
        	  {
        		   // Here below line is print vehicle Information
        		   System.out.println(BookingNumber);   
        	   }
         }
         booking.UserDropdownClick();
         //Logging out from user interface 
         booking.UserLogoutClick();
     }
     
     
     @When("User Clicks on Confirmed Option and Verify Interface")
     public void user_clicks_on_confirmed_option_and_verify_interface() throws InterruptedException {
    	 
    	 //Here we are clicking on Confirmed Option
    	 booking.ClickConfirmedBooking();
    	 
    	 //Here we are Verifying Confirmed Bookings Interface
    	 Thread.sleep(2000);
    	 booking.ConfirmedBookingInterface();
    	 
  		WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
  		if(sno1.isDisplayed()) {
  			System.out.println("Confirm Bookings details are present");
  		}
  		else {
  			System.out.println("Confirm Bookings Details are empty");
  		}
     }
     
     
    @When("User Clicks on Canceled Option and Verify Interface")
     public void user_clicks_on_canceled_option_and_verify_interface() throws InterruptedException {
    	//Here we are clicking on Canceled Option
    	 booking.ClickCanceledButton();
    	 
    	//Here we are Verifying Confirmed Bookings Interface
    	 Thread.sleep(2000);
    	 booking.CanceledBookingInterface();
   		WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
   		if(sno1.isDisplayed()) {
   			System.out.println("Cancelled Bookings details are present");
   		}
   		else {
   			System.out.println("Cancelled Bookings Details are empty");
   		}
     }
     
     @Then ("User clicks on Req Users option and Verify Interface")
     public void user_clicks_on_req_users_and_verify_interface() throws InterruptedException {
    	 //Here we are clicking on Admin Req Users button
    	 regusers.ReguserClickButton();
    	 
    	//Here we are Verifying Req Users Interface
    	 Thread.sleep(2000);
    	 regusers.InterfaceReguser();
    	 
    	 WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
 		if(sno1.isDisplayed()) {
 			System.out.println("Registered users details are present");
 		}
 		else {
 			System.out.println("Registered users Details are empty");
 		}
     }
     
     

     
     @Then("User Enter Name in Search Bar {string} and verify it")
     public void User_Enter_Name_in_Search_Bar_and_verify_it(String searchTerm) throws InterruptedException  {
    	 //Here we are scrolling Page  to top 
     	 JavascriptExecutor Uppage = (JavascriptExecutor) driver;
     	 Uppage.executeScript("window.scrollTo(0,0)");
     	 
     	 //Here we are Entering Name in Search Bar
     	 Thread.sleep(2000);
    	 WebElement sno2 = driver.findElement(By.xpath("//td[text()='2']"));
     	if(sno2.isDisplayed()) {
     	regusers.SearchClick(searchTerm);
     	}
     	else {
     	      WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
     	      if(sno1.isDisplayed()){
     	      System.out.println("Only one Reqistered User is present");
     		
               }
             else{
             System.out.println("Registered Users are empty");
             }
     	}
     	//Here we are Verifying  Entered Name Registered User Details are displayed or not
     	
     	regusers.SearchCompare(searchTerm);
     	Thread.sleep(3000);
     
        
  }
     
}





