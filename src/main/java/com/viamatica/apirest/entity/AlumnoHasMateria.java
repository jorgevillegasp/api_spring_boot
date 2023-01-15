package com.viamatica.apirest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno_has_materias")
public class AlumnoHasMateria {

    @EmbeddedId
    private AlumnoHasMateriaPK id;

    // RELACIONES
    @ManyToOne
    @JoinColumn(name = "id",insertable = false,updatable = false)
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name = "id",insertable = false,updatable = false)
    private Materia materia;


    //Geter y setter

    public AlumnoHasMateriaPK getId() {
        return id;
    }

    public void setId(AlumnoHasMateriaPK id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}

