import java.util.*;

public class Sklep {
    List<Produkt> produkty;

    public Sklep(){
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
        System.out.println("Dodano produkt: " + produkt.getNazwa() + ".");
    }

    public void wyswietlOferty(){
        if(produkty.isEmpty()){
            System.out.println("Sklep nie ma zadnych produktow w ofercie");
        }else{
            System.out.print("Oferta sklepu:");
            for(Produkt produkt : produkty){
                System.out.println("Nazwa: " + produkt.getNazwa() + ", cena: " + produkt.getCena() + "zł" + ", ilośc: " + produkt.getIloscNaMagazynie());
            }
        }
    }

    public Produkt wyszukajProdukt(String nazwa){
        for(Produkt produkt : produkty){
            if(produkt.getNazwa().equalsIgnoreCase(nazwa)){
                return produkt;
            }
        }
        System.out.println("Nie znaleziono produktu o nazwie: " + nazwa);
        return null;
    }

    public void zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc){
        Produkt produkt = wyszukajProdukt(nazwaProduktu);
        if(produkt!=null){
            koszyk.dodajProdukt(produkt, ilosc);
        }
    }
}
