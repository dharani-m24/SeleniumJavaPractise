package Practise;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoExcelSheet {

    public static void main(String[] args) throws IOException {

        //create a workBook
        XSSFWorkbook workbook=new XSSFWorkbook();

        //creat sheet
        XSSFSheet sheet=workbook.createSheet("MyData");

        //create a row
        XSSFRow row=sheet.createRow(0);

        row.createCell(0).setCellValue("Java");
        row.createCell(1).setCellValue(12324);
        row.createCell(2).setCellValue("Automation");

        XSSFRow row2=sheet.createRow(1);

        row2.createCell(0).setCellValue("python");
        row2.createCell(1).setCellValue(65689);
        row2.createCell(2).setCellValue("Automation");

        FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile.xlsx");

        workbook.write(file);

        workbook.close();
        file.close();





    }
}
