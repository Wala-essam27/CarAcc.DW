Feature: What customer can do?
 Browse products, make purchases, and view orders.
  
  Scenario: browsing product
  When he want to browsing 
  Then showing all products

 Scenario: make purchase
 When showing the catalog
 Then choose a product  
 And adding them to orders
 
 Scenario: view orders
 When he want to view order
 Then printing the orders
   

Scenario: edit profile
  When he want to edit profile 
  Then editing done 
  
  
Scenario: searching product
  When he want to search a product 'key'
  Then searching done 
  
  
  
  