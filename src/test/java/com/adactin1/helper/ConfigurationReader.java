package com.adactin1.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	Properties p;

	public ConfigurationReader() throws IOException {
		File f = new File("src\\test\\java\\com\\adactin1\\helper\\adactin1.property");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String setup() {
		String browserpage = p.getProperty("Browser");
		return browserpage;
	}

	public String weburl() {
		String web = p.getProperty("URL");
		return web;
	}
	public String username() {
		String user1 = p.getProperty("user");
		return user1;

	}
	public String password() {
		String pass1 = p.getProperty("pass");
		return pass1;

	}
	public String place1() {
		String pla = p.getProperty("place");
		return pla;
	}
}
