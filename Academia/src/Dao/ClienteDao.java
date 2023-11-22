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

            preparedStatement.execute();
            try (ResultSet rst = preparedStatement.getGeneratedKeys()) {
                while (rst.next()) {
                    cliente.setMatricula(rst.getInt(6));
                }
            }
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public ArrayList<Cliente> clienteCadastro() {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT matricula, nome, cpf, cnpj, email, data_nascimento, idade FROM cliente";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();
                ResultSet rst = pstm.getResultSet();
                while (rst.next()) {
                    int matricula = rst.getInt("matricula");
                    String nome = rst.getString("nome");
                    String cpf = rst.getString("cpf");
                    String data = rst.getString("data");
                    String cnpj = rst.getString("cnpj");
                    String email = rst.getString("email");
                    Cliente c = new Cliente(nome, cpf, cnpj, email, data, matricula);

                    clientes.add(c);

                }
            }
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
