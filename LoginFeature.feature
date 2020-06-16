Feature: Testing Login feature of Actitime Application

Background: Launch the browser and load the application
Given the browser is launched 
And the application is loaded

Scenario: Testing login feature with valid data

When user enters the valid the username
And user enters the valid the password
And user clicks on the login button
Then dashboard should be displayed

Scenario: Testing the forgot password link
When User clicks on forgot password link
Then forgot password component should be displayed
