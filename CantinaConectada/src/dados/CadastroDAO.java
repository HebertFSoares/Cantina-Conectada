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
        String sql = "insert into cadastro (nome,email,senha,confirma) values (?,?,?,?)";

        con = new MySql().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, c.getNome());
            pstm.setBoolean(2, c.getEmail());
            pstm.setString(3, c.getSenha());
            pstm.setString(4, c.confirmas(c.getSenha()));
            
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro" + erro);
        }
    }

}
