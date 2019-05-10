package com.customer.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.pattern.PropertiesPatternConverter;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;

import com.customer.base.TestBase;

//import utility.Constant;

public class ExcelUtil extends TestBase{
	
	/*private static XSSFSheet  ExcelSheet;
	private static XSSFWorkbook ExcelBook;
	private static XSSFCell cell;
	private static XSSFRow row;
	private static MissingCellPolicy xRow;  
	
	
	public static void setExcelFile(String path,String sheetName) throws IOException
	{
		try {
		FileInputStream ExcelFile=new FileInputStream(path);
		ExcelBook=new XSSFWorkbook(ExcelFile);
		ExcelSheet=ExcelBook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			System.out.println("Exception in file:"+e);
		}
	}
	//Read data from Excel
	public static String getCellData(int rowNum,int colNum)
	{
		cell=ExcelSheet.getRow(rowNum).getCell(colNum);
		String CellData=cell.getStringCellValue();
		return CellData;
	}
	//Write to Excel 

	public static void setCellData(String result,int rowNum,int colNum) throws IOException
	{
		try {
		row=ExcelSheet.getRow(rowNum);
		cell=row.getCell(colNum,xRow.RETURN_BLANK_AS_NULL);
		
		if(cell==null)
		{
			cell=row.createCell(colNum);
			cell.setCellValue(result);
			
		}
		else
		{
			cell.setCellValue(result);
		}
		FileOutputStream fileOut=new FileOutputStream("E:\\Eclipse Workspace\\SeleniumAmazon\\src\\main\\java\\com\\customer\\testData\\TestData.xlsx");
				 //File_Test="TestData.xlsx";);
		ExcelBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception in fileout:"+e);
		}
	}  */

	
	   
	//Main Directory of the project
	    public static final String currentDir = System.getProperty("user.dir");
	 
	    //Location of Test data excel file
	    public static String testDataExcelPath = null;
	 
	    //Excel WorkBook
	    private static XSSFWorkbook excelWBook;
	 
	    //Excel Sheet
	    private static XSSFSheet excelWSheet;
	 
	    //Excel cell
	    private static XSSFCell cell;
	 
	    //Excel row
	    private static XSSFRow row;
	 
	    //Row Number
	    public static int rowNumber;
	 
	    //Column Number
	    public static int columnNumber;
	 
	    //Test Sheet name
	    
	    //Setter and Getters of row and columns
	    public static void setRowNumber(int pRowNumber) {
	        rowNumber = pRowNumber;
	    }
	 
	    public static int getRowNumber() {
	        return rowNumber;
	    }
	 
	    public static void setColumnNumber(int pColumnNumber) {
	        columnNumber = pColumnNumber;
	    }
	 
	    public static int getColumnNumber() {
	        return columnNumber;
	    }
	 
	    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
	    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.
	    public static void setExcelFileSheet(String sheetName) {
	  
	            testDataExcelPath = currentDir + "\\src\\main\\java\\com\\customer\\testData\\TestData.xlsx";
	        
	        try {
	            // Open the Excel file
	        	System.out.println("testDataExcelPath:"+testDataExcelPath);
	            FileInputStream ExcelFile = new FileInputStream(testDataExcelPath );//+ prop.getProperty("testDataExcelFileName"));
	           
	            excelWBook = new XSSFWorkbook(ExcelFile);
	            System.out.println("excel work book:"+excelWBook.toString());
	          //  excelWSheet = excelWBook.getSheetAt(0);
	            excelWSheet = excelWBook.getSheet(sheetName);
	           
	        } catch (Exception e) {
	            try {
	                throw (e);
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        }
	    }
	 
	    //This method reads the test data from the Excel cell.
	
	    public static String getCellData(int RowNum, int ColNum) {
	        try {
	            cell = excelWSheet.getRow(RowNum).getCell(ColNum);
	            DataFormatter formatter = new DataFormatter();
	            String cellData = formatter.formatCellValue(cell);
	            return cellData;
	        } catch (Exception e) {
	            throw (e);
	        }
	    }
	 
	    //This method takes row number as a parameter and returns the data of given row number.
	    public static XSSFRow getRowData(int RowNum) {
	        try {
	        	System.out.println("Row num in getRowData()"+RowNum);
	        	System.out.println("excelsheet"+excelWSheet);
	            row = excelWSheet.getRow(RowNum);
	           
	            System.out.println(row);
	            return row;
	        } catch (Exception e) {
	            throw (e);
	        }
	    }
	 
	    //This method gets excel file, row and column number and set a value to the that cell.
	    public static void setCellData(String value, int RowNum, int ColNum) {
	        try {
	           
	            // Constant variables Test Data path and Test Data file name
	            FileOutputStream fileOut = new FileOutputStream(testDataExcelPath + prop.getProperty("testDataExcelFileName"));
	            excelWBook.write(fileOut);
	            fileOut.flush();
	            fileOut.close();
	        } catch (Exception e) {
	            try {
	                throw (e);
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        }
	    }
	    
	    
	}
	
