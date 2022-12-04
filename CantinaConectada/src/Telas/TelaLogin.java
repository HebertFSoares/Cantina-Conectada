package Telas;

import cantinaconectada.Cadastro;
import cantinaconectada.Login;
import dados.UsuarioDAO;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author hebert
 */
public class TelaLogin extends javax.swing.JFrame {

    private ArrayList<Cadastro> lista = new ArrayList<Cadastro>();

   
    public TelaLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PainelFormulario = new javax.swing.JPanel();
        PainelCampoEmail = new javax.swing.JPanel();
        LabelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        PainelCampoSenha = new javax.swing.JPanel();
        LabelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        PainelBotoes = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cantina Conectada");
        setMinimumSize(new java.awt.Dimension(380, 330));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelPrincipal.setBackground(new java.awt.Color(250, 250, 250));
        PainelPrincipal.setMaximumSize(new java.awt.Dimension(380, 330));
        PainelPrincipal.setMinimumSize(new java.awt.Dimension(380, 330));
        PainelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PainelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Base01.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(380, 128));
        jLabel2.setMinimumSize(new java.awt.Dimension(380, 128));
        jLabel2.setPreferredSize(new java.awt.Dimension(380, 128));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, -1));

        PainelFormulario.setMaximumSize(new java.awt.Dimension(200, 150));
        PainelFormulario.setMinimumSize(new java.awt.Dimension(200, 150));
        PainelFormulario.setOpaque(false);
        PainelFormulario.setPreferredSize(new java.awt.Dimension(200, 150));
        PainelFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelCampoEmail.setMaximumSize(new java.awt.Dimension(200, 60));
        PainelCampoEmail.setMinimumSize(new java.awt.Dimension(200, 60));
        PainelCampoEmail.setOpaque(false);
        PainelCampoEmail.setPreferredSize(new java.awt.Dimension(200, 60));
        PainelCampoEmail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelEmail.setText("E-mail Institucional");
        LabelEmail.setMaximumSize(new java.awt.Dimension(200, 25));
        LabelEmail.setMinimumSize(new java.awt.Dimension(200, 25));
        LabelEmail.setPreferredSize(new java.awt.Dimension(200, 25));
        PainelCampoEmail.add(LabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtEmail.setMaximumSize(new java.awt.Dimension(200, 35));
        txtEmail.setMinimumSize(new java.awt.Dimension(200, 35));
        txtEmail.setName(""); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 35));
        PainelCampoEmail.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

        PainelFormulario.add(PainelCampoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PainelCampoSenha.setMaximumSize(new java.awt.Dimension(200, 60));
        PainelCampoSenha.setOpaque(false);
        PainelCampoSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelSenha.setText("Senha");
        LabelSenha.setMaximumSize(new java.awt.Dimension(200, 25));
        LabelSenha.setMinimumSize(new java.awt.Dimension(200, 25));
        LabelSenha.setPreferredSize(new java.awt.Dimension(200, 25));
        PainelCampoSenha.add(LabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PainelFormulario.add(PainelCampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));
        PainelFormulario.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 200, 35));

        getContentPane().add(PainelFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 120));

        PainelBotoes.setMaximumSize(new java.awt.Dimension(150, 35));
        PainelBotoes.setMinimumSize(new java.awt.Dimension(150, 35));
        PainelBotoes.setName(""); // NOI18N
        PainelBotoes.setPreferredSize(new java.awt.Dimension(200, 45));
        PainelBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegister.setText("Register");
        btnRegister.setMaximumSize(new java.awt.Dimension(95, 35));
        btnRegister.setMinimumSize(new java.awt.Dimension(95, 35));
        btnRegister.setPreferredSize(new java.awt.Dimension(95, 35));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        PainelBotoes.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        btnLogin.setText("Login");
        btnLogin.setMaximumSize(new java.awt.Dimension(95, 35));
        btnLogin.setMinimumSize(new java.awt.Dimension(95, 35));
        btnLogin.setPreferredSize(new java.awt.Dimension(95, 35));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        PainelBotoes.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 0, 90, -1));

        getContentPane().add(PainelBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 275, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Logar();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        this.dispose();
        TelaRegister Cadastro = new TelaRegister(this);
        Cadastro.setVisible(true);

    }//GEN-LAST:event_btnRegisterActionPerformed

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelCampoEmail;
    private javax.swing.JPanel PainelCampoSenha;
    private javax.swing.JPanel PainelFormulario;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Cadastro> getLista() {
        return lista;
    }

    private void Logar() {
        try {
            String email_usuario, senha_usuario;

            email_usuario = txtEmail.getText();
            senha_usuario = txtSenha.getText();

            Login usuario = new Login();
            usuario.setEmail_usuario(email_usuario);
            usuario.setSenha_usuario(senha_usuario);

            UsuarioDAO usuariodao = new UsuarioDAO();
            ResultSet rsusuario = usuariodao.autenticacaoUsuario(usuario);

            if (rsusuario.next()) {
                //chamar a tela
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                this.dispose();
            } else {
                //enviar mensagem 
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválida");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Tela Login" + erro);
        }
    }
}
