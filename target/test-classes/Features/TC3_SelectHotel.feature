@Select
Feature: Verifying Adactin Select Hotel Booking details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin Select hotel page by selecting hotel
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    And User should search hotels "<location>", "<Hotels>", "<Room Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify it is navigating to select hotel page "Select Hotel"
    And User should select the hotel and click continue
    Then User should verify after continue and it is navigating to book a hotel page "Book A Hotel"

    Examples: 
      | username  | password   | location  | Hotels        | Room Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | Ferozkhan | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    |

  Scenario Outline: Verifying Adactin Select hotel page without selecting hotel
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    And User should search hotels "<location>", "<Hotels>", "<Room Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify it is navigating to select hotel page "Select Hotel"
    And User should not select the hotel and click continue option
    Then User should verify in select hotel after click continue it shows an error message "Please Select a Hotel"

    Examples: 
      | username  | password   | location  | Hotels        | Room Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | Ferozkhan | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    |
