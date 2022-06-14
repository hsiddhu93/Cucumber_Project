package com.adactin1.helper;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
public static FileReaderManager getInstance() {
	FileReaderManager read =new FileReaderManager();
	return read;
	
}
public ConfigurationReader getcrInstance() throws IOException {
	ConfigurationReader c = new ConfigurationReader();
	return c;
}
}
