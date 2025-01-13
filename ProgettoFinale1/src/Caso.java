import java.util.ArrayList;

    public class Caso {
        private ArrayList<Sospettato> sospettati;
        private Vittima vittima;
        private Colpevole colpevole;
        private String armaDelitto;
        private String donnaSupermercato;
        private String bambinaGenitori;
        private String litigioScuola;
        private String serialKiller;
        private String uomoCappuccio;

        public Caso(Vittima vittima, Colpevole colpevole, String armaDelitto) {
            sospettati = new ArrayList<>();
            this.vittima = vittima;
            this.colpevole = colpevole;
            this.armaDelitto = armaDelitto;
        }

        public ArrayList<Sospettato> getSospettati() {
            return sospettati;
        }

        public void setSospettati(ArrayList<Sospettato> sospettati) {
            this.sospettati = sospettati;
        }

        public Vittima getVittima() {
            return vittima;
        }

        public void setVittima(Vittima vittima) {
            this.vittima = vittima;
        }

        public Colpevole getColpevole() {
            return colpevole;
        }

        public void setColpevole(Colpevole colpevole) {
            this.colpevole = colpevole;
        }

        public String getArmaDelitto() {
            return armaDelitto;
        }

        public void setArmaDelitto(String armaDelitto) {
            this.armaDelitto = armaDelitto;
        }
        public void addSospettato(Sospettato sospettato) {
            sospettati.add(sospettato);
        }
        public void removeSospettato(Sospettato sospettato) {
            sospettati.remove(sospettato);
        }
        public void printSospettati() {
            for (Sospettato sospettato : sospettati) {
                System.out.println(sospettato);
            }
        }
    }


