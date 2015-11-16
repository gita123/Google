$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature1.feature");
formatter.feature({
  "id": "verifying-site-functionalities",
  "description": "",
  "name": "Verifying site functionalities",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "verifying-site-functionalities;verify-button",
  "tags": [
    {
      "name": "@test",
      "line": 14
    }
  ],
  "description": "",
  "name": "Verify button",
  "keyword": "Scenario",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "I am on site \"https://www.google.com/keep/\"",
  "keyword": "Given ",
  "line": 16
});
formatter.step({
  "name": "I click on Try Google Keep",
  "keyword": "When ",
  "line": 17
});
formatter.step({
  "name": "I should see different versions",
  "keyword": "Then ",
  "line": 18
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/keep/",
      "offset": 14
    }
  ],
  "location": "Feature1Steps.i_am_on_site(String)"
});
formatter.result({
  "duration": 8378161000,
  "status": "passed"
});
formatter.match({
  "location": "Feature1Steps.i_click_on_Try_Google_Keep()"
});
formatter.result({
  "duration": 125833000,
  "status": "passed"
});
formatter.match({
  "location": "Feature1Steps.i_should_see_different_versions()"
});
formatter.result({
  "duration": 112526000,
  "status": "passed"
});
});