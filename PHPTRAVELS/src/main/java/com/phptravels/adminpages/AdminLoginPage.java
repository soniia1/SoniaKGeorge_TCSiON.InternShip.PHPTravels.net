package com.phptravels.adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.base.BaseTest;

public class AdminLoginPage extends BaseTest{
	@FindBy(xpath = "//input[@name='email' and @type='text']")
	private WebElement email;
	@FindBy (xpath = "//input[@name='password' and @type='password']")
	private WebElement password;
	@FindBy(xpath = ".//*[@type='submit']")
	private WebElement login;
	public AdminLoginPage(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 adminUrl();
	}
	
	 public void setEmail(String StrEmail) {
	    	email.sendKeys(StrEmail); 	
	    	
	    }
	    public void setPassword(String strPasswd) {
	    	password.sendKeys(strPasswd);
	    	
	    }
	    public void clickLogin() {
	    	login.click();
	    	
	    }
	    

}
