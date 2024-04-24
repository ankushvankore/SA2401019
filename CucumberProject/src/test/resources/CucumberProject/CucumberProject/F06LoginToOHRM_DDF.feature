Feature: Understanding DDF

  Scenario Outline: Test Login to OHRM Via DDF
    Given Open Orange HR Application
    When I Enter "<userName>" and "<Password>"
    And Click on Submit button for login
    Then Login should successful

    Examples: 
      | userName  | Password     |
      | admin     | admin123     |
      | jeya      | jeya123      |
      | chetan    | chetan123    |
      | admin     | admin123     |
      | aishwarya | aishwarya123 |
