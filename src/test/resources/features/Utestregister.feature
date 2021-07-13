# Autor: Alberto Caballero
@stories
Feature: Utest Register
  As a user, I want register in the website called utest for a thecnical test from Choucair Testing
  @scenario
  Scenario: Register on Utest website
    Given than Robert wants to join the Utest community
    When he complete the registration process
      | strName  |  strLastName |  strEmail      | strLangSpoke  |  strCity    | strZip  | strCountry  |  strPassword    |
      | Roberto  |    Bernuli   | test3@mail.com |   Portuguese  |    Bogotá   | 07065   |   Colombia  |    Test131313.  |

    Then he finally register on Utest Community
      |                                strWelcome                             |
      |Welcome to the world's largest community of freelance software testers!|