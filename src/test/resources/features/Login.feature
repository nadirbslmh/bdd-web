@Login
Feature: Login
  As a user
  I want to see home page
  So that I can buy product

  Background:
    Given I am on the login page

  @Normal-User
  Scenario Outline: As a user I have be able to login successfully
    When I input "<username>" username
    And I input valid password
    And I click login button
    Then I am on the home page
    Examples:
      |username     |
      |standard_user|
      |problem_user |

  @Locked-User
  Scenario: As a user I have been locked out
    When I input locked username
    And I input valid password
    And I click login button
    Then I can see error message "Epic sadface: Sorry, this user has been locked out."
