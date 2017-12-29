import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_HeaderBlock_links_names 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://www.bing.com");
		WebElement HeaderBlock=driver.findElement(By.id("sc_hdu"));
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		System.out.println(HeaderBlockLinks.size());
		for(int i=0;i<HeaderBlockLinks.size();i++)
		{
			System.out.println(HeaderBlockLinks.get(i).getText());
		}
		driver.close();

	}

}
