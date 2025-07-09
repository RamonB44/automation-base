@login-example
Feature: Login Functionality

  Background: The user open the app
    Given ingresa al app store
    When quiere ingresa a su cuenta del banco
    Then el usuario abre la aplicacion

  @scenario_1 @CP_ZT1 @high @regresion
  Scenario: Successful login
    Given the user launches the app
    When the user enters valid credentials
    And remenber user
    Then the user should be logged in

  @scenario_2 @CP_ZT2 @low
  Scenario: Successful login
    Given the user launches the app
    When the user enters valid credentials
    But the user's passsword contains alphanumeric leeters
    Then the user should be logged in

  @scenario_3
  Scenario Outline: Successful login
    Given the user launches the app
    When the user enters username <Username> and password <Password>
    But the user's passsword <Alphanumeric_condition> contains alphanumeric leeters
    Then the user should be logged in

    Examples:
      | Username | Password | Remenber | Alphanumeric_condition |
      | Juan     | 123456   | yes      | yes                    |
      | Luis     | 987654   | yes      | no                     |

  @scenario_4
  Scenario: Successful login
    Given the user launches the app
    When the user enters username and password
      | Username   | Password |
      | Roberto    | 123456   |
      | Juann      | 123456   |
      | Alejandro  | 123456   |
      | Lucia      | 123456   |
      | Hermelinda | 123456   |
    But the user's passsword contains alphanumeric leeters
    Then the user should be logged in