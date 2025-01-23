import java.util.ArrayList;
public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
        System.out.println("Dodano zamowienie do hsitorii klienta " + imie + " " + nazwisko + ".");
    }

    public void wyswietlHistorieZamowien() {
        if (listaZamowien.isEmpty()) {
            System.out.println("Klient " + imie + " " + nazwisko + " nie ma żadnych zamówień.");
        } else {
            System.out.println("Historia zamówień klienta " + imie + " " + nazwisko + ":");
            for (int i = 0; i < listaZamowien.size(); i++) {
                Zamowienie zamowienie = listaZamowien.get(i);
                System.out.println("Zamówienie " + (i + 1) + " - Status: " + zamowienie.getStatus());
                zamowienie.getKoszyk().WyswietlZawartoscKoszyka();
                System.out.println("---");
            }
        }
    }

    public double obliczLacznyKosztZamowien() {
        double suma = 0;
        for (Zamowienie zamowienie : listaZamowien) {
            suma += zamowienie.getKoszyk().obliczCalkowitaWartosc();
        }
        return suma;
    }
}
