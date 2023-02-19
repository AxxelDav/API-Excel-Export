package com.axel.project.sheet;

import com.axel.project.sheet.content.ContenidoExamenes;
import com.axel.project.sheet.header.CabeceraExamenes;
import com.axel.project.sheet.title.Titulo;
import com.axel.project.util.Estilos;
import lombok.Data;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Data
public class SheetExamenes {

    @Autowired
    private ContenidoExamenes contenidoExamenes;

    public void gererarHojaExamenesFinales(XSSFWorkbook workbook) {

        //Generacion de Fuentes
        Font titleFont = Estilos.createFont(workbook, IndexedColors.BLACK.getIndex(), (short)13, true);
        Font headerFont = Estilos.createFont(workbook, IndexedColors.BLACK.getIndex(), (short)10, true);
        Font contentFont = Estilos.createFont(workbook, IndexedColors.BLACK.getIndex(), (short)10, false);

        //Generacion de Estilos
        CellStyle titleStyle = Estilos.createTitleStyle(workbook, titleFont, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, IndexedColors.AQUA.getIndex());
        CellStyle headerStyle = Estilos.createHeaderStyle(workbook, headerFont, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, true, IndexedColors.LIGHT_YELLOW.getIndex());
        CellStyle contentStyle = Estilos.createContentStyle(workbook, contentFont, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, true);

        //Strings
        List<String> cabecera = Arrays.asList("Codigo de Materia", "Materia", "Departamento", "Fecha de Examen", "Cantidad de Inscriptos", "Condicion", "Aula Asignada", "Publicacion de Notas", "Importe de Incripciones");
        String titulo = "EXAMENES FINALES";

        //Creo Hoja
        Sheet sheet = workbook.createSheet("Examenes");

        //Titulo
        Titulo.titulo(sheet, titulo, titleStyle, 1, 0, 1, 1, 0, 8);

        //Cabecera
        CabeceraExamenes.cabeceraTabla(sheet, 3, 0, cabecera, headerStyle);

        //Contenido de Tabla
        contenidoExamenes.contenidoTabla(sheet, contentStyle, 4);

        //Ajusta Ancho de las Columnas
        Estilos.ajustaAnchoDeColumna(sheet);
    }
}
