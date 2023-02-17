package com.phptravels.customerpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.base.BaseTest;

public class PaymentPayPalPage extends BaseTest {
	
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' Add Funds']")
	private WebElement addfunds;
	@FindBy(xpath = "//input[@id='gateway_paypal']")
	private WebElement paypal;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement paynow;
	
	 public PaymentPayPalPage (WebDriver driver) {
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 public void clickAddFund() throws InterruptedException {
	       	
	    	addfunds.click();
	    	paypal.click();
	    	paynow.click();
	    	Thread.sleep(2000);
	    }

}
