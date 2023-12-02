
Feature: products
 - Categories: Products should be organized when we add
- Product listings: Detailed product descriptions, images, prices, and availability.
- Search and filter options to easily find products.

 
  Scenario: adding product in each category
    When choose which category and add
    Then check if type if information is correct 
    And adding them to correct catagory

  
  Scenario: printing all products 
  When he wants to print all category
  Then printing categorys
  
    Scenario: printing one of category
  When he wants to print one of them 
  Then printing one of categorys
  
    Scenario: searching 
  When he wants to search
  Then he can see all options 
   