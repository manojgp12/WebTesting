package automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserautomation 
{

	public static void main(String[] args) 
	{
		FirefoxDriver Driver = new FirefoxDriver();
		FirefoxDriver pack =new FirefoxDriver();
		Driver.get("https://youtu.be/9V0hw6QjzSw");
		pack.navigate().to("https://youtu.be/il_pSa5l98w");
		Driver.close();
		pack.close();
		
		

	}

}
