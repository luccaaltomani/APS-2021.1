package DAO;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class UsuarioDAO {
    private Connection conecta;
    
    public UsuarioDAO() {
        Conexao conectar = new Conexao();
        this.conecta = conectar.conecta();
    }
    
    // Salvando usuários no banco de dados
    public void salvarUsuarios(Usuario usuario) {
        String sql = "INSERT INTO tb_usuario(loginUsuario, "
                + "senhaUsuario) VALUES(?,?)";
        
        try { 
            // Utilizando PreparedStatement pois os dados inseridos são direcionados para Query e são executados
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, usuario.getLoginUsuario());
            stmt.setString(2, usuario.getSenhaUsuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    // Alterando usuários no banco de dados
    public void alterarUsuarios(Usuario usuario) {
        String sql = "UPDATE tb_usuario SET loginUsuario=?, "
                + "senhaUsuario=? WHERE idUsuario=? ";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, usuario.getLoginUsuario());
            stmt.setString(2, usuario.getSenhaUsuario());
            stmt.setInt(3, usuario.getIdUsuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    // Deletando usuários no banco de dados
    public void deletarUsuarios(Usuario usuario) {
        String sql = "DELETE FROM tb_usuario WHERE idUsuario=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String pegarIdUsuario(){
        String sql = "SELECT MAX(idUsuario) FROM tb_usuario;";
        
        ResultSet rs;
        
        List<String> idUsuario = new ArrayList<String>();
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String maxId = rs.getString("max");
                
                idUsuario.add(maxId);
            }
            String result = idUsuario.get(idUsuario.size()-1);
            rs.close();
            stmt.execute();
            stmt.close();
            
            return result;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
        
        
    }
    
    
    
    // Listando usuários do banco de dados
    public void listarUsuarios() {
        String sql = "SELECT * FROM usuario ORDER BY idUsuario";
        ResultSet rs;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setLoginUsuario(rs.getString("loginUsuario"));
                usuarios.add(usuario);
            }
            rs.close();
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
