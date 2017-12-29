package com.capturingtitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://www.google.com");
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		
		

	}

}
