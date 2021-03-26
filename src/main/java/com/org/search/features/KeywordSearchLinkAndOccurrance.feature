#Author: shivanand havannavar --> shiv4vr@gmail.com
Feature: Link availbility and Keyword Occurance

  Scenario: Check the links are wokring fine for search result and check the Occurance of Search keyword
    Given User is on Google-Search Page
    When User Enters "Laptop" keyword in Search TextBox
    Then Validate the Result Page-Title
    Then Validate the Link availibilty
    Then Valdiate the keyword occurance
