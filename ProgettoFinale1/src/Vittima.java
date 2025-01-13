public class Vittima {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String luogoDecesso;
    private String oraMorte;
    private String causaMorte;

    public Vittima(String nome, String cognome, String dataNascita, String luogoDecesso, String oraMorte, String causaMorte) {
        if(nome.isEmpty() || cognome.isEmpty() || dataNascita.isEmpty() || luogoDecesso.isEmpty() || oraMorte.isEmpty() || causaMorte.isEmpty()) {
            throw new IllegalArgumentException("Sconosciuto");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.luogoDecesso = luogoDecesso;
        this.oraMorte = oraMorte;
        this.causaMorte = causaMorte;
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

    public String getLuogoDecesso() {
        return luogoDecesso;
    }

    public void setLuogoDecesso(String luogoDecesso) {
        this.luogoDecesso = luogoDecesso;
    }

    public String getOraMorte() {
        return oraMorte;
    }

    public void setOraMorte(String oraMorte) {
        this.oraMorte = oraMorte;
    }

    public String getCausaMorte() {
        return causaMorte;
    }

    public void setCausaMorte(String causaMorte) {
        this.causaMorte = causaMorte;
    }


    @Override
    public String toString() {
        return "Vittima{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita='" + dataNascita + '\'' +
                ", luogoDecesso='" + luogoDecesso + '\'' +
                ", oraMorte='" + oraMorte + '\'' +
                ", causaMorte='" + causaMorte + '\'' +
                '}';
    }
}
