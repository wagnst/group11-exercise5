package tpe.collections.minions.domain;

import static tpe.collections.minions.domain.MinionNamen.NACHNAME;
import static tpe.collections.minions.domain.MinionNamen.VORNAMEN;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Factory, um Minions zu erzeugen.
 *
 * Mit Hilfe dieser Klasse können neue Minions erzeugt werden. Da man nicht
 * genau weiß, wie überhaupt Minions entstehen, ist der genaue
 * Entstehungsmechanismus in dieser Klasse verborgen.
 */
public class MinionIterable implements Iterable<Minion> {

    /** Fehlerrate für doppelte Minions. */
    private static final int DOUBLETTENRATE = 15;

    /** Fehlerrate für doppelte Minions. */
    private static final int TRIPPLETRATE = 5;

    /** Gefühlte Anzahl von Minions */
    private static final int ANZAHL = 10000;

    /** Fudge-Konstante für die Farbe */
    private static final int FARB_FUDGE = 3;

    /** Bobs Replikationskonstante */
    private static final int REPL_BOB = 12;

    /** Zufallszahlengenerator */
    private static final Random rnd = new Random();

    /** Die Minions */
    private final Minion[] theMinions = erzeugeMinions();

    /**
     * Erzeugte eine neue Minion-Fabrik.
     */
    public MinionIterable() {
    }

    /**
     * Erzeugt ein neues Minion mit zufälliger Farbe.
     *
     * @return ein neu geborenes Minion
     */
    private static Minion erzeugeMinion() {

        int farbInt = rnd.nextInt(MinionFarbe.values().length);
        int fudge = rnd.nextInt(FARB_FUDGE);

        if (fudge == 0) {
            farbInt = 0;
        }

        MinionFarbe farbe = MinionFarbe.values()[farbInt];

        String vorname = waehleNamen(VORNAMEN);
        String nachname = waehleNamen(NACHNAME);

        switch(farbe){
            case GELB:
                return new GelbesMinion(vorname, nachname);

            case VIOLETT:
            default:
                return new ViolettesMinion(vorname, nachname);
        }
    }

    /**
     * Erzeugt die gegebene Anzahl von Minions in zufälliger Farbe.
     *
     * @param anzahl Anzahl von Minions, die erzeugt werden soll.
     * @return die erzeugten Minions als Array.
     */
    private static Minion[] erzeugeMinions(int anzahl) {

        // Minions erzeugen
        Minion[] minions = new Minion[anzahl];
        for (int i = 0; i < minions.length; i++) {
            minions[i] =  erzeugeMinion();
        }

        // Minions mischen
        List<Minion> minionList = Arrays.asList(minions);
        Collections.shuffle(minionList);

        // Fehler einbauen
        for (int i = 0; i < anzahl / DOUBLETTENRATE; i++) {
            int index1 = rnd.nextInt(minions.length);
            int index2 = rnd.nextInt(minions.length);
            int index3 = rnd.nextInt(minions.length);

            if (rnd.nextInt(TRIPPLETRATE) == 0) {
                minions[index3] = minions[index1];
            }

            minions[index2] = minions[index1];
        }

        // the evil one
        Minion bob = new ViolettesMinion("\u0042\u006f\u0062",
                "\u0045\u0076\u0069\u006c");

        for (int i = 0; i < REPL_BOB; i++) {
            int index = rnd.nextInt(minions.length);
            minions[index] = bob;
        }

        return minionList.toArray(minions);
    }

    /**
     * Erzeugt eine unbestimmte Anzahl von Minions.
     *
     * @return Minions.
     */
    private static Minion[] erzeugeMinions() {
        int fudgeFactor = rnd.nextInt(ANZAHL / 5);
        return erzeugeMinions(ANZAHL + fudgeFactor);
    }

    /**
     * Wählt den Namen des Minions zufällig aus.
     *
     * @param auswahl Liste, aus der die Namen gewählt werden sollen.
     * @return den gewählten Namen
     */
    private static String waehleNamen(String[] auswahl) {
        int index = new Random().nextInt(auswahl.length);
        return auswahl[index];
    }

    /**
     * @see java.lang.Iterable#iterator()
     */
    public Iterator<Minion> iterator() {
        return Arrays.asList(theMinions).iterator();
    }
}
