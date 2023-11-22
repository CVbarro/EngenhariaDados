package entidades;

public class Cliente {
    private String nome, cpf, cnpj, email;
    private String data_nascimento;
    private int matricula;
    private Pagamento pagamento;
    private Acesso acesso;

    public Cliente(String nome, String cpf, String cnpj, String email, String data_nascimento,
            int matricula) {
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

    public void realizarPagamento(String idPagamento, String dataPagamento, Pagamento pagamento) {
        // Lógica para realizar o pagamento
        pagamento = new Pagamento(idPagamento, dataPagamento);
        System.out.println("Pagamento realizado para o cliente: " + nome);
    }

    public void verificarAcesso() {
        if (pagamento != null) {
            // Se houver um pagamento registrado, verifica o acesso
            acesso = new Acesso(pagamento.getDataPagamento(), String.valueOf(matricula));

            if (acesso.verificarAcesso(pagamento)) {
                System.out.println("Acesso liberado para o cliente: " + nome);
            } else {
                System.out.println("Acesso negado para o cliente: " + nome);
            }
        } else {
            System.out.println("Cliente não realizou pagamento.");
        }
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }
}