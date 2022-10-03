package com.salesforce.test.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.salesforce.test.utility.CommonUtilities;
import com.salesforce.test.utility.Constants;
import com.salesforce.test.utility.GenerateReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	public static GenerateReports report = null;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLog;

	@BeforeTest 
	public static void SetUpBeforeTest() {
		//htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
		extent = new ExtentReports();
        //extent.attachReporter(htmlReporter);
	}
	@Parameters({"browsername"})
	@BeforeMethod
	public static void setUp() {
		System.out.println("before execution started");
		//report.startSingleTestReport("");  // test name to enter in place of test1
		//setDriver("chrome");
		CommonUtilities CU = new CommonUtilities();
		Properties applicationPropertiesFile=CU.loadFile("applicationProperties");
		String url=CU.getApplicationProperty("url", applicationPropertiesFile);
		//gotoUrl(url);
		//waitUntilPageLoads();		
	}
	
	/*@AfterMethod
	public static void tearDown(ITestResult result, File File) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			FileUtils.copyFileToDirectory(File, new File
					("C:\\Users\\sahil\\eclipse-workspace\\SalesForceFinalFramework\\ScreenShots" + result.getName() +".jpg"));
					}
		driver.quit();
		}*/
		
	
	/*@DataProvider (name = "SalesForce")
	public static readdata() {
		// logic to read all data from xl sheet data [][];
		// return data[][];
	}*/
	public static void setDriver(String browser) {

		switch (browser) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
	}	
	public static void gotoUrl(String url) {
		driver.get(url);

	}
	public static void waitUntilPageLoads() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));	
	}
	public static void closebrowser() {
		driver.close();
	}
	public static void enterText(WebElement element, String text, String objName) {
		if (element.isDisplayed()) {
			clearElement(element, objName);
			element.sendKeys(text);
			//extentLog.info("text enterted in " + objName + "field");
		} else {
			extentLog.error("fail:" + objName + "element not displayed");
		}
	}
	public static void clearElement(WebElement element, String objName) {
		if (element.isDisplayed()) {
			element.clear();
			//extentLog.info("pass:" + objName + "element cleared");
		} else {
			extentLog.error("fail:" + objName + "element not displayed");
		}
	}
	public static void clickElement(WebElement remember, String objName) {
		if (remember.isDisplayed()) {
			remember.click();
			//extentLog.info("pass:" + objName + "element clicked");
		} else {
			extentLog.error("fail:" + objName + "element not displayed");
		}
	}
	public static void removePopup(WebElement tryLexDialogX, String objName) {
		if (tryLexDialogX.isDisplayed()) {
			clickElement(tryLexDialogX, "close");
			extentLog.info("pass:" + objName + "element cleared");
		} else {
			extentLog.error("fail:" + objName + "element not displayed");
		}
	}
	public static void movetoelement(WebElement remember, String objName) {
		if (remember.isDisplayed()) {
			remember.click();
			extentLog.info("pass:" + objName + "element clicked");
		} else {
			extentLog.error("fail:" + objName + "element not displayed");
		}
	}
	public static void replace(WebElement element, String objName) {
		if (element.isDisplayed()) {
			element.click();
			driver.close();
			extentLog.info("pass:" + objName + "element clicked");
		} else {
			extentLog.error("fail:" + objName + "element not displayed");
		}
	}
	public static void close() {
		driver.close();
		extentLog.info("closed");
	}
	public static void pageLoad() {
		driver.manage().timeouts().getPageLoadTimeout();
	}

	public static void close1() {
		driver.close();
	}

	public static void SelectByVisibleText(String string) {
		Select ob = new Select(null);
		ob.selectByVisibleText(null);
	}
	public static void ImplicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait
	}
	public static void waitUntilvisibilityOfElementLocated(By locator, String objName) { // Explicit wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
	}
// FluentWait : it has the polling time in it. it checks the DOM every 5 sec or so to check any element is present or not.
//	Wait Wait1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
	//		.ignoring(NoSuchElementException.class);

	
	//@BeforeMethod
	public static void logintoSalesForce(){
		setDriver("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.get("http://login.salesforce.com/");
		WebElement username = driver.findElement(By.className("username"));
		enterText(username, "johnabrahim@tekarch.com", "username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,"Sahil@123" , "password");
		WebElement Login = driver.findElement(By.id("Login"));
		clickElement(Login, "Login"); 
	}
	

	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void newWindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);
	}
	public static void selectByTextdata(WebElement element, String text, String objName) {
	Select selectcity = new Select(element);
	selectcity.selectByVisibleText(text);
	System.out.println(objName + "selected" + text);
	}

	public static void selectByindexdata(WebElement element, int index, String objName) {
	Select selectcity = new Select(element);
	selectcity.selectByIndex(index);
	}
	public static void selectByValuedata(WebElement element,  String text) {
	Select selectcity = new Select(element);
	selectcity.selectByValue(text);
	}

	public static void switchToWindowIpened(String mainWindowHandle) {
	Set<String> allWindowHandles = driver.getWindowHandles();
	for (String handle: allWindowHandles) {
		if(!mainWindowHandle.equalsIgnoreCase(handle));
		driver.switchTo().window(handle);
	}
	System.out.println("switch to new window");
			
	}
	public static WebElement selectFromList(List<WebElement> list, String text) {
	WebElement country=null;
	for(WebElement i:list) {
		if(i.getText().equalsIgnoreCase(text)) {
			System.out.println("selected=" +i.getText());
			country = i;
			break;
		}
	}
	return country;
	}
	public static void waitUntilVisible(WebElement element, String objName) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void waitUntilalertIsPresent(WebElement element, String objName) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public static void waitUntilElementtobeClickable(By locator, String objName) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	public static void validateText(String actualText, String expectedText, String objName) throws InterruptedException{
	Assert.assertEquals(actualText, expectedText, objName);
	report.logTestpassed(objName);
}
	public static void validateButtons(boolean result, String objName) {
		if(result)
			report.logTestInfo(objName+" button checked");
		else {
			report.logTestInfo(objName+"button unchecked");
			String filename=objName.replace((char)32,'_');
			takeScreenShot(filename);
			report.logTestfailed(objName);
			//Assert.fail(objName+" button unchecked");
		}
		}
	
	public static void createhtmlReport() {
		htmlReporter = new ExtentHtmlReporter("extentReport.html");
		extent = new ExtentReports();
		
		htmlReporter.config().setDocumentTitle("Test Execution Report");
		htmlReporter.config().setReportName("salesforce regression tests");

		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Salesforce");
		extent.setSystemInfo("Environment", "Automation Testing");
		extent.setSystemInfo("User Name", "Sahil");
		}
	
	
	public static void startTest(String TestCaseName) {
		extentLog = extent.createTest(TestCaseName);
	}
	public static void info() {
		extentLog.info("");
	}
	public static void logFail(String message) {
		extentLog.log(Status.FAIL,MarkupHelper.createLabel("Test Case Failed", ExtentColor.RED));	
	}
	public static void logPass(String message) {
		extentLog.log(Status.PASS,	MarkupHelper.createLabel("Test Case Passed", ExtentColor.GREEN));
}
	public static void logwarning( String details) {
		extentLog.log(Status.WARNING, MarkupHelper.createLabel("Test Case in Warning stage", ExtentColor.YELLOW));
}
	public static void closeReport() {
		extent.flush();
	}
	public static void takesScreenShot(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(file, new File
	("C:\\Users\\sahil\\eclipse-workspace\\SalesForceFinalFramework\\ScreenShots" + fileName +".jpg"));
	}
	
public static void takeScreenShot(String fileName) {		
		File screenshotFile = ((HasFullPageScreenshot) driver).getFullPageScreenshotAs(OutputType.FILE);
		String path = Constants.SCREENSHOTS_PATH+fileName;
		File destination = new File(path);
		try {
			FileUtils.copyFile(screenshotFile, destination);
		}catch (IOException e) {
			report.logTestFailedWithException(e);
		}
		//report.logTestInfo("Screenshot taken");
		}
public static void Login() {
	setDriver("chrome");
	createhtmlReport();
	startTest("TC09");
	logPass("Test case Passed");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://login.salesforce.com/");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	}
public static void Select(WebElement DateField) {
	Select select = new Select(DateField);
	select.selectByVisibleText("Created Date");
}
public static void selectByvisibleIndex(WebElement element, int ind) {
	Select index = new Select (element);
	index.deselectByIndex(ind);
}
}