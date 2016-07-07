package edu.utn.frc.iaew.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author ang_2
 */
@JsonAutoDetect
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Vendedor implements Serializable {

    private int id;
    private String nombre;

    public Vendedor() {
    }

    public Vendedor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @JsonProperty
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty
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
