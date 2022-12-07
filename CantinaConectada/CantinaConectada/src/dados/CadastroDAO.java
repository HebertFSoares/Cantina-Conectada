package dados;

import cantinaconectada.Cadastro;
import cantinaconectada.Lanchonete;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hebert
 */
public class CadastroDAO {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Lanchonete> lista = new ArrayList<>();
    
    public void cadastroBD(Cadastro c) throws SQLException {
        String sql = "insert into usuario (nome_usuario,email_usuario,senha_usuario) values (?,?,?)";
        
        con = new MySql().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, c.getNome());
            pstm.setString(2, c.getEmail());
            pstm.setString(3, c.getSenha());
            
            
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro" + erro);
        }
    }

    /**
     *
     * @return
     */
    

}
