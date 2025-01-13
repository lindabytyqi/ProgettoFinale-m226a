import java.util.ArrayList;

public class GestioneGioco {
    private String nome;

    public GestioneGioco(String nome) {
        this.nome = "nome";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String printDonnaSupermercato() {
        return "Caso numero 1 - Donna al Supermercato";
    }
    public String infoDonnaSupermercato(){
        return "Informazioni sulla vittima: " + "\n" +
                "Nome della vittima: Jasmine" + "\n" +
                "Cognome della vittima: Lopez" + "\n" +
                "Data di nascita: 12.09.1990" + "\n" +
                "Luogo del decesso: parcheggi del Supermercados Dia, Calle de Lagasca 89 Madrid" + "\n" +
                "Orario del decesso: 12.00" + "\n" +
                "Causa del decesso: Strangolamento" + "\n" +
                "Un testimone afferma di aver visto la donna uscire dal supermercato alle 10.30." + "\n" +
                "Un altro testimone afferma che la vittima non se ne sia mai andata dai parcheggi del supermercato, fatto che possiamo confermare perchè la macchina della vittima si trovava ancora ai parcheggi e al suo fianco c'era il suo corpo" + "\n" +
                "Inoltre possiamo confermare dalle telecamere di sorveglianza che quella mattina c'è stato un litigio tra la vittima ed un uomo che pare si conoscessero, un uomo anziano afferma di averli sentiti discutere sul fatto che lei l'abbia lasciato e se ne fosse andata da casa senza rispondere alle telefonate dell'uomo" + "\n" +
                "Lo descrivono un uomo alto circa 1.75, capelli scuri e barba, ha l'aria di una persona manesca. Purtroppo dalle telecamere di sorveglianza si può vedere l'uomo girato di spalle" + "\n" +
                "Lista dei sospettati da interrogare: "+ "\n" +
                "1. Pablo Ramìrez";

    }
    public String printBambinaGenitori() {
        return "Caso numero 2 - Bambina Genitori";
    }
    public String infoBambinaGenitori(){
        return "Informazioni sulla vittima: " + "\n" +
                "Nome della vittima: Alice" + "\n" +
                "Cognome della vittima: Williams" + "\n" +
                "Data di nascita: 01.04.2018" + "\n" +
                "Luogo del decesso: Casa Williams, 255 Belair Dr, USA" + "\n" +
                "Orario del decesso: 18.00" + "\n" +
                "Causa del decesso: Uccisa a mani nude" + "\n" +
                "La piccola Alice è stata trovata morta nel suo letto." + "\n" +
                "I vicini di casa affermano di aver sentito la bambina urlare e piangere, fatto che gli ha spaventati perchè era una bambina molto tranquilla" + "\n" +
                "Lista dei sospettati da interrogare: "+ "\n" +
                "1. Tyler Williams - padre della vittima" + "\n" +
                "2. Emily Carter - madre della vittima";
    }
    public String printLitigioScuola() {
        return "Caso numero 3 - Litigio Scuola";
    }
    public String infoLitigioScuola(){
        return "Informazioni sulla vittima: " + "\n" +
                "Nome della vittima: Jasper" + "\n" +
                "Cognome della vittima: Smith" + "\n" +
                "Data di nascita: 25.02.2002" + "\n" +
                "Luogo del decesso: Wellington Square, Oxford OX1 2JD, UK" + "\n" +
                "Orario del decesso: 16.00" + "\n" +
                "Causa del decesso: Colpo d'arma da fuoco" + "\n" +
                "Jasper è stato trovato morto dietro all'edificio dell'univeristà che frequentava con un colpo alla testa." + "\n" +
                "Dal colpo possiamo determinare che si tratta di una Glock 17" + "\n" +
                "La vittima veniva spesso presa in giro da tre compagni in particolare" + "\n" +
                "Lista dei sospettati da interrogare: "+ "\n" +
                "1. James Parker" + "\n" +
                "2. Ethan Parker";
    }
    public String printStalker() {
        return "Caso numero 4 - Stalker";
    }
    public String infoStalker(){
        return "Informazioni sulla vittima: " + "\n" +
                "Nome della vittima: Lolita" + "\n" +
                "Cognome della vittima: Martin" + "\n" +
                "Data di nascita: 16.12.2000" + "\n" +
                "Luogo del decesso: Comlara Park, 13001 Recreation Area Dr, Hudson, IL 61748, USA" + "\n" +
                "Orario del decesso: 23.00" + "\n" +
                "Causa del decesso: Strangolamento" + "\n" +
                "La donna è stata trovata morta al Comlara Park." + "\n" +
                "È stata inizialmente violontata e in seguito strangolata" + "\n" +
                "L'amica della vittima conferma che Lolita era terrorizzata da un uomo che lei definiva il suo Stalker." + "\n" +
                "Le mandava messaggi strani e la seguiva ovunque, si tratta di un uomo alto circa 1.85, dai capelli biondi e di età circa sui 27 anni." + "\n" +
                "Lista dei sospettati da interrogare: "+ "\n" +
                "1. Noah Wilson - ex fidanzato della vittima" + "\n" +
                "2. Charlie Roberts" + "\n" +
                "3. Lucas Bennett";
    }

    @Override
    public String toString() {
        return "Regole del Gioco:" + "\n" +
                "Il gioco simula un caso di cronaca nera" + "\n" +
                "in cui il detective sei tu e il tuo compito è quello di risolvere il caso." + "\n" +
                "A disposizione hai una una lista di sospettati che si aggiornerà automaticamente ogni volta che ce ne sarà uno." + "\n" +
                "Inoltre hai la cartella con l'identità della vittima, del sospettato e del colpevole." + "\n" +
                "Quando riuscirai a trovare il colpevole, avrai la possibilità di scegliere se stampare il rapporto ufficiale del caso oppure no." + "\n" +
                "Divertiti e trova il colpevole!";
    }
}
