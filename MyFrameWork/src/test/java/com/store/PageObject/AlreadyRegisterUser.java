package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlreadyRegisterUser {

	WebDriver driver;

	public AlreadyRegisterUser() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement regiuser;

	@FindBy(xpath = "//input[@id=\"passwd\"]")
	WebElement regipassword;

	@FindBy(xpath = "//button[@name=\"SubmitLogin\"]")
	WebElement signup;

	public void RegisterUser(String remail) {
		regiuser.sendKeys(remail);
	}

	public void RegisterPassword(String repassword) {
		regiuser.sendKeys(repassword);

	}

	public void Signup() {
		signup.click();
	}
}
