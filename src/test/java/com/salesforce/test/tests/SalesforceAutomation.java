package com.salesforce.test.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SalesforceAutomation extends BaseTest{
	
	
	@Test
	public static void LoginErrorMessage() throws IOException {
	   
		setDriver("chrome");
		createhtmlReport();
		startTest("TC 1");
		logPass("Test case Passed");
		logFail("Test case Failed");
		logwarning("In warning stage");
		driver.get("http://login.salesforce.com/");
		WebElement username = driver.findElement(By.className("username"));
		enterText(username, "User@gmail.com", "username");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		WebElement Login = driver.findElement(By.id("Login"));
		clickElement(Login, "Login");
		takesScreenShot("Login Error Message");
		closeReport();
		closebrowser();
	}
	@Test
	public static void LoginToSalesForce() throws IOException {     										
				
		logintoSalesForce();
		createhtmlReport();
		startTest("LoginToSalesForce");
		logPass("Test case Passed");
		logFail("Test case Failed");
		logwarning("In warning stage");
		takesScreenShot("");
		//report.logTestpassed("LoginToSalesForce");
		closeReport();
		closebrowser();
		
		/*setDriver("chrome");
		driver.get("http://login.salesforce.com/");
		WebElement username = driver.findElement(By.className("username"));
		enterText(username, "johnabrahim@tekarch.com", "username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,"Sahil@123" , "password");
		WebElement Login = driver.findElement(By.id("Login"));
		clickElement(Login, "Login");*/
		
	}
	@Test
	public static void CheckRememberMe() throws InterruptedException, IOException {
		setDriver("chrome");
		createhtmlReport();
		startTest("CheckRememberMe");
		logPass("Test case Passed");
		logintoSalesForce();
	WebElement userId = driver.findElement(By.id("userNavButton"));
	clickElement(userId, "");
	WebElement logout = driver.findElement(By.linkText("Logout"));
	clickElement(logout, "Logout");
	WebElement username1 = driver.findElement(By.className("username"));
	enterText(username1, "johnabrahim@tekarch.com", "username");
	//username.isDisplayed();
	takesScreenShot("CheckRememberMe");
	closeReport();
	closebrowser();
	}
	
	@Test
	public static void Chrome4A() throws InterruptedException {
		setDriver("firefox");
		createhtmlReport();
		startTest("Chrome4A");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com/");
		WebElement forgot = driver.findElement(By.id("forgot_password_link"));
		clickElement(forgot, "");
		WebElement username = driver.findElement(By.id("un"));
		enterText(username, "johnabrahim@tekarch.com", "username");
		WebElement cont = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		clickElement(cont, "");
		//report.logTestInfo("Program completed");
		takeScreenShot("Chrome4A");
		closeReport();
		closebrowser();
	}

	@Test
	public static void ValidateLoginErrorMessage() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("ValidateLoginErrorMessage");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://login.salesforce.com/");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "123", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "22131" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	System.out.println("Program completed");
	closeReport();
	closebrowser();
	}

	@Test
	public static void TC05() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("ValidateLoginErrorMessage");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://login.salesforce.com/");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement user = driver.findElement(By.className("menuButtonLabel"));
	clickElement(user, "JOHNABCD");
	report.logTestInfo("Clicked on user");
	/*WebElement Logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
	clickElement(Logout, "Logout");
	System.out.println("clicked on Logout");*/
	report.logTestInfo("Program completed");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC06() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC06");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com/");
		WebElement username = driver.findElement(By.className("username"));
		enterText(username, "johnabrahim@tekarch.com", "username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, "Sahil@123" , "password");
		WebElement Login = driver.findElement(By.id("Login"));
		clickElement(Login, "Login");
		WebElement user = driver.findElement(By.className("menuButtonLabel"));
		clickElement(user, "JOHNABCD");
		System.out.println("Clicked on user");
		WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[1]"));
		clickElement(profile, "My Profile");
		WebElement drag = driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		clickElement(drag, "User Action Menu");
		System.out.println("Clicked on user manu");
		WebElement edit = driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		clickElement(edit, "Edit Profile");
		System.out.println("Edit profile clicked");
		driver.switchTo().frame("aboutMeContentId");
		WebElement About = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		clickElement(About, "About");
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastName.clear();
		lastName.sendKeys("Cena");
		WebElement saveall = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
		clickElement(saveall, " ");
		WebElement myFrame = driver.findElement(By.xpath("//textarea[@id='publishereditablearea']"));
		clickElement(myFrame, "post");
		System.out.println("post clicked");
		driver.switchTo().defaultContent(); //enterText = driver.findElement(By.xpath(""));
		WebElement postFrame = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(postFrame);
		driver.findElement(By.xpath("//body[@class='chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Publish this post");
		//driver.findElement(By.xpath("//input[id='publishersharebutton']")).click();
		driver.switchTo().defaultContent();
		WebElement share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		clickElement(share, "");
		System.out.println("share clicked");
		//WebElement postFrame = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		WebElement file = driver.findElement(By.xpath("//*[@id=\"publisherAttachContentPost\"]/span[1]"));
		clickElement(file, "file");
		WebElement uploadfile = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/a"));
		clickElement(uploadfile, "Upload file button");
		System.out.println("upload file button clicked");
		WebElement myProfilePhoto = driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(myProfilePhoto).build().perform();
		driver.findElement(By.id("uploadLink")).click();
		WebElement imageFrame = driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(imageFrame);
		WebElement browseImage = driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
		browseImage.sendKeys("C:\\Users\\sahil\\Pictures\\Acer\\Acer_Wallpaper_03_3840x2400.jpg");
		WebElement saveuploadimage = driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadBtn\"]"));
		saveuploadimage.click();
		WebElement saveCropped = driver.findElement(By.name("j_id0:j_id7:save"));
		saveCropped.click();
		report.logTestInfo("All done");
		closeReport();
		closebrowser();
	}

	@Test 
	public static void TC07() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC07");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://login.salesforce.com/");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement user = driver.findElement(By.className("menuButtonLabel"));
	clickElement(user, "JOHNABCD");
	System.out.println("Clicked on user");
	WebElement mySetting = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
	clickElement(mySetting, "My Settings");
	WebElement personalId = driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));	
	clickElement(personalId, "Personal");
	System.out.println("personal clicked");
	WebElement history = driver.findElement(By.id("LoginHistory_font"));
	clickElement(history, "Login History");
	WebElement Display = driver.findElement(By.xpath("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"));
	Thread.sleep(3000);
	clickElement(Display, "Display & Layout");
	System.out.println("Display & Layout clicked");
	WebElement customize = driver.findElement(By.id("CustomizeTabs_font"));
	clickElement(customize, "Customize My Tabs");
	WebElement content = driver.findElement(By.id("p4"));
	content.sendKeys(Keys.ARROW_UP);
	System.out.println("SFC Clicked");
	WebElement Tabs = driver.findElement(By.xpath("//label[contains(@for,'duel_select_0')]"));
	clickElement(Tabs, "");
	System.out.println("Tab clicked");
	WebElement account = driver.findElement(By.xpath("//option[@value='Account']"));
	clickElement(account, "");
	WebElement right = driver.findElement(By.id("duel_select_0_right"));
	clickElement(right, "");
	System.out.println("arrow clicked");
	WebElement save = driver.findElement(By.name("save"));
	clickElement(save, "Save");
	WebElement email = driver.findElement(By.xpath("//*[@id=\"EmailSetup\"]/a"));
	clickElement(email, "Email");
	WebElement emailSetting = driver.findElement(By.id("EmailSettings_font"));
	clickElement(emailSetting, "My Email Settings");
	WebElement Radio = driver.findElement(By.name("auto_bcc"));
	clickElement(Radio, "");
	WebElement saveButton = driver.findElement(By.name("save"));
	clickElement(saveButton, "Save");
	WebElement calander = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
	clickElement(calander, "Calendar & Remainders");
	WebElement act = driver.findElement(By.xpath("//a[@id='Reminders_font']"));
	clickElement(act, "Activity Reminders");
	WebElement Open = driver.findElement(By.id("testbtn"));
	clickElement(Open, "Open a Test Reminder");
	System.out.println("Program completed");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC08() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC08");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com/");
		WebElement username = driver.findElement(By.className("username"));
		enterText(username, "johnabrahim@tekarch.com", "username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, "Sahil@123" , "password");
		WebElement Login = driver.findElement(By.id("Login"));
		clickElement(Login, "Login");
		WebElement user = driver.findElement(By.className("menuButtonLabel"));
		clickElement(user, "JOHNABCD");
		System.out.println("Clicked on user");
		WebElement developer = driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
		clickElement(developer, "Developer Console");
		System.out.println("Program completed");
		closeReport();
		closebrowser();
	}

	@Test  
	public static void TC09() throws InterruptedException {
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
	WebElement user = driver.findElement(By.className("menuButtonLabel"));
	clickElement(user, "JOHNABCD");
	System.out.println("Clicked on user");
	WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	clickElement(logout, "Logout");
	System.out.println("Program completed");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC10CreateAccount() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC10CreateAccount");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://login.salesforce.com/");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement acc = driver.findElement(By.linkText("Accounts"));
	clickElement(acc, "Accounts");
	WebElement New = driver.findElement(By.xpath("//td[@class='pbButton']//input[@type='button']"));
	clickElement(New, "New");
	System.out.println("New view clicked");
	WebElement close = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(close, "");
	WebElement accountName = driver.findElement(By.xpath("//input[@id='acc2']"));
	accountName.sendKeys("John");
	WebElement CustPrior = driver.findElement(By.id("00N5g00000VXjOv"));
	clickElement(CustPrior, "--None--");
	CustPrior.sendKeys(Keys.ARROW_DOWN);
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC11Creatnewview() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC11Creatnewview");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://login.salesforce.com/");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement acc = driver.findElement(By.linkText("Accounts"));
	clickElement(acc, "Accounts");
	WebElement createnew = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	clickElement(createnew, "Create New View");
	WebElement viewName = driver.findElement(By.id("fname"));
	viewName.sendKeys("Johny");
	WebElement uniqueName = driver.findElement(By.id("devname"));
	uniqueName.sendKeys("Lever");
	WebElement save1 = driver.findElement(By.name("save"));
	clickElement(save1, "Save");
	closeReport();
	closebrowser();
	}

	@Test 
	
	public static void TC12Editview() throws InterruptedException {   								
		setDriver("chrome");
		createhtmlReport();
		startTest("TC12Editview");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://login.salesforce.com/");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement acc = driver.findElement(By.linkText("Accounts"));
	clickElement(acc, "Accounts");
	WebElement close = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(close, "");
	WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
	view.click();
	view.sendKeys(Keys.ARROW_DOWN);
	view.sendKeys(Keys.ARROW_DOWN);
	view.sendKeys(Keys.ARROW_DOWN);
	view.sendKeys(Keys.ARROW_DOWN);
	System.out.println("View clicked");
	WebElement edit = driver.findElement(By.linkText("Edit"));
	clickElement(edit, "Edit");
	System.out.println("Edit clicked");
	WebElement vn = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	vn.sendKeys("Aksh");
	WebElement uvn = driver.findElement(By.xpath("//*[@id=\"devname\"]"));
	uvn.sendKeys("Kumar");
	System.out.println("name updated");
	closeReport();
	closebrowser();
	}
	
	@Test  
	public static void TC13MergeAccounts() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC13MergeAccounts");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement acc = driver.findElement(By.linkText("Accounts"));
	clickElement(acc, "Accounts");
	WebElement Merge = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
	clickElement(Merge, "Merge Accounts");
	System.out.println("Merge Acc clicked");
	WebElement search = driver.findElement(By.xpath("//input[@id='srch']"));
	clickElement(search, "");
	search.sendKeys("John");
	WebElement find = driver.findElement(By.name("srchbutton"));
	clickElement(find, "Find ACcounts");
	WebElement next = driver.findElement(By.name("goNext"));
	clickElement(next, "Next");
	WebElement mergeFinal = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]"));
	clickElement(mergeFinal, "Merge");
	closeReport();
	closebrowser();
	}
	
	@Test 
	public static void TC14() throws InterruptedException, IOException { 							 					
		setDriver("chrome");
		createhtmlReport();
		startTest("TC13MergeAccounts");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement acc = driver.findElement(By.linkText("Accounts"));
	clickElement(acc, "Accounts");
	WebElement days = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
	clickElement(days, "Accounts with last activity> 30 days");
	WebElement AccountGeneral = driver.findElement(By.xpath("//*[@id=\"ext-gen148\"]"));
	clickElement(AccountGeneral, "AccountGeneral");
	System.out.println("date field clicked");
	selectByTextdata(AccountGeneral, "Created Date", "Created Date");
	clickElement(AccountGeneral, "Created Date");
	//takesScreenShot("");
	AccountGeneral.sendKeys(Keys.ARROW_DOWN);
	clickElement(AccountGeneral, "");
	WebElement CreatedDate = driver.findElement(By.xpath("/html/body/div[17]/div/div[3]"));
	SelectByVisibleText("Created Date");
	CreatedDate.click();
	WebElement createddate= driver.findElement(By.xpath("//*[@id=\"ext-gen250\"]/div[3]"));
	clickElement(createddate, "Created date");
	System.out.println("date clicked");
	WebElement date = driver.findElement(By.xpath("//*[@id=\"ext-gen152\"]"));
	clickElement(date, "");
	WebElement Select = driver.findElement(By.xpath("//*[@id=\"ext-gen273\"]/tbody/tr[2]/td/table/tbody/tr[4]/td[1]/a/em/span"));
	clickElement(Select, "");
	WebElement saveReport = driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]"));
	clickElement(saveReport, "save");
	WebElement reportName = driver.findElement(By.xpath("//*[@id=\"saveReportDlg_reportNameField\"]"));
	reportName.sendKeys("Sahil");
	WebElement nameUnique = driver.findElement(By.xpath("//*[@id=\"saveReportDlg_DeveloperName\"]"));
	nameUnique.sendKeys("Sahil1");
	WebElement Saneandreport = driver.findElement(By.xpath("//*[@id=\"ext-gen301\"]"));
	Thread.sleep(2000);
	clickElement(Saneandreport, "Save and Run Report");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC15() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC15");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement opp = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	clickElement(opp, "Opportunities");
	WebElement close = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(close, "");
	WebElement drop = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
	Thread.sleep(2000);
	clickElement(drop, "All Oppurtinities");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC16() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC16");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement opp = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	clickElement(opp, "Opportunities");
	WebElement close = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(close, "");
	WebElement New = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
	clickElement(New, "New");
	WebElement Opp = driver.findElement(By.xpath("//input[@id='opp3']"));
	clickElement(Opp, "");
	Opp.sendKeys("tekarch");
	System.out.println("opp entered");
	WebElement accName = driver.findElement(By.xpath("//*[@id=\"opp4\"]"));
	clickElement(accName, "");
	accName.sendKeys("Sahil");
	System.out.println("name entered");
	WebElement closeDate = driver.findElement(By.id("opp9"));
	clickElement(closeDate, "");
	WebElement selectDate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div[2]/table/tbody/tr[5]/td[2]"));
	clickElement(selectDate, "");
	WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
	clickElement(stage, "Qualification");
	System.out.println("stage selected");
	WebElement probability = driver.findElement(By.xpath("//*[@id=\"opp12\"]"));
	clickElement(stage, "");
	probability.sendKeys("12");
	System.out.println("stage selected");
	WebElement Leadsource = driver.findElement(By.xpath("//*[@id=\"opp6\"]"));
	clickElement(Leadsource, "Web");
	Leadsource.sendKeys(Keys.ARROW_DOWN);
	System.out.println("Leadsource selected");
	WebElement Campaign = driver.findElement(By.xpath("//*[@id=\"opp17\"]"));
	clickElement(Campaign, "Qualification");
	Campaign.sendKeys("tekarch12");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC17() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC17");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement opp = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	clickElement(opp, "Opportunities");
	WebElement close = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(close, "");
	WebElement pipeline = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
	clickElement(pipeline, "Opportunity Pipeline");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC18() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC18");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement opp = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	clickElement(opp, "Opportunities");
	WebElement close = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(close, "");
	WebElement Stuckopportunities = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
	clickElement(Stuckopportunities, "Stuck Opportunities");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC19() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC19");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement opp = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	clickElement(opp, "Opportunities");
	WebElement close = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(close, "");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC20LeadTab() throws InterruptedException {      							
		setDriver("chrome");
		createhtmlReport();
		startTest("TC20LeadTab");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement Leads = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
	clickElement(Leads, "Leads");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement user = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	Thread.sleep(3000);
	clickElement(user, "JOHN ABCD");
	Thread.sleep(3000);
	WebElement Log = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	clickElement(Log, "Logout");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC21leadsselectvalue() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC21leadsselectvalue");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement content = driver.findElement(By.xpath("//*[@id=\"tsidLabel\"]"));
	clickElement(content, "Content");
	System.out.println("content clicked");
	WebElement user = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	Thread.sleep(1000);
	clickElement(user, "JOHN ABCD");
	WebElement Log = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	clickElement(Log, "Logout");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC22defaultview() throws InterruptedException {  							// Not Passed 5
		setDriver("chrome");
		createhtmlReport();
		startTest("TC22defaultview");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement Leads = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
	clickElement(Leads, "Leads");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement view = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
	clickElement(view, "");
	System.out.println("View clicked");
	movetoelement(view, "Today's Leads");
	System.out.println("Today's Lead clicked");
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	clickElement(user, "JOHN ABCD");
	WebElement Log = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	clickElement(Log, "Logout");
	System.out.println("Logout clicked");
	WebElement username1 = driver.findElement(By.className("username"));
	enterText(username1, "johnabrahim@tekarch.com", "username");
	WebElement password1 = driver.findElement(By.id("password"));
	enterText(password1, "Sahil@123" , "password");
	WebElement Login1 = driver.findElement(By.id("Login"));
	clickElement(Login1, "Login");
	WebElement Leads1 = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
	clickElement(Leads1, "Leads");
	WebElement go = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input"));
	clickElement(go, "Go!");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC23() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC23");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement Leads = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
	clickElement(Leads, "Leads");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement Leaddrag1 = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
	clickElement(Leaddrag1, "");
	Leaddrag1.sendKeys(Keys.ARROW_DOWN);
	Leaddrag1.sendKeys(Keys.ARROW_DOWN);
	Leaddrag1.sendKeys(Keys.ARROW_DOWN);
	closeReport();
	closebrowser();
	}
	@Test 
	public static void TC24() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC24");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement Leads = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
	clickElement(Leads, "Leads");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement New1 = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
	clickElement(New1, "New");
	WebElement Lname = driver.findElement(By.xpath("//*[@id=\"name_lastlea2\"]"));
	Lname.sendKeys("ABCD");
	System.out.println("ABCD Entered");
	WebElement Cname = driver.findElement(By.xpath("//*[@id=\"lea3\"]"));
	Cname.sendKeys("ABCD");
	System.out.println("ABCD Entered");
	WebElement saveName = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	clickElement(saveName, "Save");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC25() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC25");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
	clickElement(contact, "Contacts");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement New2 = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
	clickElement(New2, "New");
	//WebElement FN2 = driver.findElement(By.xpath("//*[@id=\"name_firstcon2\"]"));
	//FN2.sendKeys("Hellooww");
	//System.out.println("Firstname entered");
	WebElement LN2 = driver.findElement(By.xpath("//*[@id=\"name_lastcon2\"]"));
	LN2.sendKeys("Hello");
	System.out.println("Text entered");
	WebElement Accountname = driver.findElement(By.xpath("//*[@id=\"con4\"]"));
	Accountname.sendKeys("John");
	System.out.println("Company name clicked");
	WebElement SAVE = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	clickElement(SAVE, "Save");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC26() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC26");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
	clickElement(contact, "Contacts");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement newLink = driver.findElement(By.linkText("Create New View"));
	clickElement(newLink, "Create New View");
	WebElement viewName = driver.findElement(By.id("fname"));
	viewName.sendKeys("John");
	System.out.println("John print");
	WebElement viewUniquename = driver.findElement(By.id("devname"));
	viewUniquename.sendKeys("Cena");
	System.out.println("Cena Prints");
	WebElement Save3 = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
	clickElement(Save3, "");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC27() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC27");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
	clickElement(contact, "Contacts");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement recently = driver.findElement(By.xpath("//*[@id=\"hotlist_mode\"]"));
	clickElement(recently, "");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC28() throws InterruptedException {            							  // Not passed 6
		setDriver("chrome");
		createhtmlReport();
		startTest("TC28");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
	clickElement(contact, "Contacts");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement tag = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
	clickElement(tag, "");
	selectByTextdata(tag, "My Contacts", "My Contacts");
	clickElement(tag, "My contacts");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC29() throws InterruptedException {        // Not Passed
		setDriver("chrome");
		createhtmlReport();
		startTest("TC29");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
	clickElement(contact, "Contacts");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement nametag = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
	clickElement(nametag, "Hello, John");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC31() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC31");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
	clickElement(contact, "Contacts");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement newview = driver.findElement(By.linkText("Create New View"));
	clickElement(newview, "Create New View");
	WebElement namee = driver.findElement(By.id("fname"));
	namee.sendKeys("EFGH");
	System.out.println("name prints");
	WebElement uniqueName = driver.findElement(By.id("devname"));
	uniqueName.sendKeys("EFGH");
	System.out.println("unPrints");
	WebElement saveee = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
	clickElement(saveee, " ");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC30() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC30");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
	clickElement(contact, "Contacts");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement newview = driver.findElement(By.linkText("Create New View"));
	clickElement(newview, "Create New View");
	WebElement namee = driver.findElement(By.id("fname"));
	namee.sendKeys("ABCD");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC32() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC32");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a"));
	clickElement(contact, "Contacts");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement Neww = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
	clickElement(Neww, "");
	WebElement namee = driver.findElement(By.id("name_lastcon2"));
	namee.sendKeys("Indian");
	WebElement accName = driver.findElement(By.id("con4"));
	accName.sendKeys("Global Media");
	WebElement sAve = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
	clickElement(sAve, "");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC33() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC33");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	clickElement(home, "Home");
	WebElement profilePage = driver.findElement(By.linkText("JOHN Cena"));
	clickElement(profilePage, "");
	closeReport();
	closebrowser();
	}

	@Test 
	public static void TC34() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC34");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	clickElement(home, "Home");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement profilePage = driver.findElement(By.linkText("JOHN Cena"));
	Thread.sleep(3000);
	clickElement(profilePage, "");
	WebElement dragOpt = driver.findElement(By.xpath("//*[@id=\"moderatorMutton\"]"));
	clickElement(dragOpt, "");
	WebElement edit = driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
	clickElement(edit, "Edit Profile");
	System.out.println("Edit profile clicked");
	driver.switchTo().frame("aboutMeContentId");
	WebElement About = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
	clickElement(About, "About");
	WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	lastName.clear();
	lastName.sendKeys("abcd");
	System.out.println("last name entered");
	WebElement saveall = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
	clickElement(saveall, " ");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC35() throws InterruptedException {
		setDriver("chrome");
		createhtmlReport();
		startTest("TC35");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement arrow = driver.findElement(By.className("allTabsArrow"));
	clickElement(arrow, "");
	WebElement customize = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input"));
	clickElement(customize, "");
	WebElement Account = driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]/option[6]"));
	clickElement(Account, "Accounts");
	WebElement remove = driver.findElement(By.xpath("//*[@id=\"duel_select_0_left\"]/img"));
	clickElement(remove, "");
	System.out.println("Avvounts removed");
	WebElement saveee = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	clickElement(saveee, "");
	WebElement user = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	Thread.sleep(1000);
	clickElement(user, "JOHN ABCD");
	WebElement Log = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	clickElement(Log, "Logout");
	WebElement username12 = driver.findElement(By.className("username"));
	enterText(username12, "johnabrahim@tekarch.com", "username");
	WebElement password12 = driver.findElement(By.id("password"));
	enterText(password12, "Sahil@123" , "password");
	WebElement Login12 = driver.findElement(By.id("Login"));
	clickElement(Login12, "Login");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC36() throws InterruptedException, IOException {                   						 // Not Passed 7
		setDriver("chrome");
		createhtmlReport();
		startTest("TC36");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	clickElement(home, "Home");
	WebElement date = driver.findElement(By.linkText("Sunday October 2, 2022"));  
	clickElement(date, "");
	WebElement pm = driver.findElement(By.linkText("8:00 PM"));
	clickElement(pm, "");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement subject = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
	clickElement(subject, "");
	String oldWindow = driver.getWindowHandle();
	Set<String> getAllWindows = driver.getWindowHandles();
	String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
	Thread.sleep(3000);
	driver.switchTo().window(getWindow[1]);
	driver.get("https://tekarch-4a-dev-ed.my.salesforce.com/widg/combobox.jsp?form=editPage&field=evt5&display=1&cnt=5");
	System.out.println(driver.getCurrentUrl());
	WebElement other = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
	clickElement(other, "");
	driver.switchTo().window(oldWindow);
	System.out.println(driver.getCurrentUrl());
	WebElement datee = driver.findElement(By.xpath("//*[@id=\"EndDateTime\"]"));
	clickElement(datee, "");
	System.out.println("date clicked  rtr");
	WebElement dateee = driver.findElement(By.xpath("//*[@id=\"calRow2\"]/td[1]")); 
	clickElement(dateee, "");
	System.out.println("date clicked rtr1");
	WebElement StartTime = driver.findElement(By.xpath("//*[@id=\"StartDateTime_time\"]")); //
	clickElement(StartTime, "");
	StartTime.clear();
	StartTime.sendKeys("9:00 PM");
	StartTime.sendKeys(Keys.ENTER);
	WebElement EndTime = driver.findElement(By.xpath("//*[@id=\"EndDateTime_time\"]")); // 
	clickElement(EndTime, "");
	EndTime.clear();
	EndTime.sendKeys("11:30 PM");
	WebElement Savas = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	clickElement(Savas, "");
	System.out.println("Saved last element");
	closeReport();
	closebrowser();
	}

	@Test  
	public static void TC37() throws InterruptedException {							// Not Passed 8
		setDriver("chrome");
		createhtmlReport();
		startTest("TC37");
		logPass("Test case Passed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://login.salesforce.com");
	WebElement username = driver.findElement(By.className("username"));
	enterText(username, "johnabrahim@tekarch.com", "username");
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, "Sahil@123" , "password");
	WebElement Login = driver.findElement(By.id("Login"));
	clickElement(Login, "Login");
	WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	clickElement(home, "Home");
	WebElement date = driver.findElement(By.linkText("Sunday October 2, 2022"));  
	clickElement(date, "");
	WebElement pm = driver.findElement(By.linkText("4:00 PM"));
	clickElement(pm, "");
	WebElement closeTab = driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]"));
	clickElement(closeTab, "close");
	WebElement subject = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
	clickElement(subject, "");
	String oldWindow = driver.getWindowHandle();
	Set<String> getAllWindows = driver.getWindowHandles();
	String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
	Thread.sleep(3000);
	driver.switchTo().window(getWindow[1]);
	driver.get("https://tekarch-4a-dev-ed.my.salesforce.com/widg/combobox.jsp?form=editPage&field=evt5&display=1&cnt=5");
	System.out.println(driver.getCurrentUrl());
	WebElement other = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
	clickElement(other, "");
	driver.switchTo().window(oldWindow);
	System.out.println(driver.getCurrentUrl());
	WebElement datee = driver.findElement(By.xpath("//*[@id=\"EndDateTime\"]"));
	clickElement(datee, "");
	System.out.println("date clicked  rtr");
	WebElement dateee = driver.findElement(By.xpath("//*[@id=\"calRow2\"]/td[1]")); 
	clickElement(dateee, "");
	System.out.println("date clicked rtr1");
	WebElement StartTime = driver.findElement(By.xpath("//*[@id=\"StartDateTime_time\"]")); //
	clickElement(StartTime, "");
	StartTime.clear();
	StartTime.sendKeys("5:00 PM");
	StartTime.sendKeys(Keys.ENTER);
	WebElement EndTime = driver.findElement(By.xpath("//*[@id=\"EndDateTime_time\"]")); // 
	clickElement(EndTime, "");
	EndTime.clear();
	EndTime.sendKeys("11:30 PM");
	WebElement Savas = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	clickElement(Savas, "");
	WebElement SevenPM = driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:26:j_id64\"]/a"));
	clickElement(SevenPM, "");
	WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"IsRecurrence\"]"));
	clickElement(CheckBox, "");
	WebElement WeeklyCheckBox = driver.findElement(By.xpath("//*[@id=\"rectypeftw\"]"));
	clickElement(WeeklyCheckBox, "");
	WebElement DayIn = driver.findElement(By.xpath("//*[@id=\"64\"]"));
	clickElement(DayIn, "");
	WebElement LastDate = driver.findElement(By.xpath("//*[@id=\"RecurrenceEndDateOnly\"]"));
	clickElement(LastDate, "");
	WebElement twoWeeksDate = driver.findElement(By.xpath("//*[@id=\"calRow4\"]/td[1]"));
	clickElement(twoWeeksDate, "");
	WebElement SAVE = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	clickElement(SAVE, "");
	WebElement Monthly = driver.findElement(By.xpath("//*[@id=\"rectypeftm\"]"));
	clickElement(Monthly, "");
	WebElement MonthlyDate = driver.findElement(By.xpath("//*[@id=\"recmm1\"]"));
	clickElement(MonthlyDate, "");
	closeReport();
	closebrowser();
	}
	}
