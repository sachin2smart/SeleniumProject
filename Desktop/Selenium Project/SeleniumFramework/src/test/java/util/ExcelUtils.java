package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//		getRowCount();
		//		getCellDate(0,0);
		//		getCellDataNumber(1,1);
	}

	public static int getRowCount() {

		int rowCount=0;
		try {
			rowCount= sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows are " +rowCount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}

	public static int getColCount() {
		int colcount = 0;
		try {
			colcount= sheet.getRow(0).getLastCellNum();
			System.out.println("No of columns are " +colcount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colcount;
	}

	public static String getCellDataString(int rowNum, int columnNum){
		String cellData=null;
		try {
			cellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			System.out.println(cellData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}

	public static void getCellDataNumber(int rowNum, int colNum){

		try {
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}




}

