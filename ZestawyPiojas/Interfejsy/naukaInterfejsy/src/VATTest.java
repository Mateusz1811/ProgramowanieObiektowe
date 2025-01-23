public class VATTest {
    public static void main(String[] args){

        double price = 100.0;

        double priceWithVAT = VATCalculator.calculateWithVAT(price);

        System.out.println("Cena produktu z VAT: " + priceWithVAT);
    }
}
