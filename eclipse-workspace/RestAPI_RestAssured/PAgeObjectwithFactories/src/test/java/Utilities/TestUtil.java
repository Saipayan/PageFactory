package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import Base.Page;


public class TestUtil extends Page {

	
	public static String  SCR_PATH=System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\";
	public static String Scr_Name="error.jpg";
	
	
	public  static String path;
	public  static FileInputStream fis = null;
	public  static FileOutputStream fileOut =null;
	private static XSSFWorkbook workbook = null;
	private static XSSFSheet sheet = null;
	private static XSSFRow row   =null;
	private static XSSFCell cell = null;
	public static POIHelper myPOIHelper;
	
	public static void CAptureScreenShot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(SCR_PATH+Scr_Name));
	}
	
	
	public static Boolean isTEstRunnable(String TEstcase) throws IOException
	{
		path = System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\isRunnable.xlsx";
		
		//File file = new File(path); 
		myPOIHelper= new POIHelper(path);
	
		int row_Count=myPOIHelper.getRowCount("Sheet1");
		for (int rNUM=2;rNUM<row_Count;rNUM++)
		{
			String TEstcase_Head = myPOIHelper.getCellData("Sheet1","TC_ID", rNUM);
		    if(("Testcases."+TEstcase_Head).equalsIgnoreCase(TEstcase))
		    {
		    	String Runmode= myPOIHelper.getCellData("Sheet1","Is_Runnable", rNUM);
		    	if(Runmode.equalsIgnoreCase("Y"))
		    	{
		    		return true;
		    	}
		    	else 
		    	{
		    		return false;
		    	}
		    }
		}
		return false;
	}
	
	@DataProvider(name="dp")
	public Object[][] getDATA(Method M) throws EncryptedDocumentException, IOException
	{
		String PAth = System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\"+M.getName()+".xlsx";
		if(myPOIHelper==null)
		{
			myPOIHelper=new POIHelper(PAth);
		
		String cell_Data="";
		
		File file = new File(PAth); 
		int Row_Count=myPOIHelper.getRowCount(M.getName());
		
		int Col_Count=myPOIHelper.getColumnCount(M.getName());
		
		Object[][] data= new Object[Row_Count-1][Col_Count];
		
		for(int row_num=1;row_num<=Row_Count-1;row_num++)
		{
			for(int col_num=0;col_num<Col_Count;col_num++)
			{
				cell_Data=myPOIHelper.getCellData(M.getName(), row_num, col_num);
				data[row_num-1][col_num]=cell_Data;
			}
		}
		
		return data;
		}
		else
		{
			return null;
		}
				
	}
	
}
