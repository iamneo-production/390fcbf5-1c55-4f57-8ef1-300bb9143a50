#CarRental Login functionality
@Regression
Feature: ManageTestimonials
        As an Admin,
        I should be able to enter below details in the loginBox to login on clicking submitButton
        i. UserName
        ii. Password
        I should be able to see all the FullName,EmailAddress,Testimonials,Postingdate,Actions
 in ManageTestimonials.
  
@Development
  Scenario: Admin | Manage Testimonial 
  Successful Login with valid credentials
  Given User Launch chrome browser
    When User opens url "https://carrental.neohire.io/admin/"
    Then User should be able to view the Admin Page
    When User Enter UserName,Password
    And Click on Login
    And User Click on ManageTestimonials
    Then Verify the ManageTestimonialsPage
    When Click on Search button again0
    And Enter anyone details among valid FullName,valid EmailAddress,valid Testimonials,valid PostingDate,valid Action
    And Click on action button again0
    And Click on action button again0
    And Select the Show entries Option2
    And Check the no of entries made2
 
    
    
   
   

  