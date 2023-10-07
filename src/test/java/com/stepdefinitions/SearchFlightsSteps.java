package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilities.Base;
import com.pages.SearchFlightPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFlightsSteps{
	private WebDriver driver;
	SearchFlightPage searchflight;
	Base base;
	
	@When("user open chrome browser")
	public void user_open_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    
	}

	@Then("go to web url {string}")
	public void go_to_web_url(String url) {
		driver.get(url);
		
	   
	}

	@Then("click on Flights")
	public void click_on_flights() {
		searchflight=new SearchFlightPage(driver);
		searchflight.searchYourFlight();
	    
	}
	@Then("select Trip option")
	public void select_trip_option() {
	    searchflight.selectFlightOption("");
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		base=new Base(driver);
		base.tearDown();
	    
	}

}