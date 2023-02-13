package com.phptravels.supplierscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.BaseTest;
import com.phptravels.supplierpages.SupplierLoginPage;
import com.phptravels.utilities.DP;
import com.phptravels.utilities.Excelutility;

public class SupplierLoginTest extends BaseTest {
	
	SupplierLoginPage objLogin;
	@BeforeMethod
		public void loginObject() {
			objLogin=new SupplierLoginPage(driver);
		}
	
	@Test(priority=0,dataProvider = "logintestdata",dataProviderClass = DP.class)
	public void verifyInvalidLogin2(String email, String password) throws IOException {
		
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password' and @type='password']"))).isDisplayed());
		
	}
		
		@Test(priority=2)
		public void verifyValidLogin() throws IOException {
			
			String email=Excelutility.getCellData("splogin", 0, 0);
			String password=Excelutility.getCellData("splogin", 0, 1);
			objLogin.setEmail(email);
			objLogin.setPassword(password);
			objLogin.clickLogin();
			
			
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Website']"))).isDisplayed());
		}

}
