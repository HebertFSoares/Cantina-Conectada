package cantinaconectada;

import cantinaconectada.Cadastro;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Cadastro {
    private String nome;
    private String email;
    private String senha;
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {

        if(this.email.endsWith("a.ficr.edu.br")){
            JOptionPane.showMessageDialog(null, "Você Foi Cadastrado Com Sucesso");
            return email;
        }else{
            JOptionPane.showMessageDialog(null, "Somente Email Da FICR Pode Ser Cadastrado!");
            return null;
        }
        
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
