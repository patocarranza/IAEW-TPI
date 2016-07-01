/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.frc.iaew.ORM.DAOImplementacion;

import edu.utn.frc.iaew.ORM.Util.GenericDAO;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import edu.utn.frc.iaew.ORM.DAOInterface.IReserva;
import edu.utn.frc.iaew.model.Reserva;
import java.util.Date;

/**
 *
 * @author ang_2
 */
public class ReservaDAO extends GenericDAO<Reserva, Integer> implements IReserva {

    private static final Logger LOG = Logger.getLogger(ReservaDAO.class);

    @Override
    public List<Reserva> listarExistentes(boolean incluirCanceladas) {
        Session session = getHibernateTemplate();
        List<Reserva> objetos = new ArrayList<>();
        try {
            String sql = null ;
            if(incluirCanceladas)
                sql = " from Reserva  ";
            else
                sql = " from Reserva  where fechaCancelacion is null ";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las Reservas de la BD local ", e);
        }
        return objetos;
    }

    @Override
    public Reserva cancelarReserva(String codReserva) {
        Session session = getHibernateTemplate();
        List<Reserva> objetos = new ArrayList<>();
        try {     
            String sql = " from Reserva where fechaCancelacion is null and codigoReserva = :codReserva";
            objetos = session.createQuery(sql).setParameter("codReserva", codReserva).list();            
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las Reservas de la BD local ", e);
        }
        if (!objetos.isEmpty()) {
            Reserva res = objetos.get(0);
            res.setFechaCancelacion(new Date());                
            this.actualizar(res);
            return res;
            
        } else {
            throw new IllegalArgumentException("codigo de reserva no encontrado");
        }
    }

}
