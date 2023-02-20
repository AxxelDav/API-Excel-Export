package com.axel.project.repository;

import com.axel.project.entity.Examen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DataJpaTest
public class RepositorioExamenTest {

    @Autowired
    private ExamenRepository examenRepository;


    @DisplayName("")
    @Test
    public void testFindAllExamenRepository() {
        Examen examen1 = new Examen();
        examen1.setId(1L);
        examen1.setFechaExamen("23/04/2023");
        examen1.setAulaDesignada(123);
        examen1.setCantidadInscriptos(315);
        examen1.setCondicion("ALTA");
        examen1.setDepartamento("Ingenieria");
        examen1.setMateria("Programacion");
        examen1.setImporteIncripciones(870.12);
        examen1.setCodigoMateria(200);

        Examen examen2 = new Examen();
        examen2.setId(2L);
        examen2.setFechaExamen("26/04/2025");
        examen2.setAulaDesignada(130);
        examen2.setCantidadInscriptos(400);
        examen2.setCondicion("NORMAL");
        examen2.setDepartamento("Derecho");
        examen2.setMateria("Ingles");
        examen2.setImporteIncripciones(900.20);
        examen2.setCodigoMateria(300);

        List<Examen> examenes = Arrays.asList(examen1, examen2);

        examenRepository.save(examen1);
        examenRepository.save(examen2);

        List<Examen> examenesEncontrados = examenRepository.findAll();

        Assertions.assertEquals(examenes.size(), examenesEncontrados.size());
        Assertions.assertEquals(examenesEncontrados.get(0).getId(), examenes.get(0).getId());


    }
}

