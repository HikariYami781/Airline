package org.ies.tierno.airline.model;

import java.util.Comparator;

public class ByNifPassengerComparator implements Comparator<Passenger> {
    @Override
    public int compare(Passenger p1, Passenger p2){
        /*
        Se puede poner también de esta forma, pero es redundante

        int compare= p1.getNif().compareTo(p2.getNif());
        return compare;
         */
        return p1.getNif().compareTo(p2.getNif());
    }
}
