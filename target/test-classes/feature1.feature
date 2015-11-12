Feature: Verifying site functionalities

 @trail
 Scenario Outline: Verify social media on header
		Given I am on site "https://www.google.com/keep/" on "<browser>"
		Then I should see "<socialmedia>" on header
		And I should see "Google" logo on header
		
		Examples:
		  | socialmedia  | browser |
		  | gplus        | Chrome  |
		  | facebook     | Firefox |