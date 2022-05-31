Feature: Validating the Main Menu links

#Background: 
#Given User opens the Browser
#And Load the application URL

Scenario: Validating the Main Menu links after login
Given Enter the username as "Admin"
And Enter the password as "admin123"
When Click the Login button
Then OrangeHRM Homepage should be displayed
When Click the menu_admin_viewAdminModule button
Then Username field should be displayed