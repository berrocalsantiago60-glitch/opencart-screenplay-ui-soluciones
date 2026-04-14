Feature: Shopping Cart

    #noinspection CucumberUndefinedStep
  Scenario: Add product to cart
    Given the user navigates to the product page
    When the user adds "MacBook" to the cart
    Then the cart should show 1 item