Feature: Login as different user
  @wip
  Scenario: Login as a driver user
    Given the user is on the login page
    When user logs in using "user11" and "UserUser123"
    Then  the user should be able to login
    And the title should contain "Dashboard"


    @wip
    Scenario: Login as a driver
      Given the user is on the login page
      When user logs in using "salesmanager101" and "UserUser123"
      Then the user should be able to login
      And the title should contain "Dashboard"
