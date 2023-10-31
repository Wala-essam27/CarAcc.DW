Feature: Users Roles
  As a user 
  I can manage products, categories, and user accounts as an admin
  I can browse products, make purchases, and view orders as a customer
  I can view installation requests and schedule appointments as an installer
  
 Scenario: Admin manages products
  Given I am logged in as an admin
  When I go to the admin page
  Then I should be able to manage products, categories, and user accounts

Scenario: Customer browses products
  Given I am logged in as a customer
  When I browse the products
  Then I should be able to view the list of available car accessories

Scenario: Customer makes a purchase
  Given I am logged in as a customer
  When I select a product and add it to my cart
  And I proceed to checkout
  Then I should be able to make a purchase successfully

Scenario: Customer views orders
  Given I am logged in as a customer
  When I go to the orders page
  Then I should be able to view my previous orders

Scenario: Installer views installation requests
  Given I am logged in as an installer
  When I go to the installer page
  Then I should be able to view the list of installation requests

Scenario: Installer schedules an appointment
  Given I am logged in as an installer
  When I select an installation request and schedule an appointment
  Then the appointment should be successfully scheduled
  