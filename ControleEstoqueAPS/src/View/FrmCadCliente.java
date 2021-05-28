package View;

import DAO.ClienteDAO;
import DAO.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Cliente;

public class FrmCadCliente extends javax.swing.JFrame {

    public FrmCadCliente() {
        initComponents();
    }
    
    public void salvarCliente() {
        Cliente cliente = new Cliente();
        
        cliente.setIdCliente(Integer.valueOf(txtIdCliente.getText()));
        cliente.setNomeCliente(jNomeCliente.getText());
        cliente.setCpfCliente(jCpfCliente.getText());
        cliente.setRgCliente(jRgCliente.getText());
        cliente.setEstCivilCliente(String.valueOf(jEstCivilCliente.getSelectedItem()));
        cliente.setEmailCliente(jEmailCliente.getText());
        cliente.setSexoCliente(String.valueOf(jSexoCliente.getSelectedItem()));
        cliente.setCelularCliente(jCelularCliente.getText());
        cliente.setTelefoneCliente(jTelefoneCliente.getText());
        cliente.setEnderecoCliente(jEnderecoCliente.getText());
        cliente.setNumero(jNumeroCliente.getText());
        cliente.setBairro(jBairroCliente.getText());
        cliente.setCep(jCepCliente.getText());
        cliente.setCidade(String.valueOf(jCidadeCliente.getSelectedItem()));
        cliente.setEstado(String.valueOf(jEstadoCliente.getSelectedItem()));
        
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.salvarCliente(cliente);
        
        JOptionPane.showMessageDialog(this, "Salvo com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void limpar() {
        txtIdCliente.setText("");
        jNomeCliente.setText("");
        jCpfCliente.setText("");
        jRgCliente.setText("");
        jEstCivilCliente.setSelectedIndex(0);
        jEmailCliente.setText("");
        jSexoCliente.setSelectedIndex(0);
        jCelularCliente.setText("");
        jTelefoneCliente.setText("");
        jEnderecoCliente.setText("");
        jNumeroCliente.setText("");
        jBairroCliente.setText("");
        jCepCliente.setText("");
        jCidadeCliente.setSelectedIndex(0);
        jEstadoCliente.setSelectedIndex(0);
        
        txtIdCliente.grabFocus();
    }
    
    public void deletarCliente() {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(Integer.valueOf(txtIdCliente.getText()));
        
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.deletarCliente(cliente);
        
        JOptionPane.showMessageDialog(this, "Salvo com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void alterarCliente() {
        Cliente cliente = new Cliente();
        
        cliente.setIdCliente(Integer.valueOf(txtIdCliente.getText()));
        cliente.setNomeCliente(jNomeCliente.getText());
        cliente.setCpfCliente(jCpfCliente.getText());
        cliente.setRgCliente(jRgCliente.getText());
        cliente.setEstCivilCliente(String.valueOf(jEstCivilCliente.getSelectedItem()));
        cliente.setEmailCliente(jEmailCliente.getText());
        cliente.setSexoCliente(String.valueOf(jSexoCliente.getSelectedItem()));
        cliente.setCelularCliente(jCelularCliente.getText());
        cliente.setTelefoneCliente(jTelefoneCliente.getText());
        cliente.setEnderecoCliente(jEnderecoCliente.getText());
        cliente.setNumero(jNumeroCliente.getText());
        cliente.setBairro(jBairroCliente.getText());
        cliente.setCep(jCepCliente.getText());
        cliente.setCidade(String.valueOf(jCidadeCliente.getSelectedItem()));
        cliente.setEstado(String.valueOf(jEstadoCliente.getSelectedItem()));
        
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.alterarCliente(cliente);
        
        JOptionPane.showMessageDialog(this, "Editado com Sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LblCliente = new javax.swing.JLabel();
        LblNome = new javax.swing.JLabel();
        LblRG = new javax.swing.JLabel();
        jNomeCliente = new javax.swing.JTextField();
        jRgCliente = new javax.swing.JTextField();
        LblCPF = new javax.swing.JLabel();
        jCpfCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jEnderecoCliente = new javax.swing.JTextField();
        LblBairro = new javax.swing.JLabel();
        jBairroCliente = new javax.swing.JTextField();
        LblNum = new javax.swing.JLabel();
        jNumeroCliente = new javax.swing.JTextField();
        LblCidade = new javax.swing.JLabel();
        jCidadeCliente = new javax.swing.JComboBox<>();
        LblCEP = new javax.swing.JLabel();
        jCepCliente = new javax.swing.JTextField();
        LblEstado = new javax.swing.JLabel();
        jEstadoCliente = new javax.swing.JComboBox<>();
        LblSexo = new javax.swing.JLabel();
        jSexoCliente = new javax.swing.JComboBox<>();
        LblEmail = new javax.swing.JLabel();
        jEmailCliente = new javax.swing.JTextField();
        LblTelefone = new javax.swing.JLabel();
        jTelefoneCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCelularCliente = new javax.swing.JTextField();
        btnSalvarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        LblEstadoCivil = new javax.swing.JLabel();
        jEstCivilCliente = new javax.swing.JComboBox<>();
        btnSairCliente = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        btnId = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastroCliente = new javax.swing.JMenu();
        MenuClientes = new javax.swing.JRadioButtonMenuItem();
        MenuProdutos = new javax.swing.JRadioButtonMenuItem();
        MenuFornecedores = new javax.swing.JRadioButtonMenuItem();
        MenuRelatórioCliente = new javax.swing.JMenu();
        MenuVenda = new javax.swing.JRadioButtonMenuItem();
        MenuRelProduto = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        LblCliente.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        LblCliente.setText("CLIENTE");

        LblNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblNome.setText("Nome:");

        LblRG.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblRG.setText("RG:");

        LblCPF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblCPF.setText("CPF:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Endereço:");

        LblBairro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblBairro.setText("Bairro:");

        LblNum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblNum.setText("Nº:");

        jNumeroCliente.setToolTipText("");

        LblCidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblCidade.setText("Cidade:");

        jCidadeCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ribeirão Preto", "Brodowski", "Batatais", "Serrana", "Cravinhos", "Sertãozinho", "Pontal", "Jaboticabal", "São Paulo", "Limeira", "Santo André", "Osasco", "Sorocaba", "Maua", "São José do Rio Preto", "Mogi das Cruzes", "Santos", "Piracicaba", "Franca", "Guarujá", "Praia Grande", "Suzano", "Sumare", "São Carlos", "Catanduva", "" }));

        LblCEP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblCEP.setText("CEP:");

        LblEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblEstado.setText("Estado:");

        jEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF", "" }));

        LblSexo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblSexo.setText("Sexo:");

        jSexoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        LblEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblEmail.setText("E-mail:");

        LblTelefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblTelefone.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Celular:");

        btnSalvarCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        LblEstadoCivil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LblEstadoCivil.setText("Estado Civil:");

        jEstCivilCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Viuvo" }));

        btnSairCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSairCliente.setText("Sair");
        btnSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairClienteActionPerformed(evt);
            }
        });

        txtIdCliente.setToolTipText("");
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        btnId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnId.setText("ID:");
        btnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(232, 232, 232)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblBairro)
                            .addComponent(jBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNum)
                            .addComponent(jNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(LblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(LblRG)
                                .addGap(212, 212, 212)
                                .addComponent(LblCPF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)))
                        .addComponent(LblEstadoCivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEstCivilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 96, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCEP)
                            .addComponent(jCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCidade)
                            .addComponent(jCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblEstado)
                            .addComponent(jEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSairCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblNome)
                        .addGap(254, 254, 254)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnId))
                            .addComponent(LblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEstadoCivil)
                    .addComponent(jEstCivilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRG)
                    .addComponent(LblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblBairro)
                        .addComponent(LblNum)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCEP)
                    .addComponent(LblCidade)
                    .addComponent(LblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTelefone)
                    .addComponent(jTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSexo)
                    .addComponent(jSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEmail)
                    .addComponent(jEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCliente)
                    .addComponent(btnEditarCliente)
                    .addComponent(btnExcluirCliente)
                    .addComponent(btnSairCliente)
                    .addComponent(btnLimpar))
                .addGap(6, 6, 6))
        );

        MenuCadastroCliente.setText("CADASTROS");

        MenuClientes.setSelected(true);
        MenuClientes.setText("Clientes");
        MenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientesActionPerformed(evt);
            }
        });
        MenuCadastroCliente.add(MenuClientes);

        MenuProdutos.setSelected(true);
        MenuProdutos.setText("Produtos");
        MenuProdutos.setActionCommand("");
        MenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProdutosActionPerformed(evt);
            }
        });
        MenuCadastroCliente.add(MenuProdutos);

        MenuFornecedores.setSelected(true);
        MenuFornecedores.setText("Fornecedores");
        MenuFornecedores.setActionCommand("");
        MenuFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFornecedoresActionPerformed(evt);
            }
        });
        MenuCadastroCliente.add(MenuFornecedores);

        jMenuBar1.add(MenuCadastroCliente);

        MenuRelatórioCliente.setText("RELATÓRIOS");

        MenuVenda.setSelected(true);
        MenuVenda.setText("Relatório de Vendas");
        MenuRelatórioCliente.add(MenuVenda);

        MenuRelProduto.setSelected(true);
        MenuRelProduto.setText("Relatório de Produtos");
        MenuRelatórioCliente.add(MenuRelProduto);

        jMenuBar1.add(MenuRelatórioCliente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesActionPerformed
        new FrmCadCliente().setVisible(true);
    }//GEN-LAST:event_MenuClientesActionPerformed

    private void btnSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairClienteActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Você realmente deseja Sair?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSairClienteActionPerformed

    private void MenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProdutosActionPerformed
        new FrmCadProduto().setVisible(true);
    }//GEN-LAST:event_MenuProdutosActionPerformed

    private void MenuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFornecedoresActionPerformed
         new FrmCadFornecedores().setVisible(true);
    }//GEN-LAST:event_MenuFornecedoresActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        if(txtIdCliente.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            salvarCliente();
            limpar();
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        if(txtIdCliente.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            deletarCliente();
            limpar();
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if(txtIdCliente.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o campo [ ID ]", "ERRO", JOptionPane.WARNING_MESSAGE);
        } else {
            alterarCliente();
            limpar();
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdActionPerformed
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        String idUsuario = usuarioDAO.pegarIdUsuario(); //Pega o último id registrado na tabela usuario.
        
        txtIdCliente.setText(idUsuario);
    }//GEN-LAST:event_btnIdActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBairro;
    private javax.swing.JLabel LblCEP;
    private javax.swing.JLabel LblCPF;
    private javax.swing.JLabel LblCidade;
    private javax.swing.JLabel LblCliente;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblEstado;
    private javax.swing.JLabel LblEstadoCivil;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblNum;
    private javax.swing.JLabel LblRG;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JMenu MenuCadastroCliente;
    private javax.swing.JRadioButtonMenuItem MenuClientes;
    private javax.swing.JRadioButtonMenuItem MenuFornecedores;
    private javax.swing.JRadioButtonMenuItem MenuProdutos;
    private javax.swing.JRadioButtonMenuItem MenuRelProduto;
    private javax.swing.JMenu MenuRelatórioCliente;
    private javax.swing.JRadioButtonMenuItem MenuVenda;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnId;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSairCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jBairroCliente;
    private javax.swing.JTextField jCelularCliente;
    private javax.swing.JTextField jCepCliente;
    private javax.swing.JComboBox<String> jCidadeCliente;
    private javax.swing.JTextField jCpfCliente;
    private javax.swing.JTextField jEmailCliente;
    private javax.swing.JTextField jEnderecoCliente;
    private javax.swing.JComboBox<String> jEstCivilCliente;
    private javax.swing.JComboBox<String> jEstadoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jNomeCliente;
    private javax.swing.JTextField jNumeroCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jRgCliente;
    private javax.swing.JComboBox<String> jSexoCliente;
    private javax.swing.JTextField jTelefoneCliente;
    private javax.swing.JTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}
