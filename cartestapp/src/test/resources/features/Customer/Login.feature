#CarRental Login functionality
@Regression
Feature: Login page
  As an Customer,
  I should be able to enter below details in the ProfileSettingsBox to send a message on clicking Send Message Button
  i. FullName  
  ii.EmailAddress
  iii.PhoneNumber
  iv.Message
  Background:
  Given User Launch chrome browser
When User opens url "https://carrental.neohire.io/profile.php"
    When User Enter Email id and password
Scenario: Home | Login | Profile Settings
  Successful Login with valid credentials
    And Click on ProfileSettings
    And Enter DateOfBirth,Address,Country,City
    # And Click on SaveChanges Option
    # Then Check the pop-up box
    # When Click on UpArrowSymbol again1
    