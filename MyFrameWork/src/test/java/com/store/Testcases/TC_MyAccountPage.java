package com.store.Testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.store.PageObject.CreateAnAccount;
import com.store.PageObject.IndexPage;
import com.store.PageObject.NewAccountPage;
import com.store.Testcases.Stroe_BaseCLass;

public class TC_MyAccountPage extends Stroe_BaseCLass{
	
	@Test
	public void VerifyRegestration() {
		
		logger.info("entering the url");
		driver.get(BaseURL);
		
		IndexPage ip=new IndexPage(driver);
		logger.info("signup on page of ecommerce website");
		ip.Signup();
		
		CreateAnAccount account=new CreateAnAccount(driver);
		
		account.EnterEmail(email);
		logger.info("enter the mail to new account ecommerce website");
		account.SubmitButtom();
		logger.info("click on submit button move to regestration");
		
		
		NewAccountPage nap=new NewAccountPage(driver);
		nap.Gender();
		
		nap.Firstname("rajita");
		
		nap.Lastname("hajare");
		
		nap.Email(email);
		
		nap.Password("789456");
		
		nap.BDay();
		
		nap.BMonth();
		
		nap.BYear();
		
		nap.Register();
		
		String username=driver.findElement(By.xpath("//a[@class=\"account\"]")).getText();
		
		if(username.equals("Rajita hajare"))
		{
			System.out.println("register user  is correct");
			System.out.println("helloooo");
			assertTrue(true);
		}
		else
		{
			System.out.println("register user is not correct");
		}
		
	}
	
	

}
