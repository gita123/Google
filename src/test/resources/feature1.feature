@test
Feature: Verifying site functionalities

 Scenario Outline: Verify social media on header
		Given I am on site
		Then I should see "<socialmedia>" on header
		
		Examples:
		  | socialmedia  |
		  | twitter      |
		  | facebook     |
		  | gplus        |

 @smoke	  
 Scenario: Verify button
 		Given I am on site
		When I click on Try Google Keep
		Then I should see different versions