package f21;

public class Zeitschrift extends PrintMedium {
    private final String ausgabedatum;

    public Zeitschrift(String titel, String verlag, String ausgabedatum) {
        super(titel, verlag);
        this.ausgabedatum = ausgabedatum;
    }

    public String getAusgabedatum() {
        return ausgabedatum;
    }

    @Override
    public String toString() {
        return "Zeitschrift{" +
                "titel='" + titel + '\'' +
                ", verlag='" + verlag + '\'' +
                ", ausgabedatum='" + ausgabedatum + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(addTab2Text(titel) + addTab2Text(verlag) + addTab2Text("") + addTab2Text("") + addTab2Text(ausgabedatum));
    }
}
