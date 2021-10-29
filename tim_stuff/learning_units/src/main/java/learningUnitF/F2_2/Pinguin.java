package learningUnitF.F2_2;

/*
 * Beschreibt einen Pinguin mit der Art und dem Namen
 */
public class Pinguin extends Tier {

    /**
     * Erzeugt ein Pinguin-Objekt und weist dem Tier einen Namen zu
     *
     * @param name des Pinguins
     * @param wert Wert des Tiers
     */
    public Pinguin(String name, float wert) {
        super("Pinguin", name, wert);
    }
}
