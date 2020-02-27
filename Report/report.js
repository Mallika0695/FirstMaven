$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "To Validate facebook functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To Verify Search Button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enter the Search Item \"\u003cSearch\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click the Search button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search"
      ]
    },
    {
      "cells": [
        "Teens"
      ]
    },
    {
      "cells": [
        "NOOK"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on bearnesandnobel webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_bearnesandnobel_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Verify Search Button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enter the Search Item \"Teens\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_Search_Item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on bearnesandnobel webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_bearnesandnobel_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Verify Search Button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enter the Search Item \"NOOK\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_Search_Item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on bearnesandnobel webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_bearnesandnobel_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Verify Signin",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user click the myaccount \"My Account\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_click_the_myaccount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_the_sign_in()"
});
formatter.result({
  "status": "passed"
});
});