package com.keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewtoursloginTest 
{
	FirefoxDriver driver;
	//ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemanth\\Desktop\\Automation\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com");
		
	}
	@Test
	public void login() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hemanth\\Desktop\\Automation practice\\web browser automation\\newtours.propeties");
		Properties pr = new Properties();
		pr.load(file);
		driver.findElement(By.name(pr.getProperty("userName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("logIn"))).click();

		
	}
	@AfterTest
	public void teardown() 
	{
		//driver.close();
	}
	

}
