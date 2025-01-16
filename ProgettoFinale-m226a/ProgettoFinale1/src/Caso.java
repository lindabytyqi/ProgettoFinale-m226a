/**
 * Classe Caso - informazioni sui rispettivi casi
 *
 * @author Linda Bytyqi
 * @version Gennaio 2025
 */
import java.util.ArrayList;

public class Caso {
    private String titolo;
    private String descrizione;
    private ArrayList<Sospettato> sospettati;
    private ArrayList<Indizio> indizi;

    public Caso(String titolo, String descrizione, ArrayList<Sospettato> sospettati, ArrayList<Indizio> indizi) {
        try{
            this.titolo = titolo;
            this.descrizione = descrizione;
            this.sospettati = sospettati;
            this.indizi = indizi;
        } catch (Exception e) {
            System.out.println("Il campo non può essere vuoto");
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public ArrayList<Sospettato> getSospettati() {
        return sospettati;
    }

    public ArrayList<Indizio> getIndizi() {
        return indizi;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setSospettati(ArrayList<Sospettato> sospettati) {
        this.sospettati = sospettati;
    }

    public void setIndizi(ArrayList<Indizio> indizi) {
        this.indizi = indizi;
    }
}
