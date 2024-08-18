Feature: Explore Book Hotel Module

  Scenario Outline: Book Hotel including gst, debitcard with special request
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"
    When User Search hotels "<stateName>", "<cityName>", "<roomType>", "<checkInDate>", "<checkOutDate>", "<NoofRooms>", "<noofAdults>" and "<noofChildren>"
    Then User Should verify after Search hotels success message "Select Hotel"
    When User save last hotel name and hotel price
    And User Should select last hotel name and accept alert
    Then User Should verify "Book Hotel" select message after select hotel
    When User add guest details "<salu>", "<firstName>", "<lastName>", "<mobile>" and "<email>"
    And User add gst details "<regNo>", "<companyName>" and "<companyAddress>"
    And User add special request "<otherRequest>"
    And User enter payment details proceed with card payment "<cardType>"
      | Select Card | Card Number      | Card Name | Month    | Year | CVV |
      | Visa        | 5555555555552222 | Raja      | February | 2027 | 254 |
      | Amex        | 5555555555554444 | Ram       | March    | 2028 | 874 |
      | Mastercard  | 5555555555550000 | Sai       | April    | 2027 | 766 |
      | Discover    | 5555555555556666 | Prakash   | May      | 2029 | 887 |
    Then User should verify booking is confirmed "Booking is Confirmed" and save order id
    And User should verify whether same selected hotel name is displayed after booking

    Examples: 
      | username             | password  | stateName  | cityName | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChildren | salu | firstName | lastName | mobile     | email                 | regNo      | companyName            | companyAddress | otherRequest               | cardType   |
      | ksguhanesshgmail.com | Learn@123 | Tamil Nadu | Madurai  | Suite    | 2024-06-21  | 2024-06-22   | 2-Two     | 2-Two      |            2 | Mr.  | Guhanessh | ks       | 8098181555 | ksguhanessh@gmail.com | 8098181555 | Greens Tech OMR Branch | Thoraipakkam   | Convinient for Car Parking | Debit Card |
