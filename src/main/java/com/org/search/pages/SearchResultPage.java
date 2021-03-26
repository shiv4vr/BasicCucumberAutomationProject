package com.org.search.pages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.search.utils.TestBase;

public class SearchResultPage extends TestBase {

	ArrayList<String> resultsList = new ArrayList<>();
	ArrayList<String> resultsLiink = new ArrayList<>();

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchInputTextBox;

	@FindBy(xpath = "(//input[@value='Google Search'])[2]")
	WebElement searchButtonClick;

	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}

	public void getTopResults() {
		List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='hlcw0c']//div[@class='g']//h3"));
		for (WebElement element : listOfElements) {
			resultsList.add(element.getText());
		}
	}

	public void getTopLinks() {
		List<WebElement> listOfElements = driver.findElements(By.xpath("//a[contains(text(),'Laptop')]"));
		for (WebElement element : listOfElements) {
			resultsLiink.add(element.getAttribute("href"));
		}
	}

	public void storeTopResultsinFile() {
		for (int i = 0; i < resultsList.size(); i++) {
			String data = resultsList.get(i);
			File file = new File("./SearchResultData/serachResult.txt");
			try {
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter fileWritter = new FileWriter(file.getName(), true);
				BufferedWriter bw = new BufferedWriter(fileWritter);
				bw.newLine();
				bw.write(data);
				bw.close();
				fileWritter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void validateLinks() {

		HttpURLConnection httpUrlConn = null;
		for (int i = 0; i < resultsLiink.size(); i++) {
			try {
				httpUrlConn = (HttpURLConnection) (new URL(resultsLiink.get(i)).openConnection());
				httpUrlConn.setRequestMethod("HEAD");
				httpUrlConn.connect();
				int respCode = httpUrlConn.getResponseCode();
				if (respCode >= 400) {
					System.out.println(resultsLiink.get(i));
					System.out.println("its a broken link");
				} else {
					System.out.println(resultsLiink.get(i));
					System.out.println("its a valid link");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void getTextKeywordOCcurance(String keyWord) {
		int size = driver.getPageSource().split(keyWord).length - 1;
		System.out.println("Keyword Occurance keyword is ["+keyWord+"]");
		System.out.println(size);
		System.out.println("$$$$$$$$$$$$$$$$" );
	}
}
