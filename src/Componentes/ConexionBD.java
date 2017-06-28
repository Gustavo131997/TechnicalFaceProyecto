package Componentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;   
import java.util.Properties;

public class ConexionBD {
    
    private final String servidor = "localhost";
    private final String bd = "chile";


    public Connection getConexion() {
        Connection cn = null;  
        try {
            //MySQL
            Properties properties = new Properties();
            properties.setProperty("user", "gustavo");
            properties.setProperty("password", "13deenero");
            properties.setProperty("useSSL", "false");
            properties.setProperty("autoReconnect", "true");
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://"+servidor+"/"+bd+"", properties);
            
            //PostgreSQL
//            Class.forName("org.postgresql.Driver");
//            cn = DriverManager.getConnection("jdbc:postgresql://"+servidor+":5432/"+bd+"", ""+usuario+"", ""+password+"");
        } catch (ClassNotFoundException e) {
            cn = null;
        } catch (SQLException e) {
            cn = null;
        }
        return cn;
    }

}
