Feature: What admin can do?
  I want to use this template for my feature file
 Manage product categories (add, edit, delete).
Add and update product listings.
 View and manage customer accounts.
- Schedule and manage installation appointments.

  Scenario: Manage product
    When add new category
    Then adding it successfully
    When choose which category and add
    Then check if type if information is correct 
    And adding them to correct catagory
    When choose which category and edit
    Then check if type if information is correct and edit
    And done editing
    When choose which category and delete
    Then check if type if information is correct and delete
    And done deleting

 
  Scenario:  View and manage customer accounts
    When view customer accounts
    Then printing cust accounts
    When update customer accounts
    Then printing cust accounts
  