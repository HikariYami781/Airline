package org.ies.tierno.airline.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
    private String nif;
    private int seatNumber;
    private List<Luggage> luggages;


}
