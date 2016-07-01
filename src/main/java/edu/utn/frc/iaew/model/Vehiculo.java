package edu.utn.frc.iaew.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author patri_000
 */
public class Vehiculo implements Serializable {
        
    private int id;
    private int cantidadPuertas;    
    private String marca;    
    private String modelo;    
    private BigDecimal precioPorDia;    
    private String puntaje;    
    private Boolean tieneAireAcon;    
    private Boolean tieneDireccion;    
    private String tipoCambio;
    private Ciudad ciudad;
    private int cantidadDisponible;
    private int vehiculoPorCiudadId;

    public Vehiculo() {
    }

    public Vehiculo(Integer id, Integer cantidadPuertas, String marca, String modelo,
                    BigDecimal precioPorDia, String puntaje, Boolean tieneAireAcon,
                    Boolean tieneDireccion, String tipoCambio, Ciudad ciudad, 
                    int cantidadDisponible, int vehiculoPorCiudadId) {
        this.id = id;
        this.cantidadPuertas = cantidadPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.precioPorDia = precioPorDia;
        this.puntaje = puntaje;
        this.tieneAireAcon = tieneAireAcon;
        this.tieneDireccion = tieneDireccion;
        this.tipoCambio = tipoCambio;
        this.ciudad = ciudad;
        this.cantidadDisponible = cantidadDisponible;
        this.vehiculoPorCiudadId = vehiculoPorCiudadId;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
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

    public int getVehiculoPorCiudadId() {
        return vehiculoPorCiudadId;
    }

    public void setVehiculoPorCiudadId(int vehiculoPorCiudadId) {
        this.vehiculoPorCiudadId = vehiculoPorCiudadId;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", cantidadPuertas=" + cantidadPuertas + ", marca=" + marca + ", modelo=" + modelo + ", precioPorDia=" + precioPorDia + ", puntaje=" + puntaje + ", tieneAireAcon=" + tieneAireAcon + ", tieneDireccion=" + tieneDireccion + ", tipoCambio=" + tipoCambio + ", ciudad=" + ciudad + ", cantidadDisponible=" + cantidadDisponible + ", vehiculoPorCiudadId=" + vehiculoPorCiudadId + '}';
    }   
}
