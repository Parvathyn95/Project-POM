package com.obsqura.ProjectPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ActionsDemoPage;
import pages.SideNavigationMenuSelect;
import pages.SimpleFormDemoPage;

public class ActionsDemoPageTest extends BaseObs{
	ActionsDemoPage othersDemoPageObj;
	SideNavigationMenuSelect sideNavigationMenuSelectObj;
	@Test
	public void checkAndVerifyDragAndDrop() throws IOException {
		othersDemoPageObj = new ActionsDemoPage(driver);
		othersDemoPageObj.verifyAndDoubleClickDragAndDrop();
	}
	@Test
	public void checkAndVerifyAndClickDynamicDataLoadingOption() {
		othersDemoPageObj = new ActionsDemoPage(driver);
		othersDemoPageObj.verifyAndClickDynamicDataLoadingOption();
	}
	@Test
	public void checkAndVerifyAndClickChartDemo() throws IOException {
		othersDemoPageObj = new ActionsDemoPage(driver);
		othersDemoPageObj.verifyAndClickChartDemo();
	}
	@Test
	public void checkAndVerifyAndHoverChartDemo() throws IOException {
		othersDemoPageObj = new ActionsDemoPage(driver);
		othersDemoPageObj.verifyAndHoverChartDemo();
	}

	
}
