import Dao.ClienteDao;
import Dao.InstrutorDao;

import java.util.List;

import Dao.AcessoDao;
import entidades.Intrutor;
import entidades.Cliente;
import entidades.Acesso;

public class Main {

    public static void main(String[] args) {
        try {
            // Adicionando um instrutor
            Intrutor intrutor1 = new Intrutor("12", "Nome", "fisio");
            Intrutor intrutor2 = new Intrutor("123", "Nome1", "superiores");
            InstrutorDao instrutorDao = new InstrutorDao();
            //instrutorDao.adicionarInstrutor(intrutor1);
            //instrutorDao.adicionarInstrutor(intrutor2);

            // Adicionando um cliente
            Cliente cliente1 = new Cliente("mateus", "12345678900", "Mat", 25, "Mat9", "12");
            Cliente cliente2 = new Cliente("vitor", "12345678903", "Mat1", 26, "Mat8", "123");
            Cliente cliente3 = new Cliente("Cvbarro", "12345678912", "Mat2", 27, "Mat10", "124");
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.adicionarCliente(cliente1);
            //clienteDao.adicionarCliente(cliente2);
            //clienteDao.adicionarCliente(cliente3);

            // Adicionando um acesso
            Acesso acesso1 = new Acesso("12345678900", 13, "Mat9");
            Acesso acesso2 = new Acesso("12345678903", 9, "Mat8");
            Acesso acesso3 = new Acesso("12345678912", 5, "Mat10");

            AcessoDao acessoDao = new AcessoDao();
            //acessoDao.adicionarAcesso(acesso1);
            //acessoDao.adicionarAcesso(acesso2);
            //acessoDao.adicionarAcesso(acesso3);

            // Removendo o instrutor pelo CPF
            //instrutorDao.removerInstrutorPorCPF("12");
            //clienteDao.removerClientePorCPF("12345678900");

            clienteDao.listarClientes();
            System.out.println("#############################################");
            System.out.println("LISTA de Alunos com o instrutor com o cpf 123");
            System.out.println("#############################################");

             List<Cliente> clientesDoInstrutor = clienteDao.listarClientesPorInstrutor("123");

        // Imprimir clientes
        for (Cliente cliente : clientesDoInstrutor) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Matrícula: " + cliente.getMatricula());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Matrícula de Acesso: " + cliente.getAcessoMatricula());
            System.out.println("CPF do Instrutor: " + cliente.getIntrutorCpf());
            System.out.println("--------------------");
        }

        } catch (Exception e) {
            System.out.println("Erro no programa: " + e.getMessage());
        }
    }
}
