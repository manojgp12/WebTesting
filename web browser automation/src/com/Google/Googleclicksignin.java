package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googleclicksignin 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.navigate().to("http://www.Google.com");
		Driver.findElement(By.id("gb_70")).click();
		//Driver.findElementByLinkText("Sign in").click();
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());

	}

}
