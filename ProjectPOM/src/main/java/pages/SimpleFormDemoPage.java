package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SimpleFormDemoPage {
	public WebDriver driver;
	By enterMessageField = By.xpath("//input[@id='single-input-field']");
	By showMessageButton = By.xpath("//button[@id='button-one']");
	By yourMessageField = By.xpath("//div[@id='message-one']");
	By enterValueA = By.xpath("//input[@id='value-a']");
	By enterValueB = By.xpath("//input[@id='value-b']");
	By totValueButton=By.xpath("//button[@id='button-two']");
	By totalAPlusBField = By.xpath("//div[@id='message-two']");
		public SimpleFormDemoPage(WebDriver driver) {
			this.driver=driver;
	
	}
	
		public void verifySingleInputField() {
			String inputText = "Apple";
			String expectedMessage = "Your Message : "+inputText,actualMessage;
			driver.findElement(enterMessageField).sendKeys(inputText);
			driver.findElement(showMessageButton).click();
			actualMessage = driver.findElement(yourMessageField).getText();
			Assert.assertEquals(expectedMessage,actualMessage, "Expected and actual messages are not same");
		}
		
		public void verifyTwoInputField() {
			int aValue,bValue,getTotalValue;
			String valueA="25",valueB="50";
			String expectedMessage , actualMessage;
			driver.findElement(enterValueA).sendKeys(valueA);
			driver.findElement(enterValueB).sendKeys(valueB);
			aValue=Integer.valueOf(valueA);
			bValue=Integer.valueOf(valueB);
			driver.findElement(totValueButton).click();
			getTotalValue = aValue+bValue;
			expectedMessage = "Total A + B : "+getTotalValue;
			actualMessage = driver.findElement(totalAPlusBField).getText();
			Assert.assertEquals(expectedMessage, actualMessage,"Actual and Expected Messages are not equal");
			
		}
}
