package opencsv;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteListToExcelFile {

	
	public static void main(String args[]) throws Exception{
		csvToXLSX();
	}
		public static void csvToXLSX() {
		    try {
		        String csvFileAddress = "C:\\Users\\Viktor\\eclipse-workspace\\opencsv\\src\\test.csv";
		        String xlsxFileAddress = "C:\\Users\\Viktor\\eclipse-workspace\\opencsv\\src\\test.xlsx";
		        XSSFWorkbook workBook = new XSSFWorkbook();
		        XSSFSheet sheet = workBook.createSheet("sheet1");
		        String currentLine=null;
		        int RowNum=0;
		        BufferedReader br = new BufferedReader(new FileReader(csvFileAddress));
		        while ((currentLine = br.readLine()) != null) {
		            String str[] = currentLine.split(",");
		            
		            
		            for(int i=0;i<str.length;i++){
		            	XSSFRow currentRow=sheet.createRow(RowNum);
		            	currentRow.createCell(0).setCellValue(str[i].replace(Character.toString('"'), ""));
		            	RowNum++;
		            }
		        }

		        FileOutputStream fileOutputStream =  new FileOutputStream(xlsxFileAddress);
		        workBook.write(fileOutputStream);
		        fileOutputStream.close();
		        System.out.println("Done");
		    } catch (Exception ex) {
		        System.out.println(ex.getMessage()+"Exception in try");
		    }
		}
		}
