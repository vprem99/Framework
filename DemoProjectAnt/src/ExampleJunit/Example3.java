package ExampleJunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Example3 {

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void test() 
	{
	String str1="xyz";
	String str2="xyz";
	String str3="123";
	String str4="";
	int x=5;
	//Assert.assertNotEquals(str1, str2);
	//Assert.assertTrue(str1.equals(str2));
	//Assert.assertFalse(str1.equals(str2));
//	Assert.assertNotNull(str3);
	Assert.assertNull(str4);
	Assert.assertFalse(x==6);;

	}

}
