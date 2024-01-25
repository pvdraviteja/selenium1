package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataexecl {

	public static void main(String[] args) throws Throwable {

File f=new File("./Excel/Book1.xlsx");
		
		FileInputStream fs= new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sh=wb.getSheetAt(0);
		
		int rows=sh.getPhysicalNumberOfRows();
		int cell=sh.getRow(1).getLastCellNum();
		
		
		for(int i=0;i<rows;i++) {
			 
			for(int j=0;j<cell;j++) {
				
				DataFormatter df= new DataFormatter();
				
				System.out.println(df.formatCellValue(sh.getRow(i).getCell(j)));
				
				
			}
		}
		
		
	}

}
