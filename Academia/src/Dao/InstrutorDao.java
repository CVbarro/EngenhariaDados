package Dao;

import entidades.Instrutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InstrutorDao {
    private Connection connection;

    public InstrutorDao(Connection connection) {
        this.connection = connection;
    }

    public void adicionarInstrutor(Instrutor instrutor) throws SQLException {
        String sql = "INSERT INTO instrutor (nomeInstrutor, idInstrutor, especInstrutor) VALUES (?, ?, ?)";
        try (Connection connection = connection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, instrutor.getNomeInstrutor());
            preparedStatement.setString(2, instrutor.getIdInstrutor());
            preparedStatement.setString(3, instrutor.getEspecInstrutor());

            preparedStatement.execute();

            try (ResultSet rst = preparedStatement.getGeneratedKeys()) {
                while (rst.next()) {
                    instrutor.setIdInstrutor(rst.getInt(1));
                }
            }
            System.out.println("Instrutor adicionado com sucesso! ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
