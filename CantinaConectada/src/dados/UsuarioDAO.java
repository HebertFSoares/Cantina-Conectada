package dados;

import cantinaconectada.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection con;
    
    public ResultSet autenticacaoUsuario(Login usuario) {
        con = new MySql().conectaBD();
        
        try {
            String sql = "select * from usuario where email_usuario = ? and senha_usuario = ?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario.getEmail_usuario());
            pstm.setString(2, usuario.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
        
    }
    
}
