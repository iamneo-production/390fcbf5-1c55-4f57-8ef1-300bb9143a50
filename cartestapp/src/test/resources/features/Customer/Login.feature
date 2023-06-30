#CarRental Login functionality
@Regression
Feature: Login page
  As an Customer,
  I should be able to enter below details in the ContactUsloginBox to send a message on clicking Send Message Button
  i. FullName  
  ii.EmailAddress
  iii.PhoneNumber
  iv.Message

  Background: 
    Given User Launch chrome browser
    When User opens url "https://carrental.neohire.io/"
    And Click on LoginOrRegister Option
    And User Enter Email id as "Tester@gmail.com" and  Password as "Tester@1234"
    And Click on LoginButton
    And Click on DownArrowSymbol beside profile

  Scenario: Home | Login | Profile Settings
  Successful Login with valid credentials
    And Click on ProfileSettings
    And Enter DateOfBirth,Address,Country,City
    And Click on SaveChanges Option
    Then Check the pop-up box
    When Click on UpArrowSymbol again1

  Scenario: Home | Login | Update Password
  Successful Login with valid credentials
    And Click on UpdatePassword Option
    And Check the Page

  Scenario: Home | Login | My Bookings
  Successful Login with valid credentials
    And Click on MyBookings Option
    And Check the BookingNo
    And Check the Confirm or NotYetConfirm button
    And Check the Grand Total Price

  Scenario: Home | Login | Post A Testimonial
  Successful Login with valid credentials
    And Click on Post Testimonial Option
    And Check the Page
    And Enter the Message in Testimonail Box
    And Click on Save button
    Then Check the pop-up Box Successful or not

  Scenario: Home | Login | My Testimonials
  Successful Login with valid credentials
    And Click on My Testimonial Option
    And Check the My Testimonial page

  Scenario: Home | Login | Sign Out
  Successful Login with valid credentials
   And Click on SignOut Login
