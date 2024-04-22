Feature: Big Basket Search

Background:
Given Open "https://www.bigbasket.com/"

  Scenario: Test search functionality on BigBasket
    When I search for "Mango"
    And I hit Enter
    Then Search for Mango should display

  Scenario: Test search mashroom functionality on BigBasket
    When search for "Mashroom"
    And hit Enter
    Then Search for mashroom should display
