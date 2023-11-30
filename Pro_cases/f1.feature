Feature: Authentication

Scenario: Successful Sign In
 When he enter the valid email "DW_car@gmail.com" and password "PASSWORD"
Then he should go to the home page


Scenario: Unsuccessful Sign In  
When he enter the invalid email "invalid email" and password "wrong password"
Then he should see an error message saying "Invalid email or password"
And request to enter email "DW_car@gmail.com" and password "PASSWORD" again




