package com.org.search.stepDefinitions;

import com.org.search.pages.SearchHomePage;
import com.org.search.pages.SearchResultPage;
import com.org.search.utils.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KeywordSearch  {

	private String keyWord = null;
	SearchHomePage searchHomePage = new SearchHomePage();
	SearchResultPage searchResultPage = new SearchResultPage();
	TestUtil testUtil=new TestUtil();

	@Given("^User is on Google Search Page$")
	public void user_is_on_Google_Search_Page() throws Throwable {
		searchHomePage.validateTitle();
	}

	@When("^User enter \"([^\"]*)\" keyword in Search TextBox$")
	public void user_enter_keyword_in_Search_TextBox(String arg1) throws Throwable {
		keyWord = arg1;
		searchHomePage.enterSerachKeyword(arg1);
	}

	@Then("^Validate the Result Page Title$")
	public void validate_the_Result_Page_Title() throws Throwable {
		searchHomePage.validateResultPage(keyWord);
	}

	@Then("^Retrieve the top-ten results from Results Page$")
	public void retrieve_the_top_ten_results_from_Results_Page() throws Throwable {
		searchResultPage.getTopResults();
	}

	@Then("^Store it in a Results-Data-file$")
	public void store_it_in_a_Results_Data_file() throws Throwable {
		searchResultPage.storeTopResultsinFile();
		// driver.close();
		searchHomePage.goBackToBaseSearchHomePage();
	}

	@Given("^Read the data from Results-Data-file$")
	public void read_the_data_from_Results_Data_file() throws Throwable {
		testUtil.readDataFromFile();
	}

	@Then("^Display data in console$")
	public void display_data_in_console() throws Throwable {
		testUtil.displayToConsole();
	}
}
