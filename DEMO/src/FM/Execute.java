package FM;

public class Execute 
{
	public static void main(String[] args)
	{
		String TC[]=Excel.GetTestcases("C:\\Users\\AW104_PC1\\Desktop\\FrameWork\\Book1.xls","Controller" );
		
		for(String TestCase:TC)
		{
		System.out.println(TestCase+" Executing");
		
		Excel.ExcelConfig("C:\\Users\\AW104_PC1\\Desktop\\FrameWork\\Book1.xls",TestCase );
			
		for(int i=1;i<=Excel.ROWNUM();i++)
		{
		String A=Excel.Read(i, 0);
		try {
		switch(A)
		{
		case "openBrowser":
			KeyConfig.openBrowser(Excel.Read(i, 3));
			break;
		case "openUrl":
			KeyConfig.openUrl(Excel.Read(i, 3));
			break;
		case "entetText":
			KeyConfig.enterText(Excel.Read(i, 1), Excel.Read(i, 2), Excel.Read(i, 3));
			break;
		case "click":
			KeyConfig.click(Excel.Read(i, 1), Excel.Read(i, 2));
			break;
	
			
		
		}
		}
		
		catch(Exception E)
		{
		System.out.println("Null");	
		}
		}
		}
	


	
}
}