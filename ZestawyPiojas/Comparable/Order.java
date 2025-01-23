import java.util.*;

public class Order implements Comparable<Order>{
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice){
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public int compareTo(Order other){
        if(this.unitPrice == other.unitPrice){
            return Double.compare(this.unitPrice, other.unitPrice);
        }
        return Double.compare(other.unitPrice, this.unitPrice);
    }

    @Override
    public String toString(){
        return "Orders{productName='" + productName + '\'' + ", quantity=" + quantity + ", unitPrice=" + unitPrice + '}';
    }

    public static void main(String[] args){
        List<Order> orders = new ArrayList<>();

        orders.add(new Order("aaaaaa", 10, 15.23));
        orders.add(new Order("bbbbbb", 15, 15.23));
        orders.add(new Order("cccccc", 20, 15.23));
        orders.add(new Order("dddddd", 30, 15.23));

        Collections.sort(orders);

        for(Order order : orders){
            System.out.println(order);
        }

    }

}
