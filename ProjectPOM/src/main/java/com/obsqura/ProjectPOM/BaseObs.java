package com.obsqura.ProjectPOM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseObs {
	public WebDriver driver;
	@BeforeMethod
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   -depricated version before Selenium 4 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //modificated version after Selenium 4 
	}
	@AfterMethod
	public void driverClose() {
		driver.close();
	}
	

}
