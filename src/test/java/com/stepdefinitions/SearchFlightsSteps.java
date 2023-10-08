package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.SearchFlightPage;
import com.utilities.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFlightsSteps{
	private WebDriver driver;
	SearchFlightPage searchflight;
	Base base;
	String url="https://www.kayak.com/";

	@Given("I am on the Kayak website")
	public void i_am_on_the_kayak_website() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    driver.get(url);
	}

	@When("I enter {string} in the departure city field")
	public void i_enter_in_the_departure_city_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter {string} in the destination city field")
	public void i_enter_in_the_destination_city_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select {string} as the trip type")
	public void i_select_as_the_trip_type(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select {string} as the departure date")
	public void i_select_as_the_departure_date(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click the search button")
	public void i_click_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should see search results for one-way flights")
	public void i_should_see_search_results_for_one_way_flights() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I have search results for one-way flights")
	public void i_have_search_results_for_one_way_flights() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I filter by {string} flights")
	public void i_filter_by_flights(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should see only nonstop flight options")
	public void i_should_see_only_nonstop_flight_options() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}