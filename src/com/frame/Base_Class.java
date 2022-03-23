package com.frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {
	public static WebDriver driver;  // ---->null

	
	
	//browser_selection
	public static WebDriver browser_configuration(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			
		} else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver","value");
			
			driver= new FirefoxDriver();

		}
		
		  driver.manage().window().maximize();
		
		  return driver;
		
	}
	
	public static void frames(WebElement element ) {
		
		driver.switchTo().frame(element);

	}

}
