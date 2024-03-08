Feature: As a user, I want to register on the izyacademy page

  Scenario: registration at izyacademy
    Given Luis opens the page
    When I write in the format to register
      | name          | username  | numeroid   | email                    | password   | verify_password | city     | phone      |
      | Luis Valencia | lvalencia | 1077475647 | lvalencia@qvision.com.co | lcvalencia | lcvalencia      | Medellin | 3132244113 |
    Then I successfully registered on the izy page