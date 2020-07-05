package com.qa.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	System.out.println("Hello Selenium");
	
	driver.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("dhanu.jnv@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='continue']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Dhanu@123");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    Thread.sleep(2000);

	}
}
