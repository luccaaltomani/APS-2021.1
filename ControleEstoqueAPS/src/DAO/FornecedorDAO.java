package DAO;

import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorDAO {
    private Connection conecta;
    
    public FornecedorDAO() {
        Conexao conectar = new Conexao();
        this.conecta = conectar.conecta();
    }
    
    public void salvarFornecedor(Fornecedor fornecedor) {
        String sql = "INSERT INTO tb_fornecedor(idFornecedor, nomeFornecedor, cnpjFornecedor, "
                + "razaoSocialFornecedor, empresaFornecedor, emailFornecedor, "
                + "enderecoFornecedor, bairro, numero, cidade, estado, cep) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt    (1, fornecedor.getIdFornecedor());
            stmt.setString (2, fornecedor.getNomeFornecedor());
            stmt.setString (3, fornecedor.getCnpjFornecedor());
            stmt.setString (4, fornecedor.getRazaoSocialFornecedor());
            stmt.setString (5, fornecedor.getEmpresaFornecedor());
            stmt.setString (6, fornecedor.getEmailFornecedor());
            stmt.setString (7, fornecedor.getEnderecoFornecedor());
            stmt.setString (8, fornecedor.getBairro());
            stmt.setString (9, fornecedor.getNumero());
            stmt.setString(10, fornecedor.getCidade());
            stmt.setString(11, fornecedor.getEstado());
            stmt.setString(12, fornecedor.getCep());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterarFornecedor(Fornecedor fornecedor) {
        String sql = "UPDATE tb_fornecedor SET nomeFornecedor=?, cnpjFornecedor=?, "
                + "razaoSocialFornecedor=?, empresaFornecedor=?, emailFornecedor=?, "
                + "enderecoFornecedor=?, bairro=?, numero=?, cidade=?, estado=?, cep=? "
                + "WHERE idFornecedor=?;";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString (1, fornecedor.getNomeFornecedor());
            stmt.setString (2, fornecedor.getCnpjFornecedor());
            stmt.setString (3, fornecedor.getRazaoSocialFornecedor());
            stmt.setString (4, fornecedor.getEmpresaFornecedor());
            stmt.setString (5, fornecedor.getEmailFornecedor());
            stmt.setString (6, fornecedor.getEnderecoFornecedor());
            stmt.setString (7, fornecedor.getBairro());
            stmt.setString (8, fornecedor.getNumero());
            stmt.setString (9, fornecedor.getCidade());
            stmt.setString(10, fornecedor.getEstado());
            stmt.setString(11, fornecedor.getCep());
            stmt.setInt   (12, fornecedor.getIdFornecedor());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void deletarFornecedor(Fornecedor fornecedor) {
        String sql = "DELETE FROM tb_fornecedor WHERE idFornecedor=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, fornecedor.getIdFornecedor());
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
