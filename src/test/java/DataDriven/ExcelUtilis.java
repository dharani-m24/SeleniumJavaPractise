package DataDriven;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtilis {

    public static FileInputStream fis;
    public static FileOutputStream fio;
    public static XSSFWorkbook workbook;
    public static XSSFSheet wsheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static CellStyle style;

    public static int getRowCount(String file,String sheet) throws IOException {

        fis=new FileInputStream(file);
        workbook=new XSSFWorkbook(fis);
        wsheet=workbook.getSheet(sheet);
        int rowCount=wsheet.getLastRowNum();
        workbook.close();
        fis.close();
        return  rowCount;
    }

    public static int getCellCount(String file, String sheet, int rownum) throws IOException {
        fis=new FileInputStream(file);
        workbook=new XSSFWorkbook(fis);
        wsheet=workbook.getSheet(sheet);
        row=wsheet.getRow(rownum);
        int cellCount=row.getLastCellNum();
        workbook.close();
        fis.close();
        return  cellCount;

    }

    public static String getCellData(String file,String sheet,int rownum,int cellnum) throws IOException {
        fis=new FileInputStream(file);
        workbook=new XSSFWorkbook(fis);
        wsheet=workbook.getSheet(sheet);
        row=wsheet.getRow(rownum);
        cell=row.getCell(cellnum);

        String data;
        try{
            data=cell.toString();
        }catch (Exception e){
            data="";
            System.out.println(e);
        }
        workbook.close();
        fis.close();
        return data;
    }

    public static void setCellData(String file,String sheet,int rownum,int cellnum,String data) throws IOException {

        fis=new FileInputStream(file);
        workbook=new XSSFWorkbook(fis);
        wsheet=workbook.getSheet(sheet);
        row=wsheet.getRow(rownum);
        cell=row.createCell(cellnum);
        cell.setCellValue(data);
        fio=new FileOutputStream(file);
        workbook.write(fio);
        workbook.close();
        fis.close();
        fio.close();

    }

    public static void fillGreenColor(String file,String sheet,int rownum,int cellnum) throws IOException {
        fis=new FileInputStream(file);
        workbook=new XSSFWorkbook(fis);
        wsheet=workbook.getSheet(sheet);
        row=wsheet.getRow(rownum);
        cell=row.getCell(cellnum);

        style=workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        fio=new FileOutputStream(file);

        workbook.write(fio);
        workbook.close();
        fis.close();
        fio.close();

    }

    public static void fillRedColor(String file,String sheet,int rownum,int cellnum) throws IOException {
        fis=new FileInputStream(file);
        workbook=new XSSFWorkbook(fis);
        wsheet=workbook.getSheet(sheet);
        row=wsheet.getRow(rownum);
        cell=row.getCell(cellnum);

        style=workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        fio=new FileOutputStream(file);

        workbook.write(fio);
        workbook.close();
        fis.close();
        fio.close();

    }

}
