Feature: Orange Demo

  @tag1
  Scenario: User launches application
    Given User launches Chrome browser
    When User enter valid <username> and <password>
    Then User clicks login

  @tag2
  Scenario: User navigates to My Leave Enttitlement
    Given User hover over leave and
    When User hover over  enttitlements
    Then User clicks my entitlements

  @tag3
  Scenario: User searches entitlement
    Given User select leave type
    And User selects leave period
    Then User clicks search

  @tag4
  Scenario: User adds entitlement
    Given User clicks add and iputs employee name
    And User selects leave type
    And User selects leave period
    And User enters entitlement
    Then User clicks save

  @tag5
  Scenario: User deletes entitlement
    Given User selects entitlement
    When User clicks delete
    Then User clicks ok
