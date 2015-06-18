package tpe.collections.minions.domain;

/**
 * Ein gelbes Minion.
 */
class GelbesMinion extends Minion {

    /**
     * Erzeugt ein neues gelbes Minion.
     *
     * @param vorname Vorname
     * @param nachname Nachname
     */
	public GelbesMinion(String vorname, String nachname) {
		super(vorname, nachname, MinionFarbe.GELB);
	}
}
