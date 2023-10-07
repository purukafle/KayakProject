@1111
Feature: Search airtickt
Scenario Outline: user wants to search airticket
	When user open chrome browser
	Then go to web url "https://www.kayak.com/"
	Then click on Flights
	Then select Trip "Round_trip"
	And Select <From> option
	And Select destination <To> option
	Then Close the Browser
	Examples:
		|From|To|
		|Baltimore, Maryland, United States (BWI)|Dallas, Texas, United States (DFW)|
		
	