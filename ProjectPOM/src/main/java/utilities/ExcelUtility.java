package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	XSSFSheet sheet;
	private int i;
	private int j;
	public ExcelUtility(int i, int j) {
		this.i=i;
		this.j=j;
		
	}
	public ExcelUtility() throws IOException {
		File path = new File("C:\\Users\\admin\\Desktop\\java\\color.xlsx");
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet("Sheet1");
	}
	public String ReadStringDataExcel(int i, int j) {    
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		return cell.getStringCellValue();                 
	}

}
