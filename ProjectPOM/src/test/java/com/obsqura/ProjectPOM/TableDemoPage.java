package com.obsqura.ProjectPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableDemoPage {
	public WebDriver driver;
	By tableColumnElements = By.xpath("//table[@id='dtBasicExample']//child::th[@class='th-sm sorting_disabled']");
	By tableRowElements = By.xpath("//table[@id='dtBasicExample']//child::tbody//tr");
	public TableDemoPage(WebDriver driver) {
		this.driver=driver;

	}
	public void rowAndColumnSize() {
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List columnElement = driver.findElements(tableColumnElements);
		int columnCount=columnElement.size();
		List rowElement= driver.findElements(tableRowElements);
		int rowCount=rowElement.size();
		
	}
}
