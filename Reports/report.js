$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Page1.feature");
formatter.feature({
  "line": 2,
  "name": "WorkIndia Registeration",
  "description": "",
  "id": "workindia-registeration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@appium"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "New user registration",
  "description": "",
  "id": "workindia-registeration;new-user-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@appium"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "initialise the App",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enters the Name \"\u003cname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User Enters the Phone Number \"\u003cmobilenumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User submit the details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user select the option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter the location \"\u003cLOCATION\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on the next button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user select gender",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user select qualification",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user select medium",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user select language",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user select Experience",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user select Age",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user select interest",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User goes to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Select there preference",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User tells about the Degree",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Select the Language",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "workindia-registeration;new-user-registration;",
  "rows": [
    {
      "cells": [
        "name",
        "mobilenumber",
        "LOCATION"
      ],
      "line": 26,
      "id": "workindia-registeration;new-user-registration;;1"
    },
    {
      "cells": [
        "shivam",
        "6387496251",
        "Arjun Nagar"
      ],
      "line": 27,
      "id": "workindia-registeration;new-user-registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15410309900,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "New user registration",
  "description": "",
  "id": "workindia-registeration;new-user-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@appium"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "initialise the App",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enters the Name \"shivam\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User Enters the Phone Number \"6387496251\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User submit the details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user select the option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter the location \"Arjun Nagar\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on the next button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user select gender",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user select qualification",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user select medium",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user select language",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user select Experience",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user select Age",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user select interest",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User goes to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Select there preference",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User tells about the Degree",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Select the Language",
  "keyword": "Then "
});
formatter.match({
  "location": "Resgister.initialise_the_App()"
});
formatter.result({
  "duration": 1278865200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shivam",
      "offset": 22
    }
  ],
  "location": "Resgister.user_Enters_the_Name(String)"
});
formatter.result({
  "duration": 201167900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6387496251",
      "offset": 30
    }
  ],
  "location": "Resgister.user_Enters_the_Phone_Number(String)"
});
formatter.result({
  "duration": 556622100,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_submit_the_details()"
});
formatter.result({
  "duration": 539361000,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_the_option()"
});
formatter.result({
  "duration": 3866819000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arjun Nagar",
      "offset": 25
    }
  ],
  "location": "Resgister.user_enter_the_location(String)"
});
formatter.result({
  "duration": 2145851200,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_click_on_the_next_button()"
});
formatter.result({
  "duration": 975167000,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_gender()"
});
formatter.result({
  "duration": 1572662200,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_qualification()"
});
formatter.result({
  "duration": 616941100,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_medium()"
});
formatter.result({
  "duration": 664123500,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_language()"
});
formatter.result({
  "duration": 660033200,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_Experience()"
});
formatter.result({
  "duration": 2065696500,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_Age()"
});
formatter.result({
  "duration": 1913784700,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_interest()"
});
formatter.result({
  "duration": 2986695500,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_goes_to_the_next_page()"
});
formatter.result({
  "duration": 584852100,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_there_preference()"
});
formatter.result({
  "duration": 3091139800,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_tells_about_the_degree()"
});
formatter.result({
  "duration": 2070560600,
  "status": "passed"
});
formatter.match({
  "location": "Resgister.user_select_the_language()"
});
formatter.result({
  "duration": 1601673400,
  "status": "passed"
});
formatter.after({
  "duration": 63068300,
  "status": "passed"
});
});