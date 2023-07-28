package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {

	WebDriver driver;

	public CreateAnAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id=\"email_create\"]")
	WebElement email;

	@FindBy(xpath= "//button[@id=\"SubmitCreate\"]")
	WebElement submitbtn;

	public void EnterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void SubmitButtom() {
		submitbtn.click();
	}
}
