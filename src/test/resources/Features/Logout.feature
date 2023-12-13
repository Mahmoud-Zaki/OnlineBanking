@Smoke_TCs @Logout_TCs
Feature: Logout

  Background:
    Given Go to Login page
    When Enter username as "mngr538910" and password as "azYbYsY"

  @Logout_TC_01
  Scenario: Logout

    When Click on Logout
    Then Verify that logout message is displayed