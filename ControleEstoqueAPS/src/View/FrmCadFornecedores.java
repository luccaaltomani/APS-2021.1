package View;

import DAO.FornecedorDAO;
import DAO.UsuarioDAO;
import Model.Fornecedor;
import javax.swing.JOptionPane;

public class FrmCadFornecedores extends javax.swing.JFrame {

    public FrmCadFornecedores() {
        initComponents();
    }
    
    public void salvarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        
        fornecedor.setIdFornecedor(Integer.valueOf(txtId.getText()));
        fornecedor.setNomeFornecedor(txtNomeFantasia.getText());
        fornecedor.setRazaoSocialFornecedor(txtRazaoSocial.getText());
        fornecedor.setCnpjFornecedor(txtCNPJ.getText());
        fornecedor.setEmpresaFornecedor(txtEmpresa.getText());
        fornecedor.setEmailFornecedor(txtEmail.getText());
        fornecedor.setEnderecoFornecedor(txtEndereco.getText());
        fornecedor.setBairro(txtBairro.getText());
        fornecedor.setNumero(txtNumero.getText());
        fornecedor.setCep(txtCEP.getText());
        fornecedor.setCidade(String.valueOf(cmbCidade.getSelectedItem()));
        fornecedor.setEstado(String.valueOf(cmbEstado.getSelectedItem()));
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.salvarFornecedor(fornecedor);
        JOptionPane.showMessageDialog(this, "Salvo com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void limpar() {
        txtId.setText("");
        txtRazaoSocial.setText("");
        txtNomeFantasia.setText("");
        txtEmpresa.setText("");
        txtCNPJ.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtCEP.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
        
        txtId.grabFocus();
        
    }
    
    public void deletarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        
        fornecedor.setIdFornecedor(Integer.valueOf(txtId.getText()));
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        
        fornecedorDAO.deletarFornecedor(fornecedor);
        
        JOptionPane.showMessageDialog(this, "Excluído com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void alterarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        
        fornecedor.setIdFornecedor(Integer.valueOf(txtId.getText()));
        fornecedor.setNomeFornecedor(txtNomeFantasia.getText());
        fornecedor.setRazaoSocialFornecedor(txtRazaoSocial.getText());
        fornecedor.setCnpjFornecedor(txtCNPJ.getText());
        fornecedor.setEmpresaFornecedor(txtEmpresa.getText());
        fornecedor.setEmailFornecedor(txtEmail.getText());
        fornecedor.setEnderecoFornecedor(txtEndereco.getText());
        fornecedor.setBairro(txtBairro.getText());
        fornecedor.setNumero(txtNumero.getText());
        fornecedor.setCep(txtCEP.getText());
        fornecedor.setCidade(String.valueOf(cmbCidade.getSelectedItem()));
        fornecedor.setEstado(String.valueOf(cmbEstado.getSelectedItem()));
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        
        fornecedorDAO.alterarFornecedor(fornecedor);
        
        JOptionPane.showMessageDialog(this, "Editado com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblFornecedores = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        LblRazaoSocial = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        LblEmpresa = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        LblNomeFantasia = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        LblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        LblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        LblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        LblCidade = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        LblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        LblCep = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        LblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        LblCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        LblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnIdFornecedor = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadFornecedores = new javax.swing.JMenu();
        MenuClientFornecedores = new javax.swing.JRadioButtonMenuItem();
        MenuProdFornecedores = new javax.swing.JRadioButtonMenuItem();
        MenuForFornecedores = new javax.swing.JRadioButtonMenuItem();
        MenuRelFornecedores = new javax.swing.JMenu();
        MenuForRelatorioVenda = new javax.swing.JRadioButtonMenuItem();
        MenuForRelProduto = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        LblFornecedores.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LblFornecedores.setText("FORNECEDORES");

        LblRazaoSocial.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblRazaoSocial.setText("Razão Social:");

        LblEmpresa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblEmpresa.setText("Empresa:");

        LblNomeFantasia.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblNomeFantasia.setText("Nome Fantasia:");

        LblEndereco.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblEndereco.setText("Endereço (Rua, AV.):");

        LblBairro.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblBairro.setText("Bairro:");

        LblNumero.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblNumero.setText("Nº:");

        LblCidade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblCidade.setText("Cidade:");

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ribeirão Preto", "Brodowski", "Batatais", "Serrana", "Cravinhos", "Sertãozinho", "Pontal", "Jaboticabal", "São Paulo", "Limeira", "Santo André", "Osasco", "Sorocaba", "Maua", "São José do Rio Preto", "Mogi das Cruzes", "Santos", "Piracicaba", "Franca", "Guarujá", "Praia Grande", "Suzano", "Sumare", "São Carlos", "Catanduva", "" }));

        LblEstado.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblEstado.setText("Estado:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF", "" }));

        LblCep.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblCep.setText("CEP:");

        LblEmail.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblEmail.setText("E-Mail:");

        LblCNPJ.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblCNPJ.setText("CNPJ:");

        LblTelefone.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LblTelefone.setText("Telefone:");

        btnSalvar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnIdFornecedor.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnIdFornecedor.setText("ID:");
        btnIdFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LblFornecedores)
                .addGap(227, 227, 227))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(btnIdFornecedor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LblEmail)
                                            .addComponent(LblCidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(LblEstado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(LblCep))
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblNomeFantasia)
                                    .addComponent(LblRazaoSocial)
                                    .addComponent(LblEmpresa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeFantasia)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(LblCNPJ)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblEndereco)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblBairro)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblNumero)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(205, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LblFornecedores)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIdFornecedor))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRazaoSocial)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNomeFantasia)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEmpresa)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCNPJ)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblBairro)
                    .addComponent(LblNumero)
                    .addComponent(LblEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCidade)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEstado)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCep)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        MenuCadFornecedores.setText("Cadastros");

        MenuClientFornecedores.setSelected(true);
        MenuClientFornecedores.setText("Clientes");
        MenuClientFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientFornecedoresActionPerformed(evt);
            }
        });
        MenuCadFornecedores.add(MenuClientFornecedores);

        MenuProdFornecedores.setSelected(true);
        MenuProdFornecedores.setText("Produtos");
        MenuProdFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProdFornecedoresActionPerformed(evt);
            }
        });
        MenuCadFornecedores.add(MenuProdFornecedores);

        MenuForFornecedores.setSelected(true);
        MenuForFornecedores.setText("Fornecedores");
        MenuForFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuForFornecedoresActionPerformed(evt);
            }
        });
        MenuCadFornecedores.add(MenuForFornecedores);

        jMenuBar1.add(MenuCadFornecedores);

        MenuRelFornecedores.setText("Relatórios");

        MenuForRelatorioVenda.setSelected(true);
        MenuForRelatorioVenda.setText("Relatório de Venda");
        MenuRelFornecedores.add(MenuForRelatorioVenda);

        MenuForRelProduto.setSelected(true);
        MenuForRelProduto.setText("Relatório de Produto");
        MenuRelFornecedores.add(MenuForRelProduto);

        jMenuBar1.add(MenuRelFornecedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuClientFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientFornecedoresActionPerformed
        // TODO add your handling code here:
        new FrmCadCliente().setVisible(true);
        
    }//GEN-LAST:event_MenuClientFornecedoresActionPerformed

    private void MenuProdFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProdFornecedoresActionPerformed
        // TODO add your handling code here:
         new FrmCadProduto().setVisible(true);
    }//GEN-LAST:event_MenuProdFornecedoresActionPerformed

    private void MenuForFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuForFornecedoresActionPerformed
        // TODO add your handling code here:
         new FrmCadFornecedores().setVisible(true);
    }//GEN-LAST:event_MenuForFornecedoresActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showConfirmDialog(this, "Você realmente deseja Sair?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(txtId.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            alterarFornecedor();
            limpar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtId.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            salvarFornecedor();
            limpar();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtId.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            deletarFornecedor();
            limpar();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnIdFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdFornecedorActionPerformed
        // TODO add your handling code here:
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String idUsuario = usuarioDAO.pegarIdUsuario(); //Pega o último id registrado na tabela usuario.
        txtId.setText(idUsuario);
    }//GEN-LAST:event_btnIdFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBairro;
    private javax.swing.JLabel LblCNPJ;
    private javax.swing.JLabel LblCep;
    private javax.swing.JLabel LblCidade;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblEmpresa;
    private javax.swing.JLabel LblEndereco;
    private javax.swing.JLabel LblEstado;
    private javax.swing.JLabel LblFornecedores;
    private javax.swing.JLabel LblNomeFantasia;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JLabel LblRazaoSocial;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JMenu MenuCadFornecedores;
    private javax.swing.JRadioButtonMenuItem MenuClientFornecedores;
    private javax.swing.JRadioButtonMenuItem MenuForFornecedores;
    private javax.swing.JRadioButtonMenuItem MenuForRelProduto;
    private javax.swing.JRadioButtonMenuItem MenuForRelatorioVenda;
    private javax.swing.JRadioButtonMenuItem MenuProdFornecedores;
    private javax.swing.JMenu MenuRelFornecedores;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIdFornecedor;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
