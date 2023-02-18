package com.axel.project.service.impl;

import com.axel.project.entity.Examen;
import com.axel.project.repository.ExamenRepository;
import com.axel.project.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private ExamenRepository examenRepository;

    @Override
    public List<Examen> getAllExamenes() {
        return examenRepository.findAll();
    }
}
