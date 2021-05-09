
Feature: Login Page
  Scenario: User to be able to login with a valid username and password
    When user opens URL
    Given user enters username
    And user enters password
    Then user clicks on the login button