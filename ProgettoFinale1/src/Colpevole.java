public class Colpevole {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String movente;
    private String rapportoVittima;
    private String precedentiPenali;

    public Colpevole(String nome, String cognome, String dataNascita, String movente, String rapportoVittima, String precedentiPenali) {
        if(nome.isEmpty() || cognome.isEmpty() || dataNascita.isEmpty() || movente.isEmpty() || rapportoVittima.isEmpty() || precedentiPenali.isEmpty()) {
            throw new IllegalArgumentException("Identità colpevole sconosciuta");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
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
        return "Colpevole{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita='" + dataNascita + '\'' +
                ", movente='" + movente + '\'' +
                ", rapportoVittima='" + rapportoVittima + '\'' +
                ", precedentiPenali='" + precedentiPenali + '\'' +
                '}';
    }
}
