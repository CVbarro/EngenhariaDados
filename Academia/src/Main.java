import Dao.*;
import entidades.*;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        Connection connection = conexao.recuperaConexao();

        Cliente cliente = new Cliente("Nome", "12345678900", "12345678901234", "email@example.com", "01/01/2000",
                1001);
        ClienteDao clienteDao = new ClienteDao(connection);

        clienteDao.realizarCadastro(cliente);

        // Lembre-se de fechar a conexão quando terminar de usá-la
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
