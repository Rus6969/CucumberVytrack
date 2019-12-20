Feature: Contacts page

  Scenario: Default page number
    Given a driver is logged in
    When the user goes to "Customers" "Contacts"
    Then default page number should be 1



    Scenario: Menu options
      Given  a driver is logged in
      Then the user should see folowing menu option
      | Fleet     |
      | Customers |
      | Activities|
      | System    |

      @wip
      Scenario: login as a driver user
        When the user logs in using folowing credentials
        | username |user1      |
        | password |UserUSer123|

        Then the user should be able to login


