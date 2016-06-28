
package edu.utn.frc.iaew.model;

import java.io.Serializable;

/**
 *
 * @author patri_000
 */
public class Ciudad implements Serializable {
    
    private int id;
    private String nombre;
    private int idPais;

    public Ciudad() {
    }

    public Ciudad(int id, String nombre, int idPais) {
        this.id = id;
        this.nombre = nombre;
        this.idPais = idPais;
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

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    
    
}
