Feature: Login functionality on OHRM

  Scenario: To validate login with valid data
    Given Open OHRM
    Then Enter valid username and valid password
    And Click on Login button
    Then Dashboard page shuld display

  Scenario: To validate login with invalid data
    Given Open Orange HRM
    Then Enter invalid username and Enter invalid password
    And I Click on Login button
    Then Error message should display
