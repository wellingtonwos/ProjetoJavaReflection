package br.com.JavaRelection;

public class Filme {

    public Filme(Integer idFilme, String nomeFilme, String anoFilme) {
        this.idFilme = idFilme;
        this.nomeFilme = nomeFilme;
        this.anoFilme = anoFilme;
    }

    public Filme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    private Integer idFilme;
    private String nomeFilme;
    private String anoFilme;

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getAnoFilme() {
        return anoFilme;
    }
}
