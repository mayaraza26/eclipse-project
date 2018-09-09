package projectcarefirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchDoctor {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://individual.carefirst.com/individuals-families/home.page");
		driver.findElement(By.className("close")).click();
		
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy,(0,75)");
		Thread.sleep(7000);
	
		
			
		driver.findElement(By.xpath("//*[@id='1508934148912']/div[2]/div/div[1]/a")).click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[4]/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/div/a")).click();

		
		
		// TODO Auto-generated method stub

	}

}
