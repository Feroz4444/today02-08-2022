@Book
Feature: Verifying Adactin Hotel Booking details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin Book a Hotel by selecting all fields
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    And User should search hotels "<location>", "<Hotels>", "<Room Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify it is navigating to select hotel page "Select Hotel"
    And User should select the hotel and click continue
    Then User should verify after continue and it is navigating to book a hotel page "Book A Hotel"
    And User should Book a hotel "<first_name>","<last_name>","<address>"
      | cardno           | cardType         | cardMonth | cardYear | cardCvv |
      | 1234567812342312 | American Express | February  |     2022 |     245 |
      | 2423456789121234 | VISA             | January   |     2022 |     577 |
      | 9876543212349876 | Master Card      | May       |     2022 |     513 |
      | 5749883992765432 | Other            | October   |     2022 |     623 |
    Then User should verify after Book now it is navigating to Booking Confirmation Page "Booking Confirmation"

    Examples: 
      | username  | password   | location  | Hotels        | Room Type | room_nos | datepick_in | datepick_out | adult_room | child_room | first_name | last_name | address    | cc_num       | cvv |
      | Ferozkhan | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | khan      | Adambakkam | 120934567142 | 577 |

  Scenario Outline: Verifying Adactin Book A Hotel by without selecting any fields
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    And User should search hotels "<location>", "<Hotels>", "<Room Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify it is navigating to select hotel page "Select Hotel"
    And User should select the hotel and click continue
    Then User should verify after continue and it is navigating to book a hotel page "Book A Hotel"
    And User should not enter any fields and click Book now option
    Then User should verify in Book hotel after click Book now it shows an error message "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address","Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Expiry Month", "Please Enter your Credit Card CVV Number"

    Examples: 
      | username  | password   | location  | Hotels        | Room Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | Ferozkhan | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    |
