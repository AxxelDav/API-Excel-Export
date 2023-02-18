package com.axel.project.sheet.header;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.List;

public class CabeceraExamenes {
    public static void cabeceraTabla(Sheet sheet, int fila, int columna, List<String> cabecera, CellStyle cellStyle) {

        Row row = sheet.createRow(fila);
        row.setHeight((short) 1200);

        for (int i=columna; i<cabecera.size()+columna; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(cabecera.get(i));
            cell.setCellStyle(cellStyle);
        }
    }
}
