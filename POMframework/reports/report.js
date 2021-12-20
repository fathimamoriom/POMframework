$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automation Leaftaps Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinition.launch_Chrome_Browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.enter_Username_as_DemoSalesManager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.enter_Password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinition.click_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Its navigate homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinition.its_navigate_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Logout Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.click_the_Logout_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.close_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC002_Login and Logout for failure",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinition.launch_Chrome_Browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username as DemoSales",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.enter_Username_as_DemoSales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.enter_Password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinition.click_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigate samepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinition.its_navigate_samepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error message",
  "keyword": "But "
});
formatter.match({
  "location": "StepsDefinition.verify_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});