package com.viamatica.apirest.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AlumnoHasMateriaPK implements Serializable {

    @Column(name = "alumno_id")
    private Integer alumnoId;
    @Column(name = "materia_id")
    private Integer materiaId;

    public Integer getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Integer alumnoId) {
        this.alumnoId = alumnoId;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }
}
