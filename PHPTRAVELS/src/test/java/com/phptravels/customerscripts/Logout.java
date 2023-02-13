package com.phptravels.customerscripts;



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
		 CustomerAgentUrl();
	}
	
	public String clickLogout() {
      	
	   	logout.click();
//	   	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//    	wait.until(ExpectedConditions.visibilityOf(login));
    	//boolean actual4=login.isDisplayed();
	   	return driver.getCurrentUrl();
	    }

}
