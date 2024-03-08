Feature: As a user, I want to login on the izyacademy page

  Scenario: Login at izyacademy
    Given Luis opens the page
    When I log in to the izyacademy page with the following credentials
      | email                    | password   |
      | lvalencia@qvision.com.co | lcvalencia |
    And I click on the post menu and fill out the fields
    Then I successfully completed the creation of the category