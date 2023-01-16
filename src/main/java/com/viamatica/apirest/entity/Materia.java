package com.viamatica.apirest.entity;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "materia")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "descripcion", length = 255)
    private String descripcion;
    @Column(name = "puntos")
    private Integer puntos;
    @Column(name = "estado")
    private boolean estado;

    // RELACIONES
    @ManyToMany(mappedBy = "materia")
    private List<AlumnoHasMateria> alumnoHasMaterias;

    //Getter y setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<AlumnoHasMateria> getAlumnoHasMaterias() {
        return alumnoHasMaterias;
    }

    public void setAlumnoHasMaterias(List<AlumnoHasMateria> alumnoHasMaterias) {
        this.alumnoHasMaterias = alumnoHasMaterias;
    }
}

