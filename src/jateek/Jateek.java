package jateek;

public class Jateek {

    public static void main(String[] args) {
        run();
    }
    
    
    public static void run() {
        Karakter k1 = new Karakter("tünde");
        Targy t1 = new Targy("kard", "hosszú éles izé");
        Targy t2 = new Targy("papucs", "gumipapucs");
        k1.toString();
        k1.felvesz(t1);
        k1.felvesz(t1);
        k1.felvesz(t2);
        k1.toString();
        Karakter[] karakterek = {k1};
        Targy[] targyak = {t1, t1, t2};
        kiirTomb("KARAKTEREK:" , karakterek);
        k1.hasznal("papucs");
        k1.hasznal("kard", 2);
        k1.hasznal("kard", 3);
        kiirTomb("karakterek felsz:",  karakterek);
        
    }
    
     private static <T> void kiirTomb(String cim, T[] tomb) {
        System.out.println(cim);
        for (T nev : tomb) {
            System.out.println(nev);
        }
    }
    
}
