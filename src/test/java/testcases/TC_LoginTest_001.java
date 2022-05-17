package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Enter username");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickSubmit();
		System.out.println(driver.getTitle());

		if (driver.getTitle().equals("Log in to Facebook")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
		} else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login test failed");
		}

	}
}
