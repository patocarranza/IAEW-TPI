package edu.utn.frc.iaew.ORM.DAOInterface;

import edu.utn.frc.iaew.ORM.Util.IGenericDAO;
import edu.utn.frc.iaew.model.Vendedor;
import java.util.List;

/**
 *
 * @author ang_2
 */
public interface IVendedor extends IGenericDAO<Vendedor, Integer> {

    public List<Vendedor> listar();

}
