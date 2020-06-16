Feature: Testing Login feature of Actitime Application

Background: Launch the browser and load the application
Given the browser is launched 
And the application is loaded

Scenario Outline: Testing login feature with valid data

When user enters the credentials as "<username>" and "<manager>"
And user enters the valid the password
And user clicks on the login button
Then dashboard should be displayed

Examples:
|username|password|
|admin|manager|
|trainee|trainee|