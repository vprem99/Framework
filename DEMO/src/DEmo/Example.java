package DEmo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {
  @Test(priority=1)
  public void Test1() 
  {
	  	  System.out.println("In Test1");
	  	  Assert.assertEquals(false, false);
  }
  
  @Test(priority=2)
  public void Test2() 
  {
	  System.out.println("In Test2");
  	  Assert.assertEquals(false, true);

  }
  
  @Test(priority=3,dependsOnMethods="Test2")
  public void Test3() 
  {
  	  Assert.assertEquals(false, false);

	  System.out.println("In Test3");
  }
}
