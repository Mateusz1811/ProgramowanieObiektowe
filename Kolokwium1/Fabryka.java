import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    public ArrayList<Elf> listaElfow;
    public double dlGeo;
    public double szGeo;

    public Fabryka(double dlGeo, double szGeo) {
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
        this.listaElfow = new ArrayList<>();
    }

    public void dodajPracownika(Elf elf){
        listaElfow.add(elf);
    }

    public void usunPracownika(Elf elf){
        listaElfow.remove(elf);
    }

    public Elf najstarszyPracownik(){
        Elf najstarszy = listaElfow.get(0);
        for(int i=1;i<listaElfow.size();i++){
            if(listaElfow.get(i).wiek > najstarszy.wiek){
                najstarszy = listaElfow.get(i);
            }
        }
        return najstarszy;
    }

    public ArrayList<Elf> getListaElfow() {
        return listaElfow;
    }

    public void setListaElfow(ArrayList<Elf> nowaListaElfow) {
        this.listaElfow = nowaListaElfow;
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(double nowaDlGeo) {
        if((nowaDlGeo > -180) && (nowaDlGeo < 180)) {
            this.dlGeo = nowaDlGeo;
        }else{
            System.out.println("Dlugosc geograficzna moze przyjmowac tylko wartosci miedzy -180 a 180!");
        }
    }

    public double getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(double nowaSzGeo) {
        if((nowaSzGeo > -90) && (nowaSzGeo < 90)) {
            this.szGeo = nowaSzGeo;
        }else{
            System.out.println("Szerokosc geograficzna moze przyjmowac tylko wartosci miedzy -90 a 90");
        }
    }

    @Override

    public String toString(){
        return String.format("Fabryka znajduje się na dlugosci geograficznej %f i szerokosci geograficznej %f, a pracujace w niej elfy to: %s", dlGeo, szGeo, listaElfow);
    }

    @Override

    public boolean equals(Object obj){
        if (obj.getClass() != this.getClass())
        {
            return false;
        }

        Fabryka fabryka = (Fabryka) obj;

        if(Objects.equals(this.dlGeo, fabryka.dlGeo) && Objects.equals(this.szGeo, fabryka.szGeo) && Objects.equals(this.listaElfow, fabryka.listaElfow)){
            return true;
        }
        return false;
    }

}
