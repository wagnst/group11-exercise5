package tpe.collections.minions.domain;

import java.util.Comparator;

/**
 * Sorts Minions by their evil number
 * Copyright by Steffen Wagner (D059727)
 *
 * Created on 18.06.2015, 14:50 Project: group11-exercise5
 */

public class MinionsComparator implements Comparator<Minion> {
   
    @Override
    public int compare(Minion o1, Minion o2) {
        if (o1.equals(o2)) {
            return 0;
        } else if (o1.getEvilNumber() > o2.getEvilNumber()) {
            return 1;
        } else {
            return -1;
        }
    }
}
