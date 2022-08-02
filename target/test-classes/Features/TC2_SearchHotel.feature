@Search
Feature: Verifying Adactin Hotel Booking details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin search hotel page by selecting all fields
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    And User should search hotels "<location>", "<Hotels>", "<Room Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify it is navigating to select hotel page "Select Hotel"

    Examples: 
      | username  | password   | location  | Hotels        | Room Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | Ferozkhan | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    |

  Scenario Outline: Verifying Adactin search hotel page by only entering mandatory fields
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    And User should search hotels "<location>", "<room_nos>", "<datepick_in>", "<datepick_out>" and "<adult_room>"
    Then User should verify it is navigating to select hotel page "Select Hotel"

    Examples: 
      | username  | password   | location  | room_nos | datepick_in | datepick_out | adult_room |
      | Ferozkhan | feroz@4444 | Melbourne | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    |

  Scenario Outline: Verifying Adactin search hotel page by selecting invalid date
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    And User should search hotels "<location>", "<Hotels>", "<Room Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify after searching hotel get date error message as "Check-In Date shall be before than Check-Out Date", "Check-Out Date shall be after than Check-In Date":

    Examples: 
      | username  | password   | location  | Hotels        | Room Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | Ferozkhan | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 14/07/2022  | 12/07/2022   | 2 - Two    | 2 - Two    |

  Scenario Outline: Verifying Adactin search hotel page without entering any data
    When User should perform login "<username>" , "<password>"
    And User should verify after login "Hello Ferozkhan!"
    And User should search hotels without entering any of the fields
    Then User should verify search hotel page error message as "Please Select a Location"

    Examples: 
      | username  | password   |
      | Ferozkhan | feroz@4444 |
