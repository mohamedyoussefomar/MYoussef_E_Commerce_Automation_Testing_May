@test
Feature: user should be able to login to profile at the website

  # Positive Test Scenario
  Scenario: user login with valid data (username, password)
    When user navigates to login page
    And user enters "mohamedyoussefomar@gmail.com" and "MoYo@123"
    Then user clicks login then login is successful