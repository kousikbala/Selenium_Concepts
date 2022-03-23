package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions (driver);
		
		WebElement moblies = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.moveToElement(moblies).build().perform();
		a.click(moblies).build().perform();
				
		
		//driver.navigate().to("http://www.leafground.com/pages/drop.html");
	//	WebElement source = driver.findElement(By.id("draggable"));
	//	WebElement target = driver.findElement(By.id("droppable"));
	//	a.dragAndDrop(source, target).build().perform();
		
		
		
	}

}
