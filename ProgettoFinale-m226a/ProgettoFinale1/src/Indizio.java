/**
 * Classe Indizio - informazioni sugli indizi
 *
 * @author Linda Bytyqi
 * @version Gennaio 2025
 */
public class Indizio {
    private String descrizione;
    private boolean importante;
    private String aiuto;

    public Indizio(String descrizione, boolean importante, String aiuto) {
        try {
            this.descrizione = descrizione;
            this.importante = importante;
            this.aiuto = aiuto;
        } catch (Exception e) {
            System.out.println("Inserisci un valore");
        }
    }

    public String getAiuto() {
        return aiuto;
    }

    public void setAiuto(String aiuto) {
        this.aiuto = aiuto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public boolean isImportante() {
        return importante;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }
}
