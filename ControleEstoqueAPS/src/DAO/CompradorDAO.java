package DAO;

import Model.Comprador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompradorDAO {
    private Connection conecta;
    
    public CompradorDAO() {
        Conexao conectar = new Conexao();
        this.conecta = conectar.conecta();
    }
    
    public void salvarComprador(Comprador comprador) {
        String sql = "INSERT INTO tb_comprador(nomeComprador) VALUES(?)";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, comprador.getNomeComprador());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterarComprador(Comprador comprador) {
        String sql = "UPDATE tb_comprador SET nomeComprador=? WHERE idComprador=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, comprador.getNomeComprador());
            stmt.setInt   (2, comprador.getIdComprador());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void deletarComprador(Comprador comprador) {
        String sql = "DELETE FROM tb_comprador WHERE idComprador=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, comprador.getIdComprador());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
