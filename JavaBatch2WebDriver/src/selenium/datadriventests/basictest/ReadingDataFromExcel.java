package selenium.datadriventests.basictest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream  file=new  FileInputStream("C://Program Files//ECLIPS//Excel sheet//ReadingData.xlsx");//excel file home directly,open the Excel files
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);//create the workbook 
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");//providing the sheet name 
		//XSSFSheet sheet=workbook.getSheet(0);
		
		// how to count numbers of rows 
		// sheet.getLastRowNum();
		int rowcount=sheet.getLastRowNum();//return the row count 
		
		//how to count column count/cell count ,focuses first row  the focuses last cell 
		
		//sheet.getRow(0).getLastesCellNum();
		int colcount=sheet.getRow(0).getLastCellNum();//return the column count /cell count 
		
		// read values from Excel file 
		
		for(int  i=0;i<rowcount;i++)
		{
			
			//sheet.getRow(i);// focusses on current row 
			XSSFRow currentrow=sheet.getRow(i);
			
			// for implement cell count 
			for(int  j=0;j<colcount;j++)
			{
				
				//currentrow.getCell(j).toString();//read the values from the cell 
				String value=currentrow.getCell(j).toString();//read the values from excel cell /	column 
			System.out.println("  " +value);
			}
			
			System.out.println();
		}
				

	}

}
