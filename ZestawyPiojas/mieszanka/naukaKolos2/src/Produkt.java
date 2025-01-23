public class Produkt implements IProdukt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInfromacje(){
        System.out.println("Nazwa produktu: " + this.nazwa);
        System.out.println("Cena produktu: " + this.cena);
        System.out.println("Ilosc na magazynie: " + this.iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc){
        this.iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc){
        if(this.iloscNaMagazynie>=ilosc){
            this.iloscNaMagazynie -= ilosc;
        }else{
            System.out.println("Nie ma wystarczajacej ilosci produktu na magazynie");
        }
    }

    public int getIloscNaMagazynie(){
        return this.iloscNaMagazynie;
    }

    public String getNazwa(){
        return this.nazwa;
    }

    public double getCena(){
        return this.cena;
    }

    public boolean Dostepny(int ilosc){
        return iloscNaMagazynie>=ilosc;
    }
}
