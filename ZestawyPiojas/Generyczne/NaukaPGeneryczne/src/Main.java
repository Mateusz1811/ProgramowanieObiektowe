import java.util.List;
import java.util.ArrayList;

public class Main {

     public static class Box<T> {
        T obiekt;

        public T getObiekt(){
            return obiekt;
        }

        public void setObiekt(T obiekt){
            this.obiekt = obiekt;
        }
    }

    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }

    public static class Counter<T>{
         List<T> lista = new ArrayList<>();

         public void add(T element){
             lista.add(element);
         }

         public int getCount(){
             return lista.size();
         }
    }


    public static <T> void swap(T[] tablica, int indeks1, int indeks2){
        if(indeks1<0 || indeks1>=tablica.length || indeks2<0 || indeks2>=tablica.length){
            throw new IllegalArgumentException("Index spoza zakresu tablicy");
        }
        if(tablica == null){
            throw new IllegalArgumentException("Tablica nie moze byc null");
        }

        T temp = tablica[indeks1];
        tablica[indeks1] = tablica[indeks2];
        tablica[indeks2] = temp;

    }

    public static <T extends Comparable<T>> T minValue(T[] array){
         if(array == null || array.length == 0){
            throw new IllegalArgumentException("Tablica nie moze byc null albo pusta");
        }

         T min = array[0];
         for(T element : array){
             if(element.compareTo(min)<0){
                 min = element;
             }
         }
         return min;
    }


    public static void main(String[] args) {


    }
}