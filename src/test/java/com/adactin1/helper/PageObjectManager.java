package com.adactin1.helper;

import org.openqa.selenium.WebDriver;

import com.adactin1.pom.Searchhotel_Page;
import com.adactin1.pom.login_page;

public class PageObjectManager {
	public static WebDriver driver;
	private login_page lp;
	private Searchhotel_Page sp;

	public PageObjectManager(WebDriver driver1) {
		this.driver = driver1;
	}

	public login_page getLogin_page() {
		lp = new login_page(driver);
		return lp;

	}
	public Searchhotel_Page geSearchhotel_Page() {
	 sp = new Searchhotel_Page(driver);
	return sp;
	}
	
}
