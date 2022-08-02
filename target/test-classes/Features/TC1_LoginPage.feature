@Login
Feature: Verifying Adactin Login Hotel details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin hotel login with valid credentials
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"

    Examples: 
      | username | password |
      | username | password |

  Scenario Outline: Verifying Adactin hotel login with valid credentials using Enter key
    When User should perform login "<username>" , "<password>" using Enter key
    And User should verify after login "Hello Ferozkhan!"

    Examples: 
      | username | password |
      | username | password |

  Scenario Outline: Verifying Adactin hotel login with invalid credentials
    When User should perform login "<username>" , "<password>"
    And User should verify after login error message which contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | username | password      |
      | username | wrongPassword |
