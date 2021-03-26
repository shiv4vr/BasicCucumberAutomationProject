package com.org.search.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.cucumber.listener.Reporter;

public class TestUtil extends TestBase {

	public static final int PAGE_LOAD_TIMEOUT = 100;
	public static final int IMPLICITWAIT = 60;

	ArrayList<String> resulsFileList = new ArrayList<>();

	public static void takesScreenshot(String testName) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyy-HH-mm-ss");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("./src/main/screenshot/" + testName + "-" + date1 + ".png"));
		String screenShotName = "./src/main/screenshot/" + testName + "-" + date1 + ".png";
		Reporter.addScreenCaptureFromPath(screenShotName);
	}

	public static void webPageLoadComplete() {
		WebDriverWait wait = new WebDriverWait(driver, PAGE_LOAD_TIMEOUT);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
				.equals("complete"));
	}

	public static void assertionElementTrue(String expectedTitle) {
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertTrue(expectedTitle.equalsIgnoreCase(TestUtil.getTitleWebPage()));
	}

	public static void waitWebElementVisible(WebElement webElement, Integer seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

	public static void selectEnterText() {
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
	}

	public static void waitWebElementClicable(WebElement webElement, Integer seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}

	public static void clickPerform(WebElement webElement) {
		Actions actions = new Actions(driver);
		actions.moveToElement(webElement).click().perform();
	}

	public static String getTitleWebPage() {
		String title = driver.getTitle();
		System.out.println("Title of current page is: [" + title + "]");
		return title;
	}

	public void readDataFromFile() {
		String fileName = "./serachResult.txt";
		File file = new File(fileName);
		FileReader fr;
		try {
			fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				resulsFileList.add(line);
			}
			fr.close();
			br.close();
			file.delete();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void displayToConsole() {
		resulsFileList.forEach((n) -> System.out.println("*******[" + n + "]*******"));
	}
}
