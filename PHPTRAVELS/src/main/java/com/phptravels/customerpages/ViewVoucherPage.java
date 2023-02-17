package com.phptravels.customerpages;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.phptravels.base.BaseTest;
public class ViewVoucherPage extends BaseTest {
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' My Bookings']")
	private WebElement booking;
	@FindBy(xpath = ".//*[text()=' View Voucher']")
	private WebElement viewvoucher;
	@FindBy(xpath = "//button[@id='download']")
	private WebElement download;
	
	public ViewVoucherPage(WebDriver driver) {
		BaseTest.driver=driver;
		PageFactory.initElements(driver, this);
		CustomerAgentUrl();
	}
	public void clickBookings() { 	
    	booking.click();
	}
   public boolean clickViewVoucher() {
	   	boolean actual = false;
    	viewvoucher.click();
   
		String mainWindow=driver.getWindowHandle();
	
		Set<String> s1= driver.getWindowHandles();
		Iterator<String>windows=s1.iterator();
		
		while(windows.hasNext()) {
			
			String childWindow=windows.next();
	
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				  
				driver.switchTo().window(childWindow);
				System.out.println(driver.getCurrentUrl());
				actual=download.isDisplayed();
	    		driver.close();	
            }
		}
	
		driver.switchTo().window(mainWindow);
		return actual;
	}
  

}
