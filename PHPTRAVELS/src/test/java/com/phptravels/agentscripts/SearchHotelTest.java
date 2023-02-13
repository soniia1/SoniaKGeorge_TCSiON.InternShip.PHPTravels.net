package com.phptravels.agentscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.agentpages.NavLinksPage;
import com.phptravels.agentpages.SearchHotelPage;
import com.phptravels.base.BaseTest;
import com.phptravels.utilities.Excelutility;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class SearchHotelTest extends BaseTest {
	
	@BeforeMethod
	public void Login() throws IOException {
	     Loginutility.Agentlogin();
		//Loginutility.customerlogin();	
		
	}
							
	@Test
	public void searchHotel() throws IOException {
		SearchHotelPage objHotel=new SearchHotelPage(driver);
		String cityname=Excelutility.getCellData("cityname", 0, 0);
		objHotel.clickHotel();
		objHotel.clickName();
		objHotel.setName(cityname);
		boolean actual=objHotel.clickSearch();
		System.out.println(actual);
     	assertTrue(actual);
     	objHotel.logout();
		
	}
	@AfterMethod
	public void logout() {
		Logoututility.caLogout();
	}

	

}
