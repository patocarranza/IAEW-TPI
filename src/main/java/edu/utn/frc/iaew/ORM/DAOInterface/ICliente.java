package edu.utn.frc.iaew.ORM.DAOInterface;


import edu.utn.frc.iaew.ORM.Util.IGenericDAO;
import edu.utn.frc.iaew.model.Cliente;
import java.util.List;

/**
 *
 * @author ang_2
 */
public interface ICliente extends IGenericDAO<Cliente, Integer> {

    public List<Cliente> listar();

}
