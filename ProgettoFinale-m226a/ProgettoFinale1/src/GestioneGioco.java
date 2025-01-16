/**
 * Classe GestioneGioco - informazioni sulla stampa
 *
 * @author Linda Bytyqi
 * @version Gennaio 2025
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class GestioneGioco {
    private Caso caso;
    private boolean risolto;
    private ArrayList<Indizio> indiziRaccolti;

    Path casoTxt = Paths.get("/Scuola/Professionale/I2AC/m226a/ProgettoFinale-m226a/ProgettoFinale1/src/caso.txt");
    ArrayList<String> txtCaso = new ArrayList<>();
    public GestioneGioco(Caso caso) {
        this.caso = caso;
        this.indiziRaccolti = new ArrayList<>();
    }
    public void avviaGioco() {
        Scanner scanner = new Scanner(System.in);
        risolto = false;

    try {
        System.out.println("Nome del detective: ");
        String nomeDetective = scanner.nextLine();
        System.out.println("Cognome del detective: ");
        String cognomeDetective = scanner.nextLine();
        txtCaso.add("Nome del detective: " + nomeDetective + " " + cognomeDetective);
        try{
            Path write = Files.write(casoTxt, txtCaso);
        } catch (IOException e) {
            System.out.println("Errore scrittura" + e.getMessage());
        }
    }catch(Exception e){
        System.out.println("Inserisci il tuo nome perfavore");
    }
        System.out.println("Caso: " + caso.getTitolo());
        System.out.println(caso.getDescrizione());


        while (!risolto) {
            System.out.println("\nChe cosa vuoi fare?");
            System.out.println("1. Esplora il luogo del crimine.");
            System.out.println("2. Interroga un sospettato.");
            System.out.println("3. Analizza gli indizi raccolti.");
            System.out.println("4. Concludi il caso e accusa un sospettato.");
            System.out.print("\nScelta: ");
            int scelta = scanner.nextInt();
            if (scelta < 0 || scelta >= 5){
                System.out.println("Scegli un numero da 1-4 perfavore");
            }
        try {
            switch (scelta) {
                case 1:
                    esploraLuogo(scanner);
                    break;
                case 2:
                    interrogaSospettato(scanner);
                    break;
                case 3:
                    analizzaIndizi();
                    break;
                case 4:
                    risolto = concludeCaso(scanner);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Non valido, inserisci un numero da 1-4");
        }
        }

    }

    /**
     * Informazioni sul luogo
     *
     * @param scanner scanner
     * @return stampa sulle informazioni del luogo
     */
    private void esploraLuogo(Scanner scanner) {
        System.out.println("\nIndizi disponibili");
        ArrayList<Indizio> indizi = caso.getIndizi();
        for (int i = 0; i < indizi.size(); i++) {
            System.out.println(((i+1) + ". " + indizi.get(i).getDescrizione()));
        }
        System.out.print("\nScegli un indizio da raccogliere: ");
        int scelta = scanner.nextInt();

        if (scelta > 0 && scelta <= 3) {
            Indizio indizio = indizi.get(scelta - 1);
            indiziRaccolti.add(indizio);
            System.out.println("\nIndizio raccolto: " + indizio.getDescrizione());
        } else {
            System.out.println("\nScelta non valida, scegli un numero da 1-3");
        }
    }
    /**
     * Interrogatorio al sospettato
     *
     * @param scanner scanner
     * @return stampa l'alibi del sospettato
     */
    private void interrogaSospettato(Scanner scanner) {
        System.out.println("\nSospettati disponibili");
        ArrayList<Sospettato> sospettati = caso.getSospettati();
        for (int i = 0; i < sospettati.size(); i++) {
            System.out.println((i + 1) + ". " + sospettati.get(i).getNome());
        }
        System.out.print("\nScegli un sospettato da interrogare: ");
        int scelta = scanner.nextInt();

        if (scelta > 0 && scelta <= 4) {
            Sospettato sospettato = sospettati.get(scelta - 1);
            System.out.println("\n" + sospettato.getNome() + ": \"" + sospettato.getAlibi() + "\"");
        } else {
            System.out.println("\nScelta non valida, scegli un numero da 1-4");
        }
    }
    private void analizzaIndizi() {
        System.out.println("\nIndizi raccolti");
        if (indiziRaccolti.isEmpty()) {
            System.out.println("Nessun indizio raccolto.");
        } else {
            for (Indizio indizio : indiziRaccolti) {
                System.out.print("- " + indizio.getDescrizione());
                System.out.println(" " + indizio.getAiuto());
                txtCaso.add("Indizi raccolti: " + indiziRaccolti);
                try{
                    Path write = Files.write(casoTxt, txtCaso);
                } catch (IOException e) {
                    System.out.println("Errore scrittura" + e.getMessage());
                }
            }
        }
    }
    /**
     * Conclusione del caso
     *
     * @param scanner scanner
     * @return stampa sulla risoluzione del caso
     */
    public boolean concludeCaso(Scanner scanner) {
        System.out.println("\nSospettati disponibili");
        ArrayList<Sospettato> sospettati = caso.getSospettati();
        for (int i = 0; i < sospettati.size(); i++) {
            System.out.println((i + 1) + ". " + sospettati.get(i).getNome());
        }
        System.out.print("\nChi accusi? ");
        int scelta = scanner.nextInt();

        if (scelta > 0 && scelta <= sospettati.size()) {
            Sospettato accusato = sospettati.get(scelta - 1);
            if (accusato.isColpevole()) {
                System.out.println("\nHai risolto il caso! Il colpevole era: " + accusato.getNome() + ".");
                txtCaso.add("*HAI VINTO CAMPIONEE!*");
                try{
                    Path write = Files.write(casoTxt, txtCaso);
                } catch (IOException e) {
                    System.out.println("Errore scrittura" + e.getMessage());
                }
                return true;
            } else {
                System.out.println("\nHai accusato la persona sbagliata! Riprova.");
                txtCaso.add("Non ti preoccupare! Riprovaci");
                try{
                    Path write = Files.write(casoTxt, txtCaso);
                } catch (IOException e) {
                    System.out.println("Errore scrittura" + e.getMessage());
                }
            }
        } else {
            System.out.println("\nScelta non valida.");
        }
        return false;

    }




}
