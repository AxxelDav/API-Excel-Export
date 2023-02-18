package com.axel.project.controller;

import com.axel.project.export.ExportarExcel;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
public class DescargarExcelController {

    @Autowired
    public ExportarExcel exportarExcel;

    @GetMapping("/descarga/examenes")
    public void descargaExamenesExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=Examenes.xlsx");
        ByteArrayInputStream inputStream= exportarExcel.exportarExamenesExcel();
        IOUtils.copy(inputStream, response.getOutputStream());
    }
}
