package H2_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Fach implements Comparable<Fach> {

    private ArrayList<Note> noten = new ArrayList<>();
    private String name;
    private String abkuerzung;

    public Fach(String name, String abkuerzung) {
        this.name = name;
        this.abkuerzung = abkuerzung;
    }

    public void addNote(Note n) {
        noten.add(n);
    }

    public float calculateAverage() {
        float tempSchnitt = 0;
        Iterator<Note> iterator = noten.iterator();

        while (iterator.hasNext()) {
            tempSchnitt += iterator.next().getNote();
        }

        return tempSchnitt / noten.size();
    }

    public void notenNachWert() {
        noten.sort(new NotenWertVergleicher());
    }

    public void notenNachDatum() {
        noten.sort(new NotenDatumsVergelicher());
    }


    @Override
    public String toString() {
        String buildString = name + " (" + abkuerzung + ") : Schnitt = " + calculateAverage() + "\n";
        Iterator<Note> iterator = noten.iterator();

        while (iterator.hasNext()) {
            buildString += "\t" + iterator.next().toString() + "\n";
        }
        return buildString;
    }

    @Override
    public int compareTo(Fach o) {
        return abkuerzung.compareTo(o.abkuerzung);
    }
}
