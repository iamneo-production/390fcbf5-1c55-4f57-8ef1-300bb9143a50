Feature: feature to test the manage contactus query Page

  
  
  Scenario: validate the search in manage contact us query
    When user opens url "https://carrental.neohire.io/admin/"
    Then user should able see the admin|signin page
    When User should enter username as "admin"  and passwrod ad "Test@12345"
    And click on login
    Then admin should able to view car rental portal | admin panel
    When click on Manage Contactus Query
    Then admin should able to see the Manage Contact Us Queries page
    And admin checks the next option
    Then admin checks the previous option
    And admin enter the text
    Then the details of the entered text will appear
    And admin reads the pending queries
    Then admin checks the show entries
