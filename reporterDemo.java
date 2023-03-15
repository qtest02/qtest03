package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class reporterDemo {
	@Test
	public static void Test1()
	{
		Reporter.log("This is Test1");
		System.out.println("This is Test1");
	}
	@Test
	public static void Test2()
	{
		Reporter.log("This is Test2");
		System.out.println("This is Test2");
	}
	@Test
	public static void Test3()
	{
		Reporter.log("This is Test3");
		System.out.println("This is Test3");
	}
	@Test
	public static void Test4()
	{
		Reporter.log("This is Test4");
		System.out.println("This is Test4");
	}

}
