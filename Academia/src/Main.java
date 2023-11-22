import Dao.ClienteDao;
import Dao.InstrutorDao;
import Dao.AcessoDao;
import entidades.Intrutor;
import entidades.Cliente;
import entidades.Acesso;

public class Main {

    public static void main(String[] args) {
        try {
            // Adicionando um instrutor
            Intrutor intrutor1 = new Intrutor("12", "Nome", "Espec");
            Intrutor intrutor2 = new Intrutor("123", "Nome1", "Espek");
            InstrutorDao instrutorDao = new InstrutorDao();
            instrutorDao.adicionarInstrutor(intrutor1);
            instrutorDao.adicionarInstrutor(intrutor2);

            // Adicionando um cliente
            Cliente cliente1 = new Cliente("mat", "12345678900", "Mat", 25, "Mat9", "12");
            Cliente cliente2 = new Cliente("maeu", "12345678903", "Mat1", 26, "Mat8", "1234");
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.adicionarCliente(cliente1);
            clienteDao.adicionarCliente(cliente2);

            // Adicionando um acesso
            Acesso acesso1 = new Acesso("12345678900", 13, "Mat9");
            Acesso acesso2 = new Acesso("12345678903", 9, "Mat8");
            AcessoDao acessoDao = new AcessoDao();
            acessoDao.adicionarAcesso(acesso1);
            acessoDao.adicionarAcesso(acesso2);

            // Removendo o instrutor pelo CPF
            // instrutorDao.removerInstrutorPorCPF("123");
            // removendo o cliente pelo cpf
            // clienteDao.removerClientePorCPF("12");
        } catch (Exception e) {
            System.out.println("Erro no programa: " + e.getMessage());
        }
    }
}
