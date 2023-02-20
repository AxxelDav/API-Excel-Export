package com.axel.project.service;

import com.axel.project.entity.Examen;
import com.axel.project.repository.ExamenRepository;
import com.axel.project.service.impl.ExamenServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
public class ServicioExamenTest {

    @InjectMocks
    private ExamenServiceImpl examenService;

    @Mock
    private ExamenRepository examenRepository;

    @BeforeEach
    public void setUp() {
    }


    @DisplayName("Probamos el metodo findAll del Servicio")
    @Test
    public void traeListaDeExamenes() {

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

        List<Examen> examenes = new ArrayList<>();
        examenes.add(examen1);
        examenes.add(examen2);

        Mockito.when(examenRepository.findAll()).thenReturn(examenes);

        Assertions.assertEquals(examenRepository.findAll().size(), examenes.size());
        Assertions.assertEquals("Programacion", examenes.get(0).getMateria());

    }
}
