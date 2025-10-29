import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author kleib
 */
public class Conexion {
    Connection conectar;
    
    String user = "user";
    String clave = "admin";
    String dbName = "clinicadb";
    String ip = "localhost";
    int port = 1433;
    
    String cadena = "jdbc:sqlserver://" + ip + ":" + port + "/" + dbName; 

    public Connection startConection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String cadena = "jdbc:sqlserver://localhost:" + port + ";databaseName=" + dbName;
            conectar = DriverManager.getConnection(cadena, user, clave);
            JOptionPane.showMessageDialog(null, "Se conecto a la bse de Datos");    
        } catch (Exception e) {
            System.err.println("Error al conectar a Base de Datos, error: " + e.toString());
            JOptionPane.showMessageDialog(null, "Error al conectar a Base de Datos, error: " + e.toString());
        }
        return conectar;
    }

}
