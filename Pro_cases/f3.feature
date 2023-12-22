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
    Then adding them to correct catagory
    When choose which category and edit
    Then done editing
    When choose which product and delete
    Then done deleting
   

 
  Scenario:  View and manage customer accounts
    When view customer accounts
    Then printing cust accounts
    When update customer accounts
    Then printing cust accounts
  