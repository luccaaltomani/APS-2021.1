package View;

import DAO.ProdutoDAO;
import Model.Produto;
import javax.swing.JOptionPane;

public class FrmCadProduto extends javax.swing.JFrame {

    public FrmCadProduto() {
        initComponents();
    }

    public void salvarProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(Integer.valueOf(txtCodProd.getText()));
        produto.setNomeProduto(txtDescricao.getText());
        produto.setQtdMinimaProduto(Integer.valueOf(qtdMinima.getText()));
        produto.setCategoriaProduto(String.valueOf(cmbCategoria.getSelectedItem()));
        produto.setQtdProduto(Integer.valueOf(txtQtd.getText()));
        produto.setValorProduto(Double.valueOf(txtCusto.getText()));
        produto.setPrecoVendaProduto(Double.valueOf(txtPrecoVenda.getText()));
        produto.setCodBarrasProduto(Integer.valueOf(txtCodBarras.getText()));
        produto.setIdFornecedor(Integer.valueOf(txtFornecedor.getText()));
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.salvarProduto(produto);
        
        JOptionPane.showMessageDialog(this, "Salvo com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void limpar() {
        txtCodProd.setText("");
        txtDescricao.setText("");
        qtdMinima.setText("");
        cmbCategoria.setSelectedIndex(0);
        txtQtd.setText("");
        txtCusto.setText("");
        txtPrecoVenda.setText("");
        txtCodBarras.setText("");
        txtFornecedor.setText("");
    }
    
    public void deletarProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(Integer.valueOf(txtCodProd.getText()));
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.deletarProduto(produto);
        
        JOptionPane.showMessageDialog(this, "Excluído com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void alterarProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(Integer.valueOf(txtCodProd.getText()));
        produto.setNomeProduto(txtDescricao.getText());
        produto.setQtdMinimaProduto(Integer.valueOf(qtdMinima.getText()));
        produto.setCategoriaProduto(String.valueOf(cmbCategoria.getSelectedItem()));
        produto.setQtdProduto(Integer.valueOf(txtQtd.getText()));
        produto.setValorProduto(Double.valueOf(txtCusto.getText()));
        produto.setPrecoVendaProduto(Double.valueOf(txtPrecoVenda.getText()));
        produto.setCodBarrasProduto(Integer.valueOf(txtCodBarras.getText()));
        produto.setIdFornecedor(Integer.valueOf(txtFornecedor.getText()));
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.alterarProduto(produto);
        
        JOptionPane.showMessageDialog(this, "Editado com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblTitle = new javax.swing.JLabel();
        LblCodProd = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        LblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        LblUnidade = new javax.swing.JLabel();
        qtdMinima = new javax.swing.JTextField();
        LblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtCusto = new javax.swing.JTextField();
        TxtPrecoDeVenda = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        LblQuantidade = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        LblCodBarras = new javax.swing.JLabel();
        txtCodBarras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        BtnSalvar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastroProd = new javax.swing.JMenu();
        MenuClientProd = new javax.swing.JRadioButtonMenuItem();
        MenuProdProduto = new javax.swing.JRadioButtonMenuItem();
        MenuFornecProd = new javax.swing.JRadioButtonMenuItem();
        MenuRelatórioProd = new javax.swing.JMenu();
        MenuRelVProd = new javax.swing.JRadioButtonMenuItem();
        MenuRelPProd = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        LblTitle.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        LblTitle.setText("PRODUTO");

        LblCodProd.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblCodProd.setText("Código Produto:");

        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });

        LblDescricao.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblDescricao.setText("Descrição:");

        LblUnidade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblUnidade.setText("Quantidade Mínima:");

        LblCategoria.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblCategoria.setText("Categoria:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercearia", "Higiene Pessoal", "Limpeza", "Perecíveis ", "Eletrônicos", "Outros" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Custo:");

        TxtPrecoDeVenda.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        TxtPrecoDeVenda.setText("Preço de Venda:");

        LblQuantidade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblQuantidade.setText("Quantidade:");

        LblCodBarras.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblCodBarras.setText("Código de Barras:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Fornecedor:");

        BtnSalvar.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnEditar.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnExcluir.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnSair.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(TxtPrecoDeVenda)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecoVenda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LblUnidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdMinima))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LblCodProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(LblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(LblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(BtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSair))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblCodBarras)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTitle)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(LblTitle)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCodProd)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUnidade)
                    .addComponent(qtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCategoria)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblQuantidade)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrecoDeVenda)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCodBarras)
                    .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnExcluir)
                    .addComponent(BtnSair))
                .addGap(37, 37, 37))
        );

        MenuCadastroProd.setText("Cadastros");

        MenuClientProd.setSelected(true);
        MenuClientProd.setText("Clientes");
        MenuClientProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientProdActionPerformed(evt);
            }
        });
        MenuCadastroProd.add(MenuClientProd);

        MenuProdProduto.setSelected(true);
        MenuProdProduto.setText("Produtos");
        MenuProdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProdProdutoActionPerformed(evt);
            }
        });
        MenuCadastroProd.add(MenuProdProduto);

        MenuFornecProd.setSelected(true);
        MenuFornecProd.setText("Forncenedores");
        MenuFornecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFornecProdActionPerformed(evt);
            }
        });
        MenuCadastroProd.add(MenuFornecProd);

        jMenuBar1.add(MenuCadastroProd);

        MenuRelatórioProd.setText("Relatórios");

        MenuRelVProd.setSelected(true);
        MenuRelVProd.setText("Relatório de Vendas");
        MenuRelatórioProd.add(MenuRelVProd);

        MenuRelPProd.setSelected(true);
        MenuRelPProd.setText("Relatório de Produtos");
        MenuRelatórioProd.add(MenuRelPProd);

        jMenuBar1.add(MenuRelatórioProd);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        if(txtCodProd.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ Código Produto ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            salvarProduto();
            limpar();
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void MenuClientProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientProdActionPerformed
        new FrmCadCliente().setVisible(true);
    }//GEN-LAST:event_MenuClientProdActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Você realmente deseja Sair?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnSairActionPerformed

    private void MenuProdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProdProdutoActionPerformed
        new FrmCadProduto().setVisible(true);
    }//GEN-LAST:event_MenuProdProdutoActionPerformed

    private void MenuFornecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFornecProdActionPerformed
         new FrmCadFornecedores().setVisible(true);
    }//GEN-LAST:event_MenuFornecProdActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if(txtCodProd.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ Código Produto ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            alterarProduto();
            limpar();
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if(txtCodProd.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ Código Produto ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            deletarProduto();
            limpar();
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LblCategoria;
    private javax.swing.JLabel LblCodBarras;
    private javax.swing.JLabel LblCodProd;
    private javax.swing.JLabel LblDescricao;
    private javax.swing.JLabel LblQuantidade;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JLabel LblUnidade;
    private javax.swing.JMenu MenuCadastroProd;
    private javax.swing.JRadioButtonMenuItem MenuClientProd;
    private javax.swing.JRadioButtonMenuItem MenuFornecProd;
    private javax.swing.JRadioButtonMenuItem MenuProdProduto;
    private javax.swing.JRadioButtonMenuItem MenuRelPProd;
    private javax.swing.JRadioButtonMenuItem MenuRelVProd;
    private javax.swing.JMenu MenuRelatórioProd;
    private javax.swing.JLabel TxtPrecoDeVenda;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField qtdMinima;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
