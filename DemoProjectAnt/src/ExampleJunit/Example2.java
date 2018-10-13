package ExampleJunit;

import static org.testng.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Example2 {

	@Before
	public void beforeMain()
	{
		System.out.println("You are in  Before Example2 ");
	}
	@After
	public void AfterMain()
	{
		System.out.println("You are in  After Example2 ");
	}

	@Test
	public void TestF()
	{
		int a=5;
		Assert.assertTrue(a==5);
	}
	
	
}
