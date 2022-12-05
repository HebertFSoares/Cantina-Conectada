package dados;

import cantinaconectada.Cadastro;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author heber
 */
public class CadastroDAO {

    Connection con;
    PreparedStatement pstm;

    public void cadastroBD(Cadastro c) {
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

}
