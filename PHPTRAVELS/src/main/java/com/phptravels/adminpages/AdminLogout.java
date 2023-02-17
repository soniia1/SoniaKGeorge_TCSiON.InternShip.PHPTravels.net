package com.phptravels.adminpages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.base.BaseTest;

public class AdminLogout extends BaseTest
{
	
	@FindBy (xpath = "//button[@id='dropdownMenuProfile']")
	private WebElement person;
	@FindBy (xpath = "//*[text()='Logout']")
	private WebElement logout;
	@FindBy(xpath = ".//*[@type='submit']")
	private WebElement login;
	
	public AdminLogout(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	public void clickperson() {
		person.click();
	}
	public String clicklogout() {
		logout.click();
	   	return driver.getCurrentUrl();
	}
	

}
