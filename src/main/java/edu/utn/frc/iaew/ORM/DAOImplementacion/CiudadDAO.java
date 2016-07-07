package edu.utn.frc.iaew.ORM.DAOImplementacion;

import edu.utn.frc.iaew.ORM.DAOInterface.ICiudad;
import edu.utn.frc.iaew.ORM.DAOInterface.ICliente;
import edu.utn.frc.iaew.ORM.Util.GenericDAO;
import edu.utn.frc.iaew.model.Ciudad;
import edu.utn.frc.iaew.model.Cliente;
import edu.utn.frc.iaew.model.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import edu.utn.frc.iaew.ORM.DAOInterface.IVehiculo;

/**
 *
 * @author ang_2
 */
public class CiudadDAO extends GenericDAO<Ciudad, Integer> implements ICiudad {

    private static final Logger LOG = Logger.getLogger(CiudadDAO.class);

}
