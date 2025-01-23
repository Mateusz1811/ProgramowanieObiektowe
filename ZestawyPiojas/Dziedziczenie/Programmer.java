import java.util.Objects;

public class Programmer extends EmployeeZad14{

    String programmingLanguage;

    public Programmer(String firstName, String lastName, double salary, String programmingLanguage){
        super(firstName, lastName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString(){
        return "First name: " + firstName + ", Last name: " + lastName + ", salary: " + salary +", Programming language: " + programmingLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programmer)) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(programmingLanguage, that.programmingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programmingLanguage);
    }
}
