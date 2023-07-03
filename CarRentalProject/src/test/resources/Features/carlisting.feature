Feature: Feature to test Car Listing page functionality

  Background: 
    Given user launches chrome browser
    When user navigates to url
    Then user shoud be able to view carrental portal

  Scenario: Check CarListing page is displayed on clicking CarListing button
    When user clicks on CarListing button
    Then user should be able to view Car Listing Page

  Scenario: Check cars are displayed on selecting brand type and fuel type
    When user clicks on CarListing button
    And Select Brand Type
    And Select Fuel Type
    And click on Find Your Car
    Then user should be able to view Car Listings

  Scenario: Check the details of the car is displayed on clicking on view details button
    When user clicks on CarListing button
    Then user should be able to view Car Listings
    When click on view details
    Then the user should be able to view car details
    When click on Accessories button
    Then all the accessories are displayed

  Scenario: Check functionality of prev and next buttons
  	When user clicks on CarListing button
    Then user should be able to view Car Listings
    When click on view details
    And click on prev button
    Then user should be able to view prev image
    When click on next button
    Then user should be able to view next image

  Scenario: Check functionality of Vehicle Overview button
  	When user clicks on CarListing button
    Then user should be able to view Car Listings
    When click on view details
    And click on Vehicle Overview button
    Then user should be able to view overview of the vehicle
    
  Scenario: Check whether the booking is done by the user
  	And Login as customer
  	Then sign in as admin
  	And click on bookings 
  	And click on New
  	Then check whether the customer name is viewed on bookings
  	
 