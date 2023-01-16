package com.viamatica.apirest.controller;

import com.viamatica.apirest.entity.Maestro;
import com.viamatica.apirest.service.MaestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/maestro")
public class MaestroController {
/*
    @Autowired
    MaestroService maestroService;
    @GetMapping()
    public List<Maestro> getMaestro(){
        return this.maestroService.getAllMaestro();
    }


    @PostMapping()
    public Maestro guardarMaestro(@RequestBody Maestro maestro){

        return this.maestroService.saveMaestro(maestro);
    }

    @GetMapping(path = "/{id}")
    public Optional<Maestro> getById(@PathVariable("id") String id){
        int numeroInt = Integer.parseInt(id);
        return this.maestroService.getById(numeroInt);
    }


    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        boolean ok = this.maestroService.deleteMaestro(id);
        if(ok){
            return "Se elimino el maestro con exito " + id;
        }else {
            return "No se pudo eliminar el maestro " + id;
        }
    }

    @GetMapping(path = "/nombre/{nombre}")
    public List<Maestro> findByNombre(@PathVariable String nombre) {
        return maestroService.getByName(nombre);
    }

    @GetMapping("/{id}/alumnos")
    public int getCantidadAlumnos(@PathVariable String id) {
        int idAlumno = Integer.parseInt(id);
        return maestroService.getCantidadAlumnos(idAlumno);
    }
    */
}
