package com.bingtotallinks_names;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linknames 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com/");
	
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for(int i=0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getText());
		}
		driver.close();
			

	}

}
