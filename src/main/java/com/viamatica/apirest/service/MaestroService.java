package com.viamatica.apirest.service;

import com.viamatica.apirest.entity.Maestro;
import com.viamatica.apirest.repository.MaestroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaestroService {
    @Autowired
    MaestroRepository maestroRepository;


    /**
     *
     * @return
     */

    public ArrayList<Maestro> getAllMaestro(){
        return (ArrayList<Maestro>) maestroRepository.findAll();
    }
    public Maestro guardarMaestro(Maestro maestro){
        return maestroRepository.save(maestro);
    }
}
