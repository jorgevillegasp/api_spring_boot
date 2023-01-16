package com.viamatica.apirest.repository;

import com.viamatica.apirest.entity.Materia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Integer> {

    //ArrayList<Materia> findByNombre(String nombre);
}
