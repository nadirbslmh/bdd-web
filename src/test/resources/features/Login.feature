Feature: Login
  As a user
  I want to see home page
  So that I can buy product

  Scenario: As a user I have be able to login successfully
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the home page

  Scenario: As a user I have been locked out
    Given I am on the login page
    When I input locked username
    And I input valid password
    And I click login button
    Then I can see error message "Epic sadface: Sorry, this user has been locked out."
