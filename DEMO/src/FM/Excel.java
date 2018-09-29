package FM;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{
	
	static Sheet s;
	public static String[] GetTestcases(String Location ,String SheetName)
	{
		ExcelConfig(Location,SheetName);
		int R=ROWNUM();
		ArrayList<String> mylist = new ArrayList<String>();
		for(int i=1;i<=R;i++)
		{
			String TC=Read(i,1);
			if(Read(i,2).equals("Y"))
			{
				mylist.add(TC);
			}
		}
		String arr[]=new String[mylist.size()];
		System.out.println(mylist.size());
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(i);
			arr[i]=mylist.get(i).toString();
		}
		
		return arr;
	
	}
	
	public static void ExcelConfig(String Location ,String SheetName)
	{
		try
		{
		FileInputStream I=new FileInputStream(Location);
		if(Location.endsWith("xls")==true)
		{
			HSSFWorkbook wb=new HSSFWorkbook(I);
		
			s=wb.getSheet(SheetName);
		}
		else if(Location.endsWith("xlsx")==true)
		{
			XSSFWorkbook wb=new XSSFWorkbook(I);
			
			s=wb.getSheet(SheetName);
		}
		else
		{
			System.out.println("Invalid Format");
		}
		}
		catch(Exception E)
		{
			System.out.println("Error while Reading File");
		}
	}

	public static String  Read(int R,int C)
	{
		String A=null;
		try {
		A=s.getRow(R).getCell(C).getStringCellValue();
		}
		catch(Exception E)
		{
			System.out.println("Error Read");
		}
		return A;
		}
	
	public static int  ROWNUM()
	{
		return s.getLastRowNum();
	}

}
