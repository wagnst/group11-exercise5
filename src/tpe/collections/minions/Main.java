package tpe.collections.minions;

import java.util.*;

import tpe.collections.minions.domain.Minion;
import tpe.collections.minions.domain.MinionFarbe;
import tpe.collections.minions.domain.MinionIterable;

public class Main {

    /**
     * ermittelt Gesamtanzahl Minions
     * 
     * @param factory
     * @return integer die Anzahl
     */
    public static int getAnzahlGesamt(MinionIterable factory) {
        int anzahl = 0;
        for (Minion m : factory) {
            anzahl++;
        }
        return anzahl;
    }

    /**
     * Zähle gelbe Minions mit Dupletten
     * 
     * @param factory
     * @return integer die Anzahl
     */
    public static int getGelbeMinionsMD(MinionIterable factory) {
        int anzahl = 0;
        for (Minion n : factory) {
            if (n.getFarbe() == (MinionFarbe.GELB)) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zähle violette Minions mit Dupletten
     * 
     * @param factory
     * @return integer die Anzahl
     */
    public static int getVioletteMinionsMD(MinionIterable factory) {
        int anzahl = 0;
        for (Minion n : factory) {
            if (n.getFarbe() == (MinionFarbe.VIOLETT)) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zähle alle Minions ohne Dupletten
     * 
     * @param factory
     * @return integer die Anzahl
     */
    public static int getMinionsOD(MinionIterable factory) {

        Set<Minion> set = new HashSet<>();

        for (Minion n : factory) {
            set.add(n);
        }

        return set.size();
    }

    /**
     * Zähle alle gelbe Minions ohne Dupletten
     * 
     * @param factory
     * @return
     */
    public static int getMinionsODGelb(MinionIterable factory) {
        Set<Minion> set = new HashSet<>();

        for (Minion n : factory) {
            if (n.getFarbe() == MinionFarbe.GELB)
                set.add(n);
        }

        return set.size();
    }

    /**
     * Zähle alle violetten Minions ohne Dupletten
     * 
     * @param factory
     * @return
     */
    public static int getMinionsODViolett(MinionIterable factory) {
        Set<Minion> set = new HashSet<>();

        for (Minion n : factory) {
            if (n.getFarbe() == MinionFarbe.VIOLETT)
                set.add(n);
        }

        return set.size();
    }

    /**
     * Berechnet Prozentwert der Eingabe *
     * 
     * @param gesamt 100 %
     * @param wert wieviel prozent sind das?
     * @return integer den Prozentsatz
     */
    public static int berechneProzent(int gesamt, int wert) {
        return gesamt / 100 * wert;
    }

    /**
     * Berechnet Differenz zweier Werte in Prozent
     * 
     * @param gesamt alle zusammen
     * @param ohneDupletten keine Dupletten enthalten
     * @return integer die Anzahl ohne Dupletten
     */
    public static int berechneFehlerQuote(int gesamt, int ohneDupletten) {

        int tmp = gesamt - ohneDupletten;

        return gesamt / 100 * tmp;
    }

    public static void main(String[] args) {

        MinionIterable factory = new MinionIterable();

        System.out.println(berechneFehlerQuote(100, 75));
    }
}
