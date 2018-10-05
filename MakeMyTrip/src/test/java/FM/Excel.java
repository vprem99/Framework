package FM;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{
	
	static Sheet s;
	static Workbook wb;
	public static void ExcelConfig(String Location ,String SheetName)
	{
		try
		{
		FileInputStream I=new FileInputStream(Location);
		if(Location.endsWith("xls")==true)
		{
			 wb=new HSSFWorkbook(I);
		
			s=wb.getSheet(SheetName);
		}
		else if(Location.endsWith("xlsx")==true)
		{
			 wb=new XSSFWorkbook(I);
			
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
		return s.getRow(R).getCell(C).getStringCellValue();
	}
	
	public static int  ROWNUM()
	{
		return s.getLastRowNum();
	}

}
