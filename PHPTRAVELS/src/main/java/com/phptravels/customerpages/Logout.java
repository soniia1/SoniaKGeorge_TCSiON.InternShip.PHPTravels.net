package com.phptravels.customerpages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.phptravels.base.BaseTest;

public class Logout extends BaseTest {
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' Logout'] ")
	private WebElement logout;
	@FindBy (xpath = "//span[text()='Login']")
	private WebElement login;
	
	public Logout(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	
	public String clickLogout() {
      	
	   	logout.click();
	   	return driver.getCurrentUrl();
	    }

}
