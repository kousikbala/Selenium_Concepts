package com.xpath_relative;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Project_Practice1 {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement dress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		dress.click();
		
		WebElement evedress = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a"));
		evedress.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement printeddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/div[2]/form"));
		js.executeScript("arguments[0].scrollIntoView();",printeddress);
		
	    WebElement more = driver.findElement(By.xpath("(//a[@itemprop='url'])[2]"));
	    more.click();
	    
		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span"));
		quantity.click();
		quantity.click();
		quantity.click();
		quantity.click();
		
		WebElement addtocard = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addtocard.click();
		
		WebElement continueshop1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span"));
		continueshop1.click();
		
		WebElement dress2 = driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[3]"));
		dress2.click();
		
		WebElement summerdress = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a"));
		summerdress.click();
		
		js.executeScript("window.scrollBy(0,600);");
		
		WebElement printdress2 =driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
		printdress2.click();
		
		js.executeScript("window.scrollBy(0,400);");
		
		WebElement qnty = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span"));
		qnty.click();
		qnty.click();
		qnty.click();
		
		WebElement addtocard2 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addtocard2.click();
		
		WebElement continueshop2 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span"));
		continueshop2.click();
		
		WebElement dress3 = driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[3]"));
		dress3.click();
		
		WebElement casualdress = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
		casualdress.click();
		
		js.executeScript("window.scrollBy(0,600);");
		
		WebElement printdress3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
		printdress3.click();
		
		js.executeScript("window.scrollBy(0,300);");
		
		WebElement qnty3 = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span"));
		qnty3.click();
		qnty3.click();
		qnty3.click();
		
		WebElement addtocard3 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addtocard3.click();
		
		
	    WebElement checkout1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	    checkout1.click();
		
		WebElement summary = driver.findElement(By.xpath("//*[@id=\"order_step\"]/li[1]/span"));
		js.executeScript("arguments[0].scrollIntoView();",summary);
		
		WebElement checkout2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		checkout2.click();
		
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"order_step\"]/li[2]/span"));
		js.executeScript("arguments[0].scrollIntoView();",signin);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kousik.balamech@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("qwerty9486");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		login.click();
		
		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		js.executeScript("arguments[0].scrollIntoView();",proceed);
		
		WebElement checkout3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		checkout3.click();
		
		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();
		
		WebElement checkout4 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		checkout4.click();
		
		WebElement payment = driver.findElement(By.xpath("//*[@id=\"step_end\"]/span"));
		js.executeScript("arguments[0].scrollIntoView();", payment);
		
		WebElement paybycheck = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
		paybycheck.click();
		
		WebElement checkpayment = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/h3"));
		js.executeScript("arguments[0].scrollIntoView();",checkpayment);
		
		WebElement confirmorder = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		confirmorder.click();
		
		WebElement ordercomplete = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]"));
		js.executeScript("arguments[0].scrollIntoView();",ordercomplete);
		
		
		
	}

}



