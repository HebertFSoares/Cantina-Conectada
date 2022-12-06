package dados;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySql {
    public Connection conectaBD(){
        Connection con = null;
        
        try {
            String url = "jdbc:mysql://localhost/cantinaconectada?user=root&password=";
            con = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoBD" + erro.getMessage());
        }
        return con;
    }
}
