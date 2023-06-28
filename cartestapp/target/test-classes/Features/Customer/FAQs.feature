#CarRental Login functionality
@Regression
Feature: FAQs 
  As an Customer,
  I should be able to see the FAQ page

@development
  Scenario: Home | FAQs
  Successful Login with valid credentials
    Given User Launch chrome browser
    When User opens url "https://carrental.neohire.io/"
    And Click on FAQ Login
    Then User should be able to view the message
    When Click on Up arrow symbol