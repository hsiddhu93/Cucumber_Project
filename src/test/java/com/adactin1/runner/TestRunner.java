package com.adactin1.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin1.baseclass.BaseClass1;
import com.adactin1.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin1\\feature\\Adactin.feature", 
glue = "com\\adactin1\\stepdefinition",
dryRun = false,
monochrome =true,
stepNotifications = true,
publish = true,
plugin = //"pretty"
		//"usage"
		"html:target/cucumber-reports/swag.html"
		//"json:target/cucumber-reports/swag.json",
		//"junit:target/cucumber-reports/swag.xml"
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)
public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUP() throws IOException {
		
		driver = BaseClass1.BrowserLaunch(FileReaderManager.getInstance().getcrInstance().setup());
		
    
	}
@AfterClass
public static void closewindow() {
	driver =BaseClass1.Quit_tab();

}
}
