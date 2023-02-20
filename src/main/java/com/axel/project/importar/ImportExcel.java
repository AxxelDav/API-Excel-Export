package com.axel.project.importar;

import com.axel.project.service.impl.ProductServiceImpl;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImportExcel {

    @Autowired
    private ProductServiceImpl productService;

    public void leerExcel() throws IOException {
            FileInputStream archivoExcel = new FileInputStream("C:\\Users\\Usuario\\Desktop\\archivoExcel.xlsx"); //Colocamos ruta donde para buscar el archivo
            XSSFWorkbook workbook = new XSSFWorkbook(archivoExcel); //Obtencion de libro Excel
            XSSFSheet sheet = workbook.getSheetAt(0);//Obtencion de primer hoja (indice 0) del libro Excel
            int numeroFilas = sheet.getLastRowNum();//Obtengo el numero de filas maximo de la hoja
            for (int i = 1; i <= numeroFilas; i++) {
                List<Object> listaUnProducto= new ArrayList<>();
                Row fila = sheet.getRow(i); //Me posiciono en la fila numero "i"
                int numeroColumnas = fila.getLastCellNum();//para la fila numero "i" obtengo la cantidad de columnas
                for (int j = 0; j < numeroColumnas; j++) {
                    Cell celda = fila.getCell(j); //Me posiciono en la columna numero "j"
                    switch (celda.getCellType().toString()) { //Dependiendo el tipo de dato de la celda ("CellType") imprimo el valor con el metodo correspondiente a su tipo de dato.
                        case "NUMERIC":
                            System.out.print(celda.getNumericCellValue() + " ");
                            listaUnProducto.add(celda.getNumericCellValue());
                            break;
                        case "STRING":
                            System.out.print(celda.getStringCellValue() + " ");
                            listaUnProducto.add(celda.getStringCellValue());
                            break;
                        case "FORMULA":
                            System.out.print(celda.getNumericCellValue());
                            listaUnProducto.add(celda.getNumericCellValue());
                            break;
                    }
                }
                productService.persistProduct(listaUnProducto);
                System.out.println("");
            }
    }
}
