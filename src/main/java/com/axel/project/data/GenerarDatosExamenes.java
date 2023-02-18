package com.axel.project.data;

import com.axel.project.model.ExamenFinal;
import com.axel.project.util.FomatDate;

import java.util.ArrayList;
import java.util.List;

public class GenerarDatosExamenes {

    public static List<ExamenFinal> examenesFinalesDummy() {

        List<ExamenFinal> listaExamenes = new ArrayList<>();

        ExamenFinal primerExamen = ExamenFinal.builder()
                .codigoMateria(1010)
                .materia("Derecho Publico")
                .departamento("Derecho")
                .fechaExamen(FomatDate.fechaFormateada(18, 7, 2016))
                .cantidadInscriptos(202)
                .condicion("ALTA")
                .aulaAsignada(812)
                .publicacionNotas(FomatDate.fechaFormateada(8, 8, 2016))
                .importeIncripciones(44.440)
                .build();

        ExamenFinal segundoExamen = ExamenFinal.builder()
                .codigoMateria(1280)
                .materia("Derecho Penal")
                .departamento("Derecho")
                .fechaExamen(FomatDate.fechaFormateada(19, 7, 2016))
                .cantidadInscriptos(168)
                .condicion("NORMAL")
                .aulaAsignada(805)
                .publicacionNotas(FomatDate.fechaFormateada(5, 8, 2016))
                .importeIncripciones(39.960)
                .build();

        listaExamenes.add(primerExamen);
        listaExamenes.add(segundoExamen);

        return listaExamenes;
    }
}
