package org.ies.tierno.airline.comparator;

import org.ies.tierno.airline.model.Passenger;

import java.util.Comparator;

public class BySeatNumberPassengerComparator implements Comparator<Passenger> {
    @Override
    public  int compare(Passenger p1, Passenger p2){

    Integer seatNumber= p1.getSeatNumber();
        return seatNumber.compareTo(p2.getSeatNumber());

    /*
    Se puede poner de esta forma, pero es redundante:

     int compare= seatNumber.compareTo(p2.getSeatNumber());
    return compare;

     */
    }
}
