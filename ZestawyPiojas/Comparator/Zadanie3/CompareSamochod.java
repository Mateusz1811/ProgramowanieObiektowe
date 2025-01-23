package Zadanie3;
import java.util.*;

public class CompareSamochod implements Comparator<Samochod>{

    @Override
    public int compare(Samochod pierwszy, Samochod drugi){
        return Integer.compare(pierwszy.getRokProdukcji(), drugi.getRokProdukcji());
    }
}
