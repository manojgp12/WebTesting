package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcomemercurytours 
{
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void register()
	{
		register.click();
	}
	
	@FindBy(linkText="SIGN-ON")
	 WebElement SignOn;
	
	public void SignOn()
	{
		SignOn.click();
		
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void support()
	{
		support.click();
		
	}
		
	@FindBy(linkText="CONTACT")
	 WebElement contact; 
	public void contact()
	{
		contact.click();
		
	}
	@FindBy(linkText="Home")
	WebElement home;
	public void home()
	{
		home.click();
	}
	@FindBy(linkText="Flights")
	WebElement flights;
	public void flights()
	{
		flights.click();
	}
	@FindBy(linkText="Hotels")
	WebElement hotels;
	public void hotels()
	{
		hotels.click();
	}
	@FindBy(linkText="Car Rentals")
	WebElement carrent;
	public void carrent()
	{
		carrent.click();
	}
	@FindBy(linkText="Cruises")
	WebElement cruises;
	public void cruises()
	{
		cruises.click();
	}
	@FindBy(linkText="Destinations")
	WebElement destiny;
	public void destiny()
	{
		destiny.click();
	}
	@FindBy(linkText="Vacations")
	WebElement vac;
	public void vac()
	{
		vac.click();
	}

	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement logIn;
	
	public void FindAFlight(String UName,String Pwd)
	{
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		logIn.click();
	}
	
}
	



