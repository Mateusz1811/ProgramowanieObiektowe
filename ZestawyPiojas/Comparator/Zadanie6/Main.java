package Zadanie6;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Tworzymy przykładowe obiekty Product
        products.add(new Product(1, "Product A", 20.99));
        products.add(new Product(2, "Product B", 15.99));
        products.add(new Product(3, "Product C", 20.99));
        products.add(new Product(4, "Product D", 10.99));
        products.add(new Product(5, "Product E", 15.99));

        // Sortowanie listy produktów z użyciem generycznego Comparatora
        Collections.sort(products, new ProductComparator());

        // Wyświetlamy posortowaną listę
        for (Product product : products) {
            System.out.println(product);
        }
    }
}