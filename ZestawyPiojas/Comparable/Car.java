import java.util.*;

public class Car implements Comparable<Car>{
    private String brand;
    private int mileage;
    private int yearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction){
        this.brand = brand;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand(){
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    @Override

    public int compareTo(Car other){
        return Double.compare(this.mileage, other.mileage);
    }

    @Override
    public String toString() {
        return "Cars{brand='" + brand + '\'' + ", mileage=" + mileage + ", yearOfProduction=" + yearOfProduction + '}';
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Skoda", 500000, 2020));
        cars.add(new Car("Volkswagen", 1000000, 2002));
        cars.add(new Car("Toyota", 50000, 2015));
        cars.add(new Car("Audi", 2000, 2025));

        Collections.sort(cars);

        for(Car car : cars){
            System.out.println(car);
        }


    }
}
