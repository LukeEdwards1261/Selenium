
@ignore
	Feature: google test

			  Scenario Outline: find "<Animals>" images on google
			  Given we can open google
			  When we search for "<animals>"
			  Then google will return us an image of "<Animals>"
			  
			  Examples:
			  | Animals |
			  | kittens |
			  | puppies |
			  | bunnies |
			  
			  Scenario: Test out tabledata
			  Given that i use the following credentials
			  |username|password|email|security|
			  |jack01|password|jack@aol.com|pizza|
			  When I interact with the webpage
			  Then I should be able to proceed