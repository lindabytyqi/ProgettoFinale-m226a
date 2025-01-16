/**
 * Classe Program
 *
 * @author Linda Bytyqi
 * @version Gennaio 2025
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Path casoTxt = Paths.get("/Scuola/Professionale/I2AC/m226a/ProgettoFinale-m226a/ProgettoFinale1/src/caso.txt");
        ArrayList<String> txtCaso = new ArrayList<>();
        if (Files.exists(casoTxt)) {
            System.out.printf("Il file %s esiste!\n", casoTxt.toString());
        } else {
            System.out.printf("Il file %s non esiste!\n", casoTxt.toString());
        }
        // Caso 3
        ArrayList<Sospettato> sospettati1 = new ArrayList<>();
        sospettati1.add(new Sospettato("La moglie", "Ero nella mia stanza a leggere un libro.", true));
        sospettati1.add(new Sospettato("Il giardiniere", "Ero in giardino ad annaffiare le piante.", false));
        sospettati1.add(new Sospettato("Il maggiordomo", "Stavo preparando il tè.", false));
        sospettati1.add(new Sospettato("Il vicino", "Non ero a casa.", false));

        ArrayList<Indizio> indizi1 = new ArrayList<>();
        indizi1.add(new Indizio("Pistola con impronte digitali.", true, " - Sono le impronte di una persona molto cara alla vittima"));
        indizi1.add(new Indizio("Biglietto con una dichiarazione d'amore.", false, " - Era famoso e tutti lo adoravano"));
        indizi1.add(new Indizio("Tazza di tè ancora calda.", false, " - Alibi confermato"));

        Caso caso1 = new Caso("Omicidio nella villa", "Un uomo è stato trovato morto nello studio della sua villa.", sospettati1, indizi1);

        // Caso 1
        ArrayList<Sospettato> sospettati2 = new ArrayList<>();
        sospettati2.add(new Sospettato("La domestica", "Stavo stirando al piano di sopra", false));
        sospettati2.add(new Sospettato("Il vicino", "Stavo tosando l'erba", false));
        sospettati2.add(new Sospettato("Il fidanzato", "Ero al centro commerciale", true));
        sospettati2.add(new Sospettato("L'amica", "Ero in macchina mentre andavo a trovarla", false));

        ArrayList<Indizio> indizi2 = new ArrayList<>();
        indizi2.add(new Indizio("Il drink sul tavolo", true, " - Analizzato ed è a posto"));
        indizi2.add(new Indizio("Dei messaggi minacciosi", false, " - La persona è stata salvata con 'Ex pazzo'"));
        indizi2.add(new Indizio("Un pezzo di vetro rotto.", false, " - È stato il cane"));

        Caso caso2 = new Caso("Omicidio alla piscina", "Una donna è stata brutalmente uccisa nella piscina della sua casa", sospettati2, indizi2);

        // Caso 2
        ArrayList<Sospettato> sospettati3 = new ArrayList<>();
        sospettati3.add(new Sospettato("Il cuoco", "Stavo preparando i piatti in cucina.", false));
        sospettati3.add(new Sospettato("Il cameriere", "Ero al tavolo a servire un cliente.", true));
        sospettati3.add(new Sospettato("Il cliente seduto vicino", "Stavo mangiando il mio piatto di pasta.", false));
        sospettati3.add(new Sospettato("Il proprietario del ristorante", "Ero nel mio ufficio a fare i conti.", false));

        ArrayList<Indizio> indizi3 = new ArrayList<>();
        indizi3.add(new Indizio("Bicchiere con tracce di veleno.", true, " - L'ultimo ad aver toccato il bicchiere prima della vittima era il cameriere"));
        indizi3.add(new Indizio("Piatti sporchi nella cucina.", false, " - Sera piena di lavoro"));
        indizi3.add(new Indizio("Un tovagliolo con delle macchie sospette.", false, " - Era Ketchup"));

        Caso caso3 = new Caso("Avvelenamento al ristorante", "Un cliente è stato avvelenato durante una cena al ristorante.", sospettati3, indizi3);

        ArrayList<Caso> casi = new ArrayList<>();
        casi.add(caso2);
        casi.add(caso3);
        casi.add(caso1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("*DetectiveGame*");
        System.out.println("Regole del gioco: ");
        System.out.println("Scegli un caso e risolvilo, sei tu il detective!");
        System.out.println("\nScegli un caso da risolvere:");
        for (int i = 0; i < casi.size(); i++) {
            System.out.println((i + 1) + ". " + casi.get(i).getTitolo());
        }

        System.out.print("\nInserisci il numero del caso: ");
        int sceltaCaso = scanner.nextInt();
        if (sceltaCaso > 0 && sceltaCaso <= casi.size()) {
            Caso casoSelezionato = casi.get(sceltaCaso - 1);
            GestioneGioco gioco = new GestioneGioco(casoSelezionato);
            gioco.avviaGioco();
        } else {
            System.out.println("Scelta non valida. Fine del gioco.");
        }
        try {
            List<String> righe = Files.readAllLines(casoTxt);
            for (String riga : righe) {
                System.out.println(riga);
            }
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }

}


