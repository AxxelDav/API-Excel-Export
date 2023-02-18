package com.axel.project.sheet.content;

import com.axel.project.model.ExamenFinal;
import com.axel.project.util.Estilos;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;

public class ContenidoExamenes {

    public static void contenidoTabla(Sheet sheet, List<ExamenFinal> examenes, CellStyle cellStyle, int fila) {

        int rowIndex = fila;

        for (ExamenFinal examenFinal : examenes) {
            int primerColumna = 0;
            Row dataRow = sheet.createRow(rowIndex);
            dataRow.createCell(primerColumna).setCellValue(examenFinal.getCodigoMateria());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examenFinal.getMateria());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examenFinal.getDepartamento());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examenFinal.getFechaExamen());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examenFinal.getCantidadInscriptos());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examenFinal.getCondicion());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examenFinal.getAulaAsignada());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examenFinal.getPublicacionNotas());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examenFinal.getImporteIncripciones());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);

            rowIndex++;
        }

    }


}
