package com.phptravels.agentpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.base.BaseTest;

public class NavLinksPage extends BaseTest {
	
	@FindBy(xpath =  "//*[text()='flights']")
	private WebElement flight;
	@FindBy(xpath = ".//*[text()='Hotels']")
	private WebElement hotel;
	@FindBy (xpath = ".//*[text()='visa']")
	private WebElement visa;
	@FindBy (xpath = "//*[text()='Tours']")
	private WebElement Tour;
	@FindBy(xpath = "//*[text()='Blog']")
	private WebElement Blog;
	@FindBy (xpath = "//*[text()='Offers']")
	private WebElement Offers;
	//@FindBy(xpath = "//span[@id='select2-from_country-container']")
	@FindBy(xpath="//button[@id='flights-search']")
	private WebElement affrom ;
	@FindBy(xpath = "//span[@id='select2-hotels_city-container']")
	private WebElement ahcity ;
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement avsubmit ;
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement atsearch ;
	@FindBy(xpath = "//button[@id='loadMore']")
	private WebElement abviewmore ;
	@FindBy(xpath = ".//*[text()='PHPTRAVELS Offers']")
	private WebElement aotext ;
	
	
	public NavLinksPage(WebDriver driver)
	{
		 BaseTest.driver=driver;
		 PageFactory.initElements(driver,this);
		 CustomerAgentUrl();
	}
	
	public boolean clickFlight() {
		flight.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(affrom));
		boolean actual1=affrom.isDisplayed();
		return actual1;
		
	}
    public boolean clickHotel() {
    	hotel.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ahcity));
    	boolean actual2=ahcity.isDisplayed();
		return actual2;
		
	}
    public boolean clickVisa() {
    	visa.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(avsubmit));
    	boolean actual3=avsubmit.isDisplayed();
		return actual3;
		
	}
    public boolean clickTour() {
    	Tour.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(atsearch));
    	boolean actual4=atsearch.isDisplayed();
		return actual4;
		
	}
    public boolean clickBlog() {
    	Blog.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(abviewmore));
    	boolean actual5=abviewmore.isDisplayed();
		return actual5;
		
	}
    public boolean clickOffers() {
    	Offers.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(aotext));
    	boolean actual6=aotext.isDisplayed();
		return actual6;
		
	}
	
}



