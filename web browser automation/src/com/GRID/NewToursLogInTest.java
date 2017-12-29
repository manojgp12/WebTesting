package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewToursLogInTest 
{
	@Parameters("browsers")
	
	@Test
	public void  LogIn(STRING b) throws MalformedURLException
	
	{
		System.out.println(b);
		DesiredCapabilities cap = null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(b.equals("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				
			}
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.144.206.198:4444/wd/hub"),cap);
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElementByName("password").sendKeys("tutorial");
		WebElement SignIN=driver.findElement(By.name("login"));
		SignIN.click();
		
		driver.close();
		
				
		
	}

}