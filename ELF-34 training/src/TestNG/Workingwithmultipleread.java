package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Workingwithmultipleread {
public static Object[][] data(String s1) throws EncryptedDocumentException, IOException {
		
		File file=new File("./Testdata/Testdata.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(stream);
		Sheet sheet=wb.getSheet(s1);
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println(rowcount);
		System.out.println(colcount);
		Object[][]  data=new Object[rowcount-1][colcount];
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++){
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		/*for(int i=0;i<rowcount-1;i++){
			for(int j=0;j<colcount;j++){
				System.out.println(data[i][j]);
			}
        }*/
		return data;
	
		
		
		

}


}