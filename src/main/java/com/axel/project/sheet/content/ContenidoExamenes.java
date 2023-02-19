package com.axel.project.sheet.content;

import com.axel.project.entity.Examen;
import com.axel.project.model.ExamenFinal;
import com.axel.project.service.impl.ExamenServiceImpl;
import com.axel.project.util.Estilos;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContenidoExamenes {

    @Autowired
    private ExamenServiceImpl examenService;

    public void contenidoTabla(Sheet sheet, CellStyle cellStyle, int fila) {

        int rowIndex = fila;

        List<Examen> examenes = examenService.getAllExamenes();

        for (Examen examen : examenes) {
            int primerColumna = 0;
            Row dataRow = sheet.createRow(rowIndex);
            dataRow.createCell(primerColumna).setCellValue(examen.getCodigoMateria());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examen.getMateria());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examen.getDepartamento());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examen.getFechaExamen());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examen.getCantidadInscriptos());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examen.getCondicion());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examen.getAulaDesignada());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examen.getPublicacionNotas());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);
            dataRow.createCell(++primerColumna).setCellValue(examen.getImporteIncripciones());
            Estilos.aplicaEstiloCelda(dataRow, primerColumna, cellStyle);

            rowIndex++;
        }

    }


}
