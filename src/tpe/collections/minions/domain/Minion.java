package tpe.collections.minions.domain;

/**
 * Basisklasse für die Minions.
 */
public abstract class Minion {

    /** Zähler für die Seriennummern der Minions */
    private static int seriennummer = 1;

    /** Vorname */
    private final String vorname;

    /** Nachname */
    private final String nachname;

    /** Seriennummer */
	private int evilNumber;

	/** Farbe des Minions */
	private MinionFarbe farbe;

	/**
	 * Legt ein neues Minion an.
	 *
	 * @param vorname Vorname des Minions.
	 * @param nachname Nachname des Minions.
	 * @param farbe seine Farbe.
	 */
	public Minion (String vorname, String nachname, MinionFarbe farbe) {
	    this.vorname = vorname;
	    this.nachname = nachname;
		this.farbe = farbe;
		this.evilNumber = seriennummer++;
	}

	/**
	 * Liefert die Seriennummer zurück.
	 *
	 * @return evilNumber Seriennummer
	 */
	public int getEvilNumber() {
		return evilNumber;
	}

	/**
	 * Liefert die Farbe zurück.
	 *
	 * @return farbe Farbe des Minions.
	 */
	public MinionFarbe getFarbe() {
		return farbe;
	}

	/**
	 * Gibt den Vornamen zurück.
	 *
	 * @return Vorname
	 */
	public String getVorname() {
	    return vorname;
	}

	/**
	 * Gibt den Nachnamen zurück.
	 *
	 * @return Nachname
	 */
	public String getNachname() {
	    return nachname;
	}

	@Override
	public String toString() {
		return String.format("%s %s: Nr. %d, Farbe: %s, Vorliebe: %s",
		        vorname, nachname, evilNumber,
		        farbe, farbe == MinionFarbe.GELB ? "Mag Bananen" : "Nichts... grrr...");
	}

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + evilNumber;
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Minion other = (Minion) obj;
        if (evilNumber != other.evilNumber) {
            return false;
        }
        return true;
    }
}

