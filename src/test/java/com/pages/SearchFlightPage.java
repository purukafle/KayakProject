package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFlightPage {
	private WebDriver driver;
	
	public SearchFlightPage(WebDriver _driver) {
		this.driver=_driver;
	}
	
	public void searchYourFlight() {
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
	}
	public void selectFlightOption(String option) {
		
	}
	
	

}