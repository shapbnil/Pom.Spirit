package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pageFactory.Common;
import pages.HomePage;

public class SpiritTest {
	
@Test
	public void mPage() {
		
	ExtentHtmlReporter htmlReport=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReport\\Report.html");
	ExtentReports extent =new ExtentReports();
	ExtentTest test= extent.createTest("Test1");
	extent.attachReporter(htmlReport);
	
		Common co= new Common();
		WebDriver driver = co.lunchBrowser();
		co.navigateUrl(driver);
		
		HomePage hp=new HomePage(driver);
		
		co.click(hp.signin, "SignIN");
		co.click(hp.signup, "SignUP");
		extent.flush();
		co.tearDown(driver);
	}


}
