package jateek;

import java.io.Serializable;
import java.util.UUID;

public class Targy  implements Serializable{
    
    UUID id;
    String nev, leiras;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }    

    @Override
    public String toString() {
        return "Targy {" + "id = " + id + ", nev = " + nev + ", leiras = " + leiras + '}';
    }

    public UUID getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }
    
}
