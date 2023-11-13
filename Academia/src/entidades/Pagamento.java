package entidades;

public class Pagamento {
    private String idPagamento, dataPagamento;
    private boolean status;

    public Pagamento(String idPagamento, String dataPagamento, boolean status){
        this.dataPagamento = dataPagamento;
        this.idPagamento = idPagamento;
        this.status = status;

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
    public void setStatus(boolean status) {
        this.status = status;
    }

}
