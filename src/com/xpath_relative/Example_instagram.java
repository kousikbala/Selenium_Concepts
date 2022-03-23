package com.xpath_relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_instagram {
	
  public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver insta = new ChromeDriver();
		insta.manage().window().maximize();
		
		
		insta.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		
		WebElement email = insta.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[1]/div/label/input"));
		email.sendKeys("kousik.bala06@gmail.com");
		
		
		WebElement pass = insta.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[2]/div/label/input"));
		pass.sendKeys("fbvjhaf234");
		
		
		WebElement login = insta.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[1]/div/label/input"));
		login.click();
		
		
		
		
		
	}

}
