Feature: Feature to test google search functionality

  Scenario: Validate google search is working
    Given Browser is open
    And User is on google search page
    When User enter a text in search box
    And hits enter
    Then User is navigated to search results