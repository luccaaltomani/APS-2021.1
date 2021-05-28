package View;

import DAO.UsuarioDAO;
import Model.Usuario;
import javax.swing.JOptionPane;

public class FrmCadUsuario extends javax.swing.JFrame {

    public FrmCadUsuario() {
        initComponents();
    }
    
    public void salvarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setLoginUsuario(String.valueOf(txtLogin.getText()));
        usuario.setSenhaUsuario(String.valueOf(txtSenha.getPassword()));

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.salvarUsuarios(usuario); 

        
        JOptionPane.showMessageDialog(this, "Usuário Cadastrado com sucesso, ID: [ "+usuarioDAO.pegarIdUsuario()+" ]");
    }
    
    public void alterarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(Integer.valueOf(txtIdUsuario.getText()));
        usuario.setLoginUsuario(String.valueOf(txtLogin.getText()));
        usuario.setSenhaUsuario(String.valueOf(txtSenha.getPassword()));

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.alterarUsuarios(usuario);
            
        JOptionPane.showMessageDialog(this, "Editado com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void limpar() {
        txtLogin.setText("");
        txtSenha.setText("");
        txtIdUsuario.setText("");
        
        
        txtLogin.grabFocus();
    }
    
    public void deletarUsuario(){
        Usuario usuario = new Usuario();
        
        usuario.setIdUsuario(Integer.valueOf(txtIdUsuario.getText()));
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        usuarioDAO.deletarUsuarios(usuario);
        
        JOptionPane.showMessageDialog(this, "Excluído com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblusuario = new javax.swing.JLabel();
        LblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        LblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        BtnExcluir = new javax.swing.JButton();
        radioBtnCliente = new javax.swing.JRadioButton();
        radioBtnAdministrador = new javax.swing.JRadioButton();
        LblSenha1 = new javax.swing.JLabel();
        btnId = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        BtnExcluir1 = new javax.swing.JButton();
        txtIdUsuario = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblusuario.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        lblusuario.setText("Cadastro Usuário");

        LblLogin.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblLogin.setText("Login:");

        LblSenha.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblSenha.setText("Senha:");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        BtnExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnExcluir.setText("Sair");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        radioBtnCliente.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(radioBtnCliente);
        radioBtnCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioBtnCliente.setText("Cliente");

        radioBtnAdministrador.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(radioBtnAdministrador);
        radioBtnAdministrador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        radioBtnAdministrador.setText("Administrador");

        LblSenha1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblSenha1.setText("Tipo Usuário:");

        btnId.setText("ID:");
        btnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdActionPerformed(evt);
            }
        });

        BtnEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnSalvar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnExcluir1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtnExcluir1.setText("Excluir");
        BtnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluir1ActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnAdministrador)
                            .addComponent(radioBtnCliente)
                            .addComponent(LblSenha1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LblSenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSenha))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(LblLogin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)
                                .addComponent(btnId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblusuario))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnExcluir1)
                        .addGap(10, 10, 10)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnExcluir)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblusuario)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnId)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(LblSenha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtnCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnExcluir1)
                    .addComponent(BtnExcluir)
                    .addComponent(btnLimpar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Você realmente deseja Sair?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdActionPerformed
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        int idUsuario = Integer.valueOf(usuarioDAO.pegarIdUsuario()); //Pega o último id registrado na tabela usuario.
        int proxIdUsuario = idUsuario + 1; //Vai mostrar Qual será o ID do usuario cadastrado
        
        txtIdUsuario.setText(String.valueOf(proxIdUsuario));
    }//GEN-LAST:event_btnIdActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if(txtIdUsuario.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            alterarUsuario();
            limpar();
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        try {
           if(txtLogin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ Login ]", "ERRO", JOptionPane.WARNING_MESSAGE);
            } else if (txtSenha.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ Senha ]", "ERRO", JOptionPane.WARNING_MESSAGE);
            } else {
                salvarUsuario();
                limpar();
                
                if (radioBtnCliente.isSelected()) {
                    FrmCadCliente cadCliente = new FrmCadCliente();

                    cadCliente.setVisible(true);
                } else if(radioBtnAdministrador.isSelected()){
                    FrmCadAdmin cadAdmin = new FrmCadAdmin();

                    cadAdmin.setVisible(true); 
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluir1ActionPerformed
        if(txtIdUsuario.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            deletarUsuario();
            limpar();
        }
    }//GEN-LAST:event_BtnExcluir1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnExcluir1;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LblLogin;
    private javax.swing.JLabel LblSenha;
    private javax.swing.JLabel LblSenha1;
    private javax.swing.JButton btnId;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JRadioButton radioBtnAdministrador;
    private javax.swing.JRadioButton radioBtnCliente;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
