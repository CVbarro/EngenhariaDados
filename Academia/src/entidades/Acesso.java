package entidades;

public class Acesso {
    private String cpf;
    private int qtdAcesso;
    private String matricula;

    public Acesso(String cpf, int qtdAcesso, String matricula) {
        this.cpf = cpf;
        this.qtdAcesso = qtdAcesso;
        this.matricula = matricula;
    }

    // Getters e Setters aqui...

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQtdAcesso() {
        return this.qtdAcesso;
    }

    public void setQtdAcesso(int qtdAcesso) {
        this.qtdAcesso = qtdAcesso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}