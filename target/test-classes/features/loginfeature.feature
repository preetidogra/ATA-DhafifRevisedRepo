Feature: Test login functionality feature


Scenario: Login with correct credentials
Given user is on login page
When user enters username "standard_user" 
When user enters password "secret_sauce"
And user clicks on Login button2
Then page title should be "Swag Labs"