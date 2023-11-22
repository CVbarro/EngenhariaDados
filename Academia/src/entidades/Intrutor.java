package entidades;

public class Intrutor {
    private String cpf;
    private String nome;
    private String espec;

    public Intrutor(String cpf, String nome, String espec) {
        this.cpf = cpf;
        this.nome = nome;
        this.espec = espec;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspec() {
        return this.espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }
}