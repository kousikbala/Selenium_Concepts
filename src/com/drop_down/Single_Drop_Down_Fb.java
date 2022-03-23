package com.drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Single_Drop_Down_Fb {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.facebook.com/");
	
	WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	
	Thread.sleep(5000);
	
	WebElement day = driver.findElement (By.xpath("//select[@aria-label='Day']"));
	Select a = new Select(day);
	a.selectByValue("24");
	
	Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select b = new Select(month);
	b.selectByVisibleText("Mar");
	
	
	WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select c = new Select(year);
	//c.selectByValue("1995");
	c.selectByIndex(5);
	
	
		
   List<WebElement> options = c.getOptions();
   
   for (WebElement i : options) {
	   
	   System.out.println(i.getText());
   } 
	
	
   
   
	
   }
}


