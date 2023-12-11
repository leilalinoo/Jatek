package jateek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Jateek {

    public static void main(String[] args) throws IOException {
        run();
    }
    
    
    public static void run() throws FileNotFoundException, IOException {
        Karakter k1 = new Karakter("tünde");
        Karakter k2 = new Karakter("farkasváltó");
        Targy t1 = new Targy("kard", "hosszú éles izé");
        Targy t2 = new Targy("papucs", "gumipapucs");
        k1.toString();
        k2.toString();
        k1.felvesz(t1);
        k1.felvesz(t1);
        k1.felvesz(t2);
        k1.toString();
        Karakter[] karakterek = {k1};
        Targy[] targyak = {t1, t1, t2};
        kiirTomb("KARAKTEREK:" , karakterek);
        k1.hasznal("papucs");
        k1.hasznal("kard", 2);
       // k1.hasznal("kard", 3);
        k1.felvesz(t2);
        k1.felvesz(t2);
        k1.hasznal("papucs");       
   /*     k1.felvesz(t2);
        k1.felvesz(t2);
        k1.hasznal("papucs", 3, false);*/
        kiirTomb("karakterek felsz:",  karakterek);
        
        try(ObjectOutputStream objKi= new ObjectOutputStream(new FileOutputStream("karakterek.bin"))){
            
            objKi.writeObject(karakterek);
        }
        
    }
    
     private static <T> void kiirTomb(String cim, T[] tomb) {
        System.out.println(cim);
        for (T nev : tomb) {
            System.out.println(nev);
        }
    }
    
}
