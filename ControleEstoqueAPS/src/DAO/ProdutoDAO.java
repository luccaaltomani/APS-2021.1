package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ProdutoDAO {
    private Connection conecta;
    
    public ProdutoDAO() {
        Conexao conectar = new Conexao();
        this.conecta = conectar.conecta();
    }
    
    public void salvarProduto(Produto produto) {
        String sql = "INSERT INTO tb_produto(nomeProduto, categoriaProduto, "
                + "codBarrasProduto, valorProduto, qtdProduto, qtdMinimaProduto, "
                + "precoVendaProduto, idFornecedor) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getCategoriaProduto());
            stmt.setInt   (3, produto.getCodBarrasProduto());
            stmt.setDouble(4, produto.getValorProduto());
            stmt.setInt   (5, produto.getQtdProduto());
            stmt.setInt   (6, produto.getQtdMinimaProduto());
            stmt.setDouble(7, produto.getPrecoVendaProduto());
            stmt.setInt(8, produto.getIdFornecedor());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterarProduto(Produto produto) {
        String sql = "UPDATE tb_produto SET nomeProduto=?, categoriaProduto=?, "
                + "codBarrasProduto=?, valorProduto=?, qtdProduto=?, "
                + "qtdMinimaProduto=?, precoVendaProduto=? WHERE idProduto=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getCategoriaProduto());
            stmt.setInt   (3, produto.getCodBarrasProduto());
            stmt.setDouble(4, produto.getValorProduto());
            stmt.setInt   (5, produto.getQtdProduto());
            stmt.setInt   (6, produto.getQtdMinimaProduto());
            stmt.setDouble(7, produto.getPrecoVendaProduto());
            stmt.setInt   (8, produto.getIdProduto());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void deletarProduto(Produto produto) {
        String sql = "DELETE FROM tb_produto WHERE idProduto=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String pegarQtd(Produto produto) {
        String sql = "SELECT qtdProduto FROM tb_produto where idProduto =?;";
        
        ResultSet rs;

        List<String> produtos = new ArrayList<String>();
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int qtdProduto = rs.getInt("qtdproduto");

                produtos.add(String.valueOf(qtdProduto));
            }
            String result = produtos.get(produtos.size()-1);
            rs.close();
            stmt.execute();
            stmt.close();

            return result;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
       
    }
    
    public List<Produto> listarProduto() {
        String sql = "SELECT * FROM tb_produto ORDER BY idProduto ASC";
        ResultSet rs;
        List<Produto> produtos = new ArrayList<Produto>();
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setCategoriaProduto(rs.getString("categoriaProduto"));
                produto.setCodBarrasProduto(rs.getInt("codBarrasProduto"));
                produto.setValorProduto(rs.getDouble("valorProduto"));
                produto.setPrecoVendaProduto(rs.getDouble("precoVendaProduto"));
                produto.setQtdProduto(rs.getInt("qtdProduto"));
                produto.setQtdMinimaProduto(rs.getInt("qtdMinimaProduto"));
                
                produtos.add(produto);
            }
            rs.close();
            stmt.close();
            return produtos;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
