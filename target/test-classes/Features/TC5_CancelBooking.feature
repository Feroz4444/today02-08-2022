@cancel
Feature: Verifying Adactin Hotel Cancel Booking details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin Hotel Booking cancellation
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
    And User should Cancel the Generated OrderID
    Then User should verify the Cancelled message "The booking has been cancelled."

    Examples: 
      | username  | password   | location  | Hotels        | Room Type | room_nos | datepick_in | datepick_out | adult_room | child_room | first_name | last_name | address    | cc_num       | cvv |
      | Ferozkhan | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | khan      | Adambakkam | 120934567142 | 577 |

  Scenario Outline: Verifying Adactin Hotel Booked OrderID Cancellation
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    Then User should Cancel the Booked OrderID "<OrderId>"
    And User should verify the Cancelled message "The booking has been cancelled."

    Examples: 
      | username  | password   | OrderId    |
      | Ferozkhan | feroz@4444 | 4E02A19SSV |
