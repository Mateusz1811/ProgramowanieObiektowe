public interface IKoszykZakupowy {
    void dodajProdukt(Produkt produkt, int ilosc);
    void usunProdukt(Produkt produkt, int ilosc);
    void WyswietlZawartoscKoszyka();
    double obliczCalkowitaWartosc();
}
