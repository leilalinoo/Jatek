package jateek;

public class Start extends Helyszin {

    @Override
    public String leiras() {
        return "Ez a start, haladj tovább!";
    }

    @Override
    public Helyszin egyikIany() {
        return new Kezdes();
    }

    @Override
    public String egyikBtnFelirata() {
        return "** Egyik iránY **";
    }

}
