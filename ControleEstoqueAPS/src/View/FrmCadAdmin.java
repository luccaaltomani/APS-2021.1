package View;

import DAO.AdministradorDAO;
import DAO.UsuarioDAO;
import Model.Administrador;
import javax.swing.JOptionPane;

public class FrmCadAdmin extends javax.swing.JFrame {

    public FrmCadAdmin() {
        initComponents();
    }
    
    public void salvarAdministrador() {
        Administrador administrador = new Administrador();
        administrador.setIdAdministrador(Integer.valueOf(txtIdAdministrador.getText()));
        administrador.setNomeAdministrador(txtNomeAdministrador.getText());
        administrador.setRgAdministrador(txtRgAdministrador.getText());
        administrador.setCpfAdministrador(txtCpfAdministrador.getText());
        
        AdministradorDAO administradorDAO = new AdministradorDAO();
        administradorDAO.salvarAdministrador(administrador);
        
        JOptionPane.showMessageDialog(this, "Salvo com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void limpar() {
        txtIdAdministrador.setText("");
        txtNomeAdministrador.setText("");
        txtRgAdministrador.setText("");
        txtCpfAdministrador.setText("");
        
        txtIdAdministrador.grabFocus();
    }
    
    public void deletarAdministrador() {
        Administrador administrador = new Administrador();
        administrador.setIdAdministrador(Integer.valueOf(txtIdAdministrador.getText()));
        
        AdministradorDAO administradorDAO = new AdministradorDAO();
        administradorDAO.deletarAdministrador(administrador);
        
        JOptionPane.showMessageDialog(this, "Excluído com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void alterarAdministrador() {
        Administrador administrador = new Administrador();
        administrador.setIdAdministrador(Integer.valueOf(txtIdAdministrador.getText()));
        administrador.setNomeAdministrador(txtNomeAdministrador.getText());
        administrador.setRgAdministrador(txtRgAdministrador.getText());
        administrador.setCpfAdministrador(txtCpfAdministrador.getText());
        
        AdministradorDAO administradorDAO = new AdministradorDAO();
        administradorDAO.salvarAdministrador(administrador);
        
        JOptionPane.showMessageDialog(this, "Editado com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblAdmin = new javax.swing.JLabel();
        LblNome = new javax.swing.JLabel();
        txtNomeAdministrador = new javax.swing.JTextField();
        LblRG = new javax.swing.JLabel();
        txtRgAdministrador = new javax.swing.JTextField();
        LblCPF = new javax.swing.JLabel();
        txtCpfAdministrador = new javax.swing.JTextField();
        BtnSalvar = new javax.swing.JButton();
        btnIdAdministrador = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtIdAdministrador = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        LblAdmin.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        LblAdmin.setText("ADMINISTRADOR ");

        LblNome.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblNome.setText("Nome:");

        LblRG.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblRG.setText("RG:");

        LblCPF.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblCPF.setText("CPF:");

        BtnSalvar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        btnIdAdministrador.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnIdAdministrador.setText("ID:");
        btnIdAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdAdministradorActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtRgAdministrador)
                                .addComponent(txtCpfAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LblCPF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(LblAdmin)))
                        .addComponent(LblNome)
                        .addComponent(txtIdAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomeAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblRG)
                        .addComponent(btnIdAdministrador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LblAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnIdAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(LblRG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRgAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpfAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair))
                .addContainerGap(22, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIdAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdAdministradorActionPerformed
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String idUsuario = usuarioDAO.pegarIdUsuario(); //Pega o último id registrado na tabela usuario.
        txtIdAdministrador.setText(idUsuario);
    }//GEN-LAST:event_btnIdAdministradorActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        if(txtIdAdministrador.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            salvarAdministrador();
            limpar();
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(txtIdAdministrador.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            alterarAdministrador();
            limpar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtIdAdministrador.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            deletarAdministrador();
            limpar();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Você realmente deseja Sair?", "EXIT", JOptionPane.YES_NO_OPTION);
         if (opcao == JOptionPane.YES_OPTION) {
             this.dispose();
         }
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LblAdmin;
    private javax.swing.JLabel LblCPF;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblRG;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIdAdministrador;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCpfAdministrador;
    private javax.swing.JTextField txtIdAdministrador;
    private javax.swing.JTextField txtNomeAdministrador;
    private javax.swing.JTextField txtRgAdministrador;
    // End of variables declaration//GEN-END:variables
}
