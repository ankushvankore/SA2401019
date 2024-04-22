@AmazonLinks
Feature: Amazon Links Test

  Background: 
    Given Open Amazon

  @SellLink
  Scenario: To Test Sell Link
    When I click on Sell link
    Then Sell page should open

  @BestSellerLink
  Scenario: To Test Best Seller Link
    When I Click on Best Seller link
    Then Best Sellers page should open

  @MobileLink
  Scenario: To Test Mobile Link
    When I Click on Mobile link
    Then Mobile Page should open

  @ElectronicsLink
  Scenario: To Test Electronics Link
    When I Click on Electronics Link
    Then Electronis page should dispaly
