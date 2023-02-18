package com.axel.project.sheet.title;

import com.axel.project.util.Estilos;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Titulo {

    public static void titulo(Sheet sheet, String titulo, CellStyle cellStyle, int fila, int columna, int firstRow, int lastRow, int firstCol, int lastCol) {
        Row row = sheet.createRow(fila);
        Cell cell = row.createCell(columna);
        cell.setCellValue(titulo);
        cell.setCellStyle(cellStyle);
        Estilos.bordesFinoCeldaCombinadaTitulo(sheet, firstRow ,lastRow, firstCol, lastCol);

    }
}
