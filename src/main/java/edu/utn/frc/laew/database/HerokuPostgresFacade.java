package edu.utn.frc.laew.database;

import edu.utn.frc.iaew.misc.Utils;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.joda.time.DateTime;

/**
 * Class in charge of operations against the heroku-provided postgreSQL
 * database.                                
 * @author Patricio Carranza
 * @version 1.00.000
 * last update: 06/15/2016
 */
public class HerokuPostgresFacade {
    
    
    /**
     * Heroku provided method for connecting to the Heroku provided postgres DB
     * (or the local postgres db if configured in the .env file).
     * @return
     * @throws SQLException 
     */
    private static Connection getConnection() 
            throws URISyntaxException, SQLException {
        URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

        return DriverManager.getConnection(dbUrl, username, password);
    }
    
    /**
     * Checks the existence of the postgres database and creates the tables
     * in case they don't exist.
     * @throws SQLException 
     * @throws java.net.URISyntaxException 
     */
    public static void initDB() 
            throws SQLException, URISyntaxException {

        Connection connection = null;
        Statement stmt = null;
        try {
            connection = getConnection();
            stmt = connection.createStatement();
                       
            //We need to have dates in MDY format (month, date, year) in order to
            //ensure comfortable reading for americans and proper dates calculations.
            //DOESNT work because postgres conf file resets the default value
            //every time the client reconnects. We use the PostgresUtils methods to
            //handle dates.
            /*ResultSet rs = stmt.executeQuery("SELECT current_database()");
            String dbName = null;
            while(rs.next()) {
                dbName = rs.getString(1);
                stmt.executeUpdate("ALTER DATABASE \"" + dbName + "\" SET datestyle TO 'ISO, MDY';");
                System.out.println("database altered");
                break;
            }                      
            rs = stmt.executeQuery("SHOW datestyle");
            while(rs.next()) {
                System.out.println("datestyle = " + rs.getString(1));
            }*/                        
                              
        } finally {
            if (stmt != null) try{stmt.close();} catch(SQLException e){}
            if (connection != null) try{connection.close();} catch(SQLException e){}
        }
    }       
    
       
}
