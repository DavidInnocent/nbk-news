Feature: Get Top Headlines
  As a user, I want to be able to retrieve the top headlines for a specific country.

  Scenario: Successfully retrieve top headlines
    When I send a GET request to "/api/top-headlines?country=us"
    Then I should receive a response with totalResults not equal to zero

  Scenario: Error retrieving top headlines
    When I send a GET request to "/api/top-headlines?country=XXX"
    Then I should receive a response with totalResults equal to zero