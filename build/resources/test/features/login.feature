Feature: As a user, I want to login on the izyacademy page

  Scenario: Login at izyacademy
    Given Luis opens the page
    When I log in to the izyacademy page with the following credentials
      | email                    | password   |
      | lvalencia@qvision.com.co | lcvalencia |
    Then I correctly enter the main page of the izy