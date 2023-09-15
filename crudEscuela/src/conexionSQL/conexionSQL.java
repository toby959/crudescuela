
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author toby959
 */
public class conexionSQL {
    
    Connection conectar = null;
    
    public Connection conexion(){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "");
            
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "Error de Conexión" + e.getMessage());
        }
        
        return conectar;
    }
    
}
