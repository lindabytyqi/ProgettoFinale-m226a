import java.util.Random;

public class Interrogatorio {
    private double orario;
    private String tempoDurata;
    private String domanda;
    private String sospettato;

    public Interrogatorio(double orario, String tempoDurata) {
        this.tempoDurata = tempoDurata;
        this.domanda = domanda;
        this.sospettato = sospettato;
    }

    public void interrogatorioSupermercato() {
        sospettato = "Paolo Ramìrez";
            if (domanda.contains("rapporto con la vittima")) {
                System.out.println("Sospettato: ero il suo fidanzato");
            } else if (domanda.contains("alibi")) {
                System.out.println("Sospettato: ero a casa mia quando tutto è successo");
            } else if (domanda.contains("litigato")) {
                System.out.println("Sospettato: si abbiamo litigato, perchè lei voleva lasciarmi ma io non volevo");
            } else if (domanda.contains("violenza") || domanda.contains("alzato le mani")) {
                System.out.println("Sospettato: no, mai");
            } else if (domanda.contains("mente") || domanda.contains("stai mentendo")) {
                System.out.println("Sospettato: voglio il mio avvocato");
            } else if (domanda.contains("telecamere")) {
                System.out.println("Sospettato: non ero io");
            } else if (domanda.contains("confermarlo")) {
                System.out.println("Sospettato: no");
            }
    }
    public double getOrario() {
        return orario;
    }

    public void setOrario(double orario) {
        this.orario = orario;
    }

    public String getTempoDurata() {
        return tempoDurata;
    }

    public void setTempoDurata(String tempoDurata) {
        this.tempoDurata = tempoDurata;
    }
}
