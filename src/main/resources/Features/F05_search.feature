@test
Feature: users can search for products
  Scenario: user can search for products
    When user navigates to homepage
    And user clicks on search field in homepage
    Then search result appears on screen