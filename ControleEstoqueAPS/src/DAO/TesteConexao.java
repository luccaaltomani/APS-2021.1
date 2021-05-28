package DAO;

import java.sql.Connection;
import java.sql.SQLException;  


// Classe para testar a conexão com o banco de dados
public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        Connection conecta = new Conexao().conecta();
        System.out.println("Conexão aberta");
        conecta.close();
    }
}