package com.Excel_operations;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_ReadingCompleteData 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hemanth\\Desktop\\manojtestdata.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=RowCount;i++)
		{
			Row r=sheet.getRow(i);
			int CellCount=r.getLastCellNum();
			for(int j=0;j<CellCount;j++)
			{
				Cell c=r.getCell(j);
				String data=c.getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}

	}

}
