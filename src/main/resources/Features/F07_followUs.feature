@test

Feature: user can press on follow us icons

  Scenario: user could open site and press follow us on facebook
    When user clicks on facebook icon
    Then  facebook is opened in new tab

  Scenario: user could open site and clicks follow us on twitter
    When user clicks on twitter icon
    Then  twitter is opened in new tab

  Scenario: user could open site and clicks follow us on rss
    When user clicks on rss icon
    Then  rss is opened in new tab

  Scenario: user could open site and clicks follow us on youtube
    When user clicks on youtube icon
    Then  youtube is opened in new tab