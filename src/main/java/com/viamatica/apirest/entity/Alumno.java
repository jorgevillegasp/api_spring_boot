package com.viamatica.apirest.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre", length = 255)
    private String nombre;

    @Column(name = "apellido", length = 255)
    private String apellido;
    //@Column(name = "maestro_id")
    //private Integer maestro_id;

    @Column(name = "estado")
    private boolean estado;

    // RELACIONES

    @ManyToOne
    @JoinColumn(name = "maestro_id", insertable = false,updatable = false)
    private Maestro maestro;
    @OneToMany(mappedBy = "alumno")
    private List<AlumnoHasMateria> alumnoHasMaterias;


    //geters y setters

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public List<AlumnoHasMateria> getAlumnoHasMaterias() {
        return alumnoHasMaterias;
    }

    public void setAlumnoHasMaterias(List<AlumnoHasMateria> alumnoHasMaterias) {
        this.alumnoHasMaterias = alumnoHasMaterias;
    }
}
