import java.util.*;

public class StudentZad11 implements Comparable<StudentZad11>{
    private String name;
    private double averageGrade;
    private int yearOfStudy;

    public StudentZad11(String name, double averageGrade, int yearOfStudy){
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName(){
        return name;
    }

    public double getAverageGrade(){
        return averageGrade;
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }

    @Override
    public int compareTo(StudentZad11 other){
        if(this.averageGrade == other.averageGrade){
            return Double.compare(this.yearOfStudy, other.yearOfStudy);
        }
        return Double.compare(other.averageGrade, this.averageGrade);
    }

    @Override
    public String toString(){
        return "Students{name='" + name + '\'' + ", averageGrade=" + averageGrade + ", yearOfStudy=" + yearOfStudy + '}';
    }


    public static void main(String[] args){
        List<StudentZad11> students = new ArrayList<>();

        students.add(new StudentZad11("Anna", 4.5, 2000));
        students.add(new StudentZad11("Kamil", 4.5, 1999));
        students.add(new StudentZad11("Zofia", 4.9, 2001));
        students.add(new StudentZad11("Piotr", 4.2, 1998));

        Collections.sort(students);

        for(StudentZad11 student : students){
            System.out.println(student);
        }
    }



}
