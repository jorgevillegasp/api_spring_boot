package com.viamatica.apirest.controller;

import com.viamatica.apirest.entity.Alumno;
import com.viamatica.apirest.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;
    @GetMapping
    public List<Alumno> getAll(){
        return alumnoService.getAllAlumno();
    }
}
