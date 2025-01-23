package Zadanie6;
import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        // Porównanie po cenie (od najniższej do najwyższej ceny)
        int priceComparison = Double.compare(p1.price, p2.price);

        // Jeśli ceny są równe, porównaj po id
        if (priceComparison == 0) {
            return Integer.compare(p1.id, p2.id);
        }

        return priceComparison;
    }
}