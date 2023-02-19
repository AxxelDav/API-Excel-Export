package com.axel.project.model;

import lombok.*;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ExamenFinal {

    private Integer codigoMateria;
    private String materia;
    private String departamento;
    private String fechaExamen;
    private Integer cantidadInscriptos;
    private String condicion;
    private Integer aulaAsignada;
    private String publicacionNotas;
    private Double importeIncripciones;
}
