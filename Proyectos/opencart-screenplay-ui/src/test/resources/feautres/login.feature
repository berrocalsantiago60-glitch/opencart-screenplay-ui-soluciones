
Feature: User Login

  #noinspection CucumberUndefinedStep
  Scenario: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters email "202210594@cibertec.pe" and password "Test@12345"
    And clicks on login
    Then the user should see the message "My Account"
