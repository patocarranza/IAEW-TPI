/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public Vendedor(String nombre) {
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