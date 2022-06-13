@test
Feature:  user must be able to switch between currencies USD and Euro
  Scenario:  user must be able to switch between currencies
    When user clicks on dropdown list and select euro
    Then  user check that items price was changed to Euro