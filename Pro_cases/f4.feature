
Feature: products
 - Categories: Products should be organized when we add
- Product listings: Detailed product descriptions, images, prices, and availability.
- Search and filter options to easily find products.

 
  Scenario: adding product in each category
    When choose which category and add
    Then adding them to correct catagory

  
  Scenario: printing all products 
  When he wants to print all category
  Then printing categorys
  
    Scenario: editing
  When he wants to editing one of them and choose one
  Then printing the result
  
    Scenario: searching 
  When he wants to search 'key'
  Then he can see all options 
  
  
 
   