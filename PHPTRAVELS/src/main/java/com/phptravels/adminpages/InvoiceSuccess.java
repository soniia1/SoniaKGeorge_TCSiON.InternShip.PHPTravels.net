package com.phptravels.adminpages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.base.BaseTest;

public class InvoiceSuccess extends BaseTest {
	@FindBy(linkText =  "Bookings")
	private WebElement Booking;	
	@FindBy(xpath = "//*[text()='Confrimed Bookings']")
	private WebElement confirmedbooking;
	@FindBy(xpath = "//*[contains(text(),'Confrimed Bookings')]//preceding::div[1]")
	private WebElement confirmbookCount;
	@FindBy(xpath="//*[@id=\"data\"]/tbody/tr[1]/td[14]/a")
	private WebElement Invoice;
	@FindBy(xpath="//button[@id='download']")
	private WebElement download;
	@FindBy(xpath="//*[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	
	public InvoiceSuccess(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	public void clickBooking() {
		Booking.click();
		driver.switchTo().alert().accept();
	}
	public int confirmBookCount() {
		
		String confirmBookCount=confirmbookCount.getText();
		int confirmBookingCountInt=Integer.parseInt(confirmBookCount);
		
		if(confirmBookingCountInt>0) {
			confirmedbooking.click();
		}
		else {
			System.out.println("No Suuceessful Bookings");
			driver.navigate().back();
			
		}
		
		return confirmBookingCountInt;
	}
	public boolean clickInvoice() throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(Invoice);
		Invoice.sendKeys(Keys.ENTER);
		System.out.println("invoice");
		//driver.switchTo().alert().accept();
		boolean actual = false;
		String mainWindow=driver.getWindowHandle();
		Set<String> s1= driver.getWindowHandles();
		Iterator<String>windows=s1.iterator();
		
		while(windows.hasNext()) {
			String childWindow=windows.next();
			
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));      
//				Alert alert = wait.until(ExpectedConditions.alertIsPresent());    
//				System.out.println("a="+alert);
//				alert.accept();
				actual=download.isDisplayed();
				Thread.sleep(2000);
		        driver.close();
		        System.out.println("child");
				
            }
		}
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(2000);
		System.out.println("main");
		dashboard.click();
		return actual;
	}

}
