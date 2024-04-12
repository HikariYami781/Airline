package org.ies.tierno.airline.readers;

import org.ies.tierno.airline.model.Airline;

import java.io.File;

public class AirlineReader  implements  Reader<Airline>{
    @Override
    public Airline read() {
        ObjectMapper om = new ObjectMapper();
        try {
            Airline airline = om
                    .readValue(
                            new File(getClass().getResource("/data.json").toURI()),
                            Airline.class
                    );
            return airline;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
