
Feature: Login Page Automation of SauceDemo App
  Scenario Outline: Check login is successful with valid cred
    Given user is on login page
    When user enters valid <username> and <password>
    And user clicks on login button
    Then user is navigated to Home page
    And close the browser
    Examples:
			|username     |password    |
			|standard_user|secret_sauce|

  