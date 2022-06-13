@test
Feature: users can search for products
  Scenario: user can search for products
    When user navigates to homepage
    And user clicks on search field in homepage
    Then search result appears on screen

  Scenario: user can search for product by SKU
    When user navigates to homepage to search SKU
    And user clicks on sku search field in homepage
    Then sku search result appears on screen