package com.viamatica.apirest.controller;

import com.viamatica.apirest.entity.Maestro;
import com.viamatica.apirest.service.MaestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/saludar")
public class HolaMundo {

    @Autowired
    MaestroService maestroService;
    @GetMapping("/hola")
    public String saludar(){
        return "hola";
    }

    @GetMapping("/maestros")
    public ArrayList<Maestro> getMaestro(){

        return maestroService.getAllMaestro();
    }
}
