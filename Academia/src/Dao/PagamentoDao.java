package Dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

import entidades.Pagamento;

public class PagamentoDao {
    private Connection connection;

    public PagamentoDao(Connection connection) {
        this.connection = connection;
    }

    public void PagamentoTabela(Pagamento pagamento) {
try{
    String sql = "INSERT INTO pagamento (dataPagamento, idPagamento) VALUES (?, ?)";
    try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
        pstm.setString(1, pagamento.getDataPagamento());
        pstm.setString(2, pagamento.getIdPagamento());


    }
}
    }
}
