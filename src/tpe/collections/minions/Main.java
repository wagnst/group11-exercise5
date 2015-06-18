package tpe.collections.minions;

import tpe.collections.minions.domain.Minion;
import tpe.collections.minions.domain.MinionFarbe;
import tpe.collections.minions.domain.MinionIterable;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /**
     * Gibt einen String zur Ausgabe aller errechneten Werte zurück.
     *
     * @param gesamtOD       Minions ohne Dubletten
     * @param gelbOD         Gelbe Minions ohne Dubletten
     * @param gelbeODP       Gelbe Minions ohne Dubletten in Prozent
     * @param violettOD      Violette Minions ohne Dubletten
     * @param violettODP     Violette Minions ohne Dubletten in Prozent
     * @param gelbviolettODV Verhältnis Gelbe und Violette Minions
     * @param gesamtMD       Minions mit Dubletten
     * @param gelbMD         Gelbe Minions mit Dubletten
     * @param gelbeMDP       Gelbe Minions mit Dubletten in Prozent
     * @param violettMD      Violette Minions mit Dubletten
     * @param violettMDP     Violette Minions mit Dubletten in Prozent
     * @param gelbviolettMDV Verhältnis Gelbe und Violette Minions
     * @param fehler         Fehler bei der Zählung
     *
     * @return Formatierter String mit allen wichtigen Infos
     */
    public static String outputString(
            int gesamtOD, int gelbOD, double gelbeODP,
            int violettOD, double violettODP, double gelbviolettODV, int gesamtMD,
            int gelbMD, double gelbeMDP, int violettMD, double violettMDP,
            double gelbviolettMDV, double fehler) {
        /*
         * Ohne Dubletten: 1128
         * Minions 717 gelbe (64%) und 411 violett (36%),
         * gelb/violett 1,74
         * -------------------------------------------------
         * Mit Dubletten: 1184 Minions 758 gelbe (64%) und 426 violett (36%),
         * gelb/violett 1,78
         * -------------------------------------------------
         * Fehler bei der Zählung: 4,7%
         */
        return ("Ohne Dubletten: " + gesamtOD + " Minions\n" + gelbOD
                + " gelbe (" + gelbeODP + "%) und " + violettOD + " violett ("
                + violettODP + "%), gelb/violett " + gelbviolettODV + "\n"
                + "-------------------------------------------------\n"
                + "Mit Dubletten: " + gesamtMD + " Minions\n" + gelbMD
                + " gelbe (" + gelbeMDP + "%) und " + violettMD + " violett ("
                + violettMDP + "%), gelb/violett " + gelbviolettMDV + "\n"
                + "-------------------------------------------------\n"
                + "Fehler bei der Zählung: " + fehler + "\n");
    }

    /**
     * ermittelt Gesamtanzahl Minions
     *
     * @param factory
     *
     * @return integer die Anzahl
     */
    public static int getAlleMD(MinionIterable factory) {
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
     *
     * @return integer die Anzahl
     */
    public static int getGMD(MinionIterable factory) {
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
     *
     * @return integer die Anzahl
     */
    public static int getVMD(MinionIterable factory) {
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
     *
     * @return integer die Anzahl
     */
    public static int getAlleOD(MinionIterable factory) {

        Set<Minion> set = new HashSet<Minion>();

        for (Minion n : factory) {
            set.add(n);
        }

        return set.size();
    }

    /**
     * Zähle alle gelbe Minions ohne Dupletten
     *
     * @param factory
     *
     * @return
     */
    public static int getGOD(MinionIterable factory) {
        Set<Minion> set = new HashSet<Minion>();

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
     *
     * @return
     */
    public static int getVOD(MinionIterable factory) {
        Set<Minion> set = new HashSet<Minion>();

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
     * @param wert   wieviel prozent sind das?
     *
     * @return integer den Prozentsatz
     */
    public static double berechneProzent(double gesamt, double wert) {
        return Math.round((100.0 * wert) / gesamt);
    }

    /**
     * Berechnet Differenz zweier Werte in Prozent
     *
     * @param gesamt        alle zusammen
     * @param ohneDupletten keine Dupletten enthalten
     *
     * @return integer die Anzahl ohne Dupletten
     */
    public static double berechneFehlerQuote(double gesamt, double ohneDupletten) {

        double tmp = gesamt - ohneDupletten;

        return Math.round((100.0 * tmp) / gesamt);
    }

    /**
     * Ermittelt das Verhältnis von a zu b
     *
     * @param a erster Parameter
     * @param b zweiter Parameter
     *
     * @return double das Verhältnis von a zu b
     */
    public static double verhaeltniss(double a, double b) {

        return (double) Math.round(a / b * 100) / 100;
    }

    public static void main(String[] args) {

        MinionIterable factory = new MinionIterable();

        // OHNE DUBLETTEN
        int gesamtOD = getAlleOD(factory);
        int gelbOD = getGOD(factory);
        double gelbODP = berechneProzent(gesamtOD, gelbOD);
        int violettOD = getVOD(factory);
        double violettODP = berechneProzent(gesamtOD, violettOD);
        double gelbviolettODV = verhaeltniss(gelbOD, violettOD);

        // MIT DUBLETTEN
        int gesamtMD = getAlleMD(factory);
        int gelbMD = getGMD(factory);
        double gelbMDP = berechneProzent(gesamtMD, gelbMD);
        int violettMD = getVMD(factory);
        double violettMDP = berechneProzent(gesamtMD, violettMD);
        double gelbviolettMDV = verhaeltniss(gelbMD, violettMD);

        //FEHLER
        double fehler = berechneFehlerQuote(gesamtMD, gesamtOD);

        System.out.println(outputString(
                gesamtOD, gelbOD, gelbODP, violettOD, violettODP, gelbviolettODV,
                gesamtMD, gelbMD, gelbMDP, violettMD, violettMDP, gelbviolettMDV,
                fehler
        ));

    }
}
