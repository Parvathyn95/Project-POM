package com.obsqura.ProjectPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.SimpleFormDemoPage;

public class SimpleFormDemoTest extends BaseObs {
	SimpleFormDemoPage simpleFormDemoPageObj;  //variable given globally
	@Test
	public void enterMessageAndVerifySingleInputField() throws IOException {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifySingleInputField();
	}
	@Test
	public void enterMessageAndVerifyTwoInputField() throws IOException {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifyTwoInputField();
	}
}
