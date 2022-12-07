package dados;

import cantinaconectada.Lanchonete;
import cantinaconectada.Login;
import cantinaconectada.Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection con;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    List<Lanchonete> lista = new ArrayList<>();
    List<Produtos> lista2 = new ArrayList<>();

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

    public List<Lanchonete> pesquisarlanchonete() {

        String sql = "select * from lanchonete";
        con = new MySql().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Lanchonete objlanchonete = new Lanchonete();
                objlanchonete.setId_lanchonete(rs.getInt("id_lanchonete"));
                objlanchonete.setNome_lanchonete(rs.getString("nome_lanchonete"));

                lista.add(objlanchonete);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroDAO lanchonete " + erro);
        }
        return lista;

    }
    public List<Produtos> pesquisarProdutos() {

        String sql = "select * from produtos";
        con = new MySql().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Produtos pd = new Produtos();
                pd.setId_produtos(rs.getInt("id_produtos"));
                pd.setNome_produtos(rs.getString("nome_produto"));
                pd.setEmpresa(rs.getString("empresa"));

                lista2.add(pd);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroDAO Produtos " + erro);
        }
        return lista2;

    }

}
