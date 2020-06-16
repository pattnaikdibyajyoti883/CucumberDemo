Feature: Testing Login feature of Actitime Application

Background: Launch the browser and load the application
Given the browser is launched 
And the application is loaded

Scenario: Testing login feature with valid data

When user enters the valid the username and password
|username|password|
|admin|manager|
|trainee|trainee|
And user clicks on the login button
Then dashboard should be displayed