package jateek;

public class Kezdes extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Fordulj valamely irányba!";
    }

    @Override
    public Helyszin egyikIany() {
        return new Balra();
    }

        @Override
    public String egyikBtnFelirata() {
        return "** Egyik iránY **";
    }
    
}
