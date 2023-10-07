@1111
Feature: Search airtickt
Scenario: user wants to search airticket
	When user open chrome browser
	Then go to web url "https://www.kayak.com/"
	Then click on Flights
	Then select Trip option
	Then Close the Browser