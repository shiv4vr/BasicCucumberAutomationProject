#Author: shivanand havannavar --> shiv4vr@gmail.com
Feature: Keyowrd Search Result

  Scenario Outline: Retrieve the top-ten results for keyword from Google Search
    Given User is on Google Search Page
    When User enter "<searchkeyword>" keyword in Search TextBox
    Then Validate the Result Page Title
    Then Retrieve the top-ten results from Results Page
    Then Store it in a Results-Data-file

    Examples: 
      | searchkeyword  |
      | mobile   |
      | car      |
      | hotel    |
      | selenium |
      | bikes    |

  Scenario: Display stored result from file to Console
    Given Read the data from Results-Data-file
    Then Display data in console
