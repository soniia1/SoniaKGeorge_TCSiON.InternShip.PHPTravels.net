package com.phptravels.agentpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.base.BaseTest;

public class AgentLoginPage extends BaseTest {
	
	
	@FindBy(css = "input[name='email'][placeholder='Email']")
	private WebElement email;
	@FindBy (xpath="//*[@name='password' and @placeholder='Password']")
	private WebElement password;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' My Bookings']")
	private WebElement booking;
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' Add Funds']")
	private WebElement addfunds;
	@FindBy(xpath = "//input[@id='gateway_paypal']")
	private WebElement paypal;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement paynow;
	
	
	
	
	 public AgentLoginPage(WebDriver driver) {
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 CustomerAgentUrl();
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
public void clickAddFund() {
       	
    	addfunds.click();
    	paypal.click();
    	paynow.click();
    }


}
