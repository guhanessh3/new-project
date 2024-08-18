Feature: Explore Hotel Module

  Scenario Outline: Enter all field and verify select hotel(including options)
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Luxury   | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |

  Scenario Outline: Enter all field and verify select hotel(including options)
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>" and "<noofAdults>"
    Then User Should verify after Search hotels success message "Select Hotel"

    Examples: 
      | username              | password  |  | stateName  | cityName   | checkInDate | checkOutDate | NoofRooms | noofAdults |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |

  Scenario Outline: Without entering any field verify 6 error msg
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User click Search button
    Then User Should verify "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username              | password  |
      | ksguhanessh@gmail.com | Learn@123 |

  Scenario Outline: Verify sorting functionality hotel price from low to high
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    When User click price low to high option
    Then User should verify the hotel prices are sorted from low to high

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Luxury   | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |

  Scenario Outline: Verify sorting functionality hotel price from high to low
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    When User click price high to low option
    Then User should verify the hotel prices are sorted from high to low

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Luxury   | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |

  Scenario Outline: Verify sorting functionality hotel name from assending order
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    When User click name assending order
    Then User should verify the hotel prices are sorted from assending order

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Luxury   | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |

  Scenario Outline: Verify sorting functionality hotel name from descending order
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    When User click name descending order
    Then User should verify the hotel prices are sorted from descending order

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Luxury   | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |

  Scenario Outline: Verify Selected multiple roomtype only present in header
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    When User click name descending order
    Then User should verify the header contains only the selected roomtype "<roomType>"

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType                            | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Standard/Deluxe/Suite/Luxury/Studio | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |

  Scenario Outline: Verify Display hotel name are in selected roomtype 
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    Then User Should verify the hotel names ends with selected room type "<roomType>"

    Examples: 
      | username              | password  |  | stateName  | cityName   | roomType | checkInDate | checkOutDate | NoofRooms | noofAdults | noofChildren |
      | ksguhanessh@gmail.com | Learn@123 |  | Tamil Nadu | Coimbatore | Standard | 2026-05-21  | 2026-05-25   | 1-One     | 2-Two      |            1 |
