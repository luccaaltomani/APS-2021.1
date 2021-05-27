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
        SubMenuCliente = new javax.swing.JRadioButtonMenuItem();
        SubMenuProdutos = new javax.swing.JRadioButtonMenuItem();
        SubMenuFornecedores = new javax.swing.JRadioButtonMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        SubMenuRelVenda = new javax.swing.JRadioButtonMenuItem();
        SubMenuRelProduto = new javax.swing.JRadioButtonMenuItem();

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
        jMenuBar2.setForeground(new java.awt.Color(0, 0, 0));

        Menu_Cadastro.setBackground(new java.awt.Color(204, 204, 204));
        Menu_Cadastro.setForeground(new java.awt.Color(0, 0, 0));
        Menu_Cadastro.setText("Cadastros");
        Menu_Cadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

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
        MenuRelatorio.setForeground(new java.awt.Color(0, 0, 0));
        MenuRelatorio.setText("Relatório");
        MenuRelatorio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        SubMenuRelVenda.setSelected(true);
        SubMenuRelVenda.setText("Relatório de Vendas");
        MenuRelatorio.add(SubMenuRelVenda);

        SubMenuRelProduto.setSelected(true);
        SubMenuRelProduto.setText("Relatório de Produtos");
        MenuRelatorio.add(SubMenuRelProduto);

        jMenuBar2.add(MenuRelatorio);

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
    private javax.swing.JMenu Menu_Cadastro;
    private javax.swing.JPanel Panel1;
    private javax.swing.JRadioButtonMenuItem SubMenuCliente;
    private javax.swing.JRadioButtonMenuItem SubMenuFornecedores;
    private javax.swing.JRadioButtonMenuItem SubMenuProdutos;
    private javax.swing.JRadioButtonMenuItem SubMenuRelProduto;
    private javax.swing.JRadioButtonMenuItem SubMenuRelVenda;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
