public class Main {
    public static void main(String[] args) {
        Produkt jablko = new Produkt("Jablko", 0.99, 15);
        jablko.wyswietlInfromacje();
        jablko.dodajDoMagazynu(15);
        jablko.wyswietlInfromacje();
        jablko.usunZMagazynu(50);
        jablko.wyswietlInfromacje();
    }
}