package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriventestingTest{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File fs=new File("./Testdata/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(fs);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		System.out.println(sheet.getRow(4).getCell(1).getStringCellValue());
	     /* Cell date = sheet.getRow(4).getCell(1);
	      date.toString();
	      System.out.println(date);*/
		
		
		
		  
		
	}
	

}
