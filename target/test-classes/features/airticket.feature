Feature: Flight Search on Kayak

  Scenario: Search for one-way flights
    Given I am on the Kayak website
    When I enter "New York" in the departure city field
    And I enter "Los Angeles" in the destination city field
    And I select "One Way" as the trip type
    And I select "2023-10-15" as the departure date
    And I click the search button
    Then I should see search results for one-way flights

  Scenario: Filter search results
    Given I have search results for one-way flights
    When I filter by "Nonstop" flights
    Then I should see only nonstop flight options