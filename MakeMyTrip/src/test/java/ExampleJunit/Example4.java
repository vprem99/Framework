package ExampleJunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Example4 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("In Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("In After Class");

	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("In Before ");

	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("In After ");

	}

	@Test
	public void test() 
	{
	
	System.out.println("In Test Method");
	}

}
