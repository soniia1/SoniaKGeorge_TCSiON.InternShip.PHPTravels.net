package com.phptravels.customerpages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.phptravels.base.BaseTest;

public class LoginPage extends BaseTest {
	@FindBy(css = "input[name='email'][placeholder='Email']")
	private WebElement email;
	@FindBy (xpath="//*[@name='password' and @placeholder='Password']")
	private WebElement password;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	
	 public LoginPage (WebDriver driver) {
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 CustomerAgentUrl();
	 }
	 
    public void setEmail(String StrEmail) {
    	email.clear();
    	email.sendKeys(StrEmail); 	
    	
    }
    public void setPassword(String strPasswd) {
    	password.clear();
    	password.sendKeys(strPasswd);
    	
    }
    public void clickLogin() {
    	login.click();
    	
    }
}    