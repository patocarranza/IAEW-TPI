package edu.utn.frc.iaew.ORM.DAOImplementacion;

import edu.utn.frc.iaew.ORM.Util.GenericDAO;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import edu.utn.frc.iaew.ORM.DAOInterface.IVendedor;
import edu.utn.frc.iaew.model.Vendedor;

/**
 *
 * @author ang_2
 */
public class VendedorDAO extends GenericDAO<Vendedor, Integer> implements IVendedor {

    private static final Logger LOG = Logger.getLogger(VendedorDAO.class);

    @Override
    public List<Vendedor> listar() {
        Session session = getHibernateTemplate();
        List<Vendedor> objetos = new ArrayList<>();
        try {
            String sql = "from Vendedor  ";
            objetos = session.createQuery(sql).list();
        } catch (RuntimeException e) {
            LOG.error("Error al buscar las Vendedor.", e);
        }
        return objetos;
    }

}
