package com.adactin1.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel_Page {
	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement place;
	@FindBy(name = "hotels")
	private WebElement hotel;
	@FindBy(name = "room_type")
	private WebElement type;
	@FindBy(name = "room_nos")
	private WebElement number;
	@FindBy(name = "datepick_in")
	private WebElement pick;
	@FindBy(name = "datepick_out")
	private WebElement drop;
	@FindBy(id = "adult_room")
	private WebElement adult;
	@FindBy(id = "child_room")
	private WebElement child;
	@FindBy(id = "Submit")
	private WebElement submit;

	public Searchhotel_Page(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlace() {
		return place;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getPick() {
		return pick;
	}

	public WebElement getDrop() {
		return drop;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
