package org.ies.tierno.airline.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String nif;
    private String name;
    private String surname;

    // private List<Flights> flights; (No estoy segura)
    
    public  int compareTo(Customer o){
        int compare= this.nif.compareTo(o.nif);
        if (compare==0){
            compare=this.name.compareTo(o.name);
            if (compare==0){
                compare=this.surname.compareTo(o.surname);
            }
        }

        return compare;
    }
}
