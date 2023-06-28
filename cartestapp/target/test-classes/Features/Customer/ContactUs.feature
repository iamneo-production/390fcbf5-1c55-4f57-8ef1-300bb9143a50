#CarRental Login functionality
@Regression
Feature: Contact Us 
  As an Customer,
  I should be able to enter below details in the ContactUsloginBox to send a message on clicking Send Message Button
  i. FullName  
  ii.EmailAddress
  iii.PhoneNumber
  iv.Message
 Background:
 Given User Launch chrome browser
 When User opens url "https://carrental.neohire.io/"
 And Click on ContactUs Login
 @Development 
   Scenario: Home | Contact Us 
  UnSuccessful Login with Invalid credentials
    When User Enter valid FullName,Invalid EmailAddress,valid PhoneNumber,valid Message
    And Click on Send Message button
    
    
   Scenario: Home | Contact Us
  UnSuccessful Login with Invalid credentials
    When User Enter valid FullName,valid EmailAddress,Invalid PhoneNumber,valid Message
    And Click on Send Message button
   
    
   Scenario: Home | Contact Us
  UnSuccessful Login with Invalid credentials
    When User Enter valid FullName,valid EmailAddress,valid PhoneNumber,Invalid Message
    And Click on Send Message button
    
    
   Scenario: Home | Contact Us
  UnSuccessful Login with Invalid credentials
    When User Enter Invalid FullName,Invalid EmailAddress,Invalid PhoneNumber,Invalid Message
    And Click on Send Message button
    
    
   Scenario: Home | Contact Us
  Successful Login with valid credentials
    When User Enter valid FullName,valid EmailAddress,valid PhoneNumber,valid Message
    And Click on Send Message button
    Then User should able to see the pop-up box 
    And Click on Up arrow symbol in contactUs