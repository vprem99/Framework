package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FM.Excel;

public class ExecuteTest extends startUp
{
  @Test(dataProvider="dp")
  public void TestExecute(String Name,String data)  throws Exception
  {
	  System.out.println(Name+ "Being Executed");
	  switch(Name)
	  {
	  case "SIGNUP":
		  SF.SIGNUP(data);
		  break;
	  case "Login":
	  		LF.Login(data);
	  		break;
	  }
	  
	  }
  
  @DataProvider
  public Object[][] dp()
  {
	  Excel.ExcelConfig(p.getProperty("exelpath"), p.getProperty("sheetname"));
	  Object data[][]=new Object[Excel.ROWNUM()][2];
	  
	  for(int i=1;i<3;i++)
	  {
		  data[i-1][0]=Excel.Read(i,0);
		  data[i-1][1]=Excel.Read(i, 1);
	  }
	
	  return data;
	  }
}
