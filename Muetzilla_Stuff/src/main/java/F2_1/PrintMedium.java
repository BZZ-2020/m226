package F2_1;

public abstract class PrintMedium {
    protected String titel;
    protected String verlag;

    public PrintMedium(String titel, String verlag) {
        this.titel = titel;
        this.verlag = verlag;
    }

    public String getTitel() {
        return titel;
    }

    public String getVerlag() {
        return verlag;
    }

    public abstract void showInfo();

    public String addTabulator2Text(String text) {
        int textLength = 100;
        text += " ".repeat(textLength);
        return text;
    }
}