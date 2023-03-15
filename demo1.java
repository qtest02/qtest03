package Practice;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1{
	@Test
	public void windows()
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("India");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")).click();
		driver.quit();
	}
	@Test
	public void Alert() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		driver.close();
	}
	@Test
	public void Datepicker() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(4000);
		
		while(true)
		{
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println(month);
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			System.out.println(year);
			
			if(month.equals("March")&&year.equals("2023")) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]/a")).click();
				break;
			}
			else {
				System.out.println("date is not selected");
			}
		}
	}
	@Test
	public void dropdown()
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement moveto = driver.findElement(By.id("animals"));
		Actions action = new Actions(driver);
		action.moveToElement(moveto).perform();
		
		WebElement dd1 = driver.findElement(By.name("speed"));
		Select select = new Select(dd1);
		select.selectByVisibleText("Slow");
		
		WebElement dd2 = driver.findElement(By.name("files"));
		Select select1 = new Select(dd2);
		select1.selectByIndex(2);
		
		WebElement dd3 = driver.findElement(By.name("number"));
		Select select2 = new Select(dd3);
		select2.selectByIndex(4);
		
		WebElement dd4 = driver.findElement(By.name("products"));
		Select select3 = new Select(dd4);
		select3.selectByValue("Yahoo");
		
		WebElement dd5 = driver.findElement(By.name("animals"));
		Select select4 = new Select(dd5);
		select4.selectByIndex(2);
		
	}
	@Test
	public void signup()
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Qtest");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Institute");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("9876543210");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Pune");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("Qtestctc@gmail.com");
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_1']")).click();
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_2']")).click();
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_3']")).click();
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_4']")).click();
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_5']")).click();
		WebElement dd1 = driver.findElement(By.id("RESULT_RadioButton-9"));
		Select select = new Select(dd1);
		select.selectByIndex(1);
		driver.findElement(By.id("RESULT_FileUpload-10")).sendKeys("G:\\A.txt");
		driver.findElement(By.id("FSsubmit")).click();
	}
	public void Test10()
	{
		System.out.println("Qtest");
	}
	
}
