package edu.utn.frc.iaew.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author patri_000
 */
public class Vehiculo implements Serializable {
    
    private Integer cantidadDisponible;    
    private Integer cantidadPuertas;    
    private Integer ciudadId;    
    private Integer id;
    private String marca;    
    private String modelo;    
    private BigDecimal precioPorDia;    
    private String puntaje;    
    private Boolean tieneAireAcon;    
    private Boolean tieneDireccion;    
    private String tipoCambio;    
    private Integer vehiculoCiudadId;

    public Vehiculo() {
    }

    public Vehiculo(Integer cantidadDisponible, Integer cantidadPuertas, Integer ciudadId, Integer id, String marca, String modelo, BigDecimal precioPorDia, String puntaje, Boolean tieneAireAcon, Boolean tieneDireccion, String tipoCambio, Integer vehiculoCiudadId) {
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadPuertas = cantidadPuertas;
        this.ciudadId = ciudadId;
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precioPorDia = precioPorDia;
        this.puntaje = puntaje;
        this.tieneAireAcon = tieneAireAcon;
        this.tieneDireccion = tieneDireccion;
        this.tipoCambio = tipoCambio;
        this.vehiculoCiudadId = vehiculoCiudadId;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public Integer getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(Integer ciudadId) {
        this.ciudadId = ciudadId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(BigDecimal precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public Boolean getTieneAireAcon() {
        return tieneAireAcon;
    }

    public void setTieneAireAcon(Boolean tieneAireAcon) {
        this.tieneAireAcon = tieneAireAcon;
    }

    public Boolean getTieneDireccion() {
        return tieneDireccion;
    }

    public void setTieneDireccion(Boolean tieneDireccion) {
        this.tieneDireccion = tieneDireccion;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Integer getVehiculoCiudadId() {
        return vehiculoCiudadId;
    }

    public void setVehiculoCiudadId(Integer vehiculoCiudadId) {
        this.vehiculoCiudadId = vehiculoCiudadId;
    }
    
    
}
