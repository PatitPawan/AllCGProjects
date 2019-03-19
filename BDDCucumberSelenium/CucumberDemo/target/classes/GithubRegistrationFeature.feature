Feature: Registration Feature for Github
Scenario: when user leaves blank the fields
Given user is on Registration Page
When user enters his details and leaves blank fields
Then user gets message to enter the blank fields
Scenario: when user enter all the details on registration page
Given user is on Registration Page
When user enters all his details
Then user is successfully registered