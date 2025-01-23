public class Jablko implements Owoc{
    public Jablko(String nazwa, double cena){
        super(nazwa, cena);
    }

    @Override
    public String smak(){
        return "Słodki";
    }

    @Override
    public void umyj(){
        System.out.println()
    }

}
