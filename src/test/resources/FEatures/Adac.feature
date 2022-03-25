Feature: validate the adactinhotel

  Scenario Outline: Validating the page navigate to select hotel by selecting all fields
    Given user should enter "<username>","<password>" and click login
    When user should enter the "<location>","<hotels>","<Roomtype>","<noofRooms>","<checkinDate>","<checkoutDate>","<adultsperRoom>","<childrensperroom>" and click search button
    Then user should validate that page should be navigate to "Select Hotel"
    And user is kanchana

    Examples: 
      | username   | password | location | hotels      | Roomtype | noofRooms | checkinDate | checkoutDate | adultsperRoom | childrensperroom | firstName | lastName | billingAddress | creditcardNo     | creditcardType   | expiryDateMOnth | expiryYEar | cvv  |
      | sugan12345 | OH98G6   | Sydney   | Hotel Creek | Standard | 1 - One   | 06/12/2021  | 11/12/2021   | 2 - Two       | 1 - One          | Daniel    | Roodie   | Chennai        | 1234567891234567 | American Express | January         |       2022 | 1234 |

  Scenario Outline: Validating the page navigate to select hotel by selecting mandatory fields
    Given user should enter "<username>","<password>" and click login
    When user should enter the "<location>","<noofRooms>","<checkinDate>","<checkoutDate>","<adultsperRoom>" and click search button
    Then user should validate that page should be navigate to "Select Hotel"

    Examples: 
      | username   | password | location | noofRooms | checkinDate | checkoutDate | adultsperRoom |
      | sugan12345 | OH98G6   | Sydney   | 1 - One   | 06/12/2021  | 11/12/2021   | 2 - Two       |

  Scenario Outline: Validating the page navigate to select hotel with wrong check in and checkout date
    Given user should enter "<username>","<password>" and click login
    When user should enter the "<location>","<checkinDate>","<checkoutDate>", and click search button
    Then user should validate "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date" message is displayed

    Examples: 
      | username   | password | location | checkinDate | checkoutDate |
      | sugan12345 | OH98G6   | Sydney   | 21/08/2021  | 10/08/2021   |

  Scenario Outline: Validating the page navigate to select hotel without entering any fields
    Given user should enter "<username>","<password>" and click login
    When user should click search button
    Then user should validate "Please Select a Location" message is displayed

    Examples: 
      | username   | password |
      | sugan12345 | OH98G6   |
