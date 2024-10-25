import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> nowaLista = new ArrayList<>(tab1);
        nowaLista.addAll(tab2);
        return nowaLista;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> nowaLista = new ArrayList<>();
        int maxDlugosc = Math.max(tab1.size(), tab2.size());

        for(int i = 0; i < maxDlugosc; i++) {
            if(i<tab1.size()) {
                nowaLista.add(tab1.get(i));
            }
            if(i<tab2.size()) {
                nowaLista.add(tab2.get(i));
            }
        }
        return nowaLista;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        Collections.sort(tab1);
        Collections.sort(tab2);

        ArrayList<Integer> nowaLista = new ArrayList<>();
        int i = 0, j = 0;

        while (i < tab1.size() && j < tab2.size()) {
            if (tab1.get(i) <= tab2.get(j)) {
                nowaLista.add(tab1.get(i));
                i++;
            } else {
                nowaLista.add(tab2.get(j));
                j++;
            }
        }

        while (i < tab1.size()) {
            nowaLista.add(tab1.get(i));
            i++;
        }
        while (j < tab2.size()) {
            nowaLista.add(tab2.get(j));
            j++;
        }

        return nowaLista;
    }

    public static ArrayList<Character> toArrayList(String napis){
        ArrayList<Character> Lista = new ArrayList<>();

        for(char znak : napis.toCharArray()){
            Lista.add(znak);
        }
        return Lista;
    }

    public static ArrayList<Integer> toArrayList(int liczba){
        ArrayList<Integer> Lista = new ArrayList<>();

        String liczbaNaNapis = String.valueOf(liczba);
        for(char cyfra : liczbaNaNapis.toCharArray()){
            Lista.add(Character.getNumericValue(cyfra));
        }
        return Lista;
    }

    public static boolean checkChar(ArrayList<String> tab, char znak){
        for(String napis : tab){
            if(napis.indexOf(znak) != -1){
                return true;
            }
        }
        return false;
    }

    public static boolean checkDigit(ArrayList<Integer> tab, int cyfra){
        return tab.contains(cyfra);
    }

    public static int countChar(ArrayList<String> tab, char znak){
        int count = 0;

        for(String napis : tab){
            for(char c : napis.toCharArray()){
                if(c == znak){
                    count++;
                }
            }
        }
        return count;
    }

    public static int countDigit(ArrayList<Integer> tab, int cyfra){
        int count = 0;

        for(int liczba : tab){
            if(liczba == cyfra){
                count++;
            }
        }
        return count;
    }

    public static ArrayList<ArrayList<Object>> uniqueArrayList1(ArrayList<String> tab){
        HashSet<String> unikalneZbiory = new HashSet<>(tab);
        ArrayList<ArrayList<Object>> wynik = new ArrayList<>();

        for(String wartosc : unikalneZbiory){
            ArrayList<Object> para = new ArrayList<>();
            para.add(wartosc);
            para.add(0);
            wynik.add(para);
        }
        return wynik;
    }

    public static ArrayList<ArrayList<Object>> uniqueArrayList2(ArrayList<Integer> tab){
        HashSet<Integer> unikalneZbiory = new HashSet<>(tab);
        ArrayList<ArrayList<Object>> wynik = new ArrayList<>();

        for(Integer wartosc : unikalneZbiory){
            ArrayList<Object> para = new ArrayList<>();
            para.add(wartosc);
            para.add(0);
            wynik.add(para);
        }
        return wynik;
    }

    public static ArrayList<ArrayList<Object>> countArrayList1(ArrayList<String> tab){
        HashMap<String, Integer> zliczanie = new HashMap<>();

        for(String napis : tab){
            for(char c : napis.toCharArray()){
                String znak = String.valueOf(c);
                zliczanie.put(znak, zliczanie.getOrDefault(znak, 0) + 1);
            }
        }
        ArrayList<ArrayList<Object>> wynik = new ArrayList<>();
        for(String znak : zliczanie.keySet()){
            ArrayList<Object> para = new ArrayList<>();
            para.add(znak);
            para.add(zliczanie.get(znak));
            wynik.add(para);
        }
        return wynik;
    }

    public static ArrayList<ArrayList<Object>> countArrayList2(ArrayList<Integer> tab){
        HashMap<Integer, Integer> zliczanie = new HashMap<>();

        for(Integer liczba : tab){
            zliczanie.put(liczba, zliczanie.getOrDefault(liczba, 0) + 1);
        }

        ArrayList<ArrayList<Object>> wynik = new ArrayList<>();
        for(Integer liczba : zliczanie.keySet()){
            ArrayList<Object> para = new ArrayList<>();
            para.add(liczba);
            para.add(zliczanie.get(liczba));
            wynik.add(para);
        }
        return wynik;
    }





    public static void main(String[] args) {
        ///zad1
        ArrayList<Integer> tab11 = new ArrayList<>();
        tab11.add(1);
        tab11.add(2);
        tab11.add(3);

        ArrayList<Integer> tab12 = new ArrayList<>();
        tab12.add(4);
        tab12.add(5);
        tab12.add(6);

        ArrayList<Integer> wynik1 = append(tab11, tab12);

        System.out.println(wynik1);
        ///zad2

        ArrayList<Integer> tab21 = new ArrayList<>();
        tab21.add(1);
        tab21.add(3);
        tab21.add(5);

        ArrayList<Integer> tab22 = new ArrayList<>();
        tab22.add(2);
        tab22.add(4);
        tab22.add(6);
        tab22.add(7);
        tab22.add(8);

        ArrayList<Integer> wynik2 = merge(tab21, tab22);

        System.out.println(wynik2);
        ///zad3

        ArrayList<Integer> tab31 = new ArrayList<>();
        tab31.add(1);
        tab31.add(3);
        tab31.add(5);

        ArrayList<Integer> tab32 = new ArrayList<>();
        tab32.add(4);
        tab32.add(2);
        tab32.add(8);
        tab32.add(7);
        tab32.add(6);

        ArrayList<Integer> wynik3 = mergeSorted(tab31, tab32);

        System.out.println(wynik3);
        ///zad4
        String napis = "hello";
        ArrayList<Character> ListaZnakow = toArrayList(napis);
        System.out.println(ListaZnakow);

        int liczba = 12345;
        ArrayList<Integer> ListaCyfr = toArrayList(liczba);
        System.out.println(ListaCyfr);

        ///zad5
        ArrayList<String> listaNapisow = new ArrayList<>();
        listaNapisow.add("hello");
        listaNapisow.add("World");
        listaNapisow.add("java");

        ArrayList<Integer> listaCyfr = new ArrayList<>();
        listaCyfr.add(1);
        listaCyfr.add(2);
        listaCyfr.add(1);
        listaCyfr.add(1);
        listaCyfr.add(5);
        listaCyfr.add(6);
        listaCyfr.add(7);

        char znak = 'o';
        int cyfra = 1;

        boolean znakWLiscie = checkChar(listaNapisow, znak);
        boolean cyfraWLiscie = checkDigit(listaCyfr, cyfra);

        System.out.println(znakWLiscie);
        System.out.println(cyfraWLiscie);

        ///zad6
        int liczbaWystapienZnaku = countChar(listaNapisow, znak);
        int liczbaWystapienCyfry = countDigit(listaCyfr, cyfra);

        System.out.println(liczbaWystapienZnaku);
        System.out.println(liczbaWystapienCyfry);

        ///zad7
        ArrayList<String> listaNapisow7 = new ArrayList<>();
        listaNapisow7.add("apple");
        listaNapisow7.add("banana");
        listaNapisow7.add("apple");
        listaNapisow7.add("orange");

        ArrayList<Integer> listaCyfr7 = new ArrayList<>();
        listaCyfr7.add(1);
        listaCyfr7.add(4);
        listaCyfr7.add(5);
        listaCyfr7.add(5);
        listaCyfr7.add(7);
        listaCyfr7.add(7);

        ArrayList<ArrayList<Object>> wynikNapis = uniqueArrayList1(listaNapisow7);
        ArrayList<ArrayList<Object>> wynikCyfr = uniqueArrayList2(listaCyfr7);

        System.out.println(wynikNapis);
        System.out.println(wynikCyfr);

        ///zad8

        ArrayList<String> listaNapisow8 = new ArrayList<>();
        listaNapisow8.add("apple");
        listaNapisow8.add("banana");
        listaNapisow8.add("apple");
        listaNapisow8.add("orange");

        ArrayList<Integer> listaCyfr8 = new ArrayList<>();
        listaCyfr8.add(1);
        listaCyfr8.add(4);
        listaCyfr8.add(5);
        listaCyfr8.add(5);
        listaCyfr8.add(7);
        listaCyfr8.add(7);

        ArrayList<ArrayList<Object>> wynikNapisow8 = countArrayList1(listaNapisow8);
        ArrayList<ArrayList<Object>> wynikCyfr8 = countArrayList2(listaCyfr8);

        System.out.println(wynikNapisow8);
        System.out.println(wynikCyfr8);





    }
}
