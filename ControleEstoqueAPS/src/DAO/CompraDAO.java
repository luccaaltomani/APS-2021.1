package DAO;

import Model.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class CompraDAO {
    private Connection conecta;
    
    public CompraDAO() {
        Conexao conectar = new Conexao();
        this.conecta = conectar.conecta();
    }
    
    public void salvarCompra(Compra compra) {
        String sql = "INSERT INTO tb_compra(dataCompra) VALUES(?)";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, compra.getDataCompra());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Compra> listarCompra() {
        String sql = "SELECT * FROM tb_compra ORDER BY dataCompra ASC";
        ResultSet rs;
        List<Compra> compras = new ArrayList<Compra>();
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCliente(rs.getInt("idCliente"));
                compra.setIdProduto(rs.getInt("idProduto"));
                compra.setDataCompra(rs.getString("dataCompra"));
                
                compras.add(compra);
            }
        rs.close();
        stmt.close();
        return compras;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
