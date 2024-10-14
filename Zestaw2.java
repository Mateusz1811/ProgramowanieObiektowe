import java.util.Scanner;


public class Main {
    static void zad1() {
        System.out.println("23.0 + 76 = " + (23.0 + 76)); //double
        System.out.println("41 * 2.0 + 3 = " + (41 * 2.0 + 3)); //double
        System.out.println("5 - 33 = " + (5 - 33)); //int
        System.out.println("109 % 3 = " + (109 % 3)); //int
        System.out.println("50 / 2 = " + (50 / 2)); //int
        System.out.println("4 | 2 = " + (4 | 2)); //int
        System.out.println("3 ^ 5 = " + (3 ^ 5)); //int
        System.out.println("7 & 9 = " + (7 & 9)); //int
    }

    static void zad2(){
        double wynik1 = (Math.sqrt(7)-1) / 2 + Math.pow(3,3) % 2;
        int wynik1NaInt  = (int)wynik1;
        System.out.println("Wynik1 to: " + wynik1NaInt);

        int rok = 2005;
        int dzien = 18;
        int miesiac = 11;

        int wynik2 = rok/(dzien*miesiac);
        System.out.println("Wynik2 to: " + wynik2);

        double wynik3 = (3 + Math.sqrt(3)) / ((Math.sqrt(5)/2)/3)+1;
        int wynik3NaInt = (int)wynik3;
        System.out.println("Wynik3 to: " + wynik3NaInt);

        int a = 10;
        int b = 4;
        int c = 3;

        int wynik4 = a%b%c;
        System.out.println("Wynik4 to: " + wynik4);

        String nazwisko = "Maciejewski";
        String imie = "Mateusz";

        int nazwiskoSum = 0;
        for(char x : nazwisko.toCharArray()){
            nazwiskoSum+=(int)x;
        }

        int imieSum=0;
        for(char y :  imie.toCharArray()){
            imieSum+=(int)y;
        }
        double wynik5=(nazwiskoSum%imieSum+1)/Math.pow(2,0.25);
        int wynik5NaInt = (int)wynik5;

        System.out.println("Wynik5 to: " + wynik5NaInt);

    }
    
    static void zad3(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj pierwsze slowo: ");
        String slowo1 = scanner.nextLine();
        
        System.out.println("Podaj drugie slowo: ");
        String slowo2 = scanner.nextLine();
        
        System.out.println("Pierwsze slowo to: " + slowo1);
        System.out.println("Drugie slowo to: " + slowo2);
    }



    public static void main(String[] args) {
            zad1();
            zad2();
            zad3();
        }
}
