package edu.utn.frc.iaew.ORM.DAOImplementacion;

import edu.utn.frc.iaew.ORM.DAOInterface.ICliente;
import edu.utn.frc.iaew.ORM.Util.GenericDAO;
import edu.utn.frc.iaew.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author ang_2
 */
public class ClienteDAO extends GenericDAO<Cliente, Integer> implements ICliente {

    private static final Logger LOG = Logger.getLogger(ClienteDAO.class);

    @Override
    public List<Cliente> listar() {
        Session session = getHibernateTemplate();
        List<Cliente> objetos = new ArrayList<>();
        try {
            String sql = "from Cliente  ";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las Cliente.", e);
        }
        return objetos;
    }

}
