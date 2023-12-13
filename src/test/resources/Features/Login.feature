@Smoke_TCs @Login_TCs
Feature: Login

  Background:
    Given Go to Login page

  @Login_TC_01
  Scenario: Login with valid credentials

    When Enter username as "mngr538910" and password as "azYbYsY"
    Then Verify that welcome message is displayed

  @Login_TC_02
  Scenario Outline: Login with invalid credentials

    When Enter username as "<username>" and password as "<password>"
    Then Verify that error message is displayed

    Examples:
      |  username     |  password  |
      |  mahmoud      |  azYbYsY   |
      |  mngr538910   |  mahmoud   |

  @Login_TC_03
  Scenario: Login with blank username

    When Enter username as "" and password as "azYbYsY"
    Then Verify that error message is displayed

  @Login_TC_04
  Scenario: Login with blank password

    When Enter username as "mngr538910" and password as ""
    Then Verify that error message is displayed