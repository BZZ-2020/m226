package aufgabe1;

public class Lohnkonto extends BankKonto{
    private float maxNegativerBezug;

    public Lohnkonto(float maxNegBzug) {
        maxNegativerBezug = maxNegBzug;
    }

    public float beziehen(float betrag) throws KontoUeberzugEcxeption {
        if((saldo - betrag) >= -maxNegativerBezug){
            saldo = saldo-betrag;
            return betrag;
        }else{
            throw new KontoUeberzugEcxeption(betrag,saldo);
        }
    }

    public float getUeberzugBetrag(){
        return maxNegativerBezug;
    }


}
