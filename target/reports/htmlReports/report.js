$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cucumbertask1.feature");
formatter.feature({
  "line": 2,
  "name": "AccountLogin test",
  "description": "",
  "id": "accountlogin-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "create a user",
  "description": "",
  "id": "accountlogin-test;create-a-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "we can login to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "we create a user using \"\u003cusername1\u003e\" and \"\u003cpassword1\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "demoSite will have generated the user and allows a log in with \"\u003cusername1\u003e\" and \"\u003cpassword1\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "accountlogin-test;create-a-user;",
  "rows": [
    {
      "cells": [
        "username1",
        "password1"
      ],
      "line": 10,
      "id": "accountlogin-test;create-a-user;;1"
    },
    {
      "cells": [
        "adamuser",
        "adampass"
      ],
      "line": 11,
      "id": "accountlogin-test;create-a-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5442317600,
  "status": "passed"
});
formatter.before({
  "duration": 5075878200,
  "status": "passed"
});
formatter.before({
  "duration": 5058091700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "create a user",
  "description": "",
  "id": "accountlogin-test;create-a-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "we can login to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "we create a user using \"adamuser\" and \"adampass\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "demoSite will have generated the user and allows a log in with \"adamuser\" and \"adampass\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTask1.we_can_login_to_the_website()"
});
formatter.result({
  "duration": 300301500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adamuser",
      "offset": 24
    },
    {
      "val": "adampass",
      "offset": 39
    }
  ],
  "location": "CucumberTask1.we_create_a_user_using_and(String,String)"
});
formatter.result({
  "duration": 3383696300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adamuser",
      "offset": 64
    },
    {
      "val": "adampass",
      "offset": 79
    }
  ],
  "location": "CucumberTask1.demosite_will_have_generated_the_user_and_allows_a_log_in_with_and(String,String)"
});
formatter.result({
  "duration": 370514200,
  "status": "passed"
});
formatter.after({
  "duration": 19188200,
  "status": "passed"
});
formatter.after({
  "duration": 18298500,
  "status": "passed"
});
formatter.after({
  "duration": 33348100,
  "status": "passed"
});
});