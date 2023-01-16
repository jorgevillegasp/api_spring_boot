package com.viamatica.apirest.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "maestro")
public class Maestro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", length = 255)
    private String nombre;
    @Column(name = "apellido", length = 255)
    private String apellido;
    @Column(name = "titulo", length = 255)
    private String titulo;
    @Column(name = "estado")
    private boolean estado;

    //RELACIONES
    @OneToMany(mappedBy = "maestro")
    private List<Alumno> alumnos;

    //Getter y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
