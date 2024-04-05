package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

//	By txt_username = By.id("user-name");
//	By txt_password = By.id("password");
//	By txt_button = By.id("login-button");
//	public LoginPage(WebDriver driver)
//	{
//		this.driver= driver;
//// to validate proper login page 
//		if(!driver.getTitle().equals("Swag Labs"))
//		{
//			throw new IllegalStateException("This is not login page .the current login page is " + driver.getCurrentUrl());
//		}
//		
//	}

//	public void enterusername(String username) {
//		driver.findElement(txt_username).sendKeys(username);
//	}
//
//	public void enterpassword(String password) {
//		driver.findElement(txt_password).sendKeys(password);
//	}
//
//	public void loginbutton() {
//		driver.findElement(txt_password).click();
//	}
//	
//	public void validateUserLogin(String username , String password)
//	{
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_password).sendKeys(password);
//		driver.findElement(txt_password).click();
//
//	}
	@FindBy(id="user-name")
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login-button")
	WebElement txt_loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver, Classnme - LoginPage.class);
		PageFactory.initElements(driver, this);
		
	}
	
	
	

	public void enterUsername(String username) 	{
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) 	{
		txt_password.sendKeys(password);
	}
	public void click() 	{
	txt_loginbtn.click();
	}
}
