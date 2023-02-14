Feature: Get Article Sources
  As a user, I want to be able to retrieve the sources of news articles.

  Scenario: Successfully retrieve news articles' sources
    When I send a GET request to sources "/api/top-headlines/sources"
    Then I should receive a sources with totalResults not equal to zero