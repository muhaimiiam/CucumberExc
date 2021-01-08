Feature: Test login funct

  Scenario Outline: Check login is successfull with valid creds
    Given Browser is open
    And user is on login page
    When user enter <username> and <password>
    And user click on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      
