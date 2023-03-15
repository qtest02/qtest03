package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderdemo {
	
	@Test (dataProvider="create")
	public void Test(String username, String password)
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
	}
	@DataProvider(name = "create")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "standard_user", "secret_sauce" },
	   { "locked_out_user", "secret_sauce"},
	   {"problem_user", "secret_sauce"},
	   {"performance_glitch_user", "secret_sauce"}
	 };
	}


}
