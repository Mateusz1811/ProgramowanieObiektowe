package Zadanie3;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Samochod[] samochody = new Samochod[5];

        samochody[0] = new Samochod("Toyota", 2015, 40000);
        samochody[1] = new Samochod("Ford", 2020, 35000);
        samochody[2] = new Samochod("BMW", 2018, 50000);
        samochody[3] = new Samochod("Audi", 2016, 45000);
        samochody[4] = new Samochod("Mercedes", 2019, 60000);

        Arrays.sort(samochody, new CompareSamochod());

        for(Samochod samochod : samochody){
            System.out.println(samochod);
        }
    }
}
