Feature: Authentication

Scenario: Successful Sign In
Given the user is on the signin page
When he enter the valid username "DW_car" and password "PASSWORD"
And click the sign-in button
Then they should be redirected to the home page.
And see a welcome message saying "Welcome, DW_car!"

Scenario: Unsuccessful Sign In 
Given the user is on the sign-in page
When he enter the invalid username "invalid_user" and password "wrong_password"
And click the sign-in button
Then he should see an error message saying "Invalid username or password"
And remain on the sign-in page

Scenario: Successful Sign Out
Given the user is logged in as "DW_car"
When he click the sign-out button
Then he should go to the sign-in page
And see a confirmation message saying "You have been successfully signed out"

Scenario: Unsuccessful Sign Out
Given the user is not logged in
When they try to Sign Out
Then they should be redirected to the sign-in page
And see a message saying "Please sign in first."



