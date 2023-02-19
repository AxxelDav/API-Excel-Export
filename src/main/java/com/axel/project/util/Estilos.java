package com.axel.project.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

public class Estilos {

    public static Font createFont(XSSFWorkbook workbook, short fontColor, short fontHeight, boolean fontBold) {
        Font cellFont = workbook.createFont();
        cellFont.setColor(fontColor);
        cellFont.setFontHeightInPoints(fontHeight);
        cellFont.setBold(fontBold);
        cellFont.setFontName("Arial");
        return cellFont;
    }

    public static CellStyle createTitleStyle(XSSFWorkbook workbook, Font font, HorizontalAlignment cellAlignHorizontal, VerticalAlignment cellAlignVertical, short cellColor) {
        CellStyle estilo = workbook.createCellStyle();
        estilo.setFont(font);
        estilo.setAlignment(cellAlignHorizontal);
        estilo.setVerticalAlignment(cellAlignVertical);
        estilo.setFillForegroundColor(cellColor);
        estilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        return estilo;
    }

    public static CellStyle createHeaderStyle(XSSFWorkbook workbook, Font font, HorizontalAlignment cellAlignHorizontal, VerticalAlignment cellAlignVertical, boolean cellBorder, short cellColor) {
        CellStyle estilo = workbook.createCellStyle();
        estilo.setFont(font);
        estilo.setAlignment(cellAlignHorizontal);
        estilo.setVerticalAlignment(cellAlignVertical);
        estilo.setFillForegroundColor(cellColor);
        estilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        estilo.setWrapText(true);
        if (cellBorder) {
            estilo.setBorderTop(BorderStyle.THIN);
            estilo.setBorderLeft(BorderStyle.THIN);
            estilo.setBorderRight(BorderStyle.THIN);
            estilo.setBorderBottom(BorderStyle.THIN);
        }
        return estilo;
    }


    public static CellStyle createContentStyle(XSSFWorkbook workbook, Font font, HorizontalAlignment cellAlignHorizontal, VerticalAlignment cellAlignVertical, boolean cellBorder) {
        CellStyle estilo = workbook.createCellStyle();
        estilo.setFont(font);
        estilo.setAlignment(cellAlignHorizontal);
        estilo.setVerticalAlignment(cellAlignVertical);
        if (cellBorder) {
            estilo.setBorderTop(BorderStyle.THIN);
            estilo.setBorderLeft(BorderStyle.THIN);
            estilo.setBorderRight(BorderStyle.THIN);
            estilo.setBorderBottom(BorderStyle.THIN);
        }
        return estilo;
    }

    public static void bordesFinoCeldaCombinadaTitulo(Sheet sheet, int primerfila, int ultimaFila, int primerColumna, int ultimaColumna) {
        sheet.addMergedRegion(new CellRangeAddress(primerfila, ultimaFila, primerColumna, ultimaColumna));
        RegionUtil.setBorderTop(BorderStyle.THIN, new CellRangeAddress(primerfila, ultimaFila, primerColumna, ultimaColumna), sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN, new CellRangeAddress(primerfila, ultimaFila, primerColumna, ultimaColumna), sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, new CellRangeAddress(primerfila, ultimaFila, primerColumna, ultimaColumna), sheet);
        RegionUtil.setBorderRight(BorderStyle.THIN, new CellRangeAddress(primerfila, ultimaFila, primerColumna, ultimaColumna), sheet);
    }


    public static void aplicaEstiloCelda(Row dataRow, int primerColumna, CellStyle cellStyle) {
        Cell cell = dataRow.getCell(primerColumna);
        cell.setCellStyle(cellStyle);
    }

    public static void ajustaAnchoDeColumna(Sheet sheet) {
        sheet.setColumnWidth(0, 3000);
        sheet.setColumnWidth(1, 6000);
        sheet.setColumnWidth(2, 3500);
        sheet.setColumnWidth(3, 3000);
        sheet.setColumnWidth(4, 3000);
        sheet.setColumnWidth(5, 3000);
        sheet.setColumnWidth(6, 3000);
        sheet.setColumnWidth(7, 3100);
        sheet.setColumnWidth(8, 3100);
    }


}
