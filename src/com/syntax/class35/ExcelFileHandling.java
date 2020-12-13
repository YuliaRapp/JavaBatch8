package com.syntax.class35;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileHandling {
    public static void main(String[] args) throws IOException {
        //Break till 12:30
        String path="C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaBatch8\\src\\com\\syntax\\class35\\Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook=new XSSFWorkbook(fileInputStream);

    }
}
