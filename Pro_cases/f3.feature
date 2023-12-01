
Feature: What admin can do?
  I want to use this template for my feature file
 Manage product categories (add, edit, delete).
Add and update product listings.
 View and manage customer accounts.
- Schedule and manage installation appointments.
  @tag1
  Scenario: Manage product
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
