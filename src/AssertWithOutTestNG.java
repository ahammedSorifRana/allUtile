import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AssertWithOutTestNG {

	

	public static void  main(String[] agr ) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ahammed Sorif\\Desktop\\Selenium-Attachment\\Selenium_Driver\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();

		Driver.get("file:///C:/Users/Ahammed%20Sorif/Desktop/Demo_Site/demoSite.htm");
	Thread.sleep(1000);
	Driver.switchTo().frame(Driver.findElement(By.id("PreviewFrame")));
Driver.findElement(By.id("customer_login_link")).click();
Driver.switchTo().defaultContent();
Driver.findElement(By.xpath(".//*[@id='CustomerEmail']")).sendKeys("ahammed@ahammedsorif.com");
Driver.findElement(By.xpath(".//*[@id='CustomerPassword']")).sendKeys("Rana0260");
Driver.findElement(By.xpath(".//*[@id='customer_login']/p[1]/input")).click();
		
		
		
	}
	
}
