Feature: Verify Google Search Functionality

  Scenario: Search bdd in google search box

    Given I am on the google homepage
    When  I enter "bdd" in the search box
    And I click on search
    Then I should see the links containig the word bdd