package com.obsqura.ProjectPOM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.SimpleFormDemoPage;

public class SimpleFormDemoTest extends BaseObs {
	SimpleFormDemoPage simpleFormDemoPageObj;  //variable given globally
	@Test
	public void enterMessageAndVerifySingleInputField() {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifySingleInputField();
	}
	@Test
	public void enterMessageAndVerifyTwoInputField() {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifyTwoInputField();
	}
}
