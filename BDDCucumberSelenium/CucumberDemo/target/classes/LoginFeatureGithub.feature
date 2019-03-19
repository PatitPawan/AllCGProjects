Feature: login feature for user    
  Scenario: user enter invalid username and password, user gets a prompt for entering valid credentials
    Given user is on the login page of github.com in browser
    When user enter invalid credentials in Username and Password
    Then user views the login page asking to re-enter credentials
	Scenario: user enter valid username and password, user gets a prompt for entering valid credentials
    Given user is on the login page of github.com in browser
    When user enter valid credentials in Username and Password
    Then user views the github dashboard