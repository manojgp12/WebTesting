package com.newtours_logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Newtours_logintest_using_TestNG 
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
		
		@Test
		public void logIn()
		{
			driver.findElement(By.name("userName")).sendKeys("tutorial");
			driver.findElementByName("password").sendKeys("tutorial");
			WebElement SignIN = driver.findElement(By.name("login"));
			SignIN.click();
			
		}
		
		@AfterTest
		public void teardown()
		{
			
			driver.close();
			
		}


}
