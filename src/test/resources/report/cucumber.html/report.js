$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Lenovo/eclipse-workspace/CucumberMultipleLoginswithMultiscenario/src/test/resources/FEatures/Adac.feature");
formatter.feature({
  "name": "validate the adactinhotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validating the page navigate to select hotel by selecting all fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\",\"\u003cpassword\u003e\" and click login",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter the \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003cRoomtype\u003e\",\"\u003cnoofRooms\u003e\",\"\u003ccheckinDate\u003e\",\"\u003ccheckoutDate\u003e\",\"\u003cadultsperRoom\u003e\",\"\u003cchildrensperroom\u003e\" and click search button",
  "keyword": "When "
});
formatter.step({
  "name": "user should validate that page should be navigate to \"Select Hotel\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user is kanchana",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "Roomtype",
        "noofRooms",
        "checkinDate",
        "checkoutDate",
        "adultsperRoom",
        "childrensperroom",
        "firstName",
        "lastName",
        "billingAddress",
        "creditcardNo",
        "creditcardType",
        "expiryDateMOnth",
        "expiryYEar",
        "cvv"
      ]
    },
    {
      "cells": [
        "sugan12345",
        "OH98G6",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "31/08/2021",
        "11/09/2021",
        "2 - Two",
        "1 - One",
        "Daniel",
        "Roodie",
        "Chennai",
        "1234567891234567",
        "American Express",
        "January",
        "2022",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the page navigate to select hotel by selecting all fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter \"sugan12345\",\"OH98G6\" and click login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterAndClickLogin(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter the \"Sydney\",\"Hotel Creek\",\"Standard\",\"1 - One\",\"31/08/2021\",\"11/09/2021\",\"2 - Two\",\"1 - One\" and click search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheAndClickSearchButton(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should validate that page should be navigate to \"Select Hotel\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.userShouldValidateThatPageShouldBeNavigateTo(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is kanchana",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validating the page navigate to select hotel by selecting mandatory fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\",\"\u003cpassword\u003e\" and click login",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter the \"\u003clocation\u003e\",\"\u003cnoofRooms\u003e\",\"\u003ccheckinDate\u003e\",\"\u003ccheckoutDate\u003e\",\"\u003cadultsperRoom\u003e\" and click search button",
  "keyword": "When "
});
formatter.step({
  "name": "user should validate that page should be navigate to \"Select Hotel\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "noofRooms",
        "checkinDate",
        "checkoutDate",
        "adultsperRoom"
      ]
    },
    {
      "cells": [
        "sugan12345",
        "OH98G6",
        "Sydney",
        "1 - One",
        "31/08/2021",
        "11/09/2021",
        "2 - Two"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the page navigate to select hotel by selecting mandatory fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter \"sugan12345\",\"OH98G6\" and click login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterAndClickLogin(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter the \"Sydney\",\"1 - One\",\"31/08/2021\",\"11/09/2021\",\"2 - Two\" and click search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheAndClickSearchButton(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should validate that page should be navigate to \"Select Hotel\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.userShouldValidateThatPageShouldBeNavigateTo(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validating the page navigate to select hotel with wrong check in and checkout date",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\",\"\u003cpassword\u003e\" and click login",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter the \"\u003clocation\u003e\",\"\u003ccheckinDate\u003e\",\"\u003ccheckoutDate\u003e\", and click search button",
  "keyword": "When "
});
formatter.step({
  "name": "user should validate \"Check-In Date shall be before than Check-Out Date\" and \"Check-Out Date shall be after than Check-In Date\" message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "checkinDate",
        "checkoutDate"
      ]
    },
    {
      "cells": [
        "sugan12345",
        "OH98G6",
        "Sydney",
        "21/08/2021",
        "10/08/2021"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the page navigate to select hotel with wrong check in and checkout date",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter \"sugan12345\",\"OH98G6\" and click login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterAndClickLogin(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter the \"Sydney\",\"21/08/2021\",\"10/08/2021\", and click search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldEnterTheAndClickSearchButton(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should validate \"Check-In Date shall be before than Check-Out Date\" and \"Check-Out Date shall be after than Check-In Date\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.userShouldValidateAndMessageIsDisplayed(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Validating the page navigate to select hotel without entering any fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\",\"\u003cpassword\u003e\" and click login",
  "keyword": "Given "
});
formatter.step({
  "name": "user should click search button",
  "keyword": "When "
});
formatter.step({
  "name": "user should validate \"Please Select a Location\" message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sugan12345",
        "OH98G6"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the page navigate to select hotel without entering any fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter \"sugan12345\",\"OH98G6\" and click login",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userShouldEnterAndClickLogin(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should click search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldClickSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should validate \"Please Select a Location\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.userShouldValidateMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});