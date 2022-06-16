package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class tocreateafilemakeitgeneric {
	
		static File fs=new File("./Testdata/Testdata.xlsx");
		static FileInputStream fis;
		static Workbook workbook;
		static Sheet sheet;
	  public static String readStringvalue(String Sheetname,int Row,int Column) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(fs);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(Sheetname);
		return sheet.getRow(Row).getCell(Column).getStringCellValue();
	}
	
	  public static double readNumericvalue(String Sheetname,int Row,int Column) throws EncryptedDocumentException, IOException{
		
		fis=new FileInputStream(fs);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(Sheetname);
		return sheet.getRow(Row).getCell(Column).getNumericCellValue();
	}

    public static Date readDatevalue(String Sheetname,int Row,int Column) throws EncryptedDocumentException, IOException{
	
	fis=new FileInputStream(fs);
	workbook=WorkbookFactory.create(fis);
	sheet=workbook.getSheet(Sheetname);
	return sheet.getRow(Row).getCell(Column).getDateCellValue();
	
}

    public static  boolean readBooleanvalue(String Sheetname,int Row,int Column) throws EncryptedDocumentException, IOException{
	
	fis=new FileInputStream(fs);
	workbook=WorkbookFactory.create(fis);
	sheet=workbook.getSheet(Sheetname);
	return sheet.getRow(Row).getCell(Column).getBooleanCellValue();
	
}
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
    	System.out.println(tocreateafilemakeitgeneric.readStringvalue("Sheet2",1,2));
    	System.out.println(tocreateafilemakeitgeneric.readNumericvalue("Sheet2",1,6));
    	System.out.println(tocreateafilemakeitgeneric.readDatevalue("Sheet2",1,4));
    	System.out.println(tocreateafilemakeitgeneric.readBooleanvalue("Sheet2",1,5));
    	
	}
	
	
}
