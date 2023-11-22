    package Dao;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

        public void listarClientes() {
        Conexao conexao = new Conexao();

        String sql = "SELECT * FROM Cliente";

        try {
            Connection connection = conexao.recuperaConexao();

            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Recuperando os dados do resultado da consulta
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String matricula = rs.getString("matricula");
                int idade = rs.getInt("idade");
                String acessoMatricula = rs.getString("Acesso_matricula");
                String instrutorCpf = rs.getString("Intrutor_cpf");

                // Imprimindo os dados
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Matrícula: " + matricula);
                System.out.println("Idade: " + idade);
                System.out.println("Matrícula de Acesso: " + acessoMatricula);
                System.out.println("CPF do Instrutor: " + instrutorCpf);
                System.out.println("--------------------");
            }

            // Fechando recursos
            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());
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
        public List<Cliente> listarClientesPorInstrutor(String cpfInstrutor) {
    Conexao conexao = new Conexao();

    String sql = "SELECT * FROM Cliente WHERE Intrutor_cpf = ?";

    List<Cliente> clientes = new ArrayList<>();

    try {
        Connection connection = conexao.recuperaConexao();

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, cpfInstrutor);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            // Recuperando os dados do resultado da consulta
            String nome = rs.getString("nome");
            String cpf = rs.getString("cpf");
            String matricula = rs.getString("matricula");
            int idade = rs.getInt("idade");
            String acessoMatricula = rs.getString("Acesso_matricula");
            String instrutorCpf = rs.getString("Intrutor_cpf");

            // Criando objeto Cliente
            Cliente cliente = new Cliente(nome, cpf, matricula, idade, acessoMatricula, instrutorCpf);

            // Adicionando cliente à lista
            clientes.add(cliente);
        }

        // Fechando recursos
        rs.close();
        stmt.close();
        connection.close();

    } catch (SQLException e) {
        System.out.println("Erro ao listar clientes por instrutor: " + e.getMessage());
    }

    return clientes;
}
    }
