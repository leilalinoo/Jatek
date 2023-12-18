package jateek;

public class Kezdes extends Helyszin {

    @Override
    public String leiras() {
        return "Fordulj valamely irányba!";
    }

    @Override
    public Helyszin egyikIany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        @Override
    public String egyikBtnFelirata() {
        return "** Egyik iránY **";
    }
    
}
