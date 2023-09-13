Feature: Launch Job Search

  Scenario: Search for a QA job
    Given I navigate to the Launch Consulting careers website
    When I search for a QA job
    Then I will find a QA Lead role available
