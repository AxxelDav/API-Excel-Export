package com.axel.project.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PRODUCTOS")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "CANTIDAD")
    private Double cantidad;

    @Column(name = "PRECIO_UNITARIO")
    private Double precioUnitario;

    @Column(name = "TOTAL")
    private Double total;
}
