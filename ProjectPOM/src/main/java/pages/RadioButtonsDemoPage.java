package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utilities.ExcelUtility;

public class RadioButtonsDemoPage {
	public WebDriver driver;
	By radioButtonDemoHeader =By.xpath("(//div[@class='card-header'])[2]");
	By maleRadioButton = By.xpath("//input[@id='inlineRadio1']");
	By femaleRadioButton = By.xpath("//input[@id='inlineRadio2']");
	By showSelectedValueButton = By.xpath("//button[@id='button-one']");
	By actMessage = By.xpath("//div[@id='message-one']");
	public RadioButtonsDemoPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyMaleFemaleRadioButtonEnabledOrNot() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualMessage,expectedMessage;
		SoftAssert softAssert = new SoftAssert();
		Boolean maleIsEnabled,femaleIsEnabled,maleIsSelected,femaleIsSelected;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		maleIsEnabled = driver.findElement(maleRadioButton).isEnabled();
		femaleIsEnabled = driver.findElement(femaleRadioButton).isEnabled();
		maleIsSelected = driver.findElement(maleRadioButton).isSelected();
		femaleIsSelected = driver.findElement(femaleRadioButton).isSelected();
			if(maleIsEnabled && femaleIsEnabled) {
				if(maleIsSelected && femaleIsSelected) {
					driver.findElement(showSelectedValueButton).click();
					actualMessage = driver.findElement(actMessage).getText();
					expectedMessage = excelUtilityObj.getStringMultiColor(1, 0, "\\src\\main\\java\\Resources\\color.xlsx", "Radio Button Demo");
					Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Messages are not equal");
					
				}
				softAssert.assertFalse(maleIsSelected, "Male Radio Button is already selected");
				softAssert.assertFalse(femaleIsSelected, "Female Radio Button is already selected");
				softAssert.assertAll();
			}
			softAssert.assertTrue(maleIsEnabled, "Male Radio Button is not enabled");
			softAssert.assertTrue(femaleIsEnabled, "Female Radio Button is not enabled");
			softAssert.assertAll();
	}
	public void verifyMaleRadioButtonSelectedMessageCheck() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualMessage,expectedMessage;
		SoftAssert softAssert = new SoftAssert();
		Boolean maleIsSelected,femaleIsSelected;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		maleIsSelected = driver.findElement(maleRadioButton).isSelected();
		femaleIsSelected = driver.findElement(femaleRadioButton).isSelected();
				if(maleIsSelected && femaleIsSelected) {
					driver.findElement(maleRadioButton).click();
					driver.findElement(showSelectedValueButton).click();
					actualMessage = driver.findElement(actMessage).getText();
					expectedMessage = excelUtilityObj.getStringMultiColor(2, 0, "\\src\\main\\java\\Resources\\color.xlsx", "Radio Button Demo");
					Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Messages are not equal");
					
				}
				softAssert.assertFalse(maleIsSelected, "Male Radio Button is already selected");
				softAssert.assertFalse(femaleIsSelected, "Female Radio Button is already selected");
				softAssert.assertAll();
	}
	public void verifyFemaleRadioButtonSelectedMessageCheck() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualMessage,expectedMessage="";
		SoftAssert softAssert = new SoftAssert();
		Boolean maleIsSelected,femaleIsSelected;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		maleIsSelected = driver.findElement(maleRadioButton).isSelected();
		femaleIsSelected = driver.findElement(femaleRadioButton).isSelected();
				if(maleIsSelected && femaleIsSelected) {
					driver.findElement(femaleRadioButton).click();
					driver.findElement(showSelectedValueButton).click();
					actualMessage = driver.findElement(actMessage).getText();
					expectedMessage = excelUtilityObj.getStringMultiColor(3, 0, "\\src\\main\\java\\Resources\\color.xlsx", "Radio Button Demo");
					Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Messages are not equal");
					
				}
				softAssert.assertFalse(maleIsSelected, "Male Radio Button is already selected");
				softAssert.assertFalse(femaleIsSelected, "Female Radio Button is already selected");
				softAssert.assertAll();
	}
	

}