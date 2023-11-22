package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entidades.Intrutor;

public class InstrutorDao {

    public void adicionarInstrutor(Intrutor intrutor) {
        Conexao conexao = new Conexao(); // Criando uma instância da classe Conexao

        String sql = "INSERT INTO Intrutor (cpf, nome, espec) VALUES (?, ?, ?)";

        try {
            Connection connection = conexao.recuperaConexao(); // Obtendo a conexão com o banco de dados

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, intrutor.getCpf());
            stmt.setString(2, intrutor.getNome());
            stmt.setString(3, intrutor.getEspec());

            stmt.executeUpdate();
            System.out.println("Instrutor adicionado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar instrutor: " + e.getMessage());
        }
    }
    public void removerInstrutorPorCPF(String cpf) {
        Conexao conexao = new Conexao();

        String sql = "DELETE FROM Intrutor WHERE cpf = ?";

        try {
            Connection connection = conexao.recuperaConexao();

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Instrutor removido com sucesso!");
            } else {
                System.out.println("Nenhum instrutor encontrado com esse CPF.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao remover instrutor: " + e.getMessage());
        }
    }
}
