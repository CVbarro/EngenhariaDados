package entidades;

public class Pagamento {
    private String idPagamento, dataPagamento;

    public Pagamento(String idPagamento, String dataPagamento){
        this.dataPagamento = dataPagamento;
        this.idPagamento = idPagamento;

    }

    public String getDataPagamento() {
        return dataPagamento;
    }
    public String getIdPagamento() {
        return idPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

}
