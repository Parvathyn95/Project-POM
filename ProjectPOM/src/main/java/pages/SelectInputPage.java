package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.ExcelUtility;

public class SelectInputPage {
	public ExcelUtility excelUtilityObj;
	public WebDriver driver;
	By selectInputField = By.xpath("//select[@id='single-input-field']");
	By actMessage = By.xpath("//div[@id='message-one']");
	By multipleInputField = By.xpath("//select[@id='multi-select-field']");
	By getFirstSelectedButton = By.xpath("//button[@id='button-first']");
	By getAllSelectedButton = By.xpath("//button[@id='button-all']");
	By multipleActualMessage = By.xpath("//div[@id='message-two']");
	public SelectInputPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifySelectSingleInputColor() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String inputColor,expectedMessage,actualMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select inputSelect = new Select(driver.findElement(selectInputField));
		inputColor=excelUtilityObj.getStringMultiColor(1,0,"\\src\\main\\java\\Resources\\color.xlsx","Select Input");
		inputSelect.selectByVisibleText(inputColor);
		actualMessage = driver.findElement(actMessage).getText();
		expectedMessage = excelUtilityObj.getStringMultiColor(1,1,"\\src\\main\\java\\Resources\\color.xlsx","Select Input");
		Assert.assertEquals(expectedMessage+inputColor, actualMessage);
		
	}
	public void verifySelectMultipleInputColor() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualMessage,expectedMessage,color1,color2,color3;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select multipleSelect = new Select(driver.findElement(multipleInputField));
		multipleSelect.isMultiple();
		multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(1,0,"\\src\\main\\java\\Resources\\color.xlsx","Select Input"));
		multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(2,0,"\\src\\main\\java\\Resources\\color.xlsx","Select Input"));
		multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(3,0,"\\src\\main\\java\\Resources\\color.xlsx","Select Input"));
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(getAllSelectedButton));
		driver.findElement(getAllSelectedButton).click();
		actualMessage = driver.findElement(multipleActualMessage).getText();
		expectedMessage = excelUtilityObj.getStringMultiColor(2,1,"\\src\\main\\java\\Resources\\color.xlsx","Select Input");
		List<WebElement> multipleColor =  multipleSelect.getOptions();
		color1=multipleColor.get(0).getText();
		color2=multipleColor.get(1).getText();
		color3=multipleColor.get(2).getText();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getAllSelectedButton));
		Assert.assertEquals(expectedMessage+color3, actualMessage);		
	}
}
