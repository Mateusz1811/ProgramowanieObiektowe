import java.util.*;

public class Main {

    class Box<T>{
        T obiekt;

        public void setObiekt(T obiekt){
            this.obiekt = obiekt;
        }

        public T getObiekt(){
            return obiekt;
        }
    }

    class Counter<T>{
        List<T> lista = new ArrayList<>();

        public void add(T element){
            lista.add(element);
        }

        public int getCount(){
            return lista.size();
        }
    }

    public static <T> void swap(T[] tablica, int indeks1, int indeks2){
        if(tablica == null){
            throw new IllegalArgumentException("Tablica nie moze byc null");
        }

        if(indeks1<0 || indeks1>=tablica.length || indeks2<0 || indeks2>=tablica.length){
            throw new IllegalArgumentException("Index spoza zakresu tablicy");
        }

        T temp = tablica[indeks1];
        tablica[indeks1] = tablica[indeks2];
        tablica[indeks2] = temp;
    }

    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }


    public static void main(String[] args) {

    }
}