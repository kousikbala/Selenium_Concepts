package com.project;

import java.awt.AWTException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Miniproject_Automation_Runner {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		signin.click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("kousik.balamech@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("qwerty9486");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		login.click();
		
		
		
		WebElement dress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		dress.click();
		
		WebElement evedress = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a"));
		evedress.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement printeddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/div[2]/form"));
		js.executeScript("arguments[0].scrollIntoView();",printeddress);
		
	    WebElement more = driver.findElement(By.xpath("(//a[@itemprop='url'])[2]"));
	    more.click();
	    
		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
		
		quantity.clear();
		
		quantity.sendKeys("5");
		
		
		
		WebElement addtocard = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addtocard.click();
		
		WebElement checkout1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		checkout1.click();
		
		WebElement summary = driver.findElement(By.xpath("//*[@id=\"order_step\"]/li[1]/span"));
		js.executeScript("arguments[0].scrollIntoView();",summary);
		
		WebElement checkout2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		checkout2.click();
		
	//	WebElement signin = driver.findElement(By.xpath("//*[@id=\"order_step\"]/li[2]/span"));
	//	js.executeScript("arguments[0].scrollIntoView();",signin);
		
	//	WebElement email = driver.findElement(By.id("email"));
	//	email.sendKeys("kousik.balamech@gmail.com");
		
	//	WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	//	password.sendKeys("qwerty9486");
		
	//	WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	//	login.click();
		
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
