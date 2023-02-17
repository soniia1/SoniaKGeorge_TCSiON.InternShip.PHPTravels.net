package com.phptravels.customerpages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.base.BaseTest;

public class UpdateAddressPage extends BaseTest {
	
	@FindBy(xpath = ".//*[@class=' waves-effect'][text()=' My Profile']")
	private WebElement profile;
	@FindBy(xpath = "//input[@name='address1']")
	private WebElement add1;
	@FindBy (xpath = "//input[@name='address2']")
	private WebElement add2;
	@FindBy (xpath = ".//*[@type='submit']")
	private WebElement update;
	@FindBy (xpath = "//*[text()=' Profile updated successfully.                                ']")
	private WebElement sucmsg;
	
	
	public UpdateAddressPage(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	
	 public void clickProfile() {
	       	
	    	profile.click();
	 }
	 public void setAddress1(String Stradd1) {
		 add1.clear();
	       	
	    add1.sendKeys(Stradd1);
	 }
	 public void setAddress2(String Stradd2) {
	       add2.clear();
		   add2.sendKeys(Stradd2);
		 }
	 public boolean clickUpdate() {
		 Actions act=new Actions(driver);
	      act.moveToElement(update);
	      update.sendKeys(Keys.ENTER);
	      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	      wait.until(ExpectedConditions.visibilityOf(sucmsg));
	      boolean a= sucmsg.isDisplayed();
	      return a;
	     
	 }

}
