package com.viamatica.apirest.controller;

import com.viamatica.apirest.entity.Materia;
import com.viamatica.apirest.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping
    public List<Materia> getAll(){
        return materiaService.getAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Materia> getById(@PathVariable("id") String id){
        Integer idMateria = Integer.parseInt(id);
        return materiaService.getById(idMateria);
    }
}
