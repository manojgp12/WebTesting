package com.capturinglinks_newtours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkstesting 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Hemanth\\Desktop\\Automation\\MicroSoftWebdriver.exe");
				EdgeDriver driver = new EdgeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth\\Desktop\\Automation\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
		}
		driver.close();
	

	}

}
