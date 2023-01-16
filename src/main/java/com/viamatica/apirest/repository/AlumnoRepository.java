package com.viamatica.apirest.repository;

import com.viamatica.apirest.entity.Alumno;
import com.viamatica.apirest.entity.Maestro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {

    List<Alumno> findByNombre(String nombre);
}
