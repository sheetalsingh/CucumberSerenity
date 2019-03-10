@home
Feature: Searching by keyword
  In order to purchase item from home page
  As a potential buyer
  I want to be able to check complete home page features

  Scenario: Basic link test
    Given I am on home page
    When I search for items all
    Then I should see all results
