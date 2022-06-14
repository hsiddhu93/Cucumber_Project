package com.adactin1.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	public WebDriver driver;

	@FindBy(name = "username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(name = "login")
	private WebElement log;
	
	public login_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

}
