package org.ies.tierno.airline;

import org.ies.tierno.airline.model.Airline;
import org.ies.tierno.airline.readers.AirlineReader;


public class Main {
    public static void main(String[] args) {

        var airlineReader= new AirlineReader();

        Airline airline= airlineReader.read();

    }

}