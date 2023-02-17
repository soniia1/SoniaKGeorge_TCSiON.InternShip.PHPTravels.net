package com.phptravels.agentpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.base.BaseTest;

public class LeftSideLinksPage  extends BaseTest {
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' My Bookings']")
	private WebElement booking;
	//@FindBy(xpath = "//a[@class=' waves-effect'][text()=' My Bookings']")
	@FindBy(xpath = ".//*[text()=' View Voucher']")
	private WebElement viewvoucher;
	@FindBy (xpath = "//a[@class=' waves-effect'][text()=' Add Funds']")
	private WebElement addfund;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement paynow;
	@FindBy(xpath = ".//*[@class=' waves-effect'][text()=' My Profile']")
	private WebElement profile;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement update;
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' Logout'] ")
	private WebElement logout;
	@FindBy (xpath = "//span[text()='Login']")
	private WebElement login;
	
	public LeftSideLinksPage(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	public boolean clickBookings() {
	   	
    	booking.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(viewvoucher));
    	boolean actual=viewvoucher.isDisplayed();
    	return actual;
    }
    public boolean clickAddFund() {
       	
    	addfund.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(paynow));
    	boolean actual2=paynow.isDisplayed();
    	return actual2;
    }
    public boolean clickProfile() {
       	
    	profile.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(update));
    	boolean actual3=paynow.isDisplayed();
    	return actual3;
    }
 
    public boolean clickLogout() {
      	
   	 logout.click();
   	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(login));
	boolean actual4=login.isDisplayed();
   	return actual4;
    }
}
