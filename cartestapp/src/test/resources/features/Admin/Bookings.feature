#CarRental Login functionality
@Regression
Feature: USNBS-02_Bookings
  As an Admin,
        I should be able to enter below details in the loginBox to login on clicking submitButton
        i.UserName
        ii.Password
        I should be able to see all the FullName,BookingNo,Vehicle,FromDate,ToDate,Postingdate,Actions
  in Bookings.
  
  @Development
  Scenario: Admin | Bookings
  Successful Login with valid credentials
    Given User Launch chrome browser
    When User opens url "https://carrental.neohire.io/"
    And Click on Admin Login
    Then User should be able to view the Admin Page
    When User Enter UserName,Password
    And Click on Login
    And User Click on Bookings
    And User Click on New Option
    Then Verify the NewBookingsPage 
    When Click on Search Option
    And Enter anyone details among valid FullName,valid BookingNo,valid Vehicle,valid FromDate,Valid ToDate,Valid Status,valid PostingDate,valid Actions1
    And User Click on Bookings
    And User Click on New Option
    Then Verify the NewBookingsPage
    When Select the Show entries button5
    And Check the no of entries5
  