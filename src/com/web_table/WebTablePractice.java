package com.web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> findElements = driver.findElements(By.tagName("th"));
		
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
			
			
			
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
        List<WebElement> findElements1 = driver.findElements(By.tagName("td"));
		
		for (WebElement webElement1 : findElements1) {
			System.out.println(webElement1.getText());
			
		}
		
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
		
        List<WebElement> findElements11 = driver.findElements(By.tagName("tr"));
		
		for (WebElement webElement1 : findElements11) {
			System.out.println(webElement1.getText());
			
	}
		
		 System.out.println("-----------------------------------------------------------------------------------------------------------------");
			
			
	        List<WebElement> findElements111 = driver.findElements(By.tagName("tc"));
			
			for (WebElement webElement1 : findElements111) {
				System.out.println(webElement1.getText());
	}

	}
}
