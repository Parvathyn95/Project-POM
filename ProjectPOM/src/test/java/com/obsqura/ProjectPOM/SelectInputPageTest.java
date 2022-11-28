package com.obsqura.ProjectPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.SelectInputPage;

public class SelectInputPageTest extends BaseObs{
	SelectInputPage selectInputPageObj;
	@Test
	public void selectColorAndVerifySelectSingleInputColor() throws IOException {
		SelectInputPage selectInputPageObj = new SelectInputPage(driver);
		selectInputPageObj.verifySelectSingleInputColor();
	}
	@Test
	public void selectColorAndVerifySelectMultipleInputColor() throws IOException {
		SelectInputPage selectInputPageObj = new SelectInputPage(driver);
		selectInputPageObj.verifySelectMultipleInputColor();
	}
}