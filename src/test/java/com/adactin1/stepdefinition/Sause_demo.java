package com.adactin1.stepdefinition;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin1.baseclass.BaseClass1;

import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sause_demo extends BaseClass1 {
	public static WebDriver driver;
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

	@Given("user launches the application")
	public void user_launches_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enter a valid {string} in username textbox")
	public void user_enter_a_valid_in_username_textbox(String user) {
		driver.findElement(By.id("user-name")).sendKeys(user);
	}

	@When("user enter a valid {string} in pasword textbox")
	public void user_enter_a_valid_in_pasword_textbox(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("verfies the homepage")
	public void verfies_the_homepage() {
		System.out.println("Logged successfully");
	}

}
