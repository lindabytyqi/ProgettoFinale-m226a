/**
 * Classe Sospettato - informazioni sul sospettato
 *
 * @author Linda Bytyqi
 * @version Gennaio 2025
 */
import java.util.Objects;

public class Sospettato {
    private String nome;
    private String alibi;
    private boolean colpevole;

    public Sospettato(String nome, String alibi, boolean colpevole) {
        try {
            this.nome = nome;
            this.alibi = alibi;
            this.colpevole = colpevole;
        } catch (Exception e) {
            System.out.println("Valore non valido");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getAlibi() {
        return alibi;
    }

    public boolean isColpevole() {
        return colpevole;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlibi(String alibi) {
        this.alibi = alibi;
    }

    public void setColpevole(boolean colpevole) {
        this.colpevole = colpevole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sospettato that = (Sospettato) o;
        return colpevole == that.colpevole && Objects.equals(nome, that.nome) && Objects.equals(alibi, that.alibi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, alibi, colpevole);
    }
}
