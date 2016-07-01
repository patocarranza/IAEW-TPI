package edu.utn.frc.iaew.ORM.DAOInterface;

import edu.utn.frc.iaew.ORM.Util.IGenericDAO;
import edu.utn.frc.iaew.model.Reserva;
import java.util.List;

/**
 *
 * @author ang_2
 */
public interface IReserva extends IGenericDAO<Reserva, Integer> {

    public List<Reserva> listarExistentes(boolean incluirCanceladas);
    public Reserva cancelarReserva(String codReserva);

}
