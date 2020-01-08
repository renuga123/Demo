package pageobject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderobject 1{
	
		public WebDriver driver;
		@BeforeMethod
		public void launch() {
		
	    System.setProperty("web driver.chrome driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		
		@DataProvider (name ="verifyLogin")
        public Object[][] getData () {
        	Object[][]data=new Object[3][2];
        	data [0][0]="admin";
        	data [0][1]="admin";
        	data [1][0]="admin";
        	data [1][1]="admin";
        	data [2][0]="admin";
        	data [2][1]="admin";
        	return data;
}
			@Test(dataProvider="verifyLogin")
			public void VerifyLogin1 (String username,String password)
			{
				driver.findElement(By.id("txtUsername")).sendKeys(username);
				driver.findElement(By.id("txtPassword")).sendKeys(password);
				driver.findElement(By.id("btnLogin")).click();
			}

}
