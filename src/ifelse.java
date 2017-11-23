

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.Result;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifelse {
	

	public static void main(String[] args) {

		/*Calendar dir = Calendar.getInstance();
		SimpleDateFormat formate = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat formate1 = new SimpleDateFormat("yyyy-mm"+15); 
		
		String time = formate.format(dir.getTime());
		String time1 = formate1.format(dir.getTime());
		System.out.println(time);
		System.out.println(time1);*/
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("http://www.phptravels.net");
		Driver.findElement(By.cssSelector("div.container.search-box-with [data-title='flight']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Driver.findElement(By.cssSelector(".form.input-lg.departureTime")).click();
		
		List<WebElement> xData = Driver.findElements(By.xpath("html/body/div[8]/div[1]/table/tbody/tr/td"));
		
		for(WebElement ele : xData) {
		String x	=ele.getText();
	
		System.out.println(x);
		if(x.equalsIgnoreCase("30")) {
			System.out.println("x value --"+x);
			Driver.findElement(By.cssSelector(".form.input-lg.departureTime")).sendKeys("2017-12-12");
			
			break;
		
		}
			
		}
		
		//Driver.close();

	}

}
