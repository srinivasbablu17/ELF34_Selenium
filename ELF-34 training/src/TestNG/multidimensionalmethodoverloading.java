package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multidimensionalmethodoverloading {
	

	public static String readString(String SN,int r,int c) throws EncryptedDocumentException, IOException
	{
		File fs=new File("./Testdata/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(fs);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		
		return sheet.getRow(r).getCell(c).getStringCellValue();
	}
	
	public static double readString(int r,String SN,int c) throws EncryptedDocumentException, IOException
	{
		File fs=new File("./Testdata/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(fs);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		
		return sheet.getRow(r).getCell(c).getNumericCellValue();
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String srini = readString("Sheet1",1,1);
		System.out.println(srini);
		
		double ph = readString(1,"Sheet1",5);
		System.out.println(ph);
		
	}
	
	
	
	
	

}
