package com.obsqura.ProjectPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.RadioButtonsDemoPage;

public class RadioButtonsDemoTest extends BaseObs {
	RadioButtonsDemoPage radioButtonsDemoPageObj;
	@Test
	public void noClickAndVerifyMaleFemaleRadioButtonEnabledOrNot() throws IOException {
		RadioButtonsDemoPage radioButtonsDemoPageObj = new RadioButtonsDemoPage(driver);
		radioButtonsDemoPageObj.verifyMaleFemaleRadioButtonEnabledOrNot();
	}
	@Test//(enabled=false)
	public void clickAndVerifyMaleRadioButtonSelectedMessageCheck() throws IOException {
		RadioButtonsDemoPage radioButtonsDemoPageObj = new RadioButtonsDemoPage(driver);
		radioButtonsDemoPageObj.verifyMaleRadioButtonSelectedMessageCheck();
	}
	@Test
	public void clickAndVerifyFemaleRadioButtonSelectedMessageCheck() throws IOException {
		RadioButtonsDemoPage radioButtonsDemoPageObj = new RadioButtonsDemoPage(driver);
		radioButtonsDemoPageObj.verifyFemaleRadioButtonSelectedMessageCheck();
	}

}
