import java.util.*;

public class KoszykZakupowy implements IKoszykZakupowy {
    private ArrayList<Produkt> listaProduktow;
    private ArrayList<Integer> iloscProduktow;

    public KoszykZakupowy(List<Produkt> lista){
        this.listaProduktow = new ArrayList<>();
        this.iloscProduktow = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc){
        if(produkt.Dostepny(ilosc)){
            int indeks = listaProduktow.indexOf(produkt);
            if(indeks!=-1){
                iloscProduktow.set(indeks, iloscProduktow.get(indeks) + ilosc);
            }else{
                listaProduktow.add(produkt);
                iloscProduktow.add(ilosc);
            }
            produkt.usunZMagazynu(ilosc);
        }
    }

    public void usunProdukt(Produkt produkt, int ilosc){
        int indeks = listaProduktow.indexOf(produkt);
        if(indeks!=-1){
            int obecnaIlosc = iloscProduktow.get(indeks);
            if(obecnaIlosc>=ilosc){
                iloscProduktow.set(indeks, obecnaIlosc-ilosc);
                produkt.usunZMagazynu(ilosc);
            }
        }
    }

    public void WyswietlZawartoscKoszyka(){
        if(listaProduktow.isEmpty()){
            System.out.println("Koszyk jest pusty");
        }else{
            System.out.println("Zawartosc koszyka: ");
            for(int i=0;i<listaProduktow.size();i++){
                Produkt produkt = listaProduktow.get(i);
                int ilosc = iloscProduktow.get(i);

                System.out.println("- " + produkt.getNazwa() + ": " + ilosc + "szt.");
            }
        }
    }

    public double obliczCalkowitaWartosc(){
        double suma = 0.0;
        for(int i=0;i<listaProduktow.size();i++){
            Produkt produkt = listaProduktow.get(i);
            int ilosc = iloscProduktow.get(i);
            suma += produkt.getCena() * ilosc;
        }
        return suma;
    }


}
