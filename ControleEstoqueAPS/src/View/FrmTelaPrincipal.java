package View;

public class FrmTelaPrincipal extends javax.swing.JFrame {

    public FrmTelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        Menu_Cadastro = new javax.swing.JMenu();
        SubMenuAdministrador = new javax.swing.JRadioButtonMenuItem();
        SubMenuCliente = new javax.swing.JRadioButtonMenuItem();
        SubMenuProdutos = new javax.swing.JRadioButtonMenuItem();
        SubMenuFornecedores = new javax.swing.JRadioButtonMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        SubMenuRelProduto = new javax.swing.JRadioButtonMenuItem();
        MenuVendas = new javax.swing.JMenu();
        SubMenuVendasProdutos = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ENTRADA DE DADOS"); // NOI18N

        Panel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jMenuBar2.setBackground(new java.awt.Color(204, 204, 204));

        Menu_Cadastro.setBackground(new java.awt.Color(204, 204, 204));
        Menu_Cadastro.setText("Cadastros");
        Menu_Cadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        SubMenuAdministrador.setSelected(true);
        SubMenuAdministrador.setText("Administrador");
        SubMenuAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuAdministradorActionPerformed(evt);
            }
        });
        Menu_Cadastro.add(SubMenuAdministrador);

        SubMenuCliente.setSelected(true);
        SubMenuCliente.setText("Clientes");
        SubMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuClienteActionPerformed(evt);
            }
        });
        Menu_Cadastro.add(SubMenuCliente);

        SubMenuProdutos.setSelected(true);
        SubMenuProdutos.setText("Produtos");
        SubMenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuProdutosActionPerformed(evt);
            }
        });
        Menu_Cadastro.add(SubMenuProdutos);

        SubMenuFornecedores.setSelected(true);
        SubMenuFornecedores.setText("Fornecedores");
        SubMenuFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuFornecedoresActionPerformed(evt);
            }
        });
        Menu_Cadastro.add(SubMenuFornecedores);

        jMenuBar2.add(Menu_Cadastro);

        MenuRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        MenuRelatorio.setText("Relatório");
        MenuRelatorio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        SubMenuRelProduto.setSelected(true);
        SubMenuRelProduto.setText("Relatório de Produtos");
        SubMenuRelProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuRelProdutoActionPerformed(evt);
            }
        });
        MenuRelatorio.add(SubMenuRelProduto);

        jMenuBar2.add(MenuRelatorio);

        MenuVendas.setBackground(new java.awt.Color(204, 204, 204));
        MenuVendas.setText("Vendas");
        MenuVendas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        SubMenuVendasProdutos.setSelected(true);
        SubMenuVendasProdutos.setText("Vendas de Produtos");
        SubMenuVendasProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuVendasProdutosActionPerformed(evt);
            }
        });
        MenuVendas.add(SubMenuVendasProdutos);

        jMenuBar2.add(MenuVendas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuClienteActionPerformed
        // TODO add your handling code here:
        new FrmCadCliente().setVisible(true);
    }//GEN-LAST:event_SubMenuClienteActionPerformed

    private void SubMenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuProdutosActionPerformed
        // TODO add your handling code here:
        new FrmCadProduto().setVisible(true);
    }//GEN-LAST:event_SubMenuProdutosActionPerformed

    private void SubMenuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuFornecedoresActionPerformed
        // TODO add your handling code here:
         new FrmCadFornecedores().setVisible(true);
    }//GEN-LAST:event_SubMenuFornecedoresActionPerformed

    private void SubMenuAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuAdministradorActionPerformed
        FrmCadAdmin cadAdmin = new FrmCadAdmin();
        
        cadAdmin.setVisible(true);
    }//GEN-LAST:event_SubMenuAdministradorActionPerformed

    private void SubMenuRelProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuRelProdutoActionPerformed
        FrmConsultaProduto consultaProduto = new FrmConsultaProduto();
        
        consultaProduto.setVisible(true);
        
        
    }//GEN-LAST:event_SubMenuRelProdutoActionPerformed

    private void SubMenuVendasProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuVendasProdutosActionPerformed
        FrmVendaProduto vendaProduto = new FrmVendaProduto();
        
        vendaProduto.setVisible(true);
    }//GEN-LAST:event_SubMenuVendasProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenu MenuVendas;
    private javax.swing.JMenu Menu_Cadastro;
    private javax.swing.JPanel Panel1;
    private javax.swing.JRadioButtonMenuItem SubMenuAdministrador;
    private javax.swing.JRadioButtonMenuItem SubMenuCliente;
    private javax.swing.JRadioButtonMenuItem SubMenuFornecedores;
    private javax.swing.JRadioButtonMenuItem SubMenuProdutos;
    private javax.swing.JRadioButtonMenuItem SubMenuRelProduto;
    private javax.swing.JRadioButtonMenuItem SubMenuVendasProdutos;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
