package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection recuperaConexao() {
        try {
            String sgbd = "mysql";
            String endereco = "127.0.0.1";
            String bd = "mydb";
            String usuario = "root";
            String senha = "mysqlroot";

            Connection connection = DriverManager.getConnection(
                    "jdbc:" + sgbd + "://" + endereco + "/" + bd + "?useTimezone=true&serverTimezone=UTC", usuario,
                    senha);

            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return null;
    }

}