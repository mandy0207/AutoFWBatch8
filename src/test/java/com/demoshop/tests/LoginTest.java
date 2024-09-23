package com.demoshop.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test
	public void verifyUserIsAbleToLoginWithValidCreds() {
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("mypassword");
		
		driver.findElement(By.xpath("//*[@class='buttons']/*[@value='Log in']")).click();
	
	}
}
