package com.viamatica.apirest.repository;

import com.viamatica.apirest.entity.Maestro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaestroRepository extends CrudRepository<Maestro, Integer> {

}
