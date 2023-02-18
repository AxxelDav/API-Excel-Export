package com.axel.project.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EXAMENES")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_MATERIA")
    private Integer codigoMateria;

    @Column(name = "MATERIA")
    private String materia;

    @Column(name = "DEPARTAMENTO")
    private String departamento;

    @Column(name = "FECHA_DE_EXAMEN")
    private String fechaExamen;

    @Column(name = "CANTIDAD_DE_INSCRIPTOS")
    private Integer cantidadInscriptos;

    @Column(name = "CONDICION")
    private String condicion;

    @Column(name = "AULA_DESIGNADA")
    private Integer aulaDesignada;

    @Column(name = "PUBLICACION_DE_LAS_NOTAS")
    private String publicacionNotas;

    @Column(name = "IMPORTE_DE_INSCRIPCIONES")
    private Double importeIncripciones;

}
