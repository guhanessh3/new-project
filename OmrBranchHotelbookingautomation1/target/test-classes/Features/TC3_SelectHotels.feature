Feature: Select Hotel Module

  Scenario Outline: Select first hotel and verify navigate to book hotel page upon accepting the alert
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    When User save first hotel name and hotel price
    And User Should select first hotel name and accept alert
    Then User Should verify "Book Hotel" select message after select hotel

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Standard | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |

      Scenario Outline: Select last hotel and verify navigate to book hotel page upon accepting the alert
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    When User save last hotel name and hotel price
    And User Should select last hotel name and accept alert
    Then User Should verify "Book Hotel" select message after select hotel

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Standard | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |
      