package entidades;

public class Instrutor {
    private String nomeInstrutor, idInstrutor, especInstrutor;

    public Instrutor(String nomeInstrutor, String idInstrutor, String especInstrutor) {
        this.especInstrutor = especInstrutor;
        this.idInstrutor = idInstrutor;
        this.nomeInstrutor = nomeInstrutor;

    }

    public String getEspecInstrutor() {
        return especInstrutor;
    }

    public String getIdInstrutor() {
        return idInstrutor;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setEspecInstrutor(String especInstrutor) {
        this.especInstrutor = especInstrutor;
    }

    public void setIdInstrutor(int i) {
        this.idInstrutor = idInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

}
