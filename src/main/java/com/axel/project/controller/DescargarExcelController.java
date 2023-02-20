package com.axel.project.controller;

import com.axel.project.exportar.ExportarExcel;
import com.axel.project.importar.ImportExcel;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
public class DescargarExcelController {

    @Autowired
    private ExportarExcel exportarExcel;

    @Autowired
    private ImportExcel importExcel;

    @GetMapping("/exportar/examenes")
    public void descargaExamenesExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=Examenes.xlsx");
        ByteArrayInputStream inputStream= exportarExcel.exportarExamenesExcel();
        IOUtils.copy(inputStream, response.getOutputStream());
    }


    @GetMapping("/importar/archivoExcel")
    public ResponseEntity<String> importaArvhicoExcel() throws IOException {
        try {
            importExcel.leerExcel();
            return new ResponseEntity<>("La importacion del archivo Excel se ha realizado con exito.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("La importacion del archivo Excel ha fallado.", HttpStatus.BAD_REQUEST);
       }
    }
}
