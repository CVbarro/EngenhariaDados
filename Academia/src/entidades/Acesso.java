package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Acesso {
    private String data_pagamento, idAcesso;

    public Acesso(String data_pagamento, String idAcesso) {
        this.data_pagamento = data_pagamento;
        this.idAcesso = idAcesso;

    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public String getIdAcesso() {
        return idAcesso;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public void setIdAcesso(String idAcesso) {
        this.idAcesso = idAcesso;
    }

    public boolean verificarAcesso(Pagamento pagamento) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dataPagamentoDate = dateFormat.parse(pagamento.getDataPagamento());

            return verificarPagamento(dataPagamentoDate);
        } catch (ParseException e) {
            System.out.println("Erro ao converter a data de pagamento.");
            e.printStackTrace();
            return false; // Em caso de erro na conversão da data
        }
    }

    private boolean verificarPagamento(Date dataPagamento) {
        // Obtém a data atual
        Date dataAtual = new Date();

        // Compara as datas
        return !dataAtual.before(dataPagamento); // Se a data atual não é antes da data de pagamento, o acesso é
        // liberado
    }
}
