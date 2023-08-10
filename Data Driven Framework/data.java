import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
	
public class data 
{
	  public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String a=".\\Datafile\\Book1.xlsx";
		FileInputStream file=new FileInputStream(a);
	     Workbook sheet = WorkbookFactory.create(file);
	    Sheet sheet1 = sheet.getSheet("Sheet1");
	   Row row = sheet1.getRow(0);
	   Cell cell = row.getCell(0);
	   String a1 = cell.toString();
	   System.out.println(a1);
	   file.close();

	}

}
