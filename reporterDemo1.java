package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class reporterDemo1 {
	
	@Test (groups= "UI")
	public void Test1()
	{
		Reporter.log("This is Test1");
		System.out.println("Test1");
	}
	@Test(groups= { "regression", "UI", "smoke"})
	public void Test2()
	{
		Reporter.log("This is Test2");
		System.out.println("Test2");
	}
	@Test(groups= "smoke")
	public void Test3()
	{
		Reporter.log("This is Test3");
		System.out.println("Test3");
	}
	@Test (groups= "regression")
	public void Test4()
	{
		Reporter.log("This is Test4");
		System.out.println("Test4");
	}
}
