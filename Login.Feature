Feature: Iceland Login
  Background:
    Given User able to open a browser
    And Click on url
    Given User click on login button
    Given User on login page

    Scenario Outline: Iceland valid login Test
      When user enter "<UserName>" and "<Password>"
#      And click on login button
#      Then user is on home page
      Then use close the browser
      Examples:
        | UserName | Password |
        | xyz1@gmail.com | India123 |


