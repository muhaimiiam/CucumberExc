Feature: Save details

  Scenario Outline: Save details
    Given Browser is open
    And user is on login page
    When user enter credentials <username> and <password>
    And user click on login
    Then user is navigated to the home page
    Then user enter details <country> and <address> and <email> and <phone>
    Then user click on save
    Then data is saved

    Examples: 
      | username | password | country   | address  | email          | phone    |
      | Raghav   |    12345 | Indonesia | Street A | test@gmail.com | 23981383 |
      | muhaimi  |    12345 | Malaysia  | Street b | test@yahoo.com | 98398131 |
