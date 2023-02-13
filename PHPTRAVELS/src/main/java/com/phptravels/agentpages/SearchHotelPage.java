package com.phptravels.agentpages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.base.BaseTest;

public class SearchHotelPage extends BaseTest {
	
	@FindBy(xpath = ".//*[text()='Hotels']")
	private WebElement hotel ;
	@FindBy(xpath="//*[@id='select2-hotels_city-container' and @role='textbox']")
	private WebElement searchcityname ;
	@FindBy(xpath = "//*[@id=\"fadein\"]/span/span/span[1]/input")
	private WebElement keyword;
//	@FindBy(xpath="//*[@id='select2-hotels_city-results']/li")
//	private WebElement cityname ;
	@FindBy(xpath = "//li[text()='Dubai,United Arab Emirates']")
	private WebElement cityname;
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement search ;
	@FindBy(xpath = "//button[@type='button'][text()='Modify Search']")
	private WebElement amodifysearch ;
	@FindBy(xpath = "//*[@class='btn btn-primary dropdown-toggle waves-effect']")
	private WebElement lgaccount;
	@FindBy(xpath = "//a[@class='dropdown-item waves-effect' and @href='https://phptravels.net/account/dashboard']")
	private WebElement logout;
	
	public SearchHotelPage(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 CustomerAgentUrl();
	}
	public void clickHotel() {
		hotel.click();
		
	}
	public void clickName() {

		Actions act=new Actions(driver);
		act.moveToElement(searchcityname);
		searchcityname.click();    

	}
	public void setName(String strNname) {
		keyword.sendKeys(strNname);
		cityname.click();	
	}
	public boolean clickSearch() {
		search.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(amodifysearch));
		boolean actual = amodifysearch.isDisplayed();
		return actual;

	}
	public void logout() {
		lgaccount.click();
		logout.click();
		
	}
	
}
