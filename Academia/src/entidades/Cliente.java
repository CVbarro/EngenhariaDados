package entidades;
public class Cliente {
    private String nome, cpf, cnpj, email, data_nascimento;
    private int matricula;

    public Cliente(String nome, String cpf, String cnpj, String email, String data_nascimento, int matricula){
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.matricula = matricula;
        this.nome = nome;

    }

    public String getCnpj() {
        return cnpj;
    }
    public String getCpf() {
        return cpf;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public String getEmail() {
        return email;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    





}
