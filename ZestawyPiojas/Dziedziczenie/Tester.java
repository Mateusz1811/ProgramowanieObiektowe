import java.util.Objects;

public class Tester extends EmployeeZad14{

    String testingType;

    public Tester(String firstName, String lastName, double salary, String testingType){
        super(firstName, lastName, salary);
        this.testingType = testingType;
    }

    public String getTestingType(){
        return testingType;
    }

    public void setTestingType(String testingType){
        this.testingType = testingType;
    }

    @Override
    public String toString(){
        return "First name: " + firstName + ", Last name: " + lastName + ", salary: " + salary +", Testing type: " + testingType;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tester)) return false;
        if (!super.equals(o)) return false;
        Tester tester = (Tester) o;
        return Objects.equals(testingType, tester.testingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), testingType);
    }

}
