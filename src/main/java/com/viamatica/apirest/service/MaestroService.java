package com.viamatica.apirest.service;

import com.viamatica.apirest.entity.Maestro;
import com.viamatica.apirest.repository.MaestroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MaestroService {

    @Autowired
    MaestroRepository maestroRepository;

    public ArrayList<Maestro> getAllMaestro(){
        return (ArrayList<Maestro>) maestroRepository.findAll();
    }
    public Maestro saveMaestro(Maestro maestro){
        return maestroRepository.save(maestro);
    }

    public Optional<Maestro> getById(Integer id){
        return maestroRepository.findById(id);
    }

    public boolean deleteMaestro(Integer id){
        try {
            maestroRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }
    }


    public List<Maestro> getByName(String nombre){
        return maestroRepository.findByNombre(nombre);
    }


    public int getCantidadAlumnos(Integer id){
        Optional<Maestro> maestro =  maestroRepository.findById(id);
        if (!maestro.isPresent()) {
            return 0;
        }
        return 5;
    }

}
