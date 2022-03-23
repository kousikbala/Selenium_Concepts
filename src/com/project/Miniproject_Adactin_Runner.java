package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_Adactin_Runner {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/index.php");
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys("kousikbala");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("P5318Z");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		login.click();
		
		Thread.sleep(3000);
		
		
		WebElement location = driver.findElement(By.xpath("//*[@id=\"location\"]"));
		
		Select a = new Select (location);
		a.selectByVisibleText("London");
		
		
		WebElement hotels = driver.findElement(By.xpath("//*[@id=\"hotels\"]"));
		
		Select b = new Select (hotels);
		b.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
		
		Select c = new Select (roomtype);
		c.selectByIndex(3);
		
		WebElement no_of_rooms = driver.findElement(By.xpath("//*[@id=\"room_nos\"]"));
		
		Select d = new Select (no_of_rooms);
		d.selectByIndex(2);
		
		WebElement checkin_date = driver.findElement(By.xpath("//*[@id=\"datepick_in\"]"));
		checkin_date.clear();
		checkin_date.sendKeys("05/04/2022");
		
		WebElement checkout_date = driver.findElement(By.xpath("//*[@id=\"datepick_out\"]"));
		checkout_date.clear();
		checkout_date.sendKeys("08/04/2022");
		
		WebElement adults = driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
		
		Select e = new Select (adults);
		e.selectByIndex(2);	
		
		WebElement children = driver.findElement(By.xpath("//*[@id=\"child_room\"]"));
		
		Select f = new Select(children);
		f.selectByIndex(1);
		
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		search.click();
		
		WebElement select1 = driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]"));
		select1.click();
		
		WebElement continue1 = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		continue1.click();
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		firstname.sendKeys("kousik");
		
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lastname.sendKeys("bala");
		
		WebElement billadd = driver.findElement(By.xpath("//*[@id=\"address\"]"));
		billadd.sendKeys("fijafjegg");
		
		WebElement cardno = driver.findElement(By.xpath("//*[@id=\"cc_num\"]"));
		cardno.sendKeys("7894561237894561");
		
        WebElement cardtype = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
		
		Select g = new Select (cardtype);
		g.selectByIndex(3);
		
		WebElement expiry_month = driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
			
	    Select h = new Select (expiry_month);
		h.selectByVisibleText("June");
		
		
		WebElement expiry_year = driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
		
	    Select i = new Select (expiry_year);
	    i.selectByVisibleText("2022");
	    
	    WebElement cvvno = driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]"));
		cvvno.sendKeys("842");
		
		WebElement booknow = driver.findElement(By.xpath("//*[@id=\"book_now\"]"));
		booknow.click();
		
		Thread.sleep(6000);
		
		WebElement myitinerary = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]"));
		myitinerary.click();
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
