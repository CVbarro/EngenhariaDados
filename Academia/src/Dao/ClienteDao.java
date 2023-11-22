package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entidades.*;

public class ClienteDao {

    public void adicionarCliente(Cliente cliente) {
        Conexao conexao = new Conexao(); // Instância da classe Conexao

        String sql = "INSERT INTO Cliente (nome, cpf, matricula, idade, Acesso_matricula, Intrutor_cpf) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = conexao.recuperaConexao(); // Obtendo a conexão com o banco de dados

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getMatricula());
            stmt.setInt(4, cliente.getIdade());
            stmt.setString(5, cliente.getAcessoMatricula());
            stmt.setString(6, cliente.getIntrutorCpf());

            stmt.executeUpdate();
            System.out.println("Cliente adicionado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar cliente: " + e.getMessage());
        }
    }

    public void removerClientePorCPF(String cpf) {
        Conexao conexao = new Conexao(); // Instância da classe Conexao

        String sql = "DELETE FROM Cliente WHERE cpf = ?";

        try {
            Connection connection = conexao.recuperaConexao(); // Obtendo a conexão com o banco de dados

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);

            stmt.executeUpdate();
            System.out.println("Cliente removido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao remover cliente: " + e.getMessage());
        }
    }
}
