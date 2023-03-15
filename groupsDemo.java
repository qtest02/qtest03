package Practice;

import org.testng.annotations.Test;

public class groupsDemo {
	
	@Test (groups= "UI", enabled=false)
	public void Test1()
	{
		System.out.println("Test1");
	}
	@Test(groups= { "regression", "UI", "smoke"}, enabled=false)
	public void Test2()
	{
		System.out.println("Test2");
	}
	@Test(groups= "smoke")
	public void Test3()
	{
		System.out.println("Test3");
	}
	@Test (groups= "regression")
	public void Test4()
	{
		System.out.println("Test4");
	}

}
