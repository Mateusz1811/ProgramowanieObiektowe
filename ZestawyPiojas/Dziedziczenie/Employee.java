public class Employee extends Person{

    public Employee(String firstName, String lastName){
        super(firstName, lastName);
    }

    public void testAccess(){
       // System.out.println(firstName); nie da sie bo pole jest prywante
        System.out.println(lastName);
    }

    public void displayData(){
        System.out.println(getFirstName()); // dostepne tutaj przez getter
        System.out.println(getLastName());
    }

}
