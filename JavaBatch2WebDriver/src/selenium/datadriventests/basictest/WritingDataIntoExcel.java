package selenium.datadriventests.basictest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file=new FileOutputStream("C://Program Files//ECLIPS//Excel sheet//WritingData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("NewAdd_DataSheet");
		
		
		for (int i=0; i<=5;i++)
			
		{
			
			XSSFRow row=sheet.createRow(i);
			
			for(int j=0;j<8; j++)
			{
				row.createCell(j).setCellValue("kadeer.Ainiwaer");
				
			}
			
			workbook.write(file);
			file.close();
			
			System.out.println("Written Data into Excel is Completed");
		}
		
		

	}

}
