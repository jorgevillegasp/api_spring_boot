package com.viamatica.apirest.service;

import com.viamatica.apirest.entity.Alumno;
import com.viamatica.apirest.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    public List<Alumno> getAllAlumno(){
        return (List<Alumno>) alumnoRepository.findAll();
    }
}
