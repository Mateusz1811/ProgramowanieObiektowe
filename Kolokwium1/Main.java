public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Mateusz", 19, "Pomocnik");
        elf1.przedstawSie();

        Elf elf2 = new Elf("Kacper", 27, "Ochroniarz");
        elf2.przedstawSie();

        Elf elf3 = new Elf("Dyzio", 20, "Pomocnik");
        elf3.przedstawSie();
        System.out.println();

        Fabryka fabryka = new Fabryka(32.3,45.3);

        fabryka.dodajPracownika(elf1);
        fabryka.dodajPracownika(elf2);
        fabryka.dodajPracownika(elf3);

        fabryka.najstarszyPracownik().przedstawSie();
        System.out.println();

        Renifer renifer1 = new Renifer("Ziomus", 30);
        Renifer renifer2 = new Renifer("Koles", 20);
        Renifer renifer3 = new Renifer("Rudolf", 50);
        System.out.println(renifer1.predkosc);
        renifer1.nakarmRenifera();
        System.out.println(renifer1.predkosc);

        Sanie sanie1 = new Sanie();

        sanie1.dodajRenifera(renifer1);
        sanie1.dodajRenifera(renifer2);
        sanie1.dodajRenifera(renifer3);

        System.out.println(sanie1.najwolniejszyRenifer().imie);

        System.out.println(elf1.getWiek());

        System.out.println(sanie1.toString());

    }
}