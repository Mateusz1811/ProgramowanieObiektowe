import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    public ArrayList<Renifer> listaReniferow;

    public Sanie(){
        this.listaReniferow = new ArrayList<>();
    }

    public void dodajRenifera(Renifer renifer){
        listaReniferow.add(renifer);
    }

    public void sumaPredkosci(){
        int suma = 0;
        for(int i=0;i<listaReniferow.size();i++){
            suma += listaReniferow.get(i).predkosc;
        }
    }

    public Renifer najwolniejszyRenifer(){
        Renifer najwolniejszy = listaReniferow.get(0);
        for(int i=1;i<listaReniferow.size();i++){
            if(listaReniferow.get(i).predkosc<najwolniejszy.predkosc){
                najwolniejszy = listaReniferow.get(i);
            }
        }
        return najwolniejszy;
    }

    public ArrayList<Renifer> getListaReniferow() {
        return listaReniferow;
    }

    public void setListaReniferow(ArrayList<Renifer> nowaListaReniferow) {
        if(listaReniferow == null){
            System.out.println("Lista nie moze byc pusta!");
        }else{
            this.listaReniferow = nowaListaReniferow;

        }
    }

    @Override

    public String toString() {
        return String.format("Renifery ciągnace sanie to: %s", listaReniferow);
    }

    @Override

    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass())
        {
            return false;
        }

        Sanie sanie = (Sanie) obj;

        if(Objects.equals(this.listaReniferow, sanie.listaReniferow)){
            return true;
        }
        return false;

    }


}
