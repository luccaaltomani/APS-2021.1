package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection conecta;
    
    public ClienteDAO() {
        Conexao conectar = new Conexao();
        this.conecta = conectar.conecta();
    }
    
    public void salvarCliente(Cliente cliente) {
        String sql = "INSERT INTO tb_cliente(idCliente, nomeCliente, cpfCliente, rgCliente, "
                + "estCivilCliente, emailCliente, sexoCliente, celularCliente, "
                + "telefoneCliente, enderecoCliente, numero, bairro, cep, cidade, "
                + "estado) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, cliente.getIdCliente());
            stmt.setString(2, cliente.getNomeCliente());
            stmt.setString(3, cliente.getCpfCliente());
            stmt.setString(4, cliente.getRgCliente());
            stmt.setString(5, cliente.getEstCivilCliente());
            stmt.setString(6, cliente.getEmailCliente());
            stmt.setString(7, cliente.getSexoCliente());
            stmt.setString(8, cliente.getCelularCliente());
            stmt.setString(9, cliente.getTelefoneCliente());
            stmt.setString(10, cliente.getEnderecoCliente());
            stmt.setString(11, cliente.getNumero());
            stmt.setString(12, cliente.getBairro());
            stmt.setString(13, cliente.getCep());
            stmt.setString(14, cliente.getCidade());
            stmt.setString(15, cliente.getEstado());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterarCliente(Cliente cliente) {
        String sql = "UPDATE tb_cliente SET nomeCliente=?, cpfCliente=?, rgCliente=?, "
                + "estCivilCliente=?, emailCliente=?, sexoCliente=?, celularCliente=?, "
                + "telefoneCliente=?, enderecoCliente=?, numero=?, bairro=?, cep=?, "
                + "cidade=?, estado=? WHERE idCliente=? ";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString (1, cliente.getNomeCliente());
            stmt.setString (2, cliente.getCpfCliente());
            stmt.setString (3, cliente.getRgCliente());
            stmt.setString (4, cliente.getEstCivilCliente());
            stmt.setString (5, cliente.getEmailCliente());
            stmt.setString (6, cliente.getSexoCliente());
            stmt.setString (7, cliente.getCelularCliente());
            stmt.setString (8, cliente.getTelefoneCliente());
            stmt.setString (9, cliente.getEnderecoCliente());
            stmt.setString(10, cliente.getNumero());
            stmt.setString(11, cliente.getBairro());
            stmt.setString(12, cliente.getCep());
            stmt.setString(13, cliente.getCidade());
            stmt.setString(14, cliente.getEstado());
            stmt.setInt   (15, cliente.getIdCliente());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void deletarCliente(Cliente cliente) {
        String sql = "DELETE FROM tb_cliente WHERE idCliente=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, cliente.getIdCliente());
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
