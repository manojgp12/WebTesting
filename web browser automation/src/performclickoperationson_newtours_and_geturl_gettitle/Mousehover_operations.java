package performclickoperationson_newtours_and_geturl_gettitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_operations 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://livetech.in");
		
		
		WebElement placements=driver.findElement(By.linkText("Placements"));
		Actions act = new Actions(driver);
		act.moveToElement(placements).perform();
		driver.findElement(By.linkText("Corporates")).click();
		
		driver.close();
	

	}

}
