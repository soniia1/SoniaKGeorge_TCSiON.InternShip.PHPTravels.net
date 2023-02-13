package com.phptravels.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop=null;
	public static void BaseTest() {
		
		
		try {
			prop=new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties"+"/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		@BeforeSuite
		public void onSetup() {
			
			BaseTest();
			
			String browserName=prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				driver=new ChromeDriver();
			}
			else if(browserName.equals("firefox")){
				driver=new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
			
		public void CustomerAgentUrl() 
			{
			
			driver.get(prop.getProperty("url1"));
			driver.manage().window().maximize();
			}
	    public void adminUrl()
			{
				driver.get(prop.getProperty("url2"));
				driver.manage().window().maximize();
			}
		public void supplierUrl()
			{
				driver.get(prop.getProperty("url3"));
				driver.manage().window().maximize();
			}
		@AfterSuite
		public void tearDown() {
			driver.quit();
			
		}
			
		}
		
		
		
	
		
	


