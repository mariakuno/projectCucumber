Feature: FinalProject

  Scenario: create an account and set password in a webpage


    Given the page "http://todo.ly/" is open
    When I want to create a new account
      | fullName   | MariaKuno           |
      |  email | mkuno@proyecto.com |
      |   password        |         12345        |
    Then I should enter to webpage
    When I access to Setting
    #Then the profile page is open
    When I update the old password "12345" with the new password "76543"
    Then the password is updated
    When I logout of page
    Then I am redirected to the page "http://todo.ly/"
    When I access with the new password
      | email    | mkuno@proyecto.com |
      | password | 76543           |
    Then I should enter to the webpage


