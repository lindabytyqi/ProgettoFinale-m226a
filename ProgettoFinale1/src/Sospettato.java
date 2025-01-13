public class Sospettato {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String alibi;
    private String movente;
    private String rapportoVittima;
    private String precedentiPenali;

    public Sospettato(String nome, String cognome, String dataNascita, String alibi, String movente, String rapportoVittima, String precedentiPenali) {
        if(nome.isEmpty() || cognome.isEmpty()) {
            throw new IllegalArgumentException("Identità obbligatoria");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.alibi = alibi;
        this.movente = movente;
        this.rapportoVittima = rapportoVittima;
        this.precedentiPenali = precedentiPenali;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getAlibi() {
        return alibi;
    }

    public void setAlibi(String alibi) {
        this.alibi = alibi;
    }

    public String getMovente() {
        return movente;
    }

    public void setMovente(String movente) {
        this.movente = movente;
    }

    public String getRapportoVittima() {
        return rapportoVittima;
    }

    public void setRapportoVittima(String rapportoVittima) {
        this.rapportoVittima = rapportoVittima;
    }

    public String getPrecedentiPenali() {
        return precedentiPenali;
    }

    public void setPrecedentiPenali(String precedentiPenali) {
        this.precedentiPenali = precedentiPenali;
    }

    @Override
    public String toString() {
        return "Sospettato{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita='" + dataNascita + '\'' +
                ", alibi='" + alibi + '\'' +
                ", movente='" + movente + '\'' +
                ", rapportoVittima='" + rapportoVittima + '\'' +
                ", precedentiPenali='" + precedentiPenali + '\'' +
                '}';
    }
}
