#Author: Luis Miguel Arcia Moreno
@UserStories
Feature: I as a DEMO user, want to interact with the products on the OpenCart page

  Background: DEMO User is logged in
    Given I as a DEMO user, am logged in on the OpenCart Page

  @TestCase01
  Scenario: Error in adding a product to the OpenCart page catalog
    When I add a product to the catalog
    Then I should see the warning message

  @TestCase02
  Scenario: Error in modifying a product to the OpenCart page catalog
    When I modify a product to the catalog
    Then I should see the warning message

  @TestCase03
  Scenario: Search for a product using the filter
    When I use filter by Product Name iMac
    Then i should see the filtered product iMac