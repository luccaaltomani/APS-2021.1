package DAO;

import Model.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdministradorDAO {
    private Connection conecta;
    
    public AdministradorDAO() {
        Conexao conectar = new Conexao();
        this.conecta = conectar.conecta();
    }
    
    public void salvarAdministrador(Administrador administrador) {
        String sql = "INSERT INTO tb_administrador(idadministrador, nomeAdministrador, "
                + "rgAdministrador, cpfAdministrador) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, administrador.getIdAdministrador());
            stmt.setString(2, administrador.getNomeAdministrador());
            stmt.setString(3, administrador.getRgAdministrador());
            stmt.setString(4, administrador.getCpfAdministrador());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void deletarAdministrador(Administrador administrador) {
        String sql = "DELETE FROM tb_administrador WHERE idAdministrador=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, administrador.getIdAdministrador());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterarAdminitrador(Administrador administrador) {
        String sql = "UPDATE tb_administrador SET nomeAdministrador=?, "
                + "rgAdministrador=?, cpfAdministrador=? WHERE idAdministrador=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, administrador.getNomeAdministrador());
            stmt.setString(2, administrador.getRgAdministrador());
            stmt.setString(3, administrador.getCpfAdministrador());
            stmt.setInt   (4, administrador.getIdAdministrador());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
