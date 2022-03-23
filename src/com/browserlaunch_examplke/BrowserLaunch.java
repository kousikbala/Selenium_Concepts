package com.browserlaunch_examplke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    
	    String a = driver.getTitle();
	    System.out.println(a);
	    
	    String b = driver.getCurrentUrl();
	    System.out.println(b);
	    
	    driver.navigate().to("https://www.instagram.com/");
	    
	    driver.navigate().back();
	    
	    Thread.sleep(5000);
	    
	    driver.close();
	    	
		
		
	
	}

}
