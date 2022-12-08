package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OthersDemoPage{
	public WebDriver driver;
	By dragAndDropOption = By.xpath("//li[@class='list-group-item']//child::a[@href='drag-drop.php']");
	By DynamicDataLoadingOption = By.xpath("//li[@class='list-group-item']//child::a[@href='dynamic-load.php']");
	By chartDemoOption  = By.xpath("//li[@class='list-group-item']//child::a[@href='chart.php']");
	public OthersDemoPage(WebDriver driver) {
		this.driver=driver;

	}
	public void verifyAndDoubleClickDragAndDrop() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(dragAndDropOption);
		action.doubleClick(element).perform();
	}
	public void verifyAndClickDynamicDataLoadingOption() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(DynamicDataLoadingOption);
		action.contextClick(element).perform();
	}
	public void verifyAndClickChartDemo() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(chartDemoOption);
		action.click(element).perform();
	}
}
