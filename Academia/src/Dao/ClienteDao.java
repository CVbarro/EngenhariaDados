package Dao;

import entidades.*;

import java.sql.*;
import java.util.ArrayList;

public class ClienteDao {
    private Connection connection;

    public ClienteDao(Connection connection) {
        this.connection = connection;
    }

    public void realizarCadastro(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, cpf, cnpj, email, data_nascimento, matricula) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getCnpj());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getData_nascimento());
            preparedStatement.setInt(6, cliente.getMatricula());

            preparedStatement.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
