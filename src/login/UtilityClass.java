package login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public static String gettestdata(int rowindex, int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Chetan\\Desktop\\Velocity\\Automation\\sample1.xlsx");
	
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		
	
		return value;
	
	}

}
