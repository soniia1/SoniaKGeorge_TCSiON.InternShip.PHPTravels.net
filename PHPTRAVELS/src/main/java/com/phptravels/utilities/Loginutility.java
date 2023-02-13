package com.phptravels.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.phptravels.adminpages.AdminLoginPage;
import com.phptravels.agentpages.AgentLoginPage;
import com.phptravels.base.BaseTest;
import com.phptravels.customerpages.LoginPage;
import com.phptravels.supplierpages.SupplierLoginPage;

public class Loginutility extends BaseTest {

	public  static void customerlogin() throws IOException {
		LoginPage objLogin=new LoginPage(driver);
		String email=Excelutility.getCellData("login", 0, 0);
		String password=Excelutility.getCellData("login", 0, 1);
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	}
	public static void Agentlogin() throws IOException {
		AgentLoginPage objLogin=new AgentLoginPage(driver);
		String email=Excelutility.getCellData("aglogin", 0, 0);
		String password=Excelutility.getCellData("aglogin", 0, 1);
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	}
	public static void Adminlogin() throws IOException {
		AdminLoginPage objLogin=new AdminLoginPage(driver);
		String email=Excelutility.getCellData("adlogin", 0, 0);
		String password=Excelutility.getCellData("adlogin", 0, 1);
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	}
	public static void Supplierlogin() throws IOException {
		SupplierLoginPage objLogin=new SupplierLoginPage(driver);
		String email=Excelutility.getCellData("splogin", 0, 0);
		String password=Excelutility.getCellData("splogin", 0, 1);
		objLogin.setEmail(email);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
	}

}
