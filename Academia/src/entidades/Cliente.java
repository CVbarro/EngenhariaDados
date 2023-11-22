package entidades;

public class Cliente {
    private String nome;
    private String cpf;
    private String matricula;
    private int idade;
    private String acessoMatricula;
    private String intrutorCpf;

    public Cliente(String nome, String cpf, String matricula, int idade, String acessoMatricula, String intrutorCpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.idade = idade;
        this.acessoMatricula = acessoMatricula;
        this.intrutorCpf = intrutorCpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAcessoMatricula() {
        return this.acessoMatricula;
    }

    public void setAcessoMatricula(String acessoMatricula) {
        this.acessoMatricula = acessoMatricula;
    }

    public String getIntrutorCpf() {
        return this.intrutorCpf;
    }

    public void setIntrutorCpf(String intrutorCpf) {
        this.intrutorCpf = intrutorCpf;
    }
}