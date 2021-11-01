Feature: Login functionality of a Facebook Site
          This is functionality which deals login in all Positive and Negative Scenarios

  Background: 
    Given the user has entered the Facebook URL
    And the user is in the Home Screen

  @SmokeTest @Login
  Scenario: Login functionality exists
    Given I have opened the browser
    When I open Facebook website
    Then Login button should exist

  #   This is to check test result for Failed test case
  Scenario: Forgot password exists
    Given I have open the browser
    When I open Facebook website
    Then Forgot password link should exist
