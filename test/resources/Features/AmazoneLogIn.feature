  Feature: LogIn functionality of Amazone site
    user will try to login with valid credentials

    Background:
      Given user entered the amazone url
      And user is on the home screen

      Scenario Outline: Login with valid user name and password
        When user click on login
        Then user should be on login page
        When user enter valid mobile as number <mobile> and click on continue btn
        When user enter valid password as <password> and click on sign in btn
        Then user should be on the homepage
        Then user should close the browser
        Examples:

        |mobile       |       password       |
        | 9988607704  |        Honey@4321    |




