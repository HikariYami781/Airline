package org.ies.tierno.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    private int flightNUmber;
    private String origin;
    private String destination;
    private Date flightDate;
    private Map<Integer, Passenger> passengers;
}
