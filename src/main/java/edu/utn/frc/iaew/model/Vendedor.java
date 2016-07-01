package edu.utn.frc.iaew.model;

import java.io.Serializable;

/**
 *
 * @author ang_2
 */
public class Vendedor implements Serializable {

    private int id;
    private String nombre;

    public Vendedor() {
    }

    public Vendedor(int id, String nombre) {
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

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
