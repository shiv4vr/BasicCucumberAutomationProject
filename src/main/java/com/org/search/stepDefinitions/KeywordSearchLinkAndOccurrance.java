package com.org.search.stepDefinitions;

import com.org.search.pages.SearchHomePage;
import com.org.search.pages.SearchResultPage;
import com.org.search.utils.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KeywordSearchLinkAndOccurrance {

	private String keyWord = null;
	SearchHomePage searchHomePage = new SearchHomePage();
	SearchResultPage searchResultPage = new SearchResultPage();
	TestUtil testUtil = new TestUtil();

	@Given("^User is on Google-Search Page$")
	public void user_is_on_Google_Search_Page() throws Throwable {
		searchHomePage.validateTitle();
	}

	@When("^User Enters \"([^\"]*)\" keyword in Search TextBox$")
	public void user_Enters_keyword_in_Search_TextBox(String arg1) throws Throwable {
		keyWord = arg1;
		searchHomePage.enterSerachKeyword(keyWord);
	}

	@Then("^Validate the Result Page-Title$")
	public void validate_the_Result_Page_Title() throws Throwable {
		searchHomePage.validateResultPage(keyWord);
	}

	@Then("^Validate the Link availibilty$")
	public void validate_the_Link_availibilty() throws Throwable {
		searchResultPage.getTopLinks();
		searchResultPage.validateLinks();
	}

	@Then("^Valdiate the keyword occurance$")
	public void valdiate_the_keyword_occurance() throws Throwable {
		searchResultPage.getTextKeywordOCcurance(keyWord);
	}
}
