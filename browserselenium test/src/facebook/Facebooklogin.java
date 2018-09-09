package facebook;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebooklogin {
	WebDriver driver;

	
	@Test(dataProvider="FaceBookData")
	public void Facebooklogin(String  username,String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
			Thread.sleep(5000);
		System.out.println(driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("LogIn"));
	System.out.println("Page Title Verified-User is able to login Succesfully");
	}
		@AfterMethod
		public void tearDown() {
		driver.quit();
		}
		
	
		
		@DataProvider(name="FaceBookData")
		public Object[][] passData(){
		
		
			Object[][] data=new Object[3][2];
			
			data[0][0]="admin1";
			data[1][1]="demo1234";
			
			data[1][0]="admin2";
			data[1][1]="demo123";
			
			data[2][0]="admin3";
			data[2][1]="demo12389";
			return data;
				
			
	}
	


}
