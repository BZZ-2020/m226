package F2_1;

public class Bibliothek {
    public static int MAX_MEDIEN = 10;
    private PrintMedium[] medienListe = new PrintMedium[MAX_MEDIEN];
    private int medienCntr = 0;

    public Bibliothek() {
    }

    public int getMedienCntr() {
        return medienCntr;
    }

    public void addMedium(PrintMedium medium) {
        if (medienCntr < MAX_MEDIEN) {
            medienListe[medienCntr] = medium;
            medienCntr++;
        }
    }

    public PrintMedium getMedium(int index) {
        return medienListe[index];
    }

    public int getMaxMedien() {
        return MAX_MEDIEN;
    }

    public void printOut() {
        System.out.println("Inventar der Bibliothek");
        System.out.println("-----------------------");
        for (int i = 0; i < medienCntr; i++) {
            System.out.println(medienListe[i].getTitel());
        }
    }

    public void showInventory() {
        String inventory = PrintMedium.addTab2Text("Titel") + PrintMedium.addTab2Text("Verlag") + PrintMedium.addTab2Text("ISBN-Nummer") + PrintMedium.addTab2Text("Autor") + PrintMedium.addTab2Text("Ausgabedatum");
        inventory += "\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        System.out.println(inventory);
        for (PrintMedium pm : medienListe) {
            if (pm != null) {
                pm.showInfo();
            }
        }
    }

}
