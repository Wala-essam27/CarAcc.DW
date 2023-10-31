Feature: Authentication

Scenario: Successful Sign In
Given the user is on the signin page
When he enter the valid email "DW_car@gmail.com" and password "PASSWORD"
And click the sign-in button
Then he should go to the home page.
And see this welcome message  "Welcome, DW_car!"

Scenario: Unsuccessful Sign In 
Given the user is on the sign in page
When he enter the invalid email "invalid email" and password "wrong password"
And click the button to sign in
Then he should see an error message saying "Invalid email or password"
And remain on the sign in page

Scenario: Successful Sign Out
Given the user is logged in as "DW_car@gmail.com"
When he click the button to sign out
Then he should go to the sign in page
And see this confirmation message "You have been successfully signed out"

Scenario: Unsuccessful Sign Out
Given the user is not logged in
When he try to Sign Out
Then he should go to the sign in page
And see this message "Please sign in first."



