#CarRental Login functionality
@Regression
Feature: RegUsers
        As an Admin,
        I should be able to enter below details in the loginBox to login on clicking submitButton
        i.UserName
        ii.Password
        I should be able to see all the FullName,EmailAddress,Testimonials,Postingdate,Actions
 in ManageTestimonials.
 
@Development
  Scenario: Admin | Reg Users
  Successful Login with valid credentials
    Given User Launch chrome browser
    When User opens url "https://carrental.neohire.io/"
    And Click on Admin Login
    Then User should be able to view the Admin Page
    When User Enter UserName,Password
    And Click on Login
    And User Click on RegUsers
    Then Verify the RegisteredUsersPage
    When Click on Search button again2
    And Select the Show entries Option1
    And Check the no of entries made1
    
   
   

  