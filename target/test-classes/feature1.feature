@test
Feature: Verifying site functionalities

 Scenario Outline: Verify social media on header
		Given I am on site "https://www.google.com/keep/"
		Then I should see "<socialmedia>" on header
		
		Examples:
		  | socialmedia  |
		  | twitter      |
		  | facebook     |
		  | gplus        |
	  
 Scenario: Verify button
 		Given I am on site "https://www.google.com/keep/"
		When I click on Try Google Keep
		Then I should see different versions