package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelUtility;

public class RowAndColumnCount {
	public WebDriver driver;
	By columnElementsList = By.xpath("//table[@id='dtBasicExample']//child::th[@class='th-sm sorting_disabled']");
	By rowElementsList = By.xpath("//table[@id='dtBasicExample']//child::tbody//tr");
	public RowAndColumnCount(WebDriver driver) {
		this.driver=driver;
	}
		public void countColumnSize() {
			List <WebElement> columnElement = driver.findElements(columnElementsList);
			int columnCount=columnElement.size();
			for(WebElement column: columnElement) {
				System.out.println(column.getText());
			}
		}
		public void countRowSize() throws IOException {
			String expectedField;
			ExcelUtility excelUtilityObj = new ExcelUtility();
			expectedField = excelUtilityObj.getStringMultiColor(1, 0, "\\src\\main\\java\\Resources\\color.xlsx", "RowColumnTable");
			List  <WebElement> rowElement= driver.findElements(rowElementsList);
			int rowCount=rowElement.size();
			for(WebElement row : rowElement) {
				if(row.getText().equals(expectedField)) {
					String actualField = row.getText();
					Assert.assertEquals(expectedField, actualField);
					break;
				}
			}
		}
	}

	
