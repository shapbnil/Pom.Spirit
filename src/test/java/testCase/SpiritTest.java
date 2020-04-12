package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageFactory.Common;
import pages.HomePage;

public class SpiritTest {
	
@Test
	public void mPage() {
		
		Common co= new Common();
		WebDriver driver = co.lunchBrowser();
		co.navigateUrl(driver);
		
		HomePage hp=new HomePage(driver);
		
		co.click(hp.signin, "SignIN");
		co.click(hp.signup, "SignUP");
		
		co.tearDown(driver);
	}


}
