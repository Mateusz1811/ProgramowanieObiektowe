import java.time.Year;
import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction){
        if(brand == null || brand.isEmpty()){
            this.brand = "";
        }else{
            this.brand = brand;
        }
        if(model == null || model.isEmpty()){
            this.model = "";
        }else{
            this.model = model;
        }

        int currentYear = Year.now().getValue();
        if (yearOfProduction > currentYear){
            this.yearOfProduction = currentYear;
        }else{
            this.yearOfProduction = yearOfProduction;
        }
    }

    @Override
    public String toString(){
        return "Vehicle: " + brand + " " + model + ", Year: " + yearOfProduction;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return yearOfProduction == vehicle.yearOfProduction &&
                Objects.equals(brand, vehicle.brand) &&
                Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearOfProduction;
        return result;
    }

}
