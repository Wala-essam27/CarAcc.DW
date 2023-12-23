Feature: Authentication

Scenario: Sign In
When he sign in

Scenario: Successful Sign In
When he enter the valid email and password 
Then he should go to the home page


Scenario: Unsuccessful Sign In  
When he enter the invalid email and password 
Then he should see an error message saying "Invalid email or password"
And request to sign again




