package com.org.search.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.org.search.utils.TestBase;
import com.org.search.utils.TestUtil;

public class SearchHomePage extends TestBase {
	@FindBy(xpath = "//input[@name='q']")
	WebElement searchInputTextBox;

	@FindBy(xpath = "(//input[@value='Google Search'])[2]")
	WebElement searchButtonClick;

	public SearchHomePage() {
		PageFactory.initElements(driver, this);
	}

	public void enterSerachKeyword(String keyword) throws InterruptedException {
		TestUtil.waitWebElementVisible(searchInputTextBox, 50);
		searchInputTextBox.clear();
		searchInputTextBox.sendKeys(keyword);
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.ENTER).click().build().perform();
	}

	public void validateTitle() {
		String Title = "Google";
		TestUtil.assertionElementTrue(Title);
	}

	public void clickSearchButton() {
		TestUtil.waitWebElementClicable(searchButtonClick, 50);
		TestUtil.clickPerform(searchButtonClick);

	}

	public void goBackToBaseSearchHomePage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void validateResultPage(String keyWord) {
		String Title = keyWord + " - Google Serach";
		TestUtil.assertionElementTrue(Title);
	}
	
}
