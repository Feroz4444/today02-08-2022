Feature: Verifying Adactin Login Hotel details

  Scenario Outline: Verifying Adactin hotel login with valid credentials
    Given User is on the Adactin Page
    When User should perform login "<username>" , "<password>"
    And User should search hotels "<location>", "<Hotels>", "<Room Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>", "<child_room>"
    And User should select hotel
    And User should Book hotel "<first_name>", "<last_name>", "<address>", "<cc_num>", "<cc_type>", "<cc_exp_month>", "<cc_exp_year>", "<cc_cvv>"
    Then User should print the Order ID

    Examples: 
      | username   | password   | location  | Hotels        | Room Type | room_nos | datepick_in | datepick_out | adult_room | child_room | first_name | last_name | address     | cc_num           | cc_type | cc_exp_month | cc_exp_year | cc_cvv |
      | Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
    
 		  | Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
		  | Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
		  | Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
	    | Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
		  | Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
	 	  | Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
			| Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
			| Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
			| Ferozkhan  | feroz@4444 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    | Feroz      | Khan      | Adambakkam  | 1122345678912120 | VISA    | May          |        2021 |    123 |
		      