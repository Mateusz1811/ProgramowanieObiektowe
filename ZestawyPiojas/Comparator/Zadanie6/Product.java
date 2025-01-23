package Zadanie6;
import java.util.*;


public class Product{
    public int id;
    public String name;
    public double price;

    public Product(int id, String name, double price){
        this.id =  id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "id: " + id + ", name: " + name + ", price: " + price;
    }
}

