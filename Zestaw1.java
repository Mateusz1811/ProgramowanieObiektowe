class HelloWorld {
    public static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //zad41();
        //zad42()
        //zad5();
        //zad6();
        //zad7();
        //zad8();
        //zad9();
        zad10();
        zad11();
        zad12();
        zad13();
    }
    static void zad1()
    {
        System.out.println("Mateusz Maciejewski");
    }
    static void zad2()
    {
        String ImieNazwisko = "Mateusz Maciejewski";
        int dlugosc = ImieNazwisko.length();
        System.out.println(dlugosc);
    }
    static void zad3()
    {
        String a = "Ala";
        String b = "ma";
        String c = "kota";
        String d = a + b + c;
        System.out.println(d);
    }
    private static void zad4a(){
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* * *\n");
        for(int i = 0; i < 14; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 15; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 14; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* * *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
    }
    private static void zad4b(){
        int a = 5;
        int b = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }
            a--;
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            b++;
            System.out.print("\n");
        }
        a = 1;
        b = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }
            a++;
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            b--;
            System.out.print("\n");
        }
    }
    static void zad5()
    {
        String Ala = "Ala ma kota";
        System.out.println(Ala.replace("a","e"));
    }
    static void zad6()
    {
        String Ala = "Ala ma kota";
        System.out.println(Ala.toUpperCase());
        System.out.println(Ala.toLowerCase());
    }
    static void zad7()
    {
        char a = 'A';
        char wykrzyknik = '!';
        char malpa = '@';
        char wieksze = '>';
        char tylda = '~';

        System.out.println((int) a);
        System.out.println((int) wykrzyknik);
        System.out.println((int) malpa);
        System.out.println((int) wieksze);
        System.out.println((int) tylda);
    }
    static void zad8()
    {
        char A = 'A';
        char Z = 'Z';
        char a = 'a';
        char z = 'z';
        char x = '0';
        char y = '9';
        System.out.print("Male znajduja sie od: " + (int) a);
        System.out.println(", do: " + (int) z);
        System.out.print("Duze znajduja sie od: " + (int) A);
        System.out.println(", do: " + (int) Z);
        System.out.print("Cyfry znajduja sie od: " + (int) x);
        System.out.println(", do: " + (int) y);
    }
    static void zad9()
    {
        String tekst = "Grzesiek nie wiedzial dlaczego %s jest tak drapieznym %s, mimo ze jego %s na to nie wskazuje ";
        String tekst2 = String.format(tekst, "bimber", "alkoholem", "woltaz");
        System.out.println(tekst2);
    }
    static void zad10()
    {
        String tekst = "%s , to najlepsza ksiazka napisana przez %s";
        String tekst2 = String.format(tekst ,"Tatuazyk", "Sentino");
        System.out.println(tekst2);
    }
    static void zad11()
    {
        String slowo = "wodrze";
        for(int i=0;i<5;i++)
        {
            System.out.print(slowo + " ");
        }
    }
    static void zad12()
    {
        java.util.Date data = new java.util.Date();
        String formattedDate = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(data);
        System.out.println("Dzisiaj jest " + formattedDate);
    }
    static void zad13(){
        System.out.println(Character.toString((char) 54));
        System.out.println(Character.toString((char) 103));
        System.out.println(Character.toString((char) 241));
        System.out.println(Character.toString((char) 67));
        System.out.println(Character.toString((char) 9999));
        System.out.println(Character.toString((char) 18));
        System.out.println(Character.toString((char) 174700));
    }

}
