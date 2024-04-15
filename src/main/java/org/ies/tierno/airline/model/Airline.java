package org.ies.tierno.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Airline {
    private String name;
    private Map<Integer, Flight> flights;
    private List<Client> clients;

/*
Dado un número de vuelo, devuelve los pasajeros del vuelo.
 */

    public  List<Passenger> getPassengerByFlightNUmber(int flightNum){
        Flight flight= flights.get(flightNum);
        if (flight!=null){
            return new ArrayList<>(flight.getPassengers().values());
        }else{
            return null;
        }
    }


/*
Dado un número de vuelo, devuelve los clientes que son
pasajeros en el vuelo.
 */

    public List<Client> getPassangerClientByFlightNumber(int flightNum){
        Flight flight=flights.get(flightNum);
        List<Client> passengerClie= new ArrayList<>();

        if (flight!=null){
            for (Passenger passenger: flight.getPassengers().values()) {
                for (Client client: clients){
                    if (client.getNif().equals(passenger.getNif())){
                        passengerClie.add(client);
                        break;
                    }
                }
            }

        }
        return passengerClie;
    }


/*
Dado unos apellidos (String), devuelve la lista de clientes
 que tengan ese apellido.
 */

    public List<Client> getClientBySurname(String surname){
        return clients
                .stream()
                .filter(client -> client.getSurname().equals(surname))
                .collect(Collectors.toList());
    }



/*
Dado un número de vuelo y un nif, devuelve el asiento del pasajero.
Si no existe el vuelo o el pasajero, devuelve null.
 */

    public Integer seatByFlightNumAndNif(int flightNum, String nif){
        Flight flight= flights.get(flightNum);
        if (flight !=null){
            Passenger passenger= flight.getPassengers().get(nif);
            if (passenger !=null){
            return  passenger.getSeatNumber();
            }
        }
        return null;
    }





/*
Dado un número de vuelo, un nif y un luggage, añade el luggage a ese
 pasajero. En caso de que no exista el vuelo o el pasajero, muestra en pantalla un mensaje de error explicativo.
 */

public void LuggageToPassenger(int fligthNum, String nif, Luggage luggage){
    Flight flight= flights.get(fligthNum);

    if (flight !=null) {
        Passenger passenger = flight.getPassengerByNif(nif);
        if (passenger != null) {
            passenger.Luggage(luggage);
            System.out.println(" Equipaje adjudicado al pasajero  " + nif);
        } else {
            System.out.println(" Pasajero " + nif + " no encontrado en el vuelo " + fligthNum);
        }
    }else {
        System.out.println("Vuelo con numero "+fligthNum+" no encontrado");
     }
    }



/*
Dado un nif, devuelve los vuelos en los que ese cliente es pasajero.
 */

    public List<Flight> getFlightByNif(String nif){
        List<Flight> flightPassenger = new ArrayList<>();

        for (Flight flight : flights.values()) {
            if (flight.getPassengers().containsKey(nif)) {
                flightPassenger.add(flight);
            }
        }

        return flightPassenger;

    }

}


