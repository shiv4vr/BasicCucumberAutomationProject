$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KeywordSearch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: shivanand havannavar --\u003e shiv4vr@gmail.com"
    }
  ],
  "line": 2,
  "name": "Keyowrd Search Result",
  "description": "",
  "id": "keyowrd-search-result",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Retrieve the top-ten results for keyword from Google Search",
  "description": "",
  "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Google Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"\u003csearchkeyword\u003e\" keyword in Search TextBox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the Result Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Retrieve the top-ten results from Results Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Store it in a Results-Data-file",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;",
  "rows": [
    {
      "cells": [
        "searchkeyword"
      ],
      "line": 12,
      "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;1"
    },
    {
      "cells": [
        "mobile"
      ],
      "line": 13,
      "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;2"
    },
    {
      "cells": [
        "car"
      ],
      "line": 14,
      "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;3"
    },
    {
      "cells": [
        "hotel"
      ],
      "line": 15,
      "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;4"
    },
    {
      "cells": [
        "selenium"
      ],
      "line": 16,
      "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;5"
    },
    {
      "cells": [
        "bikes"
      ],
      "line": 17,
      "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Retrieve the top-ten results for keyword from Google Search",
  "description": "",
  "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Google Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"mobile\" keyword in Search TextBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the Result Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Retrieve the top-ten results from Results Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Store it in a Results-Data-file",
  "keyword": "Then "
});
formatter.match({
  "location": "KeywordSearch.user_is_on_Google_Search_Page()"
});
formatter.result({
  "duration": 149817100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobile",
      "offset": 12
    }
  ],
  "location": "KeywordSearch.user_enter_keyword_in_Search_TextBox(String)"
});
formatter.result({
  "duration": 2018004300,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.validate_the_Result_Page_Title()"
});
formatter.result({
  "duration": 6830400,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.retrieve_the_top_ten_results_from_Results_Page()"
});
formatter.result({
  "duration": 94001400,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.store_it_in_a_Results_Data_file()"
});
formatter.result({
  "duration": 226820800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Retrieve the top-ten results for keyword from Google Search",
  "description": "",
  "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Google Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"car\" keyword in Search TextBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the Result Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Retrieve the top-ten results from Results Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Store it in a Results-Data-file",
  "keyword": "Then "
});
formatter.match({
  "location": "KeywordSearch.user_is_on_Google_Search_Page()"
});
formatter.result({
  "duration": 6431400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "car",
      "offset": 12
    }
  ],
  "location": "KeywordSearch.user_enter_keyword_in_Search_TextBox(String)"
});
formatter.result({
  "duration": 2710368700,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.validate_the_Result_Page_Title()"
});
formatter.result({
  "duration": 5951100,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.retrieve_the_top_ten_results_from_Results_Page()"
});
formatter.result({
  "duration": 87729300,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.store_it_in_a_Results_Data_file()"
});
formatter.result({
  "duration": 200948200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Retrieve the top-ten results for keyword from Google Search",
  "description": "",
  "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Google Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"hotel\" keyword in Search TextBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the Result Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Retrieve the top-ten results from Results Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Store it in a Results-Data-file",
  "keyword": "Then "
});
formatter.match({
  "location": "KeywordSearch.user_is_on_Google_Search_Page()"
});
formatter.result({
  "duration": 9223300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hotel",
      "offset": 12
    }
  ],
  "location": "KeywordSearch.user_enter_keyword_in_Search_TextBox(String)"
});
formatter.result({
  "duration": 2449333300,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.validate_the_Result_Page_Title()"
});
formatter.result({
  "duration": 4848400,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.retrieve_the_top_ten_results_from_Results_Page()"
});
formatter.result({
  "duration": 118484400,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.store_it_in_a_Results_Data_file()"
});
formatter.result({
  "duration": 251562900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Retrieve the top-ten results for keyword from Google Search",
  "description": "",
  "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Google Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"selenium\" keyword in Search TextBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the Result Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Retrieve the top-ten results from Results Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Store it in a Results-Data-file",
  "keyword": "Then "
});
formatter.match({
  "location": "KeywordSearch.user_is_on_Google_Search_Page()"
});
formatter.result({
  "duration": 8149800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 12
    }
  ],
  "location": "KeywordSearch.user_enter_keyword_in_Search_TextBox(String)"
});
formatter.result({
  "duration": 2460662100,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.validate_the_Result_Page_Title()"
});
formatter.result({
  "duration": 6090800,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.retrieve_the_top_ten_results_from_Results_Page()"
});
formatter.result({
  "duration": 145777500,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.store_it_in_a_Results_Data_file()"
});
formatter.result({
  "duration": 206067400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Retrieve the top-ten results for keyword from Google Search",
  "description": "",
  "id": "keyowrd-search-result;retrieve-the-top-ten-results-for-keyword-from-google-search;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Google Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter \"bikes\" keyword in Search TextBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the Result Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Retrieve the top-ten results from Results Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Store it in a Results-Data-file",
  "keyword": "Then "
});
formatter.match({
  "location": "KeywordSearch.user_is_on_Google_Search_Page()"
});
formatter.result({
  "duration": 9373700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bikes",
      "offset": 12
    }
  ],
  "location": "KeywordSearch.user_enter_keyword_in_Search_TextBox(String)"
});
formatter.result({
  "duration": 2352340400,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.validate_the_Result_Page_Title()"
});
formatter.result({
  "duration": 5316700,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.retrieve_the_top_ten_results_from_Results_Page()"
});
formatter.result({
  "duration": 105227700,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.store_it_in_a_Results_Data_file()"
});
formatter.result({
  "duration": 197461000,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Display stored result from file to Console",
  "description": "",
  "id": "keyowrd-search-result;display-stored-result-from-file-to-console",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Read the data from Results-Data-file",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Display data in console",
  "keyword": "Then "
});
formatter.match({
  "location": "KeywordSearch.read_the_data_from_Results_Data_file()"
});
formatter.result({
  "duration": 4095700,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearch.display_data_in_console()"
});
formatter.result({
  "duration": 1013600,
  "status": "passed"
});
formatter.uri("KeywordSearchLinkAndOccurrance.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: shivanand havannavar --\u003e shiv4vr@gmail.com"
    }
  ],
  "line": 2,
  "name": "Link availbility and Keyword Occurance",
  "description": "",
  "id": "link-availbility-and-keyword-occurance",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check the links are wokring fine for search result and check the Occurance of Search keyword",
  "description": "",
  "id": "link-availbility-and-keyword-occurance;check-the-links-are-wokring-fine-for-search-result-and-check-the-occurance-of-search-keyword",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Google-Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enters \"Laptop\" keyword in Search TextBox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the Result Page-Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate the Link availibilty",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Valdiate the keyword occurance",
  "keyword": "Then "
});
formatter.match({
  "location": "KeywordSearchLinkAndOccurrance.user_is_on_Google_Search_Page()"
});
formatter.result({
  "duration": 7499800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptop",
      "offset": 13
    }
  ],
  "location": "KeywordSearchLinkAndOccurrance.user_Enters_keyword_in_Search_TextBox(String)"
});
formatter.result({
  "duration": 2329493500,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearchLinkAndOccurrance.validate_the_Result_Page_Title()"
});
formatter.result({
  "duration": 4593800,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearchLinkAndOccurrance.validate_the_Link_availibilty()"
});
formatter.result({
  "duration": 4071833000,
  "status": "passed"
});
formatter.match({
  "location": "KeywordSearchLinkAndOccurrance.valdiate_the_keyword_occurance()"
});
formatter.result({
  "duration": 204933500,
  "status": "passed"
});
});