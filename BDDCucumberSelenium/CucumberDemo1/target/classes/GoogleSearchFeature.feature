@execute
Feature: Google Search Feature

Scenario: user want to search information on 'Agile Method' by entering valid set of words
Given user is on the google homepage
When user search for 'Agile Methodology
Then all links should display with 'Agile Methodology'