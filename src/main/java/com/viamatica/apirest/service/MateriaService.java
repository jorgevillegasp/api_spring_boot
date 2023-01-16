package com.viamatica.apirest.service;

import com.viamatica.apirest.entity.Maestro;
import com.viamatica.apirest.entity.Materia;
import com.viamatica.apirest.repository.AlumnoRepository;
import com.viamatica.apirest.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository materiaRepository;

    public List<Materia> getAll(){
        return (ArrayList<Materia>) materiaRepository.findAll();
    }

    public Optional<Materia> getById(Integer id){
        return materiaRepository.findById(id);
    }

}
