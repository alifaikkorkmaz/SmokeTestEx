Feature: Updating contact detail from UI and Verifying from DB

  Scenario: Contacts test with email
    Given the user logged in as "sales manager"
    And the user navigates to "Customers" "Contacts"
    And the user updates one contact data details
    Then the user verifies same data has been modified at the DB part