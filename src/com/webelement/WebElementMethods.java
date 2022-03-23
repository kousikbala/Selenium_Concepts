package com.webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebElementMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("kousik.balamech@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("kousibala789");
		
		WebElement login = driver.findElement(By.name("login"));
	//	login.click();
		
		boolean a = email.isDisplayed();
		System.out.println(a);
		
        boolean b = pass.isEnabled();
        System.out.println(b);
        
        boolean c = login.isSelected();
        System.out.println(c);
        
        email.clear();
        
        Thread.sleep(5000);
        
        pass.clear();
        
        
        
   
			
		
                               Dimension size = email.getSize();
                                System.out.println(size);
                        
                              String tagName = email.getTagName();
                              System.out.println(tagName);
                         
                               Point location = email.getLocation();
                             System.out.println(location);
                          
          
          
	}
}
