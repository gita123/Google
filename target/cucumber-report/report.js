$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature1.feature");
formatter.feature({
  "id": "verifying-site-functionalities",
  "description": "",
  "name": "Verifying site functionalities",
  "keyword": "Feature",
  "line": 1
});
formatter.scenarioOutline({
  "id": "verifying-site-functionalities;verify-social-media-on-header",
  "tags": [
    {
      "name": "@trail",
      "line": 3
    }
  ],
  "description": "",
  "name": "Verify social media on header",
  "keyword": "Scenario Outline",
  "line": 4,
  "type": "scenario_outline"
});
formatter.step({
  "name": "I am on site \"https://www.google.com/keep/\" on \"\u003cbrowser\u003e\"",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I should see \"\u003csocialmedia\u003e\" on header",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "I should see \"Google\" logo on header",
  "keyword": "And ",
  "line": 7
});
formatter.examples({
  "id": "verifying-site-functionalities;verify-social-media-on-header;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 9,
  "rows": [
    {
      "id": "verifying-site-functionalities;verify-social-media-on-header;;1",
      "cells": [
        "socialmedia",
        "browser"
      ],
      "line": 10
    },
    {
      "id": "verifying-site-functionalities;verify-social-media-on-header;;2",
      "cells": [
        "gplus",
        "Chrome"
      ],
      "line": 11
    },
    {
      "id": "verifying-site-functionalities;verify-social-media-on-header;;3",
      "cells": [
        "facebook",
        "Firefox"
      ],
      "line": 12
    }
  ]
});
formatter.scenario({
  "id": "verifying-site-functionalities;verify-social-media-on-header;;2",
  "tags": [
    {
      "name": "@trail",
      "line": 3
    }
  ],
  "description": "",
  "name": "Verify social media on header",
  "keyword": "Scenario Outline",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "I am on site \"https://www.google.com/keep/\" on \"Chrome\"",
  "keyword": "Given ",
  "line": 5,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I should see \"gplus\" on header",
  "keyword": "Then ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I should see \"Google\" logo on header",
  "keyword": "And ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/keep/",
      "offset": 14
    },
    {
      "val": "Chrome",
      "offset": 48
    }
  ],
  "location": "Feature1Steps.i_am_on_site(String,String)"
});
formatter.result({
  "duration": 4770426000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gplus",
      "offset": 14
    }
  ],
  "location": "Feature1Steps.i_should_see_on_header(String)"
});
formatter.result({
  "duration": 87000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 14
    }
  ],
  "location": "Feature1Steps.i_should_see_logo_on_header(String)"
});
formatter.result({
  "duration": 572015000,
  "status": "passed"
});
formatter.scenario({
  "id": "verifying-site-functionalities;verify-social-media-on-header;;3",
  "tags": [
    {
      "name": "@trail",
      "line": 3
    }
  ],
  "description": "",
  "name": "Verify social media on header",
  "keyword": "Scenario Outline",
  "line": 12,
  "type": "scenario"
});
formatter.step({
  "name": "I am on site \"https://www.google.com/keep/\" on \"Firefox\"",
  "keyword": "Given ",
  "line": 5,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I should see \"facebook\" on header",
  "keyword": "Then ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I should see \"Google\" logo on header",
  "keyword": "And ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/keep/",
      "offset": 14
    },
    {
      "val": "Firefox",
      "offset": 48
    }
  ],
  "location": "Feature1Steps.i_am_on_site(String,String)"
});
formatter.result({
  "duration": 3790976000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "facebook",
      "offset": 14
    }
  ],
  "location": "Feature1Steps.i_should_see_on_header(String)"
});
formatter.result({
  "duration": 142000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 14
    }
  ],
  "location": "Feature1Steps.i_should_see_logo_on_header(String)"
});
formatter.result({
  "duration": 150438000,
  "status": "passed"
});
});