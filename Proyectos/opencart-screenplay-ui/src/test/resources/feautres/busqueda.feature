Feature: Product Search
  #noinspection CucumberUndefinedStep
  Scenario: Search for a product by name
    Given the user navigates to the search page
    When the user searches for "MacBook"
    Then the search results should contain "MacBook"