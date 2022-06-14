package com.adactin1.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.adactin1.baseclass.BaseClass1;
import com.adactin1.helper.FileReaderManager;
import com.adactin1.helper.PageObjectManager;
import com.adactin1.pom.login_page;
import com.adactin1.runner.TestRunner;

import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass1 {
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager po = new PageObjectManager(driver);
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

	@Given("user launches the adactin application")
	public void user_launches_the_adactin_application() throws IOException {

		driver.get(FileReaderManager.getInstance().getcrInstance().weburl());
		driver.manage().window().maximize();
	}

	@When("Enter the username in user textbox")
	public void enter_the_username_in_user_textbox() throws IOException {
		// String user1 = FileReaderManager.getInstance().getcrInstance().user();
		// driver = BaseClass1.Inputdata(p.getLp().getUser(), user1);
		Inputdata(po.getLogin_page().getUser(), FileReaderManager.getInstance().getcrInstance().username());
	}

	@When("Enter the password in pass textbox")
	public void enter_the_password_in_pass_textbox() throws IOException {
		Inputdata(po.getLogin_page().getPass(), FileReaderManager.getInstance().getcrInstance().password());
	}

	/*
	 * mapping concept // @When("Enter the below details for login function") //
	 * public void //
	 * enter_the_below_details_for_login_function(io.cucumber.datatable.DataTable //
	 * dataTable) { // List<Map<String, String>> login =
	 * dataTable.asMaps(String.class, // String.class); // String user =
	 * login.get(0).get("username"); // String pass = login.get(0).get("password");
	 * 
	 * // driver.findElement(By.id("username")).sendKeys(user); //
	 * driver.findElement(By.id("password")).sendKeys(pass); // By_id("sendkeys",
	 * "username", "siddhu93"); // By_id("sendkeys", "password", "Hsidd@1293"); // }
	 */
	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
		click(po.getLogin_page().getLog());
	}

	@Then("^verify the homepage and navigate to search hotel page$")
	public void verify_the_homepage_and_navigate_to_search_hotel_page() throws Throwable {
		System.out.println("Logged in successfully");
	}
}
