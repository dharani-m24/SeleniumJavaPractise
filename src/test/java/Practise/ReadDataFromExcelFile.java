package Practise;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcelFile {
    public static void main(String[] args) throws IOException {

        //open the file in reading mode
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\data.xlsx");

        //extract the workbook
        XSSFWorkbook workbook=new XSSFWorkbook(file);

        //get the sheet
        XSSFSheet sheet=workbook.getSheet("Sheet1");

        //get the rowcount
        int rowNum=sheet.getLastRowNum();

        System.out.println("Number of Row"+rowNum);

        //get the columnCount
        int columnNum=sheet.getRow(1).getLastCellNum();
        System.out.println("Number of column"+ columnNum);

        //read the excel data
        for(int r=0;r<=rowNum;r++){

            XSSFRow row=sheet.getRow(r);

            for(int c=0;c<columnNum;c++){

               XSSFCell cell= row.getCell(c);

                System.out.print(cell.toString()+"\t");

            }

            System.out.println();
        }

        workbook.close();
        file.close();

    }
}
