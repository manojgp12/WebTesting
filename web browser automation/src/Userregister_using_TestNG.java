import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Userregister_using_TestNG 
{
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com");
		
    }
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=2)
	public void newuserregister()
	{
		driver.findElement(By.name("firstName")).sendKeys("manoj");
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		driver.findElement(By.name("phone")).sendKeys("8019452617");
		driver.findElement(By.name("userName")).sendKeys("manojgp12@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("gangupalli(vill),sathambakam(post),chittoor,AP.");
		driver.findElement(By.name("city")).sendKeys("Chittoor");
		driver.findElement(By.name("state")).sendKeys("Andhrapradesh");
		driver.findElement(By.name("postalCode")).sendKeys("517127");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("manojgp12");
		driver.findElement(By.name("password")).sendKeys("manojgp12");
		driver.findElement(By.name("confirmPassword")).sendKeys("manojgp12");
		
		Sleeper.sleepTightInSeconds(10);
		driver.findElement(By.name("register")).click();
		
		String Expectedusername="manojgp12";
		String ActualText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		if(ActualText.contains(Expectedusername))
		{
			System.out.println("User created Successfully -- PASS");
			
		}
		else
		{
			System.out.println("User created Successfully -- FAIL");
		}
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
