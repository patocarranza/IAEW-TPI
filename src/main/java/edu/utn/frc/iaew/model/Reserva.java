package edu.utn.frc.iaew.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.EstadoReservaEnum;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.LugarRetiroDevolucion;
import org.datacontract.schemas._2004._07.wcfreservavehiculos_business.VehiculoModel;

/**
 *
 * @author ang_2
 */
public class Reserva implements Serializable {    

    private int id;
    private String codigoReserva;
    private Date fechaReserva;
    private Date fechaHoraDevolucion;
    private Date fechaHoraRetiro;
    private Date fechaCancelacion;
    private EstadoReservaEnum estado;
    private LugarRetiroDevolucion lugarRetiro;
    private LugarRetiroDevolucion lugarDevolucion;    
    private Vendedor vendedor;
    private Cliente cliente;
    private String usuarioReserva;
    private String usuarioCancelacion;
    private BigDecimal costo;
    private BigDecimal precioFinal;
    private int vehiculoPorCiudadId;
    private Vehiculo vehiculo;
    

    public Reserva() {
    }

    public Reserva(int id, String codigoReserva, Date fechaReserva, Date fechaHoraDevolucion, 
                   Date fechaHoraRetiro, Date fechaCancelacion, EstadoReservaEnum estado, 
                   LugarRetiroDevolucion lugarRetiro, LugarRetiroDevolucion lugarDevolucion, 
                   Vendedor vendedor, Cliente cliente, String usuarioReserva, String usuarioCancelacion, 
                   BigDecimal costo, BigDecimal precioFinal, int vehiculoPorCiudadId, Vehiculo vehiculo) {
        this.id = id;
        this.codigoReserva = codigoReserva;
        this.fechaReserva = fechaReserva;
        this.fechaHoraDevolucion = fechaHoraDevolucion;
        this.fechaHoraRetiro = fechaHoraRetiro;
        this.fechaCancelacion = fechaCancelacion;
        this.estado = estado;
        this.lugarRetiro = lugarRetiro;
        this.lugarDevolucion = lugarDevolucion;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.usuarioReserva = usuarioReserva;
        this.usuarioCancelacion = usuarioCancelacion;
        this.costo = costo;
        this.precioFinal = precioFinal;
        this.vehiculoPorCiudadId = vehiculoPorCiudadId;
        this.vehiculo = vehiculo;
    }

    public String getUsuarioReserva() {
        return usuarioReserva;
    }

    public void setUsuarioReserva(String usuarioReserva) {
        this.usuarioReserva = usuarioReserva;
    }

    public String getUsuarioCancelacion() {
        return usuarioCancelacion;
    }

    public void setUsuarioCancelacion(String usuarioCancelacion) {
        this.usuarioCancelacion = usuarioCancelacion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
  
    public Date getFechaHoraDevolucion() {
        return fechaHoraDevolucion;
    }

    public void setFechaHoraDevolucion(Date fechaHoraDevolucion) {
        this.fechaHoraDevolucion = fechaHoraDevolucion;
    }

    public Date getFechaHoraRetiro() {
        return fechaHoraRetiro;
    }

    public void setFechaHoraRetiro(Date fechaHoraRetiro) {
        this.fechaHoraRetiro = fechaHoraRetiro;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public EstadoReservaEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoReservaEnum estado) {
        this.estado = estado;
    }

    public LugarRetiroDevolucion getLugarRetiro() {
        return lugarRetiro;
    }

    public void setLugarRetiro(LugarRetiroDevolucion lugarRetiro) {
        this.lugarRetiro = lugarRetiro;
    }

    public LugarRetiroDevolucion getLugarDevolucion() {
        return lugarDevolucion;
    }

    public void setLugarDevolucion(LugarRetiroDevolucion lugarDevolucion) {
        this.lugarDevolucion = lugarDevolucion;
    }

    public BigDecimal getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(BigDecimal precioFinal) {
        this.precioFinal = precioFinal;
    }

    public int getVehiculoPorCiudadId() {
        return vehiculoPorCiudadId;
    }

    public void setVehiculoPorCiudadId(int vehiculoPorCiudadId) {
        this.vehiculoPorCiudadId = vehiculoPorCiudadId;
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", codigoReserva=" + codigoReserva + ", fechaReserva=" + fechaReserva + ", fechaHoraDevolucion=" + fechaHoraDevolucion + ", fechaHoraRetiro=" + fechaHoraRetiro + ", fechaCancelacion=" + fechaCancelacion + ", estado=" + estado + ", lugarRetiro=" + lugarRetiro + ", lugarDevolucion=" + lugarDevolucion + ", vendedor=" + vendedor + ", cliente=" + cliente + ", usuarioReserva=" + usuarioReserva + ", usuarioCancelacion=" + usuarioCancelacion + ", costo=" + costo + ", precioFinal=" + precioFinal + ", vehiculoPorCiudadId=" + vehiculoPorCiudadId + ", vehiculo=" + vehiculo + '}';
    }
}
