package jateek;

import java.io.Serializable;
import java.util.ArrayList;

public class Karakter  implements Serializable{

    private ArrayList<Targy> felszereles;
    private String faj;
    private int eletero, ugyesseg, szerencse;

    public Karakter(String faj) {
        this.faj = faj;
        this.felszereles = new ArrayList<>();
        this.eletero = dobas() + dobas() + 12;
        this.ugyesseg = dobas() + 6;
        this.szerencse = dobas() + 6;
    }

    private int dobas() {
        int szam = (int) (Math.random() * (6 - 1) + 1);
        return szam;
    }
    
    
    public void hasznal(String targy, int db, boolean levonjae){
        if(levonjae){
            hasznal(targy, db);
        }else{
            System.out.println("Nincs elég tárgy.");
        }
    }
    
    
    public void hasznal(String targy, int db){
        for (int i = 0; i < db; i++) {
            hasznal(targy);
        }
    }
    
    
    public void hasznal(String targy){
        int i =0, N = felszereles.size();
        while(i < N && !(felszereles.get(i).getNev().equals(targy))){
            i++;
        }
        if(i < N){
            felszereles.remove(i);
            //return felszereles.get(i);
        }else{
            //return null;
            System.out.println("Nincsen a keresett tárgy a felszerelések között.");
        }
    }

    public ArrayList<Targy> felvesz(Targy targy) {
        felszereles.add(targy);
        return felszereles;
    }

    public ArrayList<Targy> felvesz(int db, Targy targy) {
        for (int i = 0; i < db; i++) {
            felszereles.add(targy);
        }
        return felszereles;
    }

    @Override
    public String toString() {
        return "Karakter{  faj = " + faj + ", felszereles = " + felszereles + ", eletero = " + eletero + ", ugyesseg = " + ugyesseg + ", szerencse = " + szerencse + '}';
    }

}
