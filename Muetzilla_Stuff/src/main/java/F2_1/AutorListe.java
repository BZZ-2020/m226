package F2_1;

public class AutorListe {
    public static int MAX_AUTOREN = 5;
    private Autor[] autoren = new Autor[MAX_AUTOREN];
    private int autorenCntr = 0;

    public AutorListe() {

    }

    public void addAutor(Autor autor) {
        if (autorenCntr < MAX_AUTOREN) {
            autoren[autorenCntr] = autor;
            autorenCntr++;
        }
    }

    public Autor getAutor(int index) {
        return autoren[index];
    }

    public void printOut() {
        System.out.println("Autoren-Liste");
        System.out.println("--------------");
        for (int i = 0; i < autorenCntr; i++) {
            System.out.println(autoren[i].getName());
        }
        System.out.println();
    }

}
