package com.store.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Properties;

;

public class ReadConfiguration {
	// to read the data from config.properties
	Properties properties;

	// constructor
	public ReadConfiguration() {
		File src = new File("C:\\Users\\HP\\eclipse-workspace\\MyFrameWork\\Configuration\\myframwork_config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			properties = new Properties();
			properties.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public String geturl() {
		String url = properties.getProperty("URL");
		System.out.println(url);
			return url;
	}
	public String getmail() {
		String mail = properties.getProperty("Email");
		System.out.println(mail);
		return mail;

	}

}
