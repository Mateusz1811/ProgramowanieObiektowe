import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 2025);
        Vehicle vehicle2 = new Vehicle("Toyota", "Corolla", 2025);
        Vehicle vehicle3 = new Vehicle(null, "", 2010);

        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
        System.out.println(vehicle3.toString());

        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle2.hashCode());

        System.out.println();
        System.out.println();
        System.out.println();

        Employee employee = new Employee("Mateusz", "Maciejewski");
        employee.testAccess();
        employee.displayData();


        System.out.println();
        System.out.println();
        System.out.println();


        List<ComputerGraphic> graphics = new ArrayList<>();
        graphics.add(new Bitmap(1920, 1080, "image1.bmp"));
        graphics.add(new Vector(800, 600, "vector1.svg"));
        graphics.add(new Bitmap(1280, 720, "image2.bmp"));
        graphics.add(new Vector(1024, 768, "vector2.svg"));
        graphics.add(new Bitmap(2560, 1440, "image3.bmp"));


        for (ComputerGraphic graphic : graphics) {
            graphic.loadFile();
            graphic.saveFile();
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();

        EmployeeZad14 employeeZad14 = new EmployeeZad14("John", "Doe", 4000.23);
        Programmer programmer = new Programmer("Alice", "Smith", 80000, "Java");
        Tester tester = new Tester("Bob", "Johnson", 60000, "Automation");

        // Print details
        System.out.println(employee);
        System.out.println(programmer);
        System.out.println(tester);

        // Test equals and hashCode
        Programmer programmer2 = new Programmer("Alice", "Smith", 80000, "Java");
        System.out.println("Programmer equals programmer2: " + programmer.equals(programmer2));

        Tester tester2 = new Tester("Bob", "Johnson", 60000, "Automation");
        System.out.println("Tester equals tester2: " + tester.equals(tester2));
    }
}