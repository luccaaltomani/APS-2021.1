package DAO;

import java.sql.Connection;         // Para conectar ao banco de dados
import java.sql.DriverManager;      // Requisitos para conexão
import java.sql.SQLException;       // Verificar erro de conexão

public class Conexao {
    public Connection conecta() {
        try {
            // Criando variáveis para conexão ao banco de dados
            String url = "jdbc:postgresql://localhost:5432/CONTROLE_ESTOQUE_APS_2021";
            String usuario = "postgres";
            String senha = "luccadb";
            
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}