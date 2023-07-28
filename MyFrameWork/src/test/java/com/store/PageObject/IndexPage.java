package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM for indexpage

public class IndexPage {
	WebDriver driver;
	
	
	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@class=\"login\"]")
	WebElement signup;
	
	public void Signup() {
		signup.click();
	}

}
