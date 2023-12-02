Feature: What customer can do?
 Browse products, make purchases, and view orders.
  
  Scenario: browsing product
  When he want to browsing 
  Then showing all products

 Scenario: make purchase
 When choose a category 
 Then printing it only
 And he must choose a one 
 And adding them to orders
 
 Scenario: view orders
 When he want to view order
 Then printing the orders
   

