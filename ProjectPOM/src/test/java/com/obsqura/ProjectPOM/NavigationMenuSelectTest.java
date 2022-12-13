package com.obsqura.ProjectPOM;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.NavigationMenuSelect;

public class NavigationMenuSelectTest extends BaseObs {
	NavigationMenuSelect navigationMenuSelectObj;
	
	@Test
	@Parameters("expectedString")
	public void checkNavigationMenuClick(String expectedString){
		navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick(expectedString);
	}

}
