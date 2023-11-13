package entidades;

public class Acesso {
    private String data_pagamento, idAcesso;

    public Acesso(String data_pagamento, String idAcesso){
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
    

}
