Feature: Login functionality on OHRM

  Background: 
    Given Open Orange HRM in Browser

  Scenario: To validate login with valid data
    Then Enter valid username "Admin" and valid password "admin123"
    And Click on Login button
    Then Dashboard page shuld display

  Scenario: To validate login with invalid data
    Then Enter invalid username "guru" and Enter invalid password "guru123"
    And I Click on Login button
    Then Error message should display
