package com.org.search.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.Scenario;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Scenario scenario;
	ExtentReports extent;
	ExtentTest logger;
	ExtentTest extentTest;
	public static String url;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("./src/main/java/com/org/search/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		String basePath = new File("").getAbsolutePath();
		System.out.println(basePath);
		System.out.println(destination);
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		String reportDestination = "../FailedTestsScreenshots" + "/" + screenshotName + dateName + ".png";
		return reportDestination;
	}

	@SuppressWarnings("deprecation")
	@BeforeTest
	@Parameters({ "browser", "os", "env" })
	public static void inialization(String browser, String os, String env) throws Exception {

		switch (browser) {// switch on string
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
			break;
		case "ff":
			// FirefoxSetProperty(os);
			driver = new FirefoxDriver();
			break;
		case "opera":
			// OperaSetProperty(os);
			driver = new OperaDriver();
			break;
		case "edge":
			// EdgeSetProperty(os);
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "./src/main/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICITWAIT, TimeUnit.SECONDS);
		url = getValueOrDefault(env, "url");
		driver.get(prop.getProperty(TestBase.url));
		TestUtil.webPageLoadComplete();
	}

	public static String getValueOrDefault(String value, String defaultValue) {
		return value == null ? defaultValue : value + defaultValue;
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
