package com.store.Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.store.Utilities.ReadConfiguration;

public class Stroe_BaseCLass {

	ReadConfiguration readconfig = new ReadConfiguration();

	public String BaseURL = readconfig.geturl();
	public String email = readconfig.getmail();
	public  WebDriver driver;

	public static Logger logger;

	
	@BeforeClass
	public void Setup() {
		logger = Logger.getLogger("baseclass");
		PropertyConfigurator
				.configure("C:\\Users\\HP\\eclipse-workspace\\MyFrameWork\\Configuration\\config.properties");
		

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\Microsoft Edge");

		
		driver = new ChromeDriver();
		
		logger.info("open browser");
		

		driver.manage().window().maximize();
		logger.info("maximize window");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("open window");

		

		logger.info("close browser");
	}

//	@AfterClass
//	public void teardown() {
//		driver.close();
//	}
}
