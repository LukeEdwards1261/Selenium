
	Feature: AccountLogin test

			  Scenario Outline: create a user 
			  Given we can login to the website
			  When we create a user using "<username1>" and "<password1>"
			  Then demoSite will have generated the user and allows a log in with "<username1>" and "<password1>"
			  
			  Examples:
			  |username1	|password1|
			  |adamuser		|adampass	|

			  @ignore
			  Scenario: Test out tabledata
			  Given that i use the following credentials
			  |username			|password		|
			  | adamuser 		|adampass		|
			  | bethuser 		|bethpass		|
			  | charlieuser |charliepass|
			  | danuser 		|danpass		|
			  When I interact with the webpage
			  Then I should be able to proceed