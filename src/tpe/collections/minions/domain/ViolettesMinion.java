package tpe.collections.minions.domain;

/**
 * Ein violettes Minion.
 */
class ViolettesMinion extends Minion {

    /**
     * Erzeugt ein neues violettes Minion.
     *
     * @param vorname Vorname
     * @param nachname Nachname
     */
	public ViolettesMinion(String vorname, String nachname) {
		super(vorname, nachname, MinionFarbe.VIOLETT);
	}
}
