@test
  Feature: user will be able to choose between sliders in homepage

    Scenario: first slider is clickable at homepage
      When user clicks on first slider
      Then relative product for first slider is displayed

      Scenario: second slider is clickable at homepage
        When user clicks on second slider
        Then relative product for second slider is displayed