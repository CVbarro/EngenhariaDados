package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entidades.Acesso;

public class AcessoDao {

    public void adicionarAcesso(Acesso acesso) {
        Conexao conexao = new Conexao(); // Certifique-se de que Conexao tenha o método recuperaConexao()

        String sql = "INSERT INTO Acesso (cpf, qtdacesso, matricula) VALUES (?, ?, ?)";

        try {
            Connection connection = conexao.recuperaConexao(); // Corrigindo a obtenção da conexão com o banco de dados

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, acesso.getCpf());
            stmt.setInt(2, acesso.getQtdAcesso());
            stmt.setString(3, acesso.getMatricula());

            stmt.executeUpdate();
            System.out.println("Acesso adicionado com sucesso!");

            connection.close(); // Fechando a conexão após o uso

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar acesso: " + e.getMessage());
        }
    }

  
}
