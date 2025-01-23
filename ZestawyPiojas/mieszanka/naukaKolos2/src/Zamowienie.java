public class Zamowienie {
    private KoszykZakupowy koszyk;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszyk, String status){
        this.koszyk = koszyk;
        this.statusZamowienia = "W trakcie realizacji";
        this.platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());
    }

    public void ustawStatusZamowienia(String statusZamowienia){
        this.statusZamowienia = statusZamowienia;
    }

    public void wyswietlZamowienie(){
        System.out.println("Zawartosc koszyka: ");
        koszyk.WyswietlZawartoscKoszyka();
        System.out.println("Status zamowienia: " + statusZamowienia);
    }

    public KoszykZakupowy getKoszyk(){
        return koszyk;
    }

    public String getStatus(){
        return statusZamowienia;
    }

    public Platnosc getPlatnosc(){
        return platnosc;
    }

    public void finalizujZamowienie(){
        if(platnosc.getStatusPlatnosci().equals("Opłacone")){
            statusZamowienia = "Gotowe do wysylki";
            System.out.println("Zamowienie zostalo sfinalizowane i jest gotowe do wysylki.");
        }else{
            System.out.println("Nie mozna sfinalizowac zamowienia. Platnosc nie zostala dokonana");
        }
    }

    public void zwrocProdukt(Produkt produkt, int ilosc){
        koszyk.usunProdukt(produkt, ilosc);
        platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());
    }
}
