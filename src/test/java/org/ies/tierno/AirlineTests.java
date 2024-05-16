package org.ies.tierno;

import org.ies.tierno.airline.model.Airline;
import org.ies.tierno.airline.model.Flight;
import org.ies.tierno.airline.model.Luggage;
import org.ies.tierno.airline.model.Passenger;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class AirlineTests {
    private Airline airline= new Airline(
            "Iberia",
            Map.of(1,
                    new Flight(1,"Cancún","Madrid", new Date(),
                            Map.of(1, new Passenger("25942685Q",15,
                                    List.of( new Luggage("27QWD","Maleta Grande Negra")
                                    )
                                    )
                            )
                    )
            )
    );
}

/*
Mirar los test de Airline en el GitHub de MIkel
 */