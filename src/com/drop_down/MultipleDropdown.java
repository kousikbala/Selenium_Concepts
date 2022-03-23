package com.drop_down;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver multy = new ChromeDriver();
		
		multy.manage().window().maximize();
		
		multy.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement multydrop = multy.findElement(By.xpath("(//select)[6]"));
		Select a = new Select(multydrop);
		
		a.selectByValue("1");
		a.selectByVisibleText("Loadrunner");
		a.selectByValue("2");
		
		Thread.sleep(3000);
		
		a.deselectByValue("2");
		
		boolean b = a.isMultiple();
		System.out.println(b);
		
		List<WebElement> subash = a.getAllSelectedOptions();
		
//		for (int i = 0; i < options.size(); i++) {
//			
//			System.out.println(options.get(i).getText());
//			
//		}
		for (WebElement heman : subash) {
		
		System.out.println(heman.getText());
					
		}
		
		System.out.println("------------------------------------------------------------");
		
		List<WebElement> bala = a.getAllSelectedOptions();
		for (WebElement heman : bala) {
			System.out.println(heman.getText());
			
		}
		
		System.out.println("----------------------------------------------------------------");
		
		WebElement kousi = a.getFirstSelectedOption();
		System.out.println(kousi.getText());
		
		System.out.println("------------------------------------------------------------------");
		
		
		List<WebElement> options = a.getOptions();
		for (WebElement list : options) {
			System.out.println(list.getText());
			

			TakesScreenshot ts = (TakesScreenshot)multy;
			File sorce = ts.getScreenshotAs(OutputType.FILE);
			File destin = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenShot\\pic2.png");
			
		     FileUtils.copyFile(sorce, destin);
			
			
		} 
		
		
		
	}

}
