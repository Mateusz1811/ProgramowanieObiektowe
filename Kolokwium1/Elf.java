import java.util.Objects;

public class Elf {
    public String imie;
    public int wiek;
    public String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void przedstawSie(){
        System.out.println("Cześć, nazywam się " + imie + ", mam " + wiek + " lat, a moje stanowisko pracy to " + stanowisko);
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

    public int getWiek(){
        return this.wiek;
    }

    public void setWiek(int nowyWiek){
        if(nowyWiek <= 0){
            System.out.println("Wiek nie mzoe byc mniejszy rowny od 0!");
        }else{
            this.wiek = nowyWiek;
        }
    }

    public String getStanowisko(){
        return this.stanowisko;
    }

    public void setStanowisko(String noweStanowisko){
        if(noweStanowisko == null || noweStanowisko.isEmpty()){
            System.out.println("Nazwa stanowiska nie moze byc pusta!");
        }else{
            this.stanowisko = noweStanowisko;
        }
    }

    @Override

    public String toString(){
        return String.format("Imię elfa to: %s, jego wiek to: %d, a jego stanowisko to: %s", this.imie, this.wiek, this.stanowisko);
    }

    @Override

    public boolean equals(Object obj){
        if (obj.getClass() != this.getClass())
        {
            return false;
        }

        Elf elf = (Elf) obj;

        if(Objects.equals(this.imie, elf.imie) && Objects.equals(this.stanowisko, elf.stanowisko) && Objects.equals(this.wiek, elf.wiek)){
            return true;
        }
        return false;
    }
}
