Feature: Free CRM Application Test

  Scenario: Validate Free CRM HomePage Test
    Given user opens browser
    Then user is on login page
    Then user enters username and password
    Then validate home page title
    Then validate logged in username

