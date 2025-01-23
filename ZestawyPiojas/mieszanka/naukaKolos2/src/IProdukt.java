public interface IProdukt {
    String getNazwa();
    double getCena();
    int getIloscNaMagazynie();
    void usunZMagazynu(int ilosc);
    void dodajDoMagazynu(int ilosc);
}
