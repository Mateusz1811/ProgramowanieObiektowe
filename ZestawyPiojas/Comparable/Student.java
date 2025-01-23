import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public int compareTo(Student other) {
        return Double.compare(other.averageGrade, this.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + ", averageGrade=" + averageGrade + ", yearOfBirth=" + yearOfBirth + '}';
    }

    public static void main(String[] args) {
        // Tworzenie listy studentów
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 4.5, 2000));
        students.add(new Student("Kamil", 3.7, 1999));
        students.add(new Student("Zofia", 4.9, 2001));
        students.add(new Student("Piotr", 4.2, 1998));
        students.add(new Student("Ewa", 4.8, 2000));

        // Sortowanie listy studentów według średniej ocen
        Collections.sort(students);

        // Wyświetlenie posortowanej listy
        for (Student student : students) {
            System.out.println(student);
        }


    }
}
