#CarRental Login functionality
@Regression
Feature: ManageContactUsQuery
        As an Admin,
        I should be able to enter below details in the loginBox to login on clicking submitButton
        i. UserName
        ii. Password
        I should be able to see all the FullName,EmailAddress,PhoneNumber,Message,Postingdate,Actions
 in ManageContactUsQuery.

@Development
  Scenario:  Admin | Manage Contact Us Query
  Successful Login with valid credentials
    Given User Launch chrome browser
    When User opens url "https://carrental.neohire.io/"
    And Click on Admin Login
    Then User should be able to view the Admin Page
    When User Enter UserName,Password
    And Click on Login
    And User Click on ManageContactUsQuery
    Then Verify the ManageContactUsPage 
    When Click on Search button
    And Enter anyone details among valid FullName,valid EmailAddress,valid PhoneNumber,valid Message,valid PostingDate,valid Action
    And Click on action button
    And Select the Show entries Option
    And Check the no of entries made
   
   

  