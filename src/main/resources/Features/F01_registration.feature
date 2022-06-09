@test
Feature: guest user shall be able to register to the website

  Scenario: guest user navigate to site, fill data and press register
    Given guest user go to registration page
    When guest user fill registration data
    And guest user click on register button
    Then registration success message should appear