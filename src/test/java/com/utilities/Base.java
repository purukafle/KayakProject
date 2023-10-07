package com.utilities;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Base {

	private WebDriver driver;
	public GlobalSelenium myLibGS = new GlobalSelenium();
	public Base(WebDriver _driver) {
		this.driver=_driver;
		
	}

	public void setup() {
		
	    
	}
	
	
	public void tearDown(ITestResult result) {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			// capture screenshot when test fails
			myLibGS.takeScreenshot(result.getName());
		}
		
		
		myLibGS.tearDown();
		
	}
	public void tearDown() {
		try {
			customWait(5);
			// close the browser
			driver.close();
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(true, false);
		}

	
}
	public void customWait(double inSeconds) {
		try {
			// casting / converting data type from Double to Long
			long seconds = (long) (inSeconds * 1000);

			Thread.sleep(seconds);

			// below line of code is same 2 steps above merging into one line
			// Thread.sleep((long) (inSeconds * 1000));

		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(true, false);
		}
	}
}
