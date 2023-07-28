package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
	
	WebDriver driver;
	
	public NewAccountPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id=\"uniform-id_gender1\"]")
	WebElement gender;

	@FindBy(xpath="//input[@id=\"customer_firstname\"]")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id=\"customer_lastname\"]")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@name=\"passwd\"]")
	WebElement password;
	
	@FindBy(xpath="//select[@id=\"days\"]")
	WebElement Bday;
	
	@FindBy(xpath="//select[@id=\"months\"]")
	WebElement Bmonth;
	
	@FindBy(xpath="//select[@id=\"years\"]")
	WebElement Byear;
	
	@FindBy(xpath="//button[@name=\"submitAccount\"]")
	WebElement registerbtn;
	
	public void Gender(){
		gender.click();
		}
	
	public void Firstname(String fname){
		firstname.sendKeys(fname);;
		}
	public void Lastname(String lname){
		lastname.sendKeys(lname);
		}
	public void Email(String mail){
		email.clear();
		email.sendKeys(mail);
		}
	public void Password(String pword){
		password.sendKeys(pword);;
		}
	public void BDay(){
		Bday.click();
		Select s1=new Select(Bday);
		s1.selectByValue("6");
		}
	public void BMonth(){
		Bmonth.click();
		Select s2=new Select(Bmonth);
		s2.selectByValue("2");
		}
	public void BYear(){
		Byear.click();
		Select s3=new Select(Byear);
		s3.selectByValue("2022");
		}
	public void Register(){
      registerbtn.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
