package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.Base;

public class SearchFlightPage {
	private WebDriver driver;
	Base base=new Base(driver);
	
	public SearchFlightPage(WebDriver _driver) {
		this.driver=_driver;
		
	}
	
	public void searchYourFlight() {
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
		base.customWait(10);
	}
	public void selectFlightOption(String option) {
		if(option.equals("Round_trip")) {
			driver.findElement(By.xpath("//*[text()='Round-trip']")).click();
			base.customWait(5);
			
		}
		else if(option.equals("One-way")) {
			driver.findElement(By.xpath("//*[text()='One-way']")).click();
			base.customWait(5);
		
	}
		else {
			driver.findElement(By.xpath("//*[text()='Multi-city']")).click();
			base.customWait(5);
		}
	
	}
	public void roundTripFrom(String from) {
		driver.findElement(By.xpath("//*[@id=\"Ml62\"]/div/div/div/div[1]/div[2]/div/div[1]/div/div/input")).click();
		base.customWait(5);
		WebElement roundtrip=driver.findElement(By.xpath("//input[@placeholder='From?']"));
		roundtrip.click();
		roundtrip.sendKeys(from);
		
		
	}
	public void roundTripTo(String to) {
		WebElement roundtrip=driver.findElement(By.xpath("//input[@placeholder='To?']"));
		roundtrip.click();
		roundtrip.sendKeys(to);

}
}