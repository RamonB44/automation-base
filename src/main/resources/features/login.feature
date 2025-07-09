@login-app
Feature: Login to App

  @login-no-recurrente-1
  Scenario Outline: Hacer un login satisfactorio al app interbank
    Given el Cliente se encuentra en la pantalla de interbank
    When ingresa el tipo de documento "<documentType>", usuario "<user>" y password "<password>" en login
    And luego ingresa al app
    Then el cliente visualiza los productos de su cuenta

    Examples:
      | documentType | user     | password |
      | DNI          | 00190011 | Aa111111 |

  @login-no-recurrente-2
  Scenario Outline: Hacer un login satisfactorio validando el ofuscamiento de la contraseña
    Given el Cliente se encuentra en la pantalla de interbank
    When ingresa el tipo de documento "<documentType>", usuario "<user>" y password "<password>" en login
    And valida la password ofuscada
    Then el cliente visualiza los productos de su cuenta
    Examples:
      | documentType | user     | password |
      | DNI          | 00190011 | Aa111111 |
