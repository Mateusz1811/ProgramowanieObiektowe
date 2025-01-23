public class Platnosc implements IPlatnosc{
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota){
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        System.out.println("Platnosc w wysokosci " + kwota + " zł została opłacona");
    }

    public String getStatusPlatnosci(){
        return statusPlatnosci;
    }

    public double getKwota(){
        return kwota;
    }
}
