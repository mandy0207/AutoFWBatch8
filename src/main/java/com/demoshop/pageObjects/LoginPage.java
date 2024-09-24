package com.demoshop.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement loginHeader;
	
	@FindBy(xpath="//a[@class='ico-register']")
	private WebElement registerHeader;
	
	@FindBy(xpath="//*[@id='Email']")
	private WebElement emailInput;
	
	@FindBy(id="Password")
	private WebElement passwordInput;
	

	@FindBy(xpath="//*[@class='buttons']/*[@value='Log in']")
	private WebElement loginBtn;
	
	@FindBy(css=".account")
	private WebElement loggedEmail;
	
	public void navigateToLoginSection() {
		loginHeader.click();
	}
	
	public void navigateToRegisterationSection() {
		registerHeader.click();
	}
	
	public void login(String email, String pass) {
		emailInput.sendKeys(email);
        passwordInput.sendKeys(pass);
        loginBtn.click();
	}
	
	public String getLoggedEmail() {
		return loggedEmail.getText();
	}
	

}
