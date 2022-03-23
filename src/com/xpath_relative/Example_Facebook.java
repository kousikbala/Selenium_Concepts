package com.xpath_relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type = 'text']"));
		email.sendKeys("kousik.bala06@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
		pass.sendKeys("qwert098");
		
		WebElement login = driver.findElement(By.xpath("//button[@value = '1']"));
		login.click();
		
		
		
		
	}

}
