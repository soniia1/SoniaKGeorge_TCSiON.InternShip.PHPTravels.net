package com.phptravels.agentscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.agentpages.AgentLoginPage;
import com.phptravels.base.BaseTest;
import com.phptravels.utilities.DP;
import com.phptravels.utilities.Excelutility;
import com.phptravels.utilities.Logoututility;

public class AgentLoginTest extends BaseTest {
	
	AgentLoginPage objLogin;
	@BeforeMethod
	public void loginObject() {
		objLogin=new AgentLoginPage(driver);
	}
	@Test(priority=1,dataProvider = "logintestdata",dataProviderClass = DP.class)
	public void verifyInvalidLogin2(String email, String password) throws IOException {
		
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60)); 
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password' and @placeholder='Password']"))).isDisplayed());			
	}
//	@Test(priority=2)
//	public void verifyInvalidLogin() throws IOException {
//		String email=Excelutility.getCellData("aglogin", 1, 0);
//		String password=Excelutility.getCellData("aglogin", 1, 1);
//		objLogin.setEmail(email);
//		objLogin.setPassword(password);
//		objLogin.clickLogin();
//		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password' and @placeholder='Password']"))).isDisplayed());		
//	}
	@Test(priority=2)
	public void verifyValidLogin() throws IOException {
		
		String email=Excelutility.getCellData("aglogin", 0, 0);
		String password=Excelutility.getCellData("aglogin", 0, 1);
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=' waves-effect'][text()=' My Bookings']"))).isDisplayed());
		Logoututility.caLogout();
	}



}
