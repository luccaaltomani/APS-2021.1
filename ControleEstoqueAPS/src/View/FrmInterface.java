package View;

import javax.swing.JOptionPane;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class FrmInterface extends javax.swing.JFrame {
    
    private Connection conecta;

    public FrmInterface() {
        initComponents();
        Conexao conectar = new Conexao();
        this.conecta = conectar.conecta();
    }

    public boolean verificarLogin(String loginUsuario, String senhaUsuario) {
        boolean autenticado = false;
        String sql = "SELECT loginUsuario, senhaUsuario FROM tb_usuario "
                + "WHERE loginUsuario=? AND senhaUsuario=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            ResultSet rs;
            stmt.setString(1, loginUsuario);
            stmt.setString(2, senhaUsuario);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                String login = rs.getString("loginUsuario");
                String senha = rs.getString("senhaUsuario");
                autenticado = true;
            }
            
            stmt.close();
            return autenticado;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        LblTitle = new javax.swing.JLabel();
        LblLogin = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        LblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        BntEntrar = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        BntCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(0, 102, 102));

        LblTitle.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        LblTitle.setText("CONTROLE DE ESTOQUE");

        LblLogin.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        LblLogin.setText("LOGIN");

        LblUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LblUsuario.setText("Usuário:");

        LblSenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LblSenha.setText("Senha:");

        BntEntrar.setText("Entrar");
        BntEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BntEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntEntrarActionPerformed(evt);
            }
        });

        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        BntCadastrar.setText("Cadastrar");
        BntCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BntEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(BntCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addGap(158, 158, 158))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblUsuario)
                    .addComponent(LblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(LblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(LblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblLogin)
                .addGap(40, 40, 40)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblUsuario))
                .addGap(26, 26, 26)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BntEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BntCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BntEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntEntrarActionPerformed
        // TODO add your handling code here:
        String loginUsuario = txtUsuario.getText();
        String senhaUsuario = txtSenha.getText();
        
        boolean autenticacao = verificarLogin(loginUsuario, senhaUsuario);
        
        if (autenticacao == true) { 
            JOptionPane.showMessageDialog(this, "Login realizado.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            new FrmTelaPrincipal().setVisible(true);
            this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.", "FALHA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BntEntrarActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair","LOGIN",JOptionPane.YES_NO_OPTION);
        this.dispose();
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntCadastrarActionPerformed
        new FrmCadUsuario().setVisible(true);
    }//GEN-LAST:event_BntCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntCadastrar;
    private javax.swing.JButton BntEntrar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel LblLogin;
    private javax.swing.JLabel LblSenha;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
