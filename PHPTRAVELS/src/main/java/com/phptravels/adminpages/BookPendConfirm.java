package com.phptravels.adminpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.phptravels.base.BaseTest;

public class BookPendConfirm extends BaseTest {
	
	@FindBy(xpath = "//*[text()='Pending Bookings']")
	private WebElement pendbook ;
	@FindBy(xpath = "//*[@id='booking_status'] ")
	private WebElement pending ;
	@FindBy(xpath=" //*[text()='Pending Bookings']//preceding::div[1]")
	private WebElement pendcount ;
	@FindBy(xpath="//*[text()='Confrimed Bookings']//preceding::div[1]")
	private WebElement confirmcount;
	//@FindBy(xpath="//*[text()='Dashboard']")
	@FindBy(xpath="//*[text()='Dashboard']//parent::a")
	private WebElement dashboard;
	
	int confirmCounExp,pCountExp,confirmCountAct,pCountAct,PCountNow;
	boolean actual;
	public BookPendConfirm(WebDriver driver)
	{
		BaseTest.driver=driver;
		PageFactory.initElements(driver,this);
		 
	}
	public int dashBoardCount() {
		
		String confirmCount=confirmcount.getText();
		
		 int confirmCountNow=Integer.parseInt(confirmCount);
		 confirmCounExp=confirmCountNow+1;
		 
		String pendCount=pendcount.getText();;
		int pCountNow=Integer.parseInt(pendCount);
		
		if(pCountNow>0) {
		 pCountExp=pCountNow-1;
		}
		else {
		 System.out.println("No Record in the Pending Booking");
		}
		return pCountNow;
	}
	public void clickPendBook() {
	
			pendbook.click();
			driver.switchTo().alert().accept();
		
	}
	
	
	public void clickConfirm() {
		
		Select sel=new Select(pending);
		sel.selectByVisibleText("Confirmed");
		//driver.switchTo().alert().accept();
		
	}
	public boolean clickDashBoard() {

		driver.navigate().back();
		
		String confirmCount=confirmcount.getText();
		confirmCountAct=Integer.parseInt(confirmCount);
	
		
		String pendCount=pendcount.getText();
		pCountAct=Integer.parseInt(pendCount);
	
		
		if((confirmCounExp==confirmCountAct) && (pCountExp==pCountAct )) {
		   actual=true;
		}
		else {
			actual=false;
			
		}
			return actual;
		
		
	}


}
