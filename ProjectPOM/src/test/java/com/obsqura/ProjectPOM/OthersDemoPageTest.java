package com.obsqura.ProjectPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.OthersDemoPage;
import pages.SimpleFormDemoPage;

public class OthersDemoPageTest extends BaseObs{
	OthersDemoPage othersDemoPageObj;
	@Test
	public void checkAndVerifyDragAndDrop() throws IOException {
		othersDemoPageObj = new OthersDemoPage(driver);
		othersDemoPageObj.verifyAndDoubleClickDragAndDrop();
	}
	@Test
	public void checkAndVerifyAndClickDynamicDataLoadingOption() {
		othersDemoPageObj = new OthersDemoPage(driver);
		othersDemoPageObj.verifyAndClickDynamicDataLoadingOption();
	}
	@Test
	public void checkAndVerifyAndClickChartDemo() throws IOException {
		othersDemoPageObj = new OthersDemoPage(driver);
		othersDemoPageObj.verifyAndClickChartDemo();
	}
	@Test
	public void checkAndVerifyAndHoverChartDemo() throws IOException {
		othersDemoPageObj = new OthersDemoPage(driver);
		othersDemoPageObj.verifyAndHoverChartDemo();
	}

	
}
