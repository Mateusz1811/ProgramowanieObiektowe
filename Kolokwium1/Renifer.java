import java.util.Objects;

public class Renifer {
    public String imie;
    public int predkosc;

    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public void nakarmRenifera(){
        this.predkosc = predkosc + 5;
    }

    public String getImie(){
        return this.imie;
    }

    public void setImie(String noweImie){
        if(noweImie == null || noweImie.isEmpty()){
            System.out.println("Imie nie moze byc puste!");
        }else{
            this.imie = noweImie;
        }
    }

    public int getPredkosc(){
        return this.predkosc;
    }

    public void setPredkosc(int nowaPredkosc){
        if(nowaPredkosc <= 0){
            System.out.println("Predkosc nie moze byc mniejsza lub rowna 0!");
        }else{
            this.predkosc = nowaPredkosc;
        }
    }

    @Override

    public String toString() {
        return String.format("Imię renifera to: %s, a jego prędkość to: %d", this.imie, this.predkosc);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass())
        {
            return false;
        }

        Renifer renifer = (Renifer) obj;

        if(Objects.equals(this.imie, renifer.imie) && Objects.equals(this.predkosc, renifer.predkosc)){
            return true;
        }
        return false;
    }


}
