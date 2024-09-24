package com.demoshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoshop.pageObjects.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void verifyUserIsAbleToLoginWithValidCreds() {
		
		
		LoginPage loginPage= new LoginPage(driver);
		
		loginPage.navigateToLoginSection();
		String actualEmail= "obsqura24@gmail.com";
		
		loginPage.login(actualEmail, "mypassword");
		
		String expectedEmail = loginPage.getLoggedEmail();
		
		System.out.println(expectedEmail);
		Assert.assertEquals(actualEmail, expectedEmail, "Logged Email is not matching");
	
	}
}
