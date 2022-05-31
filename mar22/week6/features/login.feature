Feature: Login Functionality of OrangeHRM

#Background:
#Given User opens the Browser
#And Load the application URL

Scenario Outline: Login with positive data
Given Enter the username as <username>
And Enter the password as <password>
When Click the Login button
Then OrangeHRM Homepage should be displayed

Examples:
|username|password|
|'Admin'|'admin123'|

Scenario Outline: Login with negative data
Given Enter the username as <username>
And Enter the password as <password>
When Click the Login button
But Error message should be displayed

Examples:
|username|password|
|'test'|'gerp123'|
