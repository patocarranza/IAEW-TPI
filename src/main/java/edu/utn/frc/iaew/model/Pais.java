package edu.utn.frc.iaew.model;

import java.io.Serializable;

/**
 *
 * @author patri_000
 */
public class Pais implements Serializable {
    
    private int id;
    private String nombre;

    public Pais() {
    }

    public Pais(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
