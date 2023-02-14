Feature: Get file download
  As a user, I want to be able to download a file given a url.

  Scenario: Successfully file from url
    When I send a GET request to file download url "/api/file-download?url=https://res.cloudinary.com/ximmoz-corp/image/upload/v1659672584/step_three_av7nld.png"
    Then I should receive a binary file that is not null