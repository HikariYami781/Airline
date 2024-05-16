package org.ies.tierno.airline.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
public class Passenger {
    private String nif;
    private int seatNumber;
    private List<Luggage> luggages;


    public void Luggage(Luggage luggage) {
        luggages.add(luggage);
    }

    /*Estoy agregando el equipaje para luego llamarlo en la clase principal
    y sumarseló al pasajero
     */


}
