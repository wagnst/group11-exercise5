package tpe.collections.minions;

import tpe.collections.minions.domain.MinionIterable;

public class Main {

    /**
     * Gibt einen String zur Ausgabe aller errechneten Werte zurück.
     *
     * @param gesamtMD Minions mit Dubletten
     * @param gelbOD Gelbe Minions ohne Dubletten
     * @param gelbeODP Gelbe Minions ohne Dubletten in Prozent
     * @param violettOD Violette Minions ohne Dubletten
     * @param violettODP Violette Minions ohne Dubletten in Prozent
     * @param gelbviolettODV Verhältnis Gelbe und Violette Minions
     * @param gesamtOD Minions ohne Dubletten
     * @param gelbMD Gelbe Minions mit Dubletten
     * @param gelbeMDP Gelbe Minions mit Dubletten in Prozent
     * @param violettMD Violette Minions mit Dubletten
     * @param violettMDP Violette Minions mit Dubletten in Prozent
     * @param gelbviolettMDV Verhältnis Gelbe und Violette Minions
     * @param fehler Fehler bei der Zählung
     *
     * @return Formatierter String mit allen wichtigen Infos
     */
    public static String outputString(int gesamtMD, int gelbOD, int gelbeODP, int violettOD, int violettODP, double gelbviolettODV,
                                      int gesamtOD, int gelbMD, int gelbeMDP, int violettMD, int violettMDP, double gelbviolettMDV, double fehler) {
        /*
        Ohne Dubletten: 1128 Minions
        717 gelbe (64%) und 411 violett (36%), gelb/violett 1,74
        -------------------------------------------------
        Mit Dubletten: 1184 Minions
        758 gelbe (64%) und 426 violett (36%), gelb/violett 1,78
        -------------------------------------------------
        Fehler bei der Zählung: 4,7%
         */
        return ("Ohne Dubletten: " + gesamtOD +" Minions\n" +
                gelbOD + " gelbe (" + gelbeODP + ") und " + violettOD + "violett (" + violettODP + "), gelb/violett "+ gelbviolettODV +"\n" +
                "-------------------------------------------------" +
                "Mit Dubletten: " + gesamtMD + "Minions\n" +
                gelbMD + " gelbe (" + gelbeMDP +") und " + violettMD + "violett (" + violettMDP +"), gelb/violett " + gelbviolettMDV +"\n" +
                "-------------------------------------------------" +
                "Fehler bei der Zählung: " + fehler + "\n");
    }

    public static void main(String[] args) {

        MinionIterable factory = new MinionIterable();
        // Lösung hier!
        
    }
}
