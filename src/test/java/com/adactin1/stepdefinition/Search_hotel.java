package com.adactin1.stepdefinition;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.testng.xml.XmlMethodSelectors;

import com.adactin1.baseclass.BaseClass1;
import com.adactin1.helper.FileReaderManager;
import com.adactin1.helper.PageObjectManager;
import com.adactin1.pom.Searchhotel_Page;

import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.*;

public class Search_hotel extends BaseClass1 {
PageObjectManager p = new PageObjectManager(driver);
@Before
public void beforehooks(Scenario scenario) {
	String name = scenario.getName();
	System.out.println(name);

}
@After
public void afterhooks(Scenario scenario) throws IOException {
	Status status = scenario.getStatus();
	System.out.println(status);
	if (scenario.isFailed()) {
		Screenshot(scenario.getName());
	}

}

	@When("User select the location")
	public void user_select_the_location() throws IOException {
		Select_index(p.geSearchhotel_Page().getPlace(), "by value",FileReaderManager.getInstance().getcrInstance().place1());
	}

	@When("User select the hotel")
	public void user_select_the_hotel() {
		Select_index(p.geSearchhotel_Page().getHotel(), "by index", "1");
	}

	@When("User select the Room type")
	public void user_select_the_room_type() {
		Select_index(p.geSearchhotel_Page().getType(), "by visibletext", "Double");
	}

	@When("User select number of Room")
	public void user_select_number_of_room() {
		Select_index(p.geSearchhotel_Page().getNumber(), "by visibletext", "2 - Two");
	}

	@When("User select the Check-In")
	public void user_select_the_check_in() {
		Inputdata(p.geSearchhotel_Page().getPick(), "31/05/2022");
	}

	@When("User select the Check-Out")
	public void user_select_the_check_out() {
		Inputdata(p.geSearchhotel_Page().getDrop(), "12/06/2022");
	}

	@When("User select the no of adult")
	public void user_select_the_no_of_adult() {
		Select_index(p.geSearchhotel_Page().getAdult(), "by index", "2");
	}

	@When("User select the no of children")
	public void user_select_the_no_of_children() {
		Select_index(p.geSearchhotel_Page().getChild(), "by index", "1");
	}

	@Then("User valid search  hotel")
	public void user_valid_search_hotel() {
	click(p.geSearchhotel_Page().getSubmit());	
	}

}
