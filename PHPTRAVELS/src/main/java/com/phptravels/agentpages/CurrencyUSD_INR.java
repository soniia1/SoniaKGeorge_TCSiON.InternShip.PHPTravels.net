package com.phptravels.agentpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.base.BaseTest;

public class CurrencyUSD_INR extends BaseTest {
	
	//@FindBy(xpath = "//*[@class='btn btn-default dropdown-toggle waves-effect' and @ id='currency']")
	@FindBy(xpath="//button[@id='currency'][contains(text(),'USD')]")
	private WebElement USD ;
	//@FindBy(xpath = "//a[@href='https://phptravels.net/currency-INR'][contains(text(),' INR')]")
	@FindBy(xpath = " //*[@class='dropdown-item waves-effect'][text()=' INR']")
	private WebElement INR ;
	@FindBy(xpath="//button[@id='currency'][contains(text(),'INR')]")
	private WebElement inr ;
	
	@FindBy(xpath = "//*[@class='btn btn-primary dropdown-toggle waves-effect']")
	private WebElement lgaccount;
	@FindBy(xpath = "//a[@class='dropdown-item waves-effect' and @href='https://phptravels.net/account/dashboard']")
	private WebElement logout;


	public CurrencyUSD_INR(WebDriver driver)
	{
		BaseTest.driver=driver;
		PageFactory.initElements(driver,this);

	}

	public void clickUSD() {
				
		USD.click();

	}
	public String clickINR() {
		
		INR.click();
		String actual= inr.getText();	
		System.out.println("inr="+actual);
		return actual;

	}
	public void logout() {
		lgaccount.click();
		logout.click();
		
}
}

