package com.phptravels.supplierpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.base.BaseTest;

public class RevenueBreakdownDisplay  extends BaseTest{
	

	@FindBy(xpath = "//*[@id='dashboardBarChart']")
	private WebElement revbkdwn;
	
	public RevenueBreakdownDisplay(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	public boolean rbDisplay()
	{
		boolean actual=revbkdwn.isDisplayed();
		return actual;
	}

}
