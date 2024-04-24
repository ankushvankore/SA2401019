Feature: Check Google title

  Scenario: Validate Google title
    Given Open google
    When Read title
    Then Title should be Google

  Scenario: Validate search functionality of Google
    Given I Open google
    When Enter valid keyword in search box
    And Hit Enter
    Then Valid search should display
