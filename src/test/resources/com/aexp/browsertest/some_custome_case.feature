
Feature: Got to Amex page from google

  Scenario Outline: Open oracle
    Given A browser open with "<page>"
    And I find My Account link
    Then I should see "<element_value>"

    Examples:
      | page                             | element_value |
      | https://www.americanexpress.com/ | My Account    |