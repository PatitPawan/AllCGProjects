Feature: Login feature for Users
Scenario: A user enter valid credentials, user can view the welcome panel with his name and account number.
Given: User is on the Banking Login page.
When: User enter his credentials.
Then: User can view the welcome panel with his name and account number.


Feature: Login feature for Users
Scenario: When a user enter invalid credentials, user will be given a chance to retry login upto 3 attempts and if attempts exceed then account access blocked for the day.
Given: User is on the Banking Login page.
When: User enter his credentials.
Then: User can view the login panel which asks his login credentials.



Feature: Account Details feature for Users
Scenario: When a user clicks on Account Details, user can view the Account Details.
Given: User is on the Welcome page.
When: User clicks on Account Details.
Then: User can view the Account Details with his details.



Feature: Transfer feature for Users
Scenario: When a user enter valid pin and account credentials, user will be able to transfer the amount.
Given: User is on the Funds Transfer page.
When: User enter his account credentials and pin.
Then: User can view the updated balance and successful transaction page.

Feature: Transfer feature for Users
Scenario: When a user enter invalid pin and account credentials, user will be not able to transfer the amount and transaction blocked for the account for a day.
Given: User is on the Funds Transfer page.
When: User enter his account credentials and pin.
Then: User can view the failed transaction page.
