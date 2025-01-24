public class Car extends Vehicle{
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors){
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Number of Doors: " + numberOfDoors;
    }
}

