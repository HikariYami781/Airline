package org.ies.tierno.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Airline {
    private String name;
    private Map<Integer, Flight> flights;
    private List<Client> clients;





}


