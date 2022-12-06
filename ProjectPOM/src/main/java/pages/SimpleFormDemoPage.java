package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.ExcelUtility;

public class SimpleFormDemoPage {
	public WebDriver driver;
	By enterMessageField = By.xpath("//input[@id='single-input-field']");
	By showMessageButton = By.xpath("//button[@id='button-one']");
	By yourMessageField = By.xpath("//div[@id='message-one']");
	By enterValueA = By.xpath("//input[@id='value-a']");
	By enterValueB = By.xpath("//input[@id='value-b']");
	By twoInputTitleField =By.xpath("(//div[@class='card']//child::div[@class='card-header'])[3]");
	By totValueButton=By.xpath("//button[@id='button-two']");
	By totalAPlusBField = By.xpath("//div[@id='message-two']");
		public SimpleFormDemoPage(WebDriver driver) {
			this.driver=driver;
	
	}
	
		public void verifySingleInputField() throws IOException {
			ExcelUtility excelUtilityObj = new ExcelUtility();
			String inputText = "Apple";
			String expectedMessage,actualMessage;
			driver.findElement(enterMessageField).sendKeys(inputText);
			WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
			driver.findElement(showMessageButton).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(yourMessageField));
			actualMessage = driver.findElement(yourMessageField).getText();
			expectedMessage = ExcelUtility.getStringMultiColor(1,0,"\\src\\main\\java\\Resources\\color.xlsx","Simple Form Demo");
			Assert.assertEquals(expectedMessage+inputText,actualMessage, "Expected and actual messages are not same");
		}
		
		public void verifyTwoInputField() throws IOException {
			ExcelUtility excelUtilityObj = new ExcelUtility();
			int aValue,bValue,getTotalValue;
			String valueA="25",valueB="50";
			String actualTitle = null,expectedMessage , actualMessage;
			WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
			driver.findElement(enterValueA).sendKeys(valueA);
			driver.findElement(enterValueB).sendKeys(valueB);
			aValue=Integer.valueOf(valueA);
			bValue=Integer.valueOf(valueB);
			driver.findElement(totValueButton).click();
			getTotalValue = aValue+bValue;
			wait.until(ExpectedConditions.presenceOfElementLocated(totalAPlusBField));
			actualMessage = driver.findElement(totalAPlusBField).getText();
			expectedMessage = ExcelUtility.getStringMultiColor(1,1,"\\src\\main\\java\\Resources\\color.xlsx","Simple Form Demo");
			Assert.assertEquals(expectedMessage+getTotalValue, actualMessage,"Actual and Expected Messages are not equal");
			
		}
}
