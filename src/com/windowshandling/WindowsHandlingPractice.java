package com.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingPractice {
	
	public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
				   

			WebDriver driver = new ChromeDriver();
			
					driver.manage().window().maximize();
					
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
					driver.get("https://www.amazon.in/");
					
					
					WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));		
					
					Actions a = new  Actions(driver);
					a.moveToElement(mob).build().perform();
					a.contextClick(mob).build().perform();
					
					Robot b = new Robot();
					b.keyPress(KeyEvent.VK_DOWN);
					b.keyRelease(KeyEvent.VK_DOWN);
					
					b.keyPress(KeyEvent.VK_ENTER);
					b.keyRelease(KeyEvent.VK_ENTER);
					
					
		             WebElement elec = driver.findElement(By.xpath("//a[text()=' Electronics ']"));		
					
					a.moveToElement(elec).build().perform();
					a.contextClick(elec).build().perform();
					
					
					b.keyPress(KeyEvent.VK_DOWN);
					b.keyRelease(KeyEvent.VK_DOWN);
					
					b.keyPress(KeyEvent.VK_ENTER);
					b.keyRelease(KeyEvent.VK_ENTER);
					
					Set<String> ids = driver.getWindowHandles();
					
					for (String id : ids) {
						System.out.println(driver.switchTo().window(id).getTitle());
						
						
					}
					for (String id : ids) {
						if (driver.switchTo().window(id).getTitle().equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in")) {
							continue;
						} else {
							driver.close();
							
		
//						}
//					}
					
//						Iterator<String> id = ids.iterator();
//						String home = id.next();
//						String elect = id.next();
//						String mobile = id.next();
//						
//						driver.switchTo().window(elect);
						
					
						
					}
					}
	}
}
					
					
					
					
					
					
					
					
		


						
						
						
					
		
		
	


