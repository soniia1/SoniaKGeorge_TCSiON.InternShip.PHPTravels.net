package com.phptravels.adminpages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.base.BaseTest;

public class WebsiteLinkPage extends BaseTest {
	@FindBy(xpath = "//*[text()='Website']")
	private WebElement website;
	
	
	public WebsiteLinkPage(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	public String clickWebsie() 
	{
		
		website.click();
		String actual = null;
		
		String mainWindow=driver.getWindowHandle();
	
		Set<String> s1= driver.getWindowHandles();
		Iterator<String>windows=s1.iterator();
		
		while(windows.hasNext()) {
			String childWindow=windows.next();
			
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
			
				System.out.println("child");
				System.out.println(childWindow);
				driver.switchTo().window(childWindow);
				actual=driver.getCurrentUrl();
				driver.close();	
            }
		}
		driver.switchTo().window(mainWindow);
		return actual;
	}
	
	}
	


