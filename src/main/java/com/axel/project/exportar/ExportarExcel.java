package com.axel.project.exportar;

import com.axel.project.sheet.SheetExamenes;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Component
public class ExportarExcel {

    @Autowired
    SheetExamenes sheetExamenes;

    public ByteArrayInputStream exportarExamenesExcel() throws IOException {
        try (XSSFWorkbook workbook = new XSSFWorkbook(); ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            sheetExamenes.gererarHojaExamenesFinales(workbook);
            workbook.write(outputStream);
            return new ByteArrayInputStream(outputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException();
        }
    }
}
