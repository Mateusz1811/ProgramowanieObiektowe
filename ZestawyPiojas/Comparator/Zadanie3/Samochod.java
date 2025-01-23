package Zadanie3;
import java.util.*;

public class Samochod{
    private String nazwa;
    private int rokProdukcji;
    private double cena;

    public Samochod(String nazwa, int rokProdukcji, double cena){
        this.nazwa = nazwa;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }


    public int getRokProdukcji(){
        return rokProdukcji;
    }

    @Override
    public String toString(){
        return "nazwa: " + nazwa + ", rokProdukcji: " + rokProdukcji + ", cena: " + cena;
    }

}
