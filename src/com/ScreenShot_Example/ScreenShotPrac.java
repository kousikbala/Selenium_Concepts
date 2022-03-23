    package com.ScreenShot_Example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotPrac {
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions Inc = new ChromeOptions();
		Inc.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(Inc);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sorce = ts.getScreenshotAs(OutputType.FILE);
		File destin = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenShot\\pic1.png");
		
	     FileUtils.copyFile(sorce, destin);
		
		
		
	}

}
