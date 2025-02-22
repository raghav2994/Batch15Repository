Feature: Verify Whether EndToEnd testcases works

  Background: PreSteps to make sure user is on right state
    Given User is already loggeIn with credentials as "akhiljda@gmail.com" and "Password"


    Scenario: Add items to cart successfully
      Given User clicks on Item "Nike zoom fly"
      When User selects the item option size as "XL" and colour as "Black"
      And User clicks on AddToCart
