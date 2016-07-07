
package edu.utn.frc.iaew.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author patri_000
 */
@JsonAutoDetect
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ciudad implements Serializable {
    
    private int id;
    private int idpk;
    private String nombre;
    private int idPais;

    public Ciudad() {
    }

    @JsonProperty
    public int getIdpk() {
        return idpk;
    }

    public void setIdpk(int idpk) {
        this.idpk = idpk;
    }

    public Ciudad(int id) {
        this.id = id;
        this.nombre = "";
    }        

    public Ciudad(int id, String nombre, int idPais) {
        this.id = id;
        this.nombre = nombre;
        this.idPais = idPais;
    }

    @JsonProperty
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

    @JsonProperty
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", nombre=" + nombre + ", idPais=" + idPais + '}';
    }
    
    
}
