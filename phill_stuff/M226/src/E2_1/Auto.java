package E2_1;

public class Auto {
    private String nrSchild;
    private Rad[] reader;
    private Motor motor;

    public Auto(){

    }

    public String getNrSchild() {
        return nrSchild;
    }

    public void setNrSchild(String nrSchild) {
        this.nrSchild = nrSchild;
    }

    public Rad[] getRad() {
        return reader;
    }

    public void addRad(Rad rad,int position) {
        this.reader = reader;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void print(){
        System.out.println("Nummerschild = " + nrSchild);
        if (reader != null) {
            for (int i = 0; i < reader.length; i++) {
                System.out.println("Rad = " + reader[i].toString());
            }
        }
        System.out.println("Motor Leistung = " + motor.getLeistung());
    }
}
