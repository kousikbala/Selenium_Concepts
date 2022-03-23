package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Practice extends Base_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement singleframe = driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		//WebElement singleframe = driver.findElement(By.xpath(" //iframe[@src='SingleFrame.html'][1]"));
	//	driver.switchTo().frame(singleframe);
		frames(singleframe);
		
		WebElement input = driver.findElement(By.xpath(" //input[@type='text'][1]"));
		input.sendKeys("hello i am java");
		driver.switchTo().defaultContent();
		
		
		WebElement nextframe = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		nextframe.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		//driver.switchTo().frame(outerframe);
		frames(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		//driver.switchTo().frame(innerframe);
		frames(innerframe);
		
		WebElement input2 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		input2.sendKeys("selenium");
		driver.switchTo().defaultContent();
	
		
	}

}
