import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random orario = new Random();
        double orari = orario.nextDouble(0.0, 24.0);
        Interrogatorio i1 = new Interrogatorio(orari, "15 minuti");
        Interrogatorio i2 = new Interrogatorio(orari, "10 minuti");
        Interrogatorio i3 = new Interrogatorio(orari, "30 minuti");
        Interrogatorio i4 = new Interrogatorio(orari, "40 minuti");
        GestioneGioco gioco = new GestioneGioco("nome");
        Path vittima = Paths.get("/Scuola/Professionale/I2AC/m226a/ProgettoFinale1/src/Vittima.txt");
        List<String> txtVittima = new ArrayList<>();
        Path sospettati = Paths.get("/Scuola/Professionale/I2AC/m226a/ProgettoFinale1/src/Sospettati.txt");
        List<String> txtSospettati = new ArrayList<>();
        Path colpevole = Paths.get("/Scuola/Professionale/I2AC/m226a/ProgettoFinale1/src/Colpevole.txt");
        List<String> txtColpevole = new ArrayList<>();
        Path caso = Paths.get("/Scuola/Professionale/I2AC/m226a/ProgettoFinale1/src/Caso.txt");
        if (Files.exists(caso)) {
            System.out.printf("Il file %s esiste!\n", caso.toString());
        } else {
            System.out.printf("Il file %s non esiste!\n", caso.toString());
        }
        List<String> txtCaso = new ArrayList<>();
        Path interrogatorio = Paths.get("/Scuola/Professionale/I2AC/m226a/ProgettoFinale1/src/Interrogatorio.txt");
        List<String> txtInterrogatorio = new ArrayList<>();
        System.out.println(gioco);
        System.out.println();
        System.out.println("Nome del detective: ");
        String nomeDetective = sc.nextLine();
        txtCaso.add("Nome del detective che segue il caso: " + nomeDetective);
        System.out.println("Cognome del detective: ");
        String cognomeDetective = sc.nextLine();
        txtCaso.add("Cognome del detective che segue il caso: " + cognomeDetective);
        try {
            Files.write(caso, txtCaso);
        } catch (IOException ex) {
            System.out.println("Errore scrittura!");
        }
        System.out.println("Scegli il tuo caso: ");
        System.out.println(gioco.printDonnaSupermercato());
        System.out.println(gioco.printBambinaGenitori());
        System.out.println(gioco.printLitigioScuola());
        System.out.println(gioco.printStalker());
        System.out.println("Caso scelto: ");
        String casoScelto = sc.nextLine();

        System.out.println("Ecco le informazioni riguardanti il caso: ");
        if (casoScelto.equals("1")) {
            System.out.println(gioco.infoDonnaSupermercato());
            txtCaso.add("Caso scelto: 1");
        }else if (casoScelto.equals("2")) {
            System.out.println(gioco.infoBambinaGenitori());
            txtCaso.add("Caso scelto: 2");
        }else if (casoScelto.equals("3")) {
            System.out.println(gioco.infoLitigioScuola());
            txtCaso.add("Caso scelto: 3");
        }else if (casoScelto.equals("4")) {
            System.out.println(gioco.infoStalker());
            txtCaso.add("Caso scelto: 4");
        }

    }
}



