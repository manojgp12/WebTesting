package com.pom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Newtourshomepagetesting 
{

	@Test
	public void homepagetesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		Welcomemercurytours wtm = PageFactory.initElements(driver, Welcomemercurytours.class);
		wtm.register();
		driver.navigate().back();
		wtm.SignOn();
		driver.navigate().back();
		wtm.support();
		driver.navigate().back();
		wtm.contact();
		driver.navigate().back();
		wtm.home();
		driver.navigate().back();
		wtm.flights();
		driver.navigate().back();
		wtm.hotels();
		driver.navigate().back();
		wtm.carrent();
		driver.navigate().back();
		wtm.cruises();
		driver.navigate().back();
		wtm.destiny();
		wtm.vac();
		driver.navigate().back();
		wtm.FindAFlight("tutorial", "tutorial");
		
		
				
		
	}
}
