public class Main {
    //zadanie 6

    public static <T> boolean isEqualOrNULL(T a, T b) {
        if(a == null && b == null) return true;
        if(a.equals(b) && b.equals(a)) return true;
        else return false;


    }


    public static void main(String[] args) {
        Hammer hammer = new Hammer("Hammer", 2025);
        Screwdriver screwdriver = new Screwdriver("Screwdriver", 2025);
        Saw saw = new Saw("Saw", 2025);

        hammer.use();
        screwdriver.use();
        saw.use();

        System.out.println();
        System.out.println();
        System.out.println();

        TemperatureSensor temperatureSensor = new TemperatureSensor(36.6, "Normal");
        PressureSensor pressureSensor = new PressureSensor(5.7, "Normal");

        System.out.println(temperatureSensor.readValue());
        System.out.println(temperatureSensor.getStatus());
        temperatureSensor.reset();
        System.out.println();
        System.out.println(pressureSensor.readValue());
        System.out.println(pressureSensor.getStatus());
        pressureSensor.reset();

        System.out.println();
        System.out.println();
        System.out.println();

        int a=3;
        int b=5;

        System.out.println(isEqualOrNULL(a, b));

        System.out.println();
        System.out.println();
        System.out.println();

        Triple<Integer, Double, String> triple = new Triple<>(13,24.5,"string");
        System.out.println(triple.getFirst() + " " + triple.getFirst().getClass());
        System.out.println(triple.getSecond() + " " + triple.getSecond().getClass());
        System.out.println(triple.getThird() + " " + triple.getThird().getClass());

        System.out.println();
        System.out.println();
        System.out.println();

        Car car = new Car("Skoda", "Octavia", 4);
        System.out.println(car);


    }
}