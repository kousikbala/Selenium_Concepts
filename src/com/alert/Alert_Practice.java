 package com.alert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Practice {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alertbox.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirmbox.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		WebElement promtbox = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		promtbox.click();
//		Thread.sleep(5000);
//		promtbox.clear(); 
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("this is bala");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destin = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenShot\\pic4.png");
		FileUtils.copyFile(source, destin);
		
		
		
		
		
	}

}
